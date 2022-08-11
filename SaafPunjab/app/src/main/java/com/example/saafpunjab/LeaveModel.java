package com.example.saafpunjab;

public class LeaveModel {

    private String l_leavetype, l_status, l_datefrom, l_dateto, l_noofdays, l_name;

    public LeaveModel(String l_name, String l_leavetype, String l_status, String l_datefrom, String l_dateto, String l_noofdays) {
        this.l_leavetype = l_leavetype;
        this.l_status = l_status;
        this.l_datefrom = l_datefrom;
        this.l_dateto = l_dateto;
        this.l_noofdays = l_noofdays;
        this.l_name = l_name;
    }

    public String getL_leavetype() {
        return l_leavetype;
    }

    public String getL_status() {
        return l_status;
    }

    public String getL_datefrom() {
        return l_datefrom;
    }

    public String getL_dateto() {
        return l_dateto;
    }

    public String getL_noofdays() {
        return l_noofdays;
    }

    public String getL_name() {
        return l_name;
    }
}
