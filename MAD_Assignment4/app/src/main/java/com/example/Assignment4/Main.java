package com.example.Assignment4;
public class Main {

    private Double Temp;
    private Double Feels_Like;
    private Double Temp_Min;
    private Double Temp_Max;
    private Integer Pressure;
    private Integer Humidity;
    public Main() {
    }

    public Main(Double Temp, Double Feels_Like, Double Temp_Min, Double Temp_Max, Integer Pressure, Integer Humidity) {
        super();
        this.Temp = Temp;
        this.Feels_Like= Feels_Like;
        this.Temp_Min = Temp_Min;
        this.Temp_Max= Temp_Max;
        this.Pressure = Pressure;
        this.Humidity = Humidity;
    }

    public Double getTemp() {
        return Temp;
    }

    public void setTemp(Double Temp) {
        this.Temp = Temp;
    }

    public Double getFeels_Like() {
        return Feels_Like;
    }

    public void setFeels_Like(Double Feels_Like) {
        this.Feels_Like = Feels_Like;
    }

    public Double getTemp_Min() {
        return temp_Min;
    }

    public void setTemp_Min(Double Temp_Min) {
        this.Temp_Min = Temp_Min;
    }

    public Double getTemp_Max() {
        return Temp_Max;
    }

    public void setTempMax(Double Temp_Max) {
        this.Temp_Max = tempMax;
    }

    public Integer getPressure() {
        return Pressure;
    }

    public void setPressure(Integer Pressure) {
        this.Pressure = Pressure;
    }

    public Integer getHumidity() {
        return Humidity;
    }

    public void setHumidity(Integer Humidity) {
        this.Humidity = Humidity;
    }

}
