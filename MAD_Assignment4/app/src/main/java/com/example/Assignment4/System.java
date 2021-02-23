package com.example.Assignment4;
public class System {

    private Integer Type;
    private Integer ID;
    private Double Msg;
    private String Country;
    private Integer Sunrise;
    private Integer Sunset;
    public System() {
    }
    public System(Integer Type, Integer ID, Double message, String Country, Integer Sunrise, Integer Sunset) {
        super();
        this.Type = Type;
        this.ID= ID;
        this.Msg = Msg;
        this.Country = Country;
        this.Sunrise = Sunrise;
        this.Sunset = Sunset;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public Integer getID() {
        return ID;
    }

    public void setId(Integer ID) {
        this.ID = ID;
    }

    public Double getMsg() {
        return Msg;
    }

    public void setMsg(Double Msg) {
        this.Msg = Msg;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public Integer getSunrise() {
        return Sunrise;
    }

    public void setSunrise(Integer Sunrise) {
        this.Sunrise = Sunrise;
    }

    public Integer getSunset() {
        return Sunset;
    }

    public void setSunset(Integer Sunset) {
        this.Sunset = Sunset;
    }

}
