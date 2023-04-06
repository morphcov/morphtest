package com.morphtest.morphtest.controller

import com.morphtest.morphtest.classes.HelloMessage
import com.morphtest.morphtest.models.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController {

    @GetMapping("/first-test")
    fun test1 (@RequestParam("name") name: String) =
        HelloMessage().printMessage(name)

    @GetMapping("/message-list")
    fun getAllMessages() =
        listOf(
            Message("1", "Hello"),
            Message("2", "Bonjour"),
            Message("3", "Privet"),
        )
}