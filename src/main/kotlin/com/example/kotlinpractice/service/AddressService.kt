package com.example.kotlinpractice.service

import com.example.kotlinpractice.entity.input.InsertAddressInput
import com.example.kotlinpractice.generated.model.GetAddressByIdResponse
import com.example.kotlinpractice.generated.model.Prefecture
import com.example.kotlinpractice.generated.model.RegisterAddressRequest
import com.example.kotlinpractice.mapper.AddressMapper
import org.springframework.stereotype.Service
import java.time.ZoneId

@Service
class AddressService(
  private val addressMapper: AddressMapper
) {
  fun registerAddress(registerAddressRequest: RegisterAddressRequest) {
    val insertAddressInput = InsertAddressInput.ModelMapper.from(registerAddressRequest)
    addressMapper.insert(insertAddressInput)
  }

  fun getAddressById(id: Int): GetAddressByIdResponse {
    val address = addressMapper.selectById(id)
    val prefecture = if (address.prefecture != null)  Prefecture(
      address.prefecture.id,
      address.prefecture.name,
      address.prefecture.nameKana
    ) else null

    return GetAddressByIdResponse(
      address.id,
      address.email,
      address.createdAt.toString(),
      address.firstName,
      address.lastName,
      address.firstNameKana,
      address.lastNameKana,
      address.birthday
        ?.toInstant()
        ?.atZone(ZoneId.systemDefault())
        ?.toLocalDate(),
      address.gender,
      prefecture,
      address.city,
      address.block,
      address.building,
      address.phoneNumber,
      address.updatedAt.toString(),
    )
  }
}