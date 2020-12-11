package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int stationMax = 9;
    private int stationMin = 0;
    private int currentVolume;
    private int volumeMax = 10;
    private int volumeMin = 0;



    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > stationMax) {
            return;
        }
        if (currentStation < stationMin) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > volumeMax) {
            return;
        }
        if (currentVolume < volumeMin) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void stationNumberNext() {

        if (currentStation >= stationMax) {
            setCurrentStation(stationMin);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void stationNumberPrev() {
        if (currentStation <= stationMin) {
            setCurrentStation(stationMax);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void stationVolumeUp() {
        setCurrentVolume(currentVolume + 1);
    }

    public void stationVolumeDown() {
        setCurrentVolume(currentVolume - 1);
    }

}








