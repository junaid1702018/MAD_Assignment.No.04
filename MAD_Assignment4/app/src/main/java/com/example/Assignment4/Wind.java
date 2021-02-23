package com.example.Assignment4;
public class Wind {

    private Double Speed;
    private Integer Degree;
    public Wind() {
    }

    public Wind(Double Speed, Integer Degree) {
        super();
        this.Speed = Speed;
        this.Degree = Degree;
    }

    public Double getSpeed() {
        return Speed;
    }

    public void setSpeed(Double Speed) {
        this.Speed = Speed;
    }

    public Integer getDegree() {
        return Degree;
    }

    public void setDegree(Integer eDgree) {
        this.Degree = Degree;
    }

}
