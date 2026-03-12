package com.siddharth.aijobapi.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class JobPostDTO {

    @NotBlank(message = "Title cannot be empty")
    private String title;

    @NotBlank(message = "Description cannot be empty")
    private String description;

    @NotBlank(message = "Skills cannot be empty")
    private String skills;

    @Min(value = 0, message = "Experience must be positive")
    private int experience;
}