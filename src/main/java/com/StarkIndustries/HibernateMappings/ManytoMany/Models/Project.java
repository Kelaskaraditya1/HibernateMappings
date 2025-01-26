package com.StarkIndustries.HibernateMappings.ManytoMany.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectId;

    @Column(name = "project_name")
    private String projectName;

    @ManyToMany(mappedBy = "projectList")
    private List<Employee> employeeList;

    public Project(int projectId, String projectName, List<Employee> employeeList) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.employeeList = employeeList;
    }

    public Project(int projectId,String projectName){
        this.projectId=projectId;
        this.projectName=projectName;
    }

    public Project(String projectName, List<Employee> employeeList) {
        this.projectName = projectName;
        this.employeeList = employeeList;
    }

    public Project() {
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
