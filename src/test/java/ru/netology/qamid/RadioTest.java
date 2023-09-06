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
    public void currentChannel() {
        Radio radio = new Radio();

        radio.setCurrentChannel(4);
        radio.setCurrentChannel(0);
        int expected = 0;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannel() {
        Radio radio = new Radio();

        radio.setCurrentChannel(7);
        radio.next();
        int expected = 8;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannel() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeLevel() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.nextVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
