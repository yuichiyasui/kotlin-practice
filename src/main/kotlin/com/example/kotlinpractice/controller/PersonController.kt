package com.example.kotlinpractice.controller

import com.example.kotlinpractice.domain.Person
import com.example.kotlinpractice.servise.PersonServise
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/person")
class PersonController(
    private val personServise: PersonServise
) {

    @GetMapping
    fun find(): Person {
        return personServise.find()
    }
}