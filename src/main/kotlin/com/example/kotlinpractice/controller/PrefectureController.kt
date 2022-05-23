package com.example.kotlinpractice.controller

import com.example.kotlinpractice.domain.Prefecture
import com.example.kotlinpractice.servise.PrefectureServise
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/person")
class PrefectureController(
    private val prefectureServise: PrefectureServise
) {

    @GetMapping
    fun find(): List<Prefecture> {
        return prefectureServise.find()
    }
}