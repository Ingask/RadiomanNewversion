package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void numberPressed() {
        int numberPressed = 5;
        int expected = 5;
        Radio radio = new Radio();
        radio.setCurrentStation(numberPressed);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "'Press next from 0',0,1",
            "'Press next from 5',5,6",
            "'Press next from 9',9,0",
    }
    )

    public void stationNumberNext(String name, int currentNumber, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentNumber);
        radio.stationNumberNext();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "'Press prev from 0',0,9",
            "'Press prev from 5',5,4",
            "'Press prev from 9',9,8"
    }
    )

    public void stationNumberPrev(String name, int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.stationNumberPrev();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "'Press up from 0',0,1",
            "'Press up from 5',5,6",
            "'Press up from 10',10,10"
    })

    public void stationVolumeUp(String name, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.stationVolumeUp();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "'Press down from 0',0,0",
            "'Press down from 5',5,4",
            "'Press down from 10',10,9"
    }
    )
    public void stationVolumeDown(String name, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.stationVolumeDown();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
