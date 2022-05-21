package com.example.kotlinpractice.mapper

import com.example.kotlinpractice.domain.Person
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface PersonMapper {
    @Select("SELECT name FROM persons")
    fun find(): Person
}