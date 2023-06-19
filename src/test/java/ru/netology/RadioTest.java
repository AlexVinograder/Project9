package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void getCurrentStation() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationBelowMin() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    public void setCurrentStationUnderMax() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setCurrentVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUnderMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void nextTest() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void nextForAnotherNumberTest() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void prevTest() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void prevForAnotherNumberTest() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void getCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    public void volumeUpTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(49);
        radio.volumeUp();

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void volumeMaxUpTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void volumeDownTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(49);
        radio.volumeDown();

        int expected = 48;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void volumeMaxDownTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }
}
