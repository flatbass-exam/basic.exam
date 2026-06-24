package com.example.git_test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.git_test.entity.Titanic;
import com.example.git_test.repository.TitanicRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class GitTestApplicationTests {

	@Autowired TitanicRepository tr;

	@Test
	void 생존자나이순조회() {
		List<Titanic> list = tr.findBySurvivedOrderByAgeDesc(1L);
		log.info(list.toString());
	}

}
