package com.example.Assignment4;
public class Weather {

    private Integer ID;
    private String Main;
    private String Description;
    private String Icon;
    public Weather() {
    }
    public Weather(Integer ID, String Main, String description, String icon) {
        super();
        this.ID = ID;
        this.Main = Main;
        this.description = description;
        this.icon = icon;
    }

    public Integer getID() {
        return ID;
    }

    public void setId(Integer ID) {
        this.ID = ID;
    }

    public String getMain() {
        return Main;
    }

    public void setMain(String Main) {
        this.Main = Main;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

}
