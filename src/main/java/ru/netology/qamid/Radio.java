package ru.netology.qamid;

public class Radio {
    private int currentVolume;
    private int currentChannel;
    private int maxChannel;


    public Radio() {
        this.maxChannel = 9;
    }

    public Radio(int channel) {
        this.maxChannel = channel - 1;
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

    public void next() {
        if (currentChannel != maxChannel) {
            currentChannel++;
        } else {
            currentChannel = 0;
        }
    }

    public void prev() {
        if (currentChannel != 0) {
            currentChannel--;
        } else {
            currentChannel = 9;
        }
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

    public void nextVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
        if (currentVolume >= 100) {
            currentVolume = 100;
        }
    }

    public void prevVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }
}