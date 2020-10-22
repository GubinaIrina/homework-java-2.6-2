package ru.netology.domain;

import org.junit.jupiter.api.Test;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

class RadioTest {

    @Test
    public void radioStationMax() {
        Radio radio = new Radio("Радио", 15, 0, 5, 100, 0, 50, true);
        radio.setRadioStationMax(15);
        System.out.println(radio.getRadioStationMax());
    }
    @Test
    public void setRadioStationCurrent() {
        Radio radio = new Radio("Радио", 15, 0, 5, 100, 0, 50, true);
        radio.setRadioStationCurrent(10);
        System.out.println(radio.getRadioStationCurrent());
    }

    @Test
    public void setRadioStationCurrentUnderMax() {
        Radio radio = new Radio("Радио", 9, 0, 10, 100, 0, 50, true);
        radio.setRadioStationCurrent(10);
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    public void setRadioStationCurrentBeforeMin() {
        Radio radio = new Radio("Радио", 15, 0, -1, 100, 0, 50, true);
        radio.setRadioStationCurrent(-1);
        System.out.println(radio.getRadioStationCurrent());
    }

    @Test
    public void setVolumeCurrent() {
        Radio radio = new Radio("Радио", 15, 0, 5, 100, 0, 50, true);
        radio.setVolumeCurrent(50);
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    public void setVolumeCurrentUnderMax() {
        Radio radio = new Radio("Радио", 15, 0, 5, 100, 0, 101, true);
        radio.setVolumeCurrent(101);
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    public void setVolumeCurrentBeforeMin() {
        Radio radio = new Radio("Радио", 15, 0, 5, 100, 0, -1, true);
        radio.setVolumeCurrent(-1);
        System.out.println(radio.getVolumeCurrent());
    }

    @Test
    public void increaseRadioStation(){
        Radio radio = new Radio("Радио", 10, 0, 5, 100, 0, 50, true);
        radio.increaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    public void increaseRadioStationBeforeMax(){
        Radio radio = new Radio("Радио", 10, 0, 9, 100, 0, 50, true);
        radio.increaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    public void increaseRadioStationUnderMax(){
        Radio radio = new Radio("Радио", 10, 0, 10, 100, 0, 50, true);
        radio.increaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }

    @Test
    public void decreaseRadioStation(){
        Radio radio = new Radio("Радио", 10, 0, 5, 100, 0, 50, true);
        radio.decreaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    public void decreaseRadioStationUnderMin(){
        Radio radio = new Radio("Радио", 10, 0, 1, 100, 0, 50, true);
        radio.decreaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }
    @Test
    public void decreaseRadioStationBeforeMin(){
        Radio radio = new Radio("Радио", 10, 0, 0, 100, 0, 50, true);
        radio.decreaseRadioStation();
        System.out.println(radio.getRadioStationCurrent());
    }

    @Test
    public void increaseVolume(){
        Radio radio = new Radio("Радио", 10, 0, 5, 100, 0, 50, true);
        radio.increaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    public void increaseVolumeBeforeMax(){
        Radio radio = new Radio("Радио", 15, 0, 5, 100, 0, 99, true);
        radio.increaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    public void increaseVolumeUnderMax(){
        Radio radio = new Radio("Радио", 10, 0, 5, 100, 0, 100, true);
        radio.increaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }

    @Test
    public void decreaseVolume(){
        Radio radio = new Radio("Радио", 10, 0, 5, 100, 0, 50, true);
        radio.decreaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    public void decreaseVolumeBeforeMin(){
        Radio radio = new Radio("Радио", 10, 0, 5, 100, 0, 0, true);
        radio.decreaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
    @Test
    public void decreaseVolumeUnderMin(){
        Radio radio = new Radio("Радио", 10, 0, 5, 100, 0, 1, true);
        radio.decreaseVolume();
        System.out.println(radio.getVolumeCurrent());
    }
}