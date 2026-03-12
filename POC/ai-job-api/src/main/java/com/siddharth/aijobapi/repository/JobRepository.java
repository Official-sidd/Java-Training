package com.siddharth.aijobapi.repository;

import com.siddharth.aijobapi.entity.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobRepository extends JpaRepository<JobPost, Long> {
    @Query("SELECT j FROM JobPost j WHERE LOWER(j.skills) LIKE LOWER(CONCAT('%', :skill, '%'))")
    List<JobPost> findBySkillsContaining(@Param("skill") String skill);
}