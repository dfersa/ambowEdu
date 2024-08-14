package com.anbow.carmanage.bean;

public class Car {
    private Integer carid;
    private Integer carmodel;
    private String carnumber;
    private String carcolor;
    private String carbrand;
    private String cardriver;

    public Car(Integer carmodel, String carnumber, String carcolor, String carbrand, String cardriver) {
        this.carmodel = carmodel;
        this.carnumber = carnumber;
        this.carcolor = carcolor;
        this.carbrand = carbrand;
        this.cardriver = cardriver;
    }

    public Car() {
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(Integer carmodel) {
        this.carmodel = carmodel;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCardriver() {
        return cardriver;
    }

    public void setCardriver(String cardriver) {
        this.cardriver = cardriver;
    }


}
