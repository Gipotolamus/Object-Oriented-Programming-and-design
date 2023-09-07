package ru.netology.qamid;

public class Radio {
    private int currentVolume;
    private int currentChannel;
    private final int maxChannel;
    private final int maxVolume;
    private boolean on;

    public Radio() {
        this.maxChannel = 9;
        this.maxVolume = 100;
    }

    public Radio(int currentVolume, int currentChannel, int maxChannel, int maxVolume, boolean on) {
        this.currentVolume = currentVolume;
        this.currentChannel = currentChannel;
        this.maxChannel = maxChannel;
        this.maxVolume = maxVolume;
        this.on = on;
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

    public int getMaxVolume() {
        return maxVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    //    public Radio() {
//        this.maxChannel = 9;
//        this.maxVolume = 100;
//    }
//
//    public Radio(int channel, int volume) {
//        this.maxChannel = channel - 1;
//        this.maxVolume = volume - 1;
//    }
//
//    public int getCurrentChannel() {
//        return currentChannel;
//    }
//
//    public void setCurrentChannel(int currentChannel) {
//        if (currentChannel < 0) {
//            return;
//        }
//        if (currentChannel > maxChannel) {
//            return;
//        }
//        this.currentChannel = currentChannel;
//    }
//
//    public void next() {
//        if (currentChannel != maxChannel) {
//            currentChannel++;
//        } else {
//            currentChannel = 0;
//        }
//    }
//
//    public void prev() {
//        if (currentChannel != maxChannel) {
//            currentChannel--;
//        }
//        if (currentChannel < 0) {
//            currentChannel = maxChannel;
//        }
//    }
//
//    public int getCurrentVolume() {
//        return currentVolume;
//    }
//
//    public void setCurrentVolume(int currentVolume) {
//        if (currentVolume >= maxVolume)
//            currentVolume = 100;
//        if (currentVolume <= 0) {
//            currentVolume = 0;
//        }
//        this.currentVolume = currentVolume;
//    }
//
//    public void nextVolume() {
//        if (currentVolume < maxVolume) {
//            currentVolume++;
//        }
//        if (currentVolume >= maxVolume) {
//            currentVolume = maxVolume;
//        }
//    }
//
//    public void prevVolume() {
//        if (currentVolume <= maxVolume) {
//            currentVolume--;
//        }
//        if (currentVolume <= 0) {
//            currentVolume = 0;
//        }
//    }
}