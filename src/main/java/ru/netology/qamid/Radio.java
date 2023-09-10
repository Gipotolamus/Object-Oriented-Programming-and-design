package ru.netology.qamid;

public class Radio {
    private int currentVolume;
    private int currentChannel;


    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < 0) {
            return;
        }
        if (currentChannel > 9) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void next() {
        if (currentChannel != 9) {
            currentChannel++;
        } else {
            currentChannel = 0;
        }
    }

    public void prev() {
        if (currentChannel != 0) {
            currentChannel--;
        }
        else {
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