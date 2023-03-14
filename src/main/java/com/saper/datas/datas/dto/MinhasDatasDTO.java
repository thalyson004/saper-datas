package com.saper.datas.datas.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.*;

public class MinhasDatasDTO {

    LocalDate myData;

    LocalTime myHora;

    LocalDateTime myDataHora;

    OffsetTime myHoraZona;

    OffsetDateTime myDataHoraZona;


    public MinhasDatasDTO(LocalDate myData, LocalTime myHora, LocalDateTime myDataHora, OffsetTime myHoraZona, OffsetDateTime myDataHoraZona) {
        this.myData = myData;
        this.myHora = myHora;
        this.myDataHora = myDataHora;
        this.myHoraZona = myHoraZona;
        this.myDataHoraZona = myDataHoraZona;
    }

    public MinhasDatasDTO() {
    }

    public LocalDate getMyData() {
        return myData;
    }

    public void setMyData(LocalDate myData) {
        this.myData = myData;
    }

    public LocalTime getMyHora() {
        return myHora;
    }

    public void setMyHora(LocalTime myHora) {
        this.myHora = myHora;
    }

    public LocalDateTime getMyDataHora() {
        return myDataHora;
    }

    public void setMyDataHora(LocalDateTime myDataHora) {
        this.myDataHora = myDataHora;
    }

    public OffsetTime getMyHoraZona() {
        return myHoraZona;
    }

    public void setMyHoraZona(OffsetTime myHoraZona) {
        this.myHoraZona = myHoraZona;
    }

    public OffsetDateTime getMyDataHoraZona() {
        return myDataHoraZona;
    }

    public void setMyDataHoraZona(OffsetDateTime myDataHoraZona) {
        this.myDataHoraZona = myDataHoraZona;
    }
}
