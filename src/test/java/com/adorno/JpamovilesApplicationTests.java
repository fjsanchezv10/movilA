package com.adorno;

import com.adorno.repo.MovilOM;
import com.adorno.repo.MovilRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpamovilesApplicationTests {
	@Autowired
	MovilRepository movilRepository;

	@BeforeAll
	void beforeAll(){
		movilRepository.deleteAll();
		movilRepository.saveAll(MovilOM.objectMother());
	}

	@Test
	void contextLoads() {

	}

}