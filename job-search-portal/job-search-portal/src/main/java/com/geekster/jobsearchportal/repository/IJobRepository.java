package com.geekster.jobsearchportal.repository;

import com.geekster.jobsearchportal.model.Job;
import com.geekster.jobsearchportal.model.JobType;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepository extends CrudRepository<Job,Long> {

    @Modifying
    @Query(value = "update JOB set ID=:id,JOB_TYPE= :jobType,DESCRIPTION =:description,SALARY = :salary, LOCATION= :location,TITLE= :title,COMPANY_NAME= :companyName",nativeQuery = true)
  public void updateJobById(Long id, JobType jobType, String description, Double salary, String location, String title, String companyName);

    List<Job> findJobBySalaryGreaterThanAndLocationOrderByCompanyName(Double salary, String location);


}
