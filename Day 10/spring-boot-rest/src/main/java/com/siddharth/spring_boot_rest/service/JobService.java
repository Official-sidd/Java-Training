package com.siddharth.spring_boot_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siddharth.spring_boot_rest.model.JobPost;
import com.siddharth.spring_boot_rest.repo.JobRepo;


@Service
public class JobService {
	@Autowired
	public JobRepo repo;
	
	
	
	//method to return all JobPosts
	public List<JobPost> getAllJobs() {
		return repo.getAllJobs();

		
	}
	
	
	
	

	// ***************************************************************************


	
	
	
	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		 repo.addJobPost(jobPost);
	
	}


    public JobPost getJobById(int postId) {
        return repo.getJobById(postId);
    }


    public void updateJobPost(JobPost jobPost) {
        repo.updateJobPost(jobPost);
    }



    public void deleteJobPost(int postId) {
        repo.deleteJobPost(postId);
    }

	
}