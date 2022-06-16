/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package com.example.kotlinpractice.generated.api

import com.example.kotlinpractice.generated.model.RegisterAddressRequest
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@Validated
@RequestMapping("\${api.base-path:}")
interface AddressApi {

    @Operation(
        summary = "連絡先を登録する",
        operationId = "registerAddress",
        description = "",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(schema = Schema(implementation = kotlin.String::class))])
        ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/address"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun registerAddress(@Parameter(description = "") @Valid @RequestBody(required = false) registerAddressRequest: RegisterAddressRequest?): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
