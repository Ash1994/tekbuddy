package com.tekbuddy.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString
@Document(collection  = "Profile")
public class Profile {

    @Id
    private String id;

    private String name;
    private List<String> skills;
    private String email_id;
    private Float rating;

    public Profile(String name, List<String> skills, String email_id, Float rating) {
        this.name = name;
        this.skills = skills;
        this.email_id = email_id;
        this.rating = rating;
    }
}
