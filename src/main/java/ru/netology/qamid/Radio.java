package ru.netology.qamid;

public class Radio {
    private int currentVolume;
    private int currentChannel;
    private int maxChannel;

    public Radio() {
    }

    public Radio(int currentVolume, int currentChannel, int maxChannel) {
        this.currentVolume = currentVolume;
        this.currentChannel = currentChannel;
        this.maxChannel = maxChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }
}


