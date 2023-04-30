package com.geekster.jobsearchportal.controller;

import com.geekster.jobsearchportal.model.Job;
import com.geekster.jobsearchportal.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

    @PostMapping(value = "/addJob")
    public void addJobs(@Valid @RequestBody List<Job> jobList){
        jobService.addJobs(jobList);
    }

    @GetMapping(value = "/getJob/{id}")
    public Job getJobById(@PathVariable Long id){
        return jobService.getJob(id);
    }

    @GetMapping(value = "/getAll")
    public List<Job> getAllJobs(){
        return jobService.getJobs();
    }

    @PutMapping(value = "/updateJob/{id}")
    public void updateJob(@PathVariable Long id,@RequestBody Job newJob){
         jobService.updateJob(id,newJob);
    }

    @DeleteMapping(value = "/deleteJob/{id}")
    public void deleteJob(@PathVariable Long id){
        jobService.deleteJobById(id);
    }

    @GetMapping(value = "/getSpecificJobs")
    public List<Job> getSpecificJobs(@RequestParam Double salary,@RequestParam String location){
        return jobService.getSpecificJobs(salary,location);
    }
}
