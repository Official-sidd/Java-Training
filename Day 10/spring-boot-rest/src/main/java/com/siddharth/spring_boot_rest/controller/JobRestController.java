package com.siddharth.spring_boot_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.siddharth.spring_boot_rest.model.JobPost;
import com.siddharth.spring_boot_rest.service.JobService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
// @CrossOrigin("http://localhost:3000") // to allow cross-origin requests from
// the specified origin (e.g., a frontend application running on localhost:3000)
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping(path = "jobPosts", produces = "application/json") // tells that this method will handle GET requests to
                                                                  // the /jobPosts endpoint and will produce a response
                                                                  // in JSON format.
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();

    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJobById(@PathVariable("postId") int postId) {
        return service.getJobById(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJobPost(@RequestBody JobPost jobPost) {
        service.addJobPost(jobPost);
        return service.getJobById(jobPost.getPostId());
        // return jobPost;
    }

    @PutMapping("jobPost")
    public JobPost updateJobPost(@RequestBody JobPost jobPost) {
        service.updateJobPost(jobPost);
        return service.getJobById(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJobPost(@PathVariable("postId") int postId) {
        service.deleteJobPost(postId);
        return "Job post with ID " + postId + " has been deleted.";
    }
}