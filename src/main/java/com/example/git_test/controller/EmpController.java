package com.example.git_test.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.git_test.entity.Emp;
import com.example.git_test.repository.EmpRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class EmpController {

    @Autowired EmpRepository empRepository;


    @GetMapping("/emp/update")
    public String emp() {
            Emp e = new Emp();
            e.setEno(1);
            e.setEname("Jone");
            e.setDept("창고");
            empRepository.save(e);

            List<Emp> emp = empRepository.findAll();
            System.out.println(emp);
        return "emp";
    }
    

    @GetMapping("/emp")
    @ResponseBody
    public List<Emp> list(){
            List<Emp> list = empRepository.findAll();
        return list;
    }

}