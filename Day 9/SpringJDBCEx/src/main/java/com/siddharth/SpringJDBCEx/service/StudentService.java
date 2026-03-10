package com.siddharth.SpringJDBCEx.service;

import com.siddharth.SpringJDBCEx.model.Student;
import com.siddharth.SpringJDBCEx.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

//    public StudentRepo getRepo() {
//        return repo;
//    }
//
//    @Autowired
//    public void setRepo(StudentRepo repo) {
//        this.repo = repo;
//    }



    public void addStudent(Student s) {

        repo.save(s);
    }

    public List<Student> getStudents() {

        return repo.findAll();
    }
}
