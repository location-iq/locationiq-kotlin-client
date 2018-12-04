/**
* LocationIQ
* LocationIQ provides flexible enterprise-grade location based solutions. We work with developers, startups and enterprises worldwide serving billions of requests everyday. This page provides an overview of the technical aspects of our API and will help you get started.
*
* OpenAPI spec version: 1.0.1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package locationiq.apis

import locationiq.models.Error
import locationiq.models.Location

import locationiq.infrastructure.*

class SearchApi(basePath: kotlin.String = "https://eu1.locationiq.com/v1") : ApiClient(basePath) {

    /**
    * Forward Geocoding
    * The Search API allows converting addresses, such as a street address, into geographic coordinates (latitude and longitude). These coordinates can serve various use-cases, from placing markers on a map to helping algorithms determine nearby bus stops. This process is also known as Forward Geocoding.
    * @param q Address to geocode 
    * @param format Format to geocode. Only JSON supported for SDKs 
    * @param normalizecity For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs. 
    * @param addressdetails Include a breakdown of the address into elements. Defaults to 0. (optional)
    * @param viewbox The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - &#x60;max_lon,max_lat,min_lon,min_lat&#x60; or &#x60;min_lon,min_lat,max_lon,max_lat&#x60; - are accepted in any order as long as they span a real box.  (optional)
    * @param bounded Restrict the results to only items contained with the viewbox (optional)
    * @param limit Limit the number of returned results. Default is 10. (optional, default to 10)
    * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
    * @param countrycodes Limit search to a list of countries. (optional)
    * @param namedetails Include a list of alternative names in the results. These may include language variants, references, operator and brand. (optional)
    * @param dedupe Sometimes you have several objects in OSM identifying the same place or object in reality. The simplest case is a street being split in many different OSM ways due to different characteristics. Nominatim will attempt to detect such duplicates and only return one match; this is controlled by the dedupe parameter which defaults to 1. Since the limit is, for reasons of efficiency, enforced before and not after de-duplicating, it is possible that de-duplicating leaves you with less results than requested. (optional)
    * @param extratags Include additional information in the result if available, e.g. wikipedia link, opening hours. (optional)
    * @param statecode Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0 (optional)
    * @return kotlin.Array<Location>
    */
    @Suppress("UNCHECKED_CAST")
    fun search(q: kotlin.String, format: kotlin.String, normalizecity: kotlin.Int, addressdetails: kotlin.Int, viewbox: kotlin.String, bounded: kotlin.Int, limit: kotlin.Int, acceptLanguage: kotlin.String, countrycodes: kotlin.String, namedetails: kotlin.Int, dedupe: kotlin.Int, extratags: kotlin.Int, statecode: kotlin.Int) : kotlin.Array<Location> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("q" to listOf("$q"), "format" to listOf("$format"), "normalizecity" to listOf("$normalizecity"), "addressdetails" to listOf("$addressdetails"), "viewbox" to listOf("$viewbox"), "bounded" to listOf("$bounded"), "limit" to listOf("$limit"), "accept-language" to listOf("$acceptLanguage"), "countrycodes" to listOf("$countrycodes"), "namedetails" to listOf("$namedetails"), "dedupe" to listOf("$dedupe"), "extratags" to listOf("$extratags"), "statecode" to listOf("$statecode"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/search.php",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Location>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Location>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
