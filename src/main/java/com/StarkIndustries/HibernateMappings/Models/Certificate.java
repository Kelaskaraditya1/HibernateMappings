package com.StarkIndustries.HibernateMappings.Models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class Certificate {

    private String courseName;

    private String certificateNumber;

    private String duration;

    public Certificate(String courseName,String certificateNumber,String duration){
        this.courseName=courseName;
        this.certificateNumber=certificateNumber;
        this.duration=duration;
    }

    public Certificate(){

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "courseName='" + courseName + '\'' +
                ", certificateNumber='" + certificateNumber + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
