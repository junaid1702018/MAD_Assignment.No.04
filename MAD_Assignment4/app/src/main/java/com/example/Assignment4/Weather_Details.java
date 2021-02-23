package com.example.Assignment4;
public class Weather_Details {
    int Icon;
    String UpperBox;
    String LowerBox;
    int Icon2;
    String UpperBox2;
    String LowerBox2;
    
    public Weather_Details(int Icon, String UpperBox, String LowerBox,int Icon2, String UpperBox2, String LowerBox2) {
        this.Icon = Icon;
        this.UpperBox = UpperBox;
        this.LowerBox = LowerBox;
        this.Icon2=Icon2;
        this.UpperBox2 = UpperBox2;
        this.LowerBox2 = LowerBox2;
    }
    public void setIcon(int Icon) {
        this.Icon = Icon;
    }

    public void setUpperBox(String UpperBox) {
        this.UpperBox = UpperBox;
    }

    public void setLowerBox(String LowerBox) {
        this.LowerBox = LowerBox;
    }

    public int getIcon() {
        return Icon;
    }

    public String getUpperBox() {
        return UpperBox;
    }

    public String getLowerBox() {
        return LowerBox;
    }

    public String getUpperBox2() {
        return UpperBox2;
    }

    public void setUpperBox2(String UpperBox2) {
        this.UpperBox2 = UpperBox2;
    }

    public String getLowerBox2() {
        return lowerBox2;
    }

    public void setLowerBox2(String LowerBox2) {
        this.LowerBox2 = LowerBox2;
    }

    public int getIcon2() {
        return Icon2;
    }

    public void setIcon2(int Icon2) {
        Icon2 = Icon2;
    }

}
