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
 * @param code 
 * @param tracepoints 
 * @param matchings 
 */

data class DirectionsMinusMatching (
    @Json(name = "code")
    val code: kotlin.String? = null,
    @Json(name = "tracepoints")
    val tracepoints: kotlin.Array<kotlin.Any>? = null,
    @Json(name = "matchings")
    val matchings: kotlin.Array<kotlin.Any>? = null
) 



