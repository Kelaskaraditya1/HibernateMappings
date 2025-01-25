package com.StarkIndustries.HibernateMappings;

import com.StarkIndustries.HibernateMappings.Configuration.Utility;
import com.StarkIndustries.HibernateMappings.Models.Certificate;
import com.StarkIndustries.HibernateMappings.Models.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMappingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateMappingsApplication.class, args);
		SessionFactory sessionFactory = Utility.getSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Certificate certificate1 = new Certificate("Android Development","2021FHCO","1 Year");
		Student student1 = new Student("2021FHCO042","Aditya Kelaskar","Computer","FE",certificate1);

		Certificate certificate2 = new Certificate("Web Development","2021FHCO","5 months");
		Student student2 = new Student("2021FHCO041","Sandesh Jadhav","Computer","FE",certificate2);

		session.save(student1);
		session.save(student2);

		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
