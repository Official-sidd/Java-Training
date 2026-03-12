package com.siddharth.aijobapi.controller;

import com.siddharth.aijobapi.dto.JobPostDTO;
import com.siddharth.aijobapi.entity.JobPost;
import com.siddharth.aijobapi.service.AIService;
import com.siddharth.aijobapi.service.JobService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService service;
    private final AIService aiService;

    public JobController(JobService service, AIService aiService) {
        this.service = service;
        this.aiService = aiService;
    }

    @PostMapping
    public JobPost createJob(@Valid @RequestBody JobPostDTO dto) {
        return service.createJob(dto);
    }

    @GetMapping
    public List<JobPost> getJobs() {
        return service.getJobs();
    }

    @GetMapping("/{id}")
    public JobPost getJob(@PathVariable Long id) {
        return service.getJob(id);
    }

    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable Long id) {
        service.deleteJob(id);
        return "Job deleted";
    }

    @PostMapping("/recommend")
    public List<JobPost> recommend(@RequestParam String skills) {

        return aiService.recommendJobs(skills);
    }

    @PutMapping("/{id}")
    public JobPost updateJob(
            @PathVariable Long id,
            @Valid @RequestBody JobPostDTO dto) {

        return service.updateJob(id, dto);
    }
}