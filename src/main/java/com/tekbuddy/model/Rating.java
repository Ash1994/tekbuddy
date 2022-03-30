package com.tekbuddy.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;


@Getter
@Setter
@ToString
@Document(collection = "Rating")
public class Rating {

    @Id
    private String id;

    private String skill;
    private Integer avgRating;
    private BigInteger numberOfRating;

    public Rating(String skill, Integer avgRating, BigInteger numberOfRating) {
        this.skill = skill;
        this.avgRating = avgRating;
        this.numberOfRating = numberOfRating;
    }
}
