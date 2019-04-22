package com.javanhe.chaos.service

import org.springframework.stereotype.Service

@Service
class BasicDemoService implements DemoService {

    def random = new Random()

    @Override
    Long generatePositiveValue() {
        random.longs()
            .filter { it > 0 }
            .findFirst()
            .orElse(0)
    }

    @Override
    String getGreeting() {
        return 'Welcome to the Chaos Monkey demo'
    }
}
