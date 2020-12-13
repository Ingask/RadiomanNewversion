package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int stationMax = 10;
    private int stationMin = 0;
    private int currentVolume;
    private int volumeMax = 100;
    private int volumeMin = 0;



    public Radio(){
    }

    public Radio(int stationMax) {
        this.stationMax=stationMax;
    }

    public int getStationMax() {
        return stationMax;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(int pressedStation) {
        if (pressedStation > stationMax || pressedStation < stationMin){
            return;
        }
        this.currentStation = pressedStation;
    }


    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int pressedVolume) {
        if (pressedVolume > volumeMax || pressedVolume<volumeMin) {
            return;
        }
        this.currentVolume = pressedVolume;
    }

    public void stationNumberNext() {

        if (currentStation == stationMax) {
            setCurrentStation(stationMin);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void stationNumberPrev() {
        if (currentStation == stationMin) {
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








