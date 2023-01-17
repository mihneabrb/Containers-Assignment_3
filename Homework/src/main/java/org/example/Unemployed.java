package org.example;

import java.util.List;

public class Unemployed extends Person{
    private String lastJob;

    public String getLastJob() {
        return lastJob;
    }

    public Unemployed(String name, int age, Hobby hobby, String address, String lastJob) {
        super(name, age, hobby, address);
        this.lastJob = lastJob;

    }

    public void setLastJob(String lastJob) {
        this.lastJob = lastJob;
    }
}
