package com.example.markodonovski.recyclerview1;

/**
 * Created by markodonovski on 12/7/17.
 */

public class Student {
    private String sName;
    private boolean sOnline;

    public Student(String sName, boolean sOnline) {
        this.sName = sName;
        this.sOnline = sOnline;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public boolean issOnline() {
        return sOnline;
    }

    public void setsOnline(boolean sOnline) {
        this.sOnline = sOnline;
    }
}
