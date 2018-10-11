package com.highschoolmatch.High.School.Match.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private int id;

    private String lastName;

    private String firstName;

    private double coreGpa;

    private double ovrIowa;

    private double engIowa;

    private double mathIowa;

    @ManyToOne
    private School school;

    public Student() {
    }

    public Student(String lastName, String firstName,
                   double coreGpa, double ovrIowa,
                   double engIowa, double mathIowa) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.coreGpa = coreGpa;
        this.ovrIowa = ovrIowa;
        this.engIowa = engIowa;
        this.mathIowa = mathIowa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getCoreGpa() {
        return coreGpa;
    }

    public void setCoreGpa(double coreGpa) {
        this.coreGpa = coreGpa;
    }

    public double getOvrIowa() {
        return ovrIowa;
    }

    public void setOvrIowa(double ovrIowa) {
        this.ovrIowa = ovrIowa;
    }

    public double getEngIowa() {
        return engIowa;
    }

    public void setEngIowa(double engIowa) {
        this.engIowa = engIowa;
    }

    public double getMathIowa() {
        return mathIowa;
    }

    public void setMathIowa(double mathIowa) {
        this.mathIowa = mathIowa;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
