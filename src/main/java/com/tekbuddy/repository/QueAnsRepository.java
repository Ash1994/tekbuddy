package com.tekbuddy.repository;

import com.tekbuddy.model.QueAns;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QueAnsRepository extends MongoRepository<QueAns, String> {
}
