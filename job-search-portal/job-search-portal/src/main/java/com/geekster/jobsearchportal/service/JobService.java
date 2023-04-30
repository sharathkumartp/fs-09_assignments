package com.geekster.jobsearchportal.service;

import com.geekster.jobsearchportal.model.Job;
import com.geekster.jobsearchportal.repository.IJobRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    IJobRepository jobRepository;

    public void addJobs(List<Job> jobList) {
        jobRepository.saveAll(jobList);
    }

    public Job getJob(Long id) {
        return jobRepository.findById(id).get();
    }

    public List<Job> getJobs() {
        return (List<Job>) jobRepository.findAll();
    }

    @Transactional
    public void updateJob(Long id, Job newJob) {
        jobRepository.updateJobById(id,newJob.getJobType(),newJob.getDescription(),newJob.getSalary(),newJob.getLocation(),newJob.getTitle(),newJob.getCompanyName());
    }

    public void deleteJobById(Long id) {
        jobRepository.deleteById(id);
    }

    public List<Job> getSpecificJobs(Double salary, String location) {
        return jobRepository.findJobBySalaryGreaterThanAndLocationOrderByCompanyName(salary,location);
    }
}
