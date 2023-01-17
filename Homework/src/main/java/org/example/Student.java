package org.example;

public class Student extends Person{
    public String schoolName;
    public double grade;
    public String year;

    public Student(String name, int age, Hobby hobby, String address, String schoolName, double grade, String year) {
        super(name, age, hobby, address);
        this.schoolName = schoolName;
        this.grade = grade;
        this.year = year;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String toString() {
        return "Student(schoolName=" + schoolName + ", grade=" + grade + ", year=" + year + ")";
    }
}
