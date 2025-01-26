package com.StarkIndustries.HibernateMappings.ManytoMany.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Column(name = "Name")
    private String empName;

    @Column(name = "Department")
    private String empDepartment;

    @ManyToMany
    private List<Project> projectList;

    public Employee(int empId, String empName, String empDepartment, List<Project> projectList) {
        this.empId = empId;
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.projectList = projectList;
    }

    public Employee(int empId,String empName,String empDepartment){
        this.empId=empId;
        this.empName=empName;
        this.empDepartment=empDepartment;
    }

    public Employee(String empName, String empDepartment, List<Project> projectList) {
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.projectList = projectList;
    }

    public Employee(){

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                ", projectList=" + projectList +
                '}';
    }
}
