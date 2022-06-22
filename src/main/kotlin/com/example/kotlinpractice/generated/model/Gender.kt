package com.example.kotlinpractice.generated.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* 性別
* Values: Male,Female,Null
*/
enum class Gender(val value: kotlin.String) {

    @JsonProperty("Male") Male("Male"),
    @JsonProperty("Female") Female("Female"),
    @JsonProperty("null") Null("null")
}

