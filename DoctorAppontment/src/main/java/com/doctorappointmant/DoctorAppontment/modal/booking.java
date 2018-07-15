package com.doctorappointmant.DoctorAppontment.modal;

import javax.persistence.*;

@Entity
@Table(name = "booking")
public class booking {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String p_name;
    private String d_name;
    private String categoris;
    private String date;
    private String time;

    public booking() {

    }
    public booking(String p_name, String d_name, String categoris, String date, String time) {
        this.p_name = p_name;
        this.d_name = d_name;
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

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
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
                ", p_name='" + p_name + '\'' +
                ", d_name='" + d_name + '\'' +
                ", categoris='" + categoris + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
