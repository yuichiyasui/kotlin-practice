package com.example.kotlinpractice.controller

import com.example.kotlinpractice.domain.Prefecture
import com.example.kotlinpractice.service.PrefectureService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/prefecture")
class PrefectureController(
    private val prefectureService: PrefectureService
) {
    @GetMapping
    fun find(): List<Prefecture> {
        return prefectureService.find()
    }
}