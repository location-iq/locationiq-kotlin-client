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
 * @param nodes 
 * @param distance 
 * @param location 
 * @param name 
 */

data class DirectionsNearestWaypoints (
    @Json(name = "nodes")
    val nodes: kotlin.Array<java.math.BigDecimal>? = null,
    @Json(name = "distance")
    val distance: java.math.BigDecimal? = null,
    @Json(name = "location")
    val location: kotlin.Array<java.math.BigDecimal>? = null,
    @Json(name = "name")
    val name: kotlin.String? = null
) 


