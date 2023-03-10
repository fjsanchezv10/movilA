package com.adorno;

import com.adorno.dto.MovilDTO;
import com.adorno.mappers.LinkedHashMapMovilMapper;
import com.adorno.om.MovilOM;
import com.adorno.repo.MovilRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class JpamovilesApplicationTests {
	@Autowired
	MovilRepository movilRepository;
	WebClient webClient;
	@BeforeEach
	void beforeEach(){
		webClient = WebClient.create("http://localhost:8080");
		movilRepository.saveAll(MovilOM.objectMother());
	}

	@Test
	void contextLoads() {
		ResponseEntity<List> responseEntity = webClient
				.get()
				.uri("/api/movil/get/five")
				.retrieve()
				.toEntity(List.class)
				.block();
		List body = responseEntity.getBody();

		List<MovilDTO> responseMapped =
				(List<MovilDTO>) body.stream()
				.map((hashMap)-> new LinkedHashMapMovilMapper().map((LinkedHashMap)hashMap))
				.collect(Collectors.toList());
		List<MovilDTO> listMovilesPrueba = new ArrayList<>();
		for (MovilDTO movil:
			 responseMapped) {
			listMovilesPrueba.add(movil);
		}
		assertTrue(listMovilesPrueba.size()==3);
	}
	/*@Test
	void test(){
		movilRepository.saveAll(MovilOM.objectMother());
	}*/
}