package com.tekbuddy.controller;

import com.tekbuddy.model.QueAns;
import com.tekbuddy.repository.QueAnsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class QueAnsController {

    @Autowired
    private QueAnsRepository repository;

    @PostMapping("/addQueAns")
    public String saveQueAns(@RequestBody QueAns queAns){
        repository.save(queAns);
        return "Added Successfully";
    }

    @GetMapping("/findAllQueAns")
    public List<QueAns> getAllQueAns() {
        return repository.findAll();
    }

}
