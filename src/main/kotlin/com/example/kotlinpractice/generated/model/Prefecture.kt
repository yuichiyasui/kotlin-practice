package com.example.kotlinpractice.generated.model

import java.util.Objects
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
 * 都道府県情報
 * @param id 都道府県ID
 * @param name 都道府県名
 * @param nameKana 都道府県名のふりがな
 */
data class Prefecture(

    @Schema(example = "21", required = true, description = "都道府県ID")
    @field:JsonProperty("id", required = true) val id: kotlin.Int,

    @Schema(example = "大阪府", required = true, description = "都道府県名")
    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "おおさかふ", required = true, description = "都道府県名のふりがな")
    @field:JsonProperty("nameKana", required = true) val nameKana: kotlin.String
) {

}

