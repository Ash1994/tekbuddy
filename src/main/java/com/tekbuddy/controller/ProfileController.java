package com.tekbuddy.controller;

import com.tekbuddy.model.Profile;
import com.tekbuddy.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProfileController {

    @Autowired
    private ProfileRepository repository;

    @PostMapping("/addProfile")
    public String saveBook(@RequestBody Profile profile){
        repository.save(profile);
        return "Added Successfully";
    }

    @GetMapping("/findAllProfiles")
    public List<Profile> getProfiles() {
        return repository.findAll();
    }

    @GetMapping("/findAllTopProfiles")
    public List<Profile> getTopProfiles() {
        List<Profile> listOfProfile = repository.findAll();
        Comparator<Profile> sortByRatingDesc = (a, b) -> b.getRating().compareTo(a.getRating());
        return listOfProfile.stream()
                .filter(x -> x.getRating()>=4)
                .sorted(sortByRatingDesc)
                .collect(Collectors.toList());
    }

    @GetMapping("/findProfilesBySkill/{skill}")
    public List<Profile> getProfilesBySkill(@PathVariable String skill) {
        List<Profile> listOfProfile = repository.findAll();
        Comparator<Profile> sortByRatingDesc = (a, b) -> b.getRating().compareTo(a.getRating());
        return listOfProfile.stream()
                .filter(x -> x.getSkills().contains(skill))
                .sorted(sortByRatingDesc)
                .collect(Collectors.toList());
    }
}
