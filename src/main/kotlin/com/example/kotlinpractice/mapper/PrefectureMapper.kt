package com.example.kotlinpractice.mapper

import com.example.kotlinpractice.generated.model.Prefecture
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface PrefectureMapper {
    @Select("SELECT id, name, name_kana FROM prefectures")
    fun findAll(): List<Prefecture>
}