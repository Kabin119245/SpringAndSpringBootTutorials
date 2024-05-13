package com.kabin.springdatarestdemo.repo;

import com.kabin.springdatarestdemo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {




}
