package ru.netology.qamid;

public class Radio {
    private int currentVolume;
    private int currentChannel;
    private int maxChannel;

    public Radio() {
        this.maxChannel = 9;
    }

    public Radio(int currentVolume, int currentChannel, int channel) {
        this.currentVolume = currentVolume;
        this.currentChannel = currentChannel;
        this.maxChannel = channel - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 100) {
            currentVolume = 100;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < 0) {
            return;
        }
        if (currentChannel > maxChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }

}


