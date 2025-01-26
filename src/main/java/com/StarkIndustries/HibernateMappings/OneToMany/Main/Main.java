package com.StarkIndustries.HibernateMappings.OneToMany.Main;

import com.StarkIndustries.HibernateMappings.Configuration.Utility;
import com.StarkIndustries.HibernateMappings.OneToMany.Models.Answer;
import com.StarkIndustries.HibernateMappings.OneToMany.Models.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = Utility.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Question question1 = new Question(101,"What is Java");
        Answer answer1 =new Answer(201,"Java is Object Oriented Language",question1);
        Answer answer2 = new Answer(202,"Java is an Enterprise Language",question1);
        List<Answer> answerList = new ArrayList<>(List.of(answer1,answer2));
        question1.setAnswer(answerList);

        session.save(question1);
        session.save(answer1);
        session.save(answer2);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
