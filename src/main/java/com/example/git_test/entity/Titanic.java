package com.example.git_test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "titanic")
public class Titanic {
    @Id
    Long index;
    @Column(name = "passenger_id")
    Long passengerId;
    Long survived;
    Long pclass;
    String name;
    String sex;
    Double age;
    @Column(name = "sib_sp")
    Long sibSp;
    Long parch;
    String ticket;
    Double fare;
    String cabin;
    String embarked;
}
