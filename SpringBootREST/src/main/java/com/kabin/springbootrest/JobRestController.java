package com.kabin.springbootrest;


import com.kabin.springbootrest.model.JobPost;
import com.kabin.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {
    @Autowired
    private JobService service;



    @GetMapping("jobPosts")
    public List<JobPost> getALlJobs() {
            return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId) {

            return service.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobpost ){

        service.addJob(jobpost);
        return service.getJob(jobpost.getPostId());
    }





}
