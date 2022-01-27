package nl.brianvermeer.demo.springbootkotlinhelloworld.controller

import nl.brianvermeer.demo.springbootkotlinhelloworld.domain.StringAndTime
import nl.brianvermeer.demo.springbootkotlinhelloworld.service.HelloWorldService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController(val helloWorldService: HelloWorldService) {

    @GetMapping("/helloworld")
    fun helloWorld(): StringAndTime {
        return helloWorldService.supplyHelloWorld()
    }
}