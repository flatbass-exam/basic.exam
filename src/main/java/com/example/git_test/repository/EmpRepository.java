package com.example.git_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.git_test.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp,Integer>{
    
}
