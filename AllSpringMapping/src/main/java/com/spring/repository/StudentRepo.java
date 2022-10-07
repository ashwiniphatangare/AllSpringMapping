package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
