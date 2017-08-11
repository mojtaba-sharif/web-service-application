package me.ramon.server.restcontrollers

import me.ramon.server.domain.Greeting
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Mojtaba on 8/12/2017.
 */
@RestController
@CrossOrigin
@RequestMapping("/greetings")
class GrertingController {

    @GetMapping
    @ResponseBody
    Greeting get() {
        Greeting greeting = new Greeting()
        greeting.setId(1)
        greeting.setContent("hello spring and android")
        return greeting
    }
}
