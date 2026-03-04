package com.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String getUser() {
        return "User fetched from repository";
    }
}