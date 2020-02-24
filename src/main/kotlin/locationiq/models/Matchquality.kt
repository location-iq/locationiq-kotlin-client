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
package locationiq.models


import com.squareup.moshi.Json
/**
 * 
 * @param matchcode 
 * @param matchtype 
 * @param matchlevel 
 */

data class Matchquality (
    @Json(name = "matchcode")
    val matchcode: kotlin.String? = null,
    @Json(name = "matchtype")
    val matchtype: kotlin.String? = null,
    @Json(name = "matchlevel")
    val matchlevel: kotlin.String? = null
) 



