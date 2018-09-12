/**
* LocationIQ
* LocationIQ provides flexible enterprise-grade location based solutions. We work with developers, startups and enterprises worldwide serving billions of requests everyday. This page provides an overview of the technical aspects of our API and will help you get started.
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package locationiq.models


/**
 * 
 * @param houseNumber 
 * @param road 
 * @param residential 
 * @param village 
 * @param county 
 * @param state 
 * @param postcode 
 * @param country 
 * @param countryCode 
 * @param city 
 */
data class Address (
    val houseNumber: kotlin.String? = null,
    val road: kotlin.String? = null,
    val residential: kotlin.String? = null,
    val village: kotlin.String? = null,
    val county: kotlin.String? = null,
    val state: kotlin.String? = null,
    val postcode: kotlin.String? = null,
    val country: kotlin.String? = null,
    val countryCode: kotlin.String? = null,
    val city: kotlin.String? = null
) {

}

