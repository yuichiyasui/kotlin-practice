package com.example.kotlinpractice.controller

import com.example.kotlinpractice.generated.api.AddressApi
import com.example.kotlinpractice.generated.model.GetAddressByIdResponse
import com.example.kotlinpractice.generated.model.RegisterAddressRequest
import com.example.kotlinpractice.service.AddressService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class AddressController(private val addressService: AddressService) : AddressApi {
  @Override
  override fun registerAddress(registerAddressRequest: RegisterAddressRequest): ResponseEntity<Unit> {
    addressService.registerAddress(registerAddressRequest)
    return ResponseEntity(HttpStatus.OK)
  }

  @Override
  override fun getAddressById(id: Int): ResponseEntity<GetAddressByIdResponse> {
    return ResponseEntity.ok(addressService.getAddressById(id))
  }
}
