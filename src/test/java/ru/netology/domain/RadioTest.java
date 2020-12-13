package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void stationMax() {
        int expected = 55;
        Radio radio = new Radio(expected);
        assertEquals(expected, radio.getStationMax());
    }

    @ParameterizedTest
    @CsvSource({
            "'Press from min', 10,0,0",
            "'Press from ma[', 10,10,10",
            "'Press more then max', 10, 15, 0",
            "'Press less then min', 10, -5, 0"

    }
    )

    public void numberPressed(String name, int max, int numberPressed, int expected) {
        Radio radio = new Radio(max);
        radio.setCurrentStation(numberPressed);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "'Press next from 0',10,0,1",
            "'Press next from 5',10,5,6",
            "'Press next from 9',10,9,10",
            "'Press next from max',10,10,0"
    }
    )

    public void stationNumberNext(String name, int max, int currentNumber, int expected) {
        Radio radio = new Radio(max);
        radio.setCurrentStation(currentNumber);
        radio.stationNumberNext();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "'Press prev from 0',10,0,10",
            "'Press prev from 5',10,5,4",
            "'Press prev from 9',10,9,8"
    }
    )

    public void stationNumberPrev(String name, int max, int currentStation, int expected) {
        Radio radio = new Radio(max);
        radio.setCurrentStation(currentStation);
        radio.stationNumberPrev();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "'Press up from 0',0,1",
            "'Press up from 50',50,51",
            "'Press up from 100',100,100"
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
            "'Press down from 5',50,49",
            "'Press down from max', 100, 99",
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
