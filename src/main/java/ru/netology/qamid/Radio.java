package ru.netology.qamid;

public class Radio {
    private int currentVolume;
    private int currentChannel;
    private final int maxChannel;
    private final int maxVolume;


    public Radio() {
        this.maxChannel = 9;
        this.maxVolume = 100;
    }

    public Radio(int channel, int volume) {
        this.maxChannel = channel - 1;
        this.maxVolume = volume - 1;
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
        if (currentChannel != maxChannel) {
            currentChannel--;
        }
        if (currentChannel < 0) {
            currentChannel = maxChannel;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void prevVolume() {
        if (currentVolume != maxVolume) {
            currentVolume--;
        }
        if (currentVolume < 0) {
            currentVolume= 0;
        }
    }
}
