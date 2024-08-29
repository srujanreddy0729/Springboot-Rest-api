package com.example.SpringBootRest.repo;

import com.example.SpringBootRest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> allJobs= new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                    3, List.of("HTML", "CSS", "JavaScript", "React")),
            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                    List.of("Python", "Machine Learning", "Data Analysis")),
            new JobPost(4, "Network Engineer",
                    "Design and implement computer networks for efficient data communication", 5,
                    List.of("Networking", "Cisco", "Routing", "Switching")),
            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
                    3, List.of("iOS Development", "Android Development", "Mobile App")),
            new JobPost(6, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines",
                    4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes"))
    ));

    public List<JobPost> getAllJobs(){
            return allJobs;
    }

    public void addJob(JobPost jobPost){
        allJobs.add(jobPost);
        //System.out.println(allJobs);
    }

    public JobPost getJob(int postId) {
        for(JobPost jobs:allJobs){
            if(jobs.getPostId()==postId){
                return jobs;
            }
        }
        return null;

    }

    public void updateJob(JobPost jobPost) {
        for(JobPost jobs:allJobs){
            if(jobs.getPostId()==jobPost.getPostId()){
                jobs.setPostDesc(jobPost.getPostDesc());
                jobs.setPostProfile(jobPost.getPostProfile());
                jobs.setReqExperience(jobPost.getReqExperience());
                jobs.setPostTechStack(jobPost.getPostTechStack());
            }
        }

    }

    public void deleteJob(int postId) {
        for(JobPost jobs:allJobs){
            if(jobs.getPostId()==postId){
                allJobs.remove(jobs);
            }
        }

    }
}
