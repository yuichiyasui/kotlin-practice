package com.example.kotlinpractice.mapper

import com.example.kotlinpractice.entity.input.InsertAddressInput
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface AddressMapper {
    fun insert (@Param("address") insertAddressInput: InsertAddressInput)
}