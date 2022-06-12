package com.example.kotlinpractice.mapper

import com.example.kotlinpractice.entity.Prefecture
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface PrefectureMapper {
    fun findAll(): List<Prefecture>
}