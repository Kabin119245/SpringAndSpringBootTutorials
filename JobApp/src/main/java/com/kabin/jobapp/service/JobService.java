package com.kabin.jobapp.service;

import com.kabin.jobapp.model.JobPost;
import com.kabin.jobapp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    //we need two methods here, one to add data and one to display data
    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost) {
        repo.addJobPost(jobPost);
    }

    public List<JobPost> getAllJobs(){
    return repo.returnAllJobPosts();
    }
}
