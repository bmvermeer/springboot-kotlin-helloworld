package nl.brianvermeer.demo.springbootkotlinhelloworld

import nl.brianvermeer.demo.springbootkotlinhelloworld.domain.StringAndTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus
import java.time.LocalTime

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringbootKotlinHeloworldApplicationTests (@Autowired val restTemplate: TestRestTemplate){

	@Test
	fun `HelloWorld endpoint return correct value`() {
		val start = LocalTime.now()
		val result = restTemplate.getForEntity<StringAndTime>("/helloworld")
		assertThat(result.statusCode).isEqualTo(HttpStatus.OK)
		assertThat(result.body?.value).isEqualTo("Hello World")
		assertThat(result.body?.time).isAfter(start)
	}


}
