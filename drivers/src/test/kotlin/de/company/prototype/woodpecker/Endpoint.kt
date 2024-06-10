package de.company.prototype.woodpecker

import io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails
import io.restassured.RestAssured.given
import io.restassured.response.ValidatableResponse
import io.restassured.specification.RequestSpecification
import jakarta.ws.rs.core.MediaType.APPLICATION_JSON

open class Endpoint {

  init {
    enableLoggingOfRequestAndResponseIfValidationFails()
  }

  fun findAllHawks(): ValidatableResponse {
    return given_()
      .`when`()
      .get("woodpeckers/findAllHawks")
      .then()
  }


  private fun given_(): RequestSpecification {
    return given().contentType(APPLICATION_JSON)
  }
}
