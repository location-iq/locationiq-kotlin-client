/**
* LocationIQ
* LocationIQ provides flexible enterprise-grade location based solutions. We work with developers, startups and enterprises worldwide serving billions of requests everyday. This page provides an overview of the technical aspects of our API and will help you get started.
*
* The version of the OpenAPI document: 1.1.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json
/**
 * 
 * @param houseNumber 
 * @param road 
 * @param residential 
 * @param borough 
 * @param neighbourhood 
 * @param quarter 
 * @param hamlet 
 * @param suburb 
 * @param island 
 * @param village 
 * @param town 
 * @param city 
 * @param cityDistrict 
 * @param county 
 * @param state 
 * @param stateDistrict 
 * @param postcode 
 * @param country 
 * @param countryCode 
 * @param stateCode 
 */

data class Address (
    @Json(name = "house_number")
    val houseNumber: kotlin.String? = null,
    @Json(name = "road")
    val road: kotlin.String? = null,
    @Json(name = "residential")
    val residential: kotlin.String? = null,
    @Json(name = "borough")
    val borough: kotlin.String? = null,
    @Json(name = "neighbourhood")
    val neighbourhood: kotlin.String? = null,
    @Json(name = "quarter")
    val quarter: kotlin.String? = null,
    @Json(name = "hamlet")
    val hamlet: kotlin.String? = null,
    @Json(name = "suburb")
    val suburb: kotlin.String? = null,
    @Json(name = "island")
    val island: kotlin.String? = null,
    @Json(name = "village")
    val village: kotlin.String? = null,
    @Json(name = "town")
    val town: kotlin.String? = null,
    @Json(name = "city")
    val city: kotlin.String? = null,
    @Json(name = "city_district")
    val cityDistrict: kotlin.String? = null,
    @Json(name = "county")
    val county: kotlin.String? = null,
    @Json(name = "state")
    val state: kotlin.String? = null,
    @Json(name = "state_district")
    val stateDistrict: kotlin.String? = null,
    @Json(name = "postcode")
    val postcode: kotlin.String? = null,
    @Json(name = "country")
    val country: kotlin.String? = null,
    @Json(name = "country_code")
    val countryCode: kotlin.String? = null,
    @Json(name = "state_code")
    val stateCode: kotlin.String? = null
) 



