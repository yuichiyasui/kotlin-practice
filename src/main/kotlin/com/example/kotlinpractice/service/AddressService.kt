package com.example.kotlinpractice.service

import com.example.kotlinpractice.entity.input.InsertAddressInput
import com.example.kotlinpractice.generated.model.RegisterAddressRequest
import com.example.kotlinpractice.mapper.AddressMapper
import org.springframework.stereotype.Service

@Service
class AddressService(
    private val addressMapper: AddressMapper
) {
    fun registerAddress(registerAddressRequest: RegisterAddressRequest) {
        val insertAddressInput = InsertAddressInput.ModelMapper.from(registerAddressRequest)
        addressMapper.insert(insertAddressInput)
    }
}