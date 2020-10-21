package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void radioStationMax() {
        Radio radio = new Radio("Радио", 15, 5,  3, true);
        radio.setRadioStationMax(15);
        System.out.println(radio.getRadioStationMax());
    }
    @Test
    public void setRadioStationCurrent() {
        Radio radio = new Radio("Радио", 10, 5,  5,true);
        radio.setRadioStationCurrent(10);
        System.out.println(radio.getRadioStationCurrent());
    }

    @Test
    public void setRadioStationCurrentUnderMax() {
        Radio radio = new Radio("Радио", 9,  10,  5,true);
        radio.setRadioStationCurrent(10);
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    public void setRadioStationCurrentBeforeMin() {
        Radio radio = new Radio("Радио", 10, -1, 5, true);
        radio.setRadioStationCurrent(-1);
        System.out.println(radio.getRadioStationCurrent());
    }

    @Test
    public void setVolumeCurrent() {
        Radio radio = new Radio("Радио", 10, 4, 50, true);
        radio.setVolumeCurrent(50);
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    public void setVolumeCurrentUnderMax() {
        Radio radio = new Radio("Радио", 10, 5, 101, true);
        radio.setVolumeCurrent(101);
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    public void setVolumeCurrentBeforeMin() {
        Radio radio = new Radio("Радио", 10, 4, -1, true);
        radio.setVolumeCurrent(-1);
        System.out.println(radio.getVolumeCurrent());
    }

    @Test
    public void increaseRadioStation(){
        Radio radio = new Radio("Радио", 10, 5, 5, true);
        radio.increaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    public void increaseRadioStationBeforeMax(){
        Radio radio = new Radio("Радио", 10, 9, 5, true);
        radio.increaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    public void increaseRadioStationUnderMax(){
        Radio radio = new Radio("Радио", 10, 10, 5, true);
        radio.increaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }

    @Test
    public void decreaseRadioStation(){
        Radio radio = new Radio("Радио", 10, 5, 5, true);
        radio.decreaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    public void decreaseRadioStationUnderMin(){
        Radio radio = new Radio("Радио", 10, 1, 5, true);
        radio.decreaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    public void decreaseRadioStationBeforeMin(){
        Radio radio = new Radio("Радио", 10, 0, 5, true);
        radio.decreaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }

    @Test
    public void increaseVolume(){
        Radio radio = new Radio("Радио", 10, 5, 50, true);
        radio.increaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    public void increaseVolumeBeforeMax(){
        Radio radio = new Radio("Радио", 10, 5, 99, true);
        radio.increaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    public void increaseVolumeUnderMax(){
        Radio radio = new Radio("Радио", 10, 5, 100, true);
        radio.increaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }

    @Test
    public void decreaseVolume(){
        Radio radio = new Radio("Радио", 10, 5, 50, true);
        radio.decreaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    public void decreaseVolumeBeforeMin(){
        Radio radio = new Radio("Радио", 10, 5, 0, true);
        radio.decreaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    public void decreaseVolumeUnderMin(){
        Radio radio = new Radio("Радио", 10, 1, 1, true);
        radio.decreaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
}