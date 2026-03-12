package com.siddharth.aijobapi.service;

import com.siddharth.aijobapi.entity.JobPost;
import com.siddharth.aijobapi.repository.JobRepository;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AIService {

    private final JobRepository repo;

    public AIService(JobRepository repo) {
        this.repo = repo;
    }

    public List<JobPost> recommendJobs(String skills) {

        String[] skillArray = skills.split(",");

        Set<JobPost> results = new HashSet<>();

        for (String skill : skillArray) {

            List<JobPost> jobs = repo.findBySkillsContaining(skill.trim());

            results.addAll(jobs);
        }

        return new ArrayList<>(results);
    }
}