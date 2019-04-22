package com.javanhe.chaos.controller

import com.javanhe.chaos.service.DemoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/chaos')
class ChaosController {

    @Autowired
    private DemoService demoService

    @GetMapping
    String greeting() {
        demoService.greeting
    }

    @GetMapping('/random')
    String random() {
        demoService.generatePositiveValue()
    }
}
