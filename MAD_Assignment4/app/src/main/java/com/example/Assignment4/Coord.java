package com.example.Assignment4;
public class Coord {
    private Double lt;
    private Double ln;
    public Coord() {
    }

    public Coord(Double lt, Double ln) {
        super();
        this.lt = lt;
        this.ln = ln;
    }

    public void setLt(Double lt) {
        this.lt = lt;
    }
    public void setLn(Double ln) {
        this.ln = ln;
    }

    public Double getLt() {
        return lt;
    }
     public Double getLn() {
        return ln;
    }

}
