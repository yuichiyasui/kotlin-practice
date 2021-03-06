package com.example.kotlinpractice.service

import com.example.kotlinpractice.generated.model.Prefecture
import com.example.kotlinpractice.mapper.PrefectureMapper
import org.springframework.stereotype.Service

@Service
class PrefectureService(
  private val prefectureMapper: PrefectureMapper
) {
  fun getAllPrefectures(): List<Prefecture> {
    val prefectures = prefectureMapper.findAll()

    return prefectures.map { prefecture -> Prefecture(prefecture.id, prefecture.name, prefecture.nameKana) }
  }
}