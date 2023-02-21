package com.adorno;

import com.adorno.om.MovilOM;
import com.adorno.repo.MovilRepository;
import com.adorno.repo.PantallaRepository;
import com.adorno.repo.ProcesadorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class JpamovilesApplicationTests {
	@Autowired
	MovilRepository movilRepository;
//	WebClient webClient;
	/*@BeforeEach
	void beforeEach(){
		webClient = WebClient.create("http://localhost:8080");
		movilRepository.saveAll(MovilOM.objectMother());
	}*/

	/*@Test
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
		for (MovilDTO movil:
			 responseMapped) {
			System.out.println(movil.modelo());
		}
	}*/
	// TODO FIX
	@Test
	void test(){
		movilRepository.saveAll(MovilOM.objectMother());
	}
}