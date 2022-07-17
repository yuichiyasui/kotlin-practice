package com.example.kotlinpractice.entity

import com.example.kotlinpractice.annotation.NoArg
import com.example.kotlinpractice.generated.model.Gender
import java.sql.Timestamp
import java.util.Date

@NoArg
data class Address(
  val id: Int,
  val firstName: String,
  val lastName: String,
  val firstNameKana: String?,
  val lastNameKana: String?,
  val birthday: Date?,
  val gender: Gender?,
  val email: String,
  val prefecture: Prefecture?,
  val city: String?,
  val block: String?,
  val building: String?,
  val phoneNumber: String?,
  val createdAt: Timestamp,
  val updatedAt: Timestamp?,
  val deletedAt: Timestamp?,
  val deleted: Boolean,
)
