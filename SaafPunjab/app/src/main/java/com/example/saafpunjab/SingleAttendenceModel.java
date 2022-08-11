package com.example.saafpunjab;

public class SingleAttendenceModel {
    private String day, date, checkin, checkout, status;

    public String getStatus() {
        return status;
    }

    public SingleAttendenceModel(String day, String date, String checkin, String checkout, String status) {
        this.day = day;
        this.date = date;
        this.checkin = checkin;
        this.checkout = checkout;
        this.status= status;
    }

    public String getDay() {
        return day;
    }

    public String getDate() {
        return date;
    }

    public String getCheckin() {
        return checkin;
    }

    public String getCheckout() {
        return checkout;
    }


}
