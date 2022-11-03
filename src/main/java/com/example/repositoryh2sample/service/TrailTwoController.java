package com.example.repositoryh2sample.service;

import com.example.repositoryh2sample.model.Repository;
import com.example.repositoryh2sample.model.TrailTwo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TrailTwoController {

    private final Repository repository;

    public TrailTwoController(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/user")
    public List<TrailTwo> getUsers() {
        return repository.findAll();
    }

    @PostMapping(path = "/user")
    public TrailTwo addUser(@RequestBody TrailTwo request) {
        repository.save(request);
        return request;
    }
}
