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

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchbyKeyword(@PathVariable("keyword") String keyword)  {

        return service.searchbyKeyword(keyword);

    }


    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobpost ){

        service.addJob(jobpost);
        return service.getJob(jobpost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }


    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId) {

        service.deleteJob(postId);
        return "Job with postId: " + postId + " has been deleted";
    }



    @GetMapping("load")
    public String loadData() {
        service.loadData();


        return "Data Loaded";
    }





}
