package com.rakovets.course.javabasics.practice.javaio;

import java.io.Serializable;

public class Computer implements Serializable {
    private String CPU;
    private String HDD;
    private String RAM;

    public Computer(String CPU, String HDD, String RAM) {
        this.CPU = CPU;
        this.HDD = HDD;
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }
}
