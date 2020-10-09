package ru.netology.domain;

public class Radio {
    private String name;
    private int radioStationMax = 9;
    private int radioStationMin = 0;
    private int radioStationCurrent;
    private int volumeMax = 10;
    private int volumeMin = 0;
    private int volumeCurrent;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadioStationMax() {
        return radioStationMax;
    }

    public void setRadioStationMax(int radioStationMax) {
        this.radioStationMax = radioStationMax;
    }

    public int getRadioStationMin() {
        return radioStationMin;
    }

    public void setRadioStationMin(int radioStationMin) {
        this.radioStationMin = radioStationMin;
    }

    public int getRadioStationCurrent() {
        return radioStationCurrent;
    }

    public void setRadioStationCurrent(int radioStationCurrent) {
        if (radioStationCurrent > radioStationMax){
           this.radioStationCurrent = radioStationMin;
           return;
        }
        if (radioStationCurrent < radioStationMin){
            this.radioStationCurrent = radioStationMax;
            return;
        }
        this.radioStationCurrent = radioStationCurrent;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeMax(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    public int getVolumeMin() {
        return volumeMin;
    }

    public void setVolumeMin(int volumeMin) {
        this.volumeMin = volumeMin;
    }

    public int getVolumeCurrent() {
        return volumeCurrent;
    }

    public void setVolumeCurrent(int volumeCurrent) {
        if (volumeCurrent > volumeMax){
            this.volumeCurrent = volumeMax;
            return;
        }
        if (volumeCurrent < volumeMin){
            this.volumeCurrent = volumeMin;
            return;
        }
        this.volumeCurrent = volumeCurrent;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseRadioStation (int radioStationCurrent){
        radioStationCurrent++;
        setRadioStationCurrent(radioStationCurrent);
    }

    public void decreaseRadioStation(int radioStationCurrent){
        radioStationCurrent--;
        setRadioStationCurrent(radioStationCurrent);
    }

    public void increaseVolume (int volumeCurrent){
        volumeCurrent++;
        setVolumeCurrent(volumeCurrent);
    }

    public void decreaseVolume(int volumeCurrent){
        volumeCurrent--;
        setVolumeCurrent(volumeCurrent);
    }
}
