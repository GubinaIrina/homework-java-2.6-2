package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data

public class Radio {
    private String name;
    private int radioStationMax = 10;
    private int radioStationMin = 0;
    private int radioStationCurrent;
    private int volumeMax = 100;
    private int volumeMin = 0;
    private int volumeCurrent;
    private boolean on;


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
    public void increaseRadioStation (){
        radioStationCurrent++;
        setRadioStationCurrent(radioStationCurrent);
    }

    public void decreaseRadioStation(){
        radioStationCurrent--;
        setRadioStationCurrent(radioStationCurrent);
    }

    public void increaseVolume (){
        volumeCurrent++;
        setVolumeCurrent(volumeCurrent);
    }

    public void decreaseVolume(){
        volumeCurrent--;
        setVolumeCurrent(volumeCurrent);
    }
}
