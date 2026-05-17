package com.aijobportal.portal.controller;

import com.aijobportal.portal.model.Job;
import com.aijobportal.portal.repository.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
@CrossOrigin("*")

public class JobController {

    @Autowired
    JobRepository repo;

    @PostMapping("/add")
    public Job addJob(@RequestBody Job job){

        return repo.save(job);

    }

    @GetMapping("/all")
    public List<Job> getJobs(){

        return repo.findAll();

    }
}