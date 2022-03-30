package com.tekbuddy.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "QueAns")
public class QueAns {

    @Id
    private String id;

    private String question;
    private String answer;
    private String skill;
    private String ans_profile_id;
    private String ans_profile_name;
    private String ques_profile_id;
    private String ques_profile_name;
    private Integer rating;

    public QueAns(String question, String answer, String skill, String ans_profile_id, String ans_profile_name, String ques_profile_id, String ques_profile_name, Integer rating) {
        this.question = question;
        this.answer = answer;
        this.skill = skill;
        this.ans_profile_id = ans_profile_id;
        this.ans_profile_name = ans_profile_name;
        this.ques_profile_id = ques_profile_id;
        this.ques_profile_name = ques_profile_name;
        this.rating = rating;
    }
}
