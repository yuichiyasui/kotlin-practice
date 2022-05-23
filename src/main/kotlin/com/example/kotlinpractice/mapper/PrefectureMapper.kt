package com.example.kotlinpractice.mapper

import com.example.kotlinpractice.domain.Prefecture
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface PrefectureMapper {
    @Select("SELECT id, name, name_kana FROM prefectures")
    fun find(): List<Prefecture>
}