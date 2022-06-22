package com.example.kotlinpractice.generated.model

import java.util.Objects
import com.example.kotlinpractice.generated.model.Gender
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
 * 
 * @param firstName 名
 * @param lastName 姓
 * @param email メールアドレス
 * @param firstNameKana 名(ふりがな)
 * @param lastNameKana 姓(ふりがな)
 * @param birthday 誕生日
 * @param gender 
 * @param prefectureId 都道府県ID
 * @param city 市区町村
 * @param block 番地
 * @param building 建物名
 * @param phoneNumber 電話番号
 */
data class RegisterAddressRequest(

    @Schema(example = "太郎", required = true, description = "名")
    @field:JsonProperty("firstName", required = true) val firstName: kotlin.String,

    @Schema(example = "田中", required = true, description = "姓")
    @field:JsonProperty("lastName", required = true) val lastName: kotlin.String,

    @get:Email
    @Schema(example = "tanaka@kotlin-practice.com", required = true, description = "メールアドレス")
    @field:JsonProperty("email", required = true) val email: kotlin.String,

    @Schema(example = "たろう", description = "名(ふりがな)")
    @field:JsonProperty("firstNameKana") val firstNameKana: kotlin.String? = null,

    @Schema(example = "たなか", description = "姓(ふりがな)")
    @field:JsonProperty("lastNameKana") val lastNameKana: kotlin.String? = null,

    @field:Valid
    @Schema(example = "Sat Jan 01 09:00:00 JST 2000", description = "誕生日")
    @field:JsonProperty("birthday") val birthday: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @field:JsonProperty("gender") val gender: Gender? = null,

    @Schema(example = "21", description = "都道府県ID")
    @field:JsonProperty("prefectureId") val prefectureId: kotlin.Int? = null,

    @Schema(example = "大阪市北区", description = "市区町村")
    @field:JsonProperty("city") val city: kotlin.String? = null,

    @Schema(example = "梅田2丁目2-22-501", description = "番地")
    @field:JsonProperty("block") val block: kotlin.String? = null,

    @Schema(example = "Kotlinマンション", description = "建物名")
    @field:JsonProperty("building") val building: kotlin.String? = null,

    @Schema(example = "09012345678", description = "電話番号")
    @field:JsonProperty("phoneNumber") val phoneNumber: kotlin.String? = null
) {

}

