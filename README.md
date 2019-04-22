### Chaos Monkey for Spring Boot Demo

This project is a very small demo Spring Boot application that enables Chaos Monkey. For more information on Chaos Monkey, see [Chaos Monkey for Spring Boot](https://codecentric.github.io/chaos-monkey-spring-boot/)

#### Endpoints

The following endpoints are exposed:  

| Endpoint | Description |
| ---- | ---- |
| /chaos | Displays a simple `Hello World` |
| /chaos/random | Displays a random number |
| /actuator/chaosmonkey | The Spring Actuator endpoints defined for Chaos Monkey |

#### Chaos Monkey Settings

Chaos Monkey is configured to hit all injected service method calls with a 1-7 second latency hit on every 5th request. See `application-chaos-monkey.yml` to play with this configuration. 
