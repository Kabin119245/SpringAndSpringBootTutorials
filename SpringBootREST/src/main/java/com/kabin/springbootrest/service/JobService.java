package com.kabin.springbootrest.service;

import com.kabin.springbootrest.model.JobPost;
import com.kabin.springbootrest.repo.JobRepo;
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

    public JobPost getJob(int i) {

        return repo.getJob(i);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}
