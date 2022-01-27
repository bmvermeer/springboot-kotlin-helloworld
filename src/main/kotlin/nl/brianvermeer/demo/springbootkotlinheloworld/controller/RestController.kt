package nl.brianvermeer.demo.springbootkotlinheloworld.controller

import nl.brianvermeer.demo.springbootkotlinheloworld.domain.StringAndTime
import nl.brianvermeer.demo.springbootkotlinheloworld.service.HelloWorldService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController(val helloWorldService: HelloWorldService) {

    @GetMapping("/helloworld")
    fun helloWorld(): StringAndTime {
        return helloWorldService.supplyHelloWorld()
    }
}