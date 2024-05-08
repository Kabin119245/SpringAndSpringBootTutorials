package com.kabin.jobapp;


import com.kabin.jobapp.model.JobPost;
import com.kabin.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @RequestMapping({"/","home"})
    public String home() {
        return "home";
    }


    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";

    }

    @GetMapping("viewalljobs")
    public String viewallJob(Model m) {
        List<JobPost> jobs = service.getAllJobs();
        m.addAttribute("jobPosts",jobs );

        return "viewalljobs";
    }



}
