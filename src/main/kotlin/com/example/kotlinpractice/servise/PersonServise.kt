package com.example.kotlinpractice.servise

import com.example.kotlinpractice.domain.Person
import com.example.kotlinpractice.mapper.PersonMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonServise (
    private val personMapper : PersonMapper
        ) {

    fun find(): Person {
        return personMapper.find()
    }
}