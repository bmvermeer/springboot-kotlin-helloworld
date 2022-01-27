package nl.brianvermeer.demo.springbootkotlinheloworld.service

import nl.brianvermeer.demo.springbootkotlinheloworld.domain.StringAndTime
import org.springframework.stereotype.Service
import java.time.LocalTime

@Service
class HelloWorldService {

    fun supplyHelloWorld(): StringAndTime {
        return StringAndTime("Hello World", LocalTime.now())
    }

}