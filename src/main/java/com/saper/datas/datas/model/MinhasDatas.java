package com.saper.datas.datas.model;

import jakarta.persistence.*;

import java.time.*;

@Entity
public class MinhasDatas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDate myData;

    LocalTime myHora;

    LocalDateTime myDataHora;

    OffsetTime myHoraZona;

    OffsetDateTime myDataHoraZona;

    OffsetDateTime myCreatedTime;

    public MinhasDatas(Long id, LocalDate myData, LocalTime myHora, LocalDateTime myDataHora, OffsetTime myHoraZona, OffsetDateTime myDataHoraZona) {
        this.id = id;
        this.myData = myData;
        this.myHora = myHora;
        this.myDataHora = myDataHora;
        this.myHoraZona = myHoraZona;
        this.myDataHoraZona = myDataHoraZona;
    }

    public MinhasDatas(Long id, LocalDate myData, LocalTime myHora, LocalDateTime myDataHora, OffsetTime myHoraZona, OffsetDateTime myDataHoraZona, OffsetDateTime myCreatedTime) {
        this.id = id;
        this.myData = myData;
        this.myHora = myHora;
        this.myDataHora = myDataHora;
        this.myHoraZona = myHoraZona;
        this.myDataHoraZona = myDataHoraZona;
        this.myCreatedTime = myCreatedTime;
    }

    public MinhasDatas(LocalDate myData, LocalTime myHora, LocalDateTime myDataHora, OffsetTime myHoraZona, OffsetDateTime myDataHoraZona) {
        this.myData = myData;
        this.myHora = myHora;
        this.myDataHora = myDataHora;
        this.myHoraZona = myHoraZona;
        this.myDataHoraZona = myDataHoraZona;
    }

    public MinhasDatas() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetDateTime getMyCreatedTime() {
        return myCreatedTime;
    }

    public void setMyCreatedTime(OffsetDateTime myCreatedTime) {
        this.myCreatedTime = myCreatedTime;
    }
}
