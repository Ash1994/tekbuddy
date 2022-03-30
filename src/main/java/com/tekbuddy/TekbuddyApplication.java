package com.tekbuddy;

import com.tekbuddy.repository.ProfileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableMongoRepositories()
public class TekbuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TekbuddyApplication.class, args);
	}

}
