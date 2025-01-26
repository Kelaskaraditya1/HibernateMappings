package com.StarkIndustries.HibernateMappings.OneToOne.Main;

import com.StarkIndustries.HibernateMappings.Configuration.Utility;
import com.StarkIndustries.HibernateMappings.OneToOne.Models.Answer;
import com.StarkIndustries.HibernateMappings.OneToOne.Models.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = Utility.getSessionFactory();

        Answer answer1 = new Answer(202,"Android is an Operating System");
        Question question1 = new Question(102,"What is Android?",answer1);
        answer1.setQuestion(question1);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(question1);
        session.save(answer1);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
