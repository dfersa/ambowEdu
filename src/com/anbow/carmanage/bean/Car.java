package com.anbow.carmanage.bean;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carid, car.carid) && Objects.equals(carmodel, car.carmodel) && Objects.equals(carnumber, car.carnumber) && Objects.equals(carcolor, car.carcolor) && Objects.equals(carbrand, car.carbrand) && Objects.equals(cardriver, car.cardriver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carid, carmodel, carnumber, carcolor, carbrand, cardriver);
    }

}
