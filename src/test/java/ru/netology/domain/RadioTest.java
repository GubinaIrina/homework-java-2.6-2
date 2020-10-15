package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @ParameterizedTest
    @CsvFileSource(resources = "/dataStation.csv")
    void setRadioStationCurrent(String test, int radioStationCurrent) {
        radio.setRadioStationCurrent(radioStationCurrent);
        System.out.println(radio.getRadioStationCurrent());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataVolume.csv")
    void setVolumeCurrent(String test, int currentVolume) {
        radio.setVolumeCurrent(currentVolume);
        System.out.println(radio.getVolumeCurrent());
    }

    @Test
    void increaseRadioStation(){
        radio.increaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    void increaseRadioStationBeforeMax(){
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
        radio.decreaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    void decreaseRadioStationUnderMin(){
        radio.setRadioStationCurrent(1);
        radio.decreaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    void decreaseRadioStationBeforeMin(){
        radio.setRadioStationCurrent(0);
        radio.decreaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }

    @Test
    void increaseVolume(){
        radio.increaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    void increaseVolumeBeforeMax(){
        radio.setVolumeCurrent(9);
        radio.increaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    void increaseVolumeUnderMax(){
        radio.setVolumeCurrent(10);
        radio.increaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }

    @Test
    void decreaseVolume(){
        radio.decreaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    void decreaseVolumeBeforeMin(){
        radio.setVolumeCurrent(0);
        radio.decreaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    void decreaseVolumeUnderMin(){
        radio.setVolumeCurrent(1);
        radio.decreaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
}