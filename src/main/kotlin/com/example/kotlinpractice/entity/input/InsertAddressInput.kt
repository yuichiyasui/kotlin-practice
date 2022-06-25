package com.example.kotlinpractice.entity.input

import com.example.kotlinpractice.generated.model.Gender
import com.example.kotlinpractice.generated.model.RegisterAddressRequest
import java.time.ZoneId
import java.util.*

data class InsertAddressInput(
  val firstName: String,
  val lastName: String,
  val firstNameKana: String?,
  val lastNameKana: String?,
  val birthday: Date?,
  val gender: Gender?,
  val email: String,
  val prefectureId: Int?,
  val city: String?,
  val block: String?,
  val building: String?,
  val phoneNumber: String?,
) {
  object ModelMapper {
    fun from(request: RegisterAddressRequest) = InsertAddressInput(
      request.firstName,
      request.lastName,
      request.firstNameKana,
      request.lastNameKana,
      request.birthday?.let
      { Date.from(request.birthday.atStartOfDay(ZoneId.systemDefault()).toInstant()) },
      request.gender,
      request.email,
      request.prefectureId,
      request.city,
      request.block,
      request.building,
      request.phoneNumber
    )
  }
}