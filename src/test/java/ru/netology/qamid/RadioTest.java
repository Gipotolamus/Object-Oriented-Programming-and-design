package ru.netology.qamid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class RadioTest {
//    @ParameterizedTest
//    @CsvSource({
//            "6,4,4"
//    }) // Работает

    //    @CsvFileSource(files = "src/test/java/resources/setChannel.csv")
//    public void currentChannel(int getCurrentChannel, int currentChannel, int expected) {
//        Radio radio = new Radio(9);
//        int actual = radio.getCurrentChannel(getCurrentChannel, currentChannel, expected);
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    public void currentChannelNoLimit() {
        Radio radio = new Radio();

        radio.setCurrentChannel(-4);
        int expected = 0;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void currentChannel() {
        Radio radio = new Radio();

        radio.setCurrentChannel(4);
        radio.setCurrentChannel(0);
        int expected = 0;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentChannelUpMax() {
        Radio radio = new Radio();

        radio.setCurrentChannel(4);
        radio.setCurrentChannel(11);
        int expected = 4;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentChannelIncrease() {
        Radio radio = new Radio();

        radio.setCurrentChannel(9);
        radio.setCurrentChannel(10);
        int expected = 9;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannel() {
        Radio radio = new Radio();

        radio.setCurrentChannel(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannelTest() {
        Radio radio = new Radio();

        radio.setCurrentChannel(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannelUp() {
        Radio radio = new Radio();

        radio.setCurrentChannel(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannel() {
        Radio radio = new Radio();

        radio.setCurrentChannel(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannelUnlimited() {
        Radio radio = new Radio();

        radio.setCurrentChannel(-1);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeLevel() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.nextVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeLevelUp() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.nextVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeLevelUpLimited() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.nextVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolumeLevelIncrease() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.nextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeLevel() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeLevelDecrease() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.prevVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
