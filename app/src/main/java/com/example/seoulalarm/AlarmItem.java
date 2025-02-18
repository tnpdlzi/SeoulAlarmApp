package com.example.seoulalarm;


import android.graphics.drawable.Drawable;

public class AlarmItem {
    String noon;
    int hour;
    int minute;
    Drawable mon;
    Drawable tue;
    Drawable wed;
    Drawable thu;
    Drawable fri;
    Drawable sat;
    Drawable sun;

    public String getNoon() {
        return noon;
    }

    public void setNoon(String noon) {
        this.noon = noon;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Drawable getMon() {
        return mon;
    }

    public void setMon(Drawable mon) {
        this.mon = mon;
    }

    public Drawable getTue() {
        return tue;
    }

    public void setTue(Drawable tue) {
        this.tue = tue;
    }

    public Drawable getWed() {
        return wed;
    }

    public void setWed(Drawable wed) {
        this.wed = wed;
    }

    public Drawable getThu() {
        return thu;
    }

    public void setThu(Drawable thu) {
        this.thu = thu;
    }

    public Drawable getFri() {
        return fri;
    }

    public void setFri(Drawable fri) {
        this.fri = fri;
    }

    public Drawable getSat() {
        return sat;
    }

    public void setSat(Drawable sat) {
        this.sat = sat;
    }

    public Drawable getSun() {
        return sun;
    }

    public void setSun(Drawable sun) {
        this.sun = sun;
    }

    @Override
    public String toString() {
        return "AlarmItem{" +
                "noon='" + noon + '\'' +
                ", hour=" + hour +
                ", minute=" + minute +
                ", mon=" + mon +
                ", tue=" + tue +
                ", wed=" + wed +
                ", thu=" + thu +
                ", fri=" + fri +
                ", sat=" + sat +
                ", sun=" + sun +
                '}';
    }
}
