# Spring Boot Kotlin Hello World example

A small example of a Spring Boot application written in Kotlin.
It contains:
 - Rest controller
 - Domain enitity 
 - Service
 - Unit test
 
 The Service provides a Domain entity (data class) and gets injected intothe RestColler (implicit autowire via contructor)
 The RestController provides an endpoint that outputs the Domain entity in JSON
 
 The Unit test validated if the endpoint provided by the Rest controller is as expected
  
 
  
