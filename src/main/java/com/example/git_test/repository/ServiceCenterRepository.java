package com.example.git_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.git_test.entity.ServiceCenter;

public interface ServiceCenterRepository extends JpaRepository<ServiceCenter,Integer> {
    
}
