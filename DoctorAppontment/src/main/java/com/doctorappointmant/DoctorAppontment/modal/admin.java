package com.doctorappointmant.DoctorAppontment.modal;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
public class admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String doctorname;
    private String doctorpass;
    private String doctorcategori;
    private String selectdate;
    private String startingtime;
    private String endingtime;

    public admin(){

    }

    public admin(String doctorname, String doctorpass, String doctorcategori, String selectdate, String startingtime, String endingtime)
    {
        this.doctorname = doctorname;
        this.doctorpass = doctorpass;
        this.doctorcategori = doctorcategori;
        this.selectdate = selectdate;
        this.startingtime = startingtime;
        this.endingtime = endingtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getDoctorpass() {
        return doctorpass;
    }

    public void setDoctorpass(String doctorpass) {
        this.doctorpass = doctorpass;
    }

    public String getDoctorcategori() {
        return doctorcategori;
    }

    public void setDoctorcategori(String doctorcategori) {
        this.doctorcategori = doctorcategori;
    }

    public String getSelectdate() {
        return selectdate;
    }

    public void setSelectdate(String selectdate) {
        this.selectdate = selectdate;
    }

    public String getStartingtime() {
        return startingtime;
    }

    public void setStartingtime(String startingtime) {
        this.startingtime = startingtime;
    }

    public String getEndingtime() {
        return endingtime;
    }

    public void setEndingtime(String endingtime) {
        this.endingtime = endingtime;
    }
}
