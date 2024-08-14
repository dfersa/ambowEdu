package com.anbow.carmanage.bean;

public class Dirver {
    private Integer driverid;
    private String drivername;
    private String phone;
    private String drivertype;
    private Integer drivertime;
    private Integer carid;

    public Dirver(String drivername, String phone, String drivertype, Integer drivertime, Integer carid) {
        this.drivername = drivername;
        this.phone = phone;
        this.drivertype = drivertype;
        this.drivertime = drivertime;
        this.carid = carid;
    }

    public Dirver() {
    }

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDrivertype() {
        return drivertype;
    }

    public void setDrivertype(String drivertype) {
        this.drivertype = drivertype;
    }

    public Integer getDrivertime() {
        return drivertime;
    }

    public void setDrivertime(Integer drivertime) {
        this.drivertime = drivertime;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }
}
