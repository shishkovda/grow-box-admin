package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="history")
public class GrowBoxRecord implements Serializable {

    @Id
    @Column
    private Integer growBoxId;
    @Id
    @Column
    private Date date;
    @Column
    private Integer temperature;
    @Column
    private Integer humidity;
    @Column
    private Integer co2;

    public Integer getGrowBoxId() {
        return growBoxId;
    }

    public void setGrowBoxId(Integer growBoxId) {
        this.growBoxId = growBoxId;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCo2() {
        return co2;
    }

    public void setCo2(Integer co2) {
        this.co2 = co2;
    }
}
