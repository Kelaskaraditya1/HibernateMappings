package com.StarkIndustries.HibernateMappings.OneToMany.Models;

import javax.persistence.*;

@Entity
@Table(name = "Answers")
public class Answer {

    @Id
    @Column(name = "answer_id")
    private int answerId;

    @Column(name = "answer")
    private String answer;

    @OneToOne(mappedBy = "answer")
    private Question question;

    public Answer(int answerId,String answer,Question question){
        this.answerId=answerId;
        this.answer=answer;
        this.question=question;
    }

    public Answer(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public Answer() {
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", answer='" + answer + '\'' +
                ", question=" + question +
                '}';
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

}
