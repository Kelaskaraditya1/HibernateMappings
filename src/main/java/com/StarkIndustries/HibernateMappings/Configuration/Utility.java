package com.StarkIndustries.HibernateMappings.Configuration;

import com.StarkIndustries.HibernateMappings.Keys.Keys;
import com.StarkIndustries.HibernateMappings.ManytoMany.Models.Employee;
import com.StarkIndustries.HibernateMappings.ManytoMany.Models.Project;
import com.StarkIndustries.HibernateMappings.Models.Certificate;
import com.StarkIndustries.HibernateMappings.Models.Student;
import com.StarkIndustries.HibernateMappings.OneToMany.Models.Answer;
import com.StarkIndustries.HibernateMappings.OneToMany.Models.Question;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class Utility {

    private static SessionFactory sessionFactory;

    public Utility(){

    }

    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            Configuration configuration = new Configuration();
            Properties properties = new Properties();
            properties.put(Environment.DRIVER, Keys.DRIVER);
            properties.put(Environment.URL,Keys.URL);
            properties.put(Environment.USER,Keys.USERNAME);
            properties.put(Environment.PASS,Keys.PASSWORD);
            properties.put(Environment.DIALECT,Keys.DIALECT);
            properties.put(Environment.HBM2DDL_AUTO,Keys.HBM2DDL_AUTO);
            properties.put(Environment.SHOW_SQL, Keys.SHOW_SQL);
            properties.put(Environment.FORMAT_SQL,Keys.FORMAT_SQL);
            configuration.setProperties(properties);

            configuration.addAnnotatedClass(Student.class);
            configuration.addAnnotatedClass(Certificate.class);
            configuration.addAnnotatedClass(Question.class);
            configuration.addAnnotatedClass(Answer.class);
            configuration.addAnnotatedClass(Employee.class);
            configuration.addAnnotatedClass(Project.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory= configuration.buildSessionFactory(serviceRegistry);
        }

        return sessionFactory;
    }

}
