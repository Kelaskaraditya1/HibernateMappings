package com.StarkIndustries.HibernateMappings.OneToMany.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Questions")
public class Question {

    @Id
    @Column(name = "question_Id")
    private int questionId;

    @Column(name = "question")
    private String question;

    @OneToMany(mappedBy = "question")
    private List<Answer> answer;

    public Question(int questionId, String question, List<Answer> answer) {
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }

    public Question(int questionId, String question) {
        this.questionId = questionId;
        this.question = question;
    }

    public Question() {
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", answer=" + answer +
                '}';
    }
}
