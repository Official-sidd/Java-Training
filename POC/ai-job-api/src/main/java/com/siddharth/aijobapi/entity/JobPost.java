package com.siddharth.aijobapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String skills;

    private int experience;
}