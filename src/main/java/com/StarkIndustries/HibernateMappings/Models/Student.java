package com.StarkIndustries.HibernateMappings.Models;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    private String sid;

    @Column(name = "name")
    private String name;

    @Column(name = "department")
    private String department;

    @Column(name = "year")
    private String year;


    private Certificate certificate;

    public Student(String sid, String name, String department, String year, Certificate certificate) {
        this.sid = sid;
        this.name = name;
        this.department = department;
        this.year = year;
        this.certificate = certificate;
    }

    public Student(String sid, String name, String department, String year) {
        this.sid = sid;
        this.name = name;
        this.department = department;
        this.year = year;
    }

    public Student(String name, String department, String year) {
        this.name = name;
        this.department = department;
        this.year = year;
    }

    public Student() {
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", year='" + year + '\'' +
                ", certificate=" + certificate +
                '}';
    }
}
