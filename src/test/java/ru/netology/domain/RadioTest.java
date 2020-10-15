package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/dataStation.csv")
    void setRadioStationCurrent(String test, int radioStationCurrent) {
        Radio radio = new Radio();
        radio.setRadioStationCurrent(radioStationCurrent);
        System.out.println(radio.getRadioStationCurrent());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataVolume.csv")
    void setVolumeCurrent(String test, int currentVolume) {
        Radio radio = new Radio();
        radio.setVolumeCurrent(currentVolume);
        System.out.println(radio.getVolumeCurrent());
    }

    @Test
    void increaseRadioStation(){
        Radio radio = new Radio();
        radio.increaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    void increaseRadioStationBeforeMax(){
        Radio radio = new Radio();
        radio.setRadioStationCurrent(8);
        radio.increaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    void increaseRadioStationUnderMax(){
        Radio radio = new Radio();
        radio.setRadioStationCurrent(9);
        radio.increaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }

    @Test
    void decreaseRadioStation(){
        Radio radio = new Radio();
        radio.decreaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    void decreaseRadioStationUnderMin(){
        Radio radio = new Radio();
        radio.setRadioStationCurrent(1);
        radio.decreaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    void decreaseRadioStationBeforeMin(){
        Radio radio = new Radio();
        radio.setRadioStationCurrent(0);
        radio.decreaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }

    @Test
    void increaseVolume(){
        Radio radio = new Radio();
        radio.increaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    void increaseVolumeBeforeMax(){
        Radio radio = new Radio();
        radio.setVolumeCurrent(9);
        radio.increaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    void increaseVolumeUnderMax(){
        Radio radio = new Radio();
        radio.setVolumeCurrent(10);
        radio.increaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }

    @Test
    void decreaseVolume(){
        Radio radio = new Radio();
        radio.decreaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    void decreaseVolumeBeforeMin(){
        Radio radio = new Radio();
        radio.setVolumeCurrent(0);
        radio.decreaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    void decreaseVolumeUnderMin(){
        Radio radio = new Radio();
        radio.setVolumeCurrent(1);
        radio.decreaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }



}