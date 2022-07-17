package com.example.kotlinpractice.generated.model

import java.util.Objects
import com.example.kotlinpractice.generated.model.Gender
import com.example.kotlinpractice.generated.model.Prefecture
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
 * 連絡先情報
 * @param id 連絡先ID
 * @param email メールアドレス
 * @param createdAt 作成日
 * @param firstName 名
 * @param lastName 姓
 * @param firstNameKana 名(ふりがな)
 * @param lastNameKana 姓(ふりがな)
 * @param birthday 誕生日
 * @param gender 
 * @param prefecture 
 * @param city 市区町村
 * @param block 番地
 * @param building 建物名
 * @param phoneNumber 電話番号
 * @param updatedAt 更新日
 */
data class GetAddressByIdResponse(

    @Schema(example = "21", required = true, description = "連絡先ID")
    @field:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Email
    @Schema(example = "tanaka@kotlin-practice.com", required = true, description = "メールアドレス")
    @field:JsonProperty("email", required = true) val email: kotlin.String,

    @Schema(example = "null", required = true, description = "作成日")
    @field:JsonProperty("createdAt", required = true) val createdAt: kotlin.String,

    @Schema(example = "太郎", description = "名")
    @field:JsonProperty("firstName") val firstName: kotlin.String? = null,

    @Schema(example = "田中", description = "姓")
    @field:JsonProperty("lastName") val lastName: kotlin.String? = null,

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

    @field:Valid
    @Schema(example = "null", description = "")
    @field:JsonProperty("prefecture") val prefecture: Prefecture? = null,

    @Schema(example = "大阪市北区", description = "市区町村")
    @field:JsonProperty("city") val city: kotlin.String? = null,

    @Schema(example = "梅田2丁目2-22-501", description = "番地")
    @field:JsonProperty("block") val block: kotlin.String? = null,

    @Schema(example = "Kotlinマンション", description = "建物名")
    @field:JsonProperty("building") val building: kotlin.String? = null,

    @Schema(example = "09012345678", description = "電話番号")
    @field:JsonProperty("phoneNumber") val phoneNumber: kotlin.String? = null,

    @Schema(example = "null", description = "更新日")
    @field:JsonProperty("updatedAt") val updatedAt: kotlin.String? = null
) {

}

