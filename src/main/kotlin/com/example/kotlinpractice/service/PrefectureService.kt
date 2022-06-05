package com.example.kotlinpractice.service

import com.example.kotlinpractice.domain.Prefecture
import com.example.kotlinpractice.mapper.PrefectureMapper
import org.springframework.stereotype.Service

@Service
class PrefectureService (
    private val prefectureMapper : PrefectureMapper
        ) {

    fun find(): List<Prefecture> {
        return prefectureMapper.find()
    }
}