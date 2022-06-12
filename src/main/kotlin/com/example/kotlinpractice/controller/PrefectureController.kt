package com.example.kotlinpractice.controller

import com.example.kotlinpractice.generated.api.PrefecturesApi
import com.example.kotlinpractice.service.PrefectureService
import com.example.kotlinpractice.generated.model.Prefecture
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class PrefectureController(private val prefectureService: PrefectureService): PrefecturesApi {

    @Override
    override fun getPrefectures(): ResponseEntity<List<Prefecture>> {
        return ResponseEntity.ok(prefectureService.getAllPrefectures())
    }
}