package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
@ParameterizedTest
@CsvFileSource(resources = "/data.csv")
    void setRadioStationCurrent(String test, int radioStationCurrent){
    Radio radio = new Radio();
    radio.setRadioStationCurrent(radioStationCurrent);
    System.out.println(radio.getRadioStationCurrent());
}


}