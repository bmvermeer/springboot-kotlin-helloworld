package nl.brianvermeer.demo.springbootkotlinheloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootKotlinHeloworldApplication

fun main(args: Array<String>) {
	runApplication<SpringbootKotlinHeloworldApplication>(*args)
}
