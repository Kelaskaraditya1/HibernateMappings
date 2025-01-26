package com.StarkIndustries.HibernateMappings.ManytoMany.Main;

import com.StarkIndustries.HibernateMappings.Configuration.Utility;
import com.StarkIndustries.HibernateMappings.ManytoMany.Models.Employee;
import com.StarkIndustries.HibernateMappings.ManytoMany.Models.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = Utility.getSessionFactory();

        Employee employee1 = new Employee(101,"Aditya Kelaskar","Native Developer");
        Employee employee2 = new Employee(102,"Mayur Khatal","Web developer");
        Employee employee3 = new Employee(103,"Sandesh Jadhav","Cloud Engineer");
        Employee employee4 = new Employee(104,"Aaryaman Ahirao","Negotiator");

        Project project1 = new Project(201,"Chatbot");
        Project project2 = new Project(202,"Android App");
        Project project3 = new Project(203,"Attendance App");
        Project project4 = new Project(204,"Radient Dermat");

        List<Employee> employeeList = List.of(employee1,employee2,employee3,employee4);
        List<Project> projectList = List.of(project1,project2,project3,project4);

        employee1.setProjectList(projectList);
        employee2.setProjectList(projectList);
        employee3.setProjectList(projectList);
        employee4.setProjectList(projectList);

        project1.setEmployeeList(employeeList);
        project2.setEmployeeList(employeeList);
        project3.setEmployeeList(employeeList);
        project4.setEmployeeList(employeeList);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(employee1);
        session.save(employee2);
        session.save(employee3);
        session.save(employee4);

        session.save(project1);
        session.save(project2);
        session.save(project3);
        session.save(project4);

        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
