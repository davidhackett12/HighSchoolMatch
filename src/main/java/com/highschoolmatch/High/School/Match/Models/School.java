package com.highschoolmatch.High.School.Match.Models;


import javax.persistence.*;
import java.util.List;

@Entity
public class School {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private double avgGpa = 0.0;

    private double minGpa = 0.0;

    private double maxGpa = 0.0;

    private double avgIowa = 0.0;

    private double minIowa = 0.0;

    private double maxIowa = 0.0;

    private double avgMath = 0.0;

    private double avgEng = 0.0;

    @OneToMany
    @JoinColumn(name = "school_id")
    private List<Student> data;

    public School() {
    }

    public School(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgGpa() {
        return avgGpa;
    }

    public void setAvgGpa(double avgGpa) {
        this.avgGpa = avgGpa;
    }


    public double getMinGpa() {
        return minGpa;
    }

    public void setMinGpa(double minGpa) {
        this.minGpa = minGpa;
    }

    public double getMaxGpa() {
        return maxGpa;
    }

    public void setMaxGpa(double maxGpa) {
        this.maxGpa = maxGpa;
    }

    public double getAvgIowa() {
        return avgIowa;
    }

    public void setAvgIowa(double avgIowa) {
        this.avgIowa = avgIowa;
    }

    public double getMinIowa() {
        return minIowa;
    }

    public void setMinIowa(double minIowa) {
        this.minIowa = minIowa;
    }

    public double getMaxIowa() {
        return maxIowa;
    }

    public void setMaxIowa(double maxIowa) {
        this.maxIowa = maxIowa;
    }

    public double getAvgMath() {
        return avgMath;
    }

    public void setAvgMath(double avgMath) {
        this.avgMath = avgMath;
    }

    public double getAvgEng() {
        return avgEng;
    }

    public void setAvgEng(double avgEng) {
        this.avgEng = avgEng;
    }

    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
        this.data = data;
    }

    public void calculateData(){
        int n = this.data.size();
        double gradepoints = 0.0;
        double totalOvrIowa = 0.0;
        double totalEngIowa = 0.0;
        double totalMathIowa = 0.0;
        for (Student student : this.data){
            gradepoints = gradepoints + student.getCoreGpa();
            totalOvrIowa = totalOvrIowa + student.getOvrIowa();
            totalEngIowa = totalEngIowa + student.getEngIowa();
            totalMathIowa = totalMathIowa + student.getMathIowa();
        }

        this.avgGpa = gradepoints/n;
        this.avgIowa = totalOvrIowa/n;
        this.avgEng = totalEngIowa/n;
        this.avgMath = totalMathIowa/n;

    }
}
