package com.example.git_test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Emp {

    @Id Integer eno;
    String ename;
    String dept;
    
}
