package com.kabin.springbootrest.service;

import com.kabin.springbootrest.model.JobPost;
import com.kabin.springbootrest.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    //we need two methods here, one to add data and one to display data
//    @Autowired
//    private JobRepo repo;
    @Autowired
    private JobRepository repos;

    public void addJob(JobPost jobPost) {
        //repo.addJobPost(jobPost);
        repos.save(jobPost);

    }

    public List<JobPost> getAllJobs(){
    //return repo.returnAllJobPosts();
        return repos.findAll();
    }

    public JobPost getJob(int i) {

        //return repo.getJob(i);
        return repos.findById(i).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
       // repo.updateJob(jobPost);
        repos.save(jobPost);
    }

    public void deleteJob(int postId) {
        //repo.deleteJob(postId);
        repos.deleteById(postId);
    }

    public void loadData() {

        List<JobPost> jobs = new ArrayList<>(List.of(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),

        new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                3, List.of("HTML", "CSS", "JavaScript", "React")),

        new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                List.of("Python", "Machine Learning", "Data Analysis")),

        new JobPost(4, "Network Engineer",
                "Design and implement computer networks for efficient data communication", 5,
                List.of("Networking", "Cisco", "Routing", "Switching")),

        new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
                3, List.of("iOS Development", "Android Development", "Mobile App"))));

        repos.saveAll(jobs);

    }

    public List<JobPost> searchbyKeyword(String keyword) {
          return  repos.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
