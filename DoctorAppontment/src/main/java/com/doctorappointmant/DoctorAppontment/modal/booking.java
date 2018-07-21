package com.doctorappointmant.DoctorAppontment.modal;

import javax.persistence.*;

@Entity
@Table(name = "booking")
public class booking {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String patname;
    private String doctname;
    private String categoris;
    private String date;
    private String time;

    public booking(){

    }

    public booking(String patname, String doctname, String categoris, String date, String time) {
        this.patname = patname;
        this.doctname = doctname;
        this.categoris = categoris;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatname() {
        return patname;
    }

    public void setPatname(String patname) {
        this.patname = patname;
    }

    public String getDoctname() {
        return doctname;
    }

    public void setDoctname(String doctname) {
        this.doctname = doctname;
    }

    public String getCategoris() {
        return categoris;
    }

    public void setCategoris(String categoris) {
        this.categoris = categoris;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "booking{" +
                "id=" + id +
                ", patname='" + patname + '\'' +
                ", doctname='" + doctname + '\'' +
                ", categoris='" + categoris + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
