package com.example.git_test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.git_test.entity.Titanic;

public interface TitanicRepository extends JpaRepository<Titanic,Long> {

    // 생존자+나이가 많은순으로 조회
    List<Titanic> findBySurvivedOrderByAgeDesc(Long survived);



}
