package com.siddharth.aijobapi.service;

import com.siddharth.aijobapi.dto.JobPostDTO;
import com.siddharth.aijobapi.entity.JobPost;
import com.siddharth.aijobapi.repository.JobRepository;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepository repo;
    private final ModelMapper mapper;

    public JobService(JobRepository repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public JobPost createJob(JobPostDTO dto) {

        JobPost job = mapper.map(dto, JobPost.class);

        return repo.save(job);
    }

    public List<JobPost> getJobs() {

        return repo.findAll(Sort.by("id").ascending());
    }

    public JobPost getJob(Long id) {

        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found"));
    }

    public void deleteJob(Long id) {

        repo.deleteById(id);
    }

    public JobPost updateJob(Long id, JobPostDTO dto) {

        JobPost job = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found"));

        job.setTitle(dto.getTitle());
        job.setDescription(dto.getDescription());
        job.setSkills(dto.getSkills());
        job.setExperience(dto.getExperience());

        return repo.save(job);
    }
}