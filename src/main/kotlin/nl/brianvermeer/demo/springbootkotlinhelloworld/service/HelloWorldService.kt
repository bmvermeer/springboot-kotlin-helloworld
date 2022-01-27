package nl.brianvermeer.demo.springbootkotlinhelloworld.service

import nl.brianvermeer.demo.springbootkotlinhelloworld.domain.StringAndTime
import org.springframework.stereotype.Service
import java.time.LocalTime

@Service
class HelloWorldService {

    fun supplyHelloWorld(): StringAndTime {
        return StringAndTime("Hello World", LocalTime.now())
    }

}