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
    void decreaseRadioStation(){
        Radio radio = new Radio();
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
    void decreaseVolume(){
        Radio radio = new Radio();
        radio.decreaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }



}