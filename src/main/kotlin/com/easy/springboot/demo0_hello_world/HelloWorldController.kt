package com.easy.springboot.demo0_hello_world

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping(value = ["", "/", "/hello"])
    fun hello(): Greeting {
//        return Greeting(name = "World£¡", greeting = "Hello£¡")
        return Greeting(name = "World£¡", greeting = "Hello£¡", para2 ="hahahahah@")
    }


    data class Greeting(var name: String, var greeting: String, var para2:String)



    @GetMapping(value = ["/world"])
    fun SayHello(): Greeting2 {
        return Greeting2(name = "World£¡", greeting = "Hello£¡", para2 ="ÊÀ½ç@")
    }

    data class Greeting2(var name: String, var greeting: String, var para2:String)






}