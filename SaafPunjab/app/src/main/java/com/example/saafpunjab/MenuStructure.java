package com.example.saafpunjab;

public class MenuStructure {
    private String name;
    private String empNo;
    private String uc;
    private String shift;

    public MenuStructure(String name, String empNo, String uc, String shift) {
        this.name = name;
        this.empNo = empNo;
        this.uc = uc;
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public String getEmpNo() {
        return empNo;
    }

    public String getUc() {
        return uc;
    }

    public String getShift() {
        return shift;
    }
}
