package org.example;

import java.util.List;

public class Employee extends Person{
    private String skills;
    private double salary;
    private String jobName;

    public String getSkills() {
        return skills;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Employee(String name, int age, Hobby hobby, String address, String skills, double salary, String jobName) {
        super(name, age, hobby, address);
        this.skills = skills;
        this.salary = salary;
        this.jobName = jobName;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String toString() {
        return "Employee(skills=" + skills + ", salary=" + salary + ", job name=" + jobName + ")";
    }
}
