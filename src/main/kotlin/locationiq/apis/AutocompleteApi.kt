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
package locationiq.apis

import locationiq.models.Error

import locationiq.infrastructure.ApiClient
import locationiq.infrastructure.ClientException
import locationiq.infrastructure.ClientError
import locationiq.infrastructure.ServerException
import locationiq.infrastructure.ServerError
import locationiq.infrastructure.MultiValueMap
import locationiq.infrastructure.RequestConfig
import locationiq.infrastructure.RequestMethod
import locationiq.infrastructure.ResponseType
import locationiq.infrastructure.Success
import locationiq.infrastructure.toMultiValue

class AutocompleteApi(basePath: kotlin.String = "https://eu1.locationiq.com/v1") : ApiClient(basePath) {

    /**
    * 
    * The Autocomplete API is a variant of the Search API that returns place predictions in response to an HTTP request.  The request specifies a textual search string and optional geographic bounds.  The service can be used to provide autocomplete functionality for text-based geographic searches, by returning places such as businesses, addresses and points of interest as a user types. The Autocomplete API can match on full words as well as substrings. Applications can therefore send queries as the user types, to provide on-the-fly place predictions.
    * @param q Address to geocode 
    * @param normalizecity For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs. 
    * @param limit Limit the number of returned results. Default is 10. (optional, default to 10)
    * @param viewbox The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - &#x60;max_lon,max_lat,min_lon,min_lat&#x60; or &#x60;min_lon,min_lat,max_lon,max_lat&#x60; - are accepted in any order as long as they span a real box.  (optional)
    * @param bounded Restrict the results to only items contained with the viewbox (optional)
    * @param countrycodes Limit search to a list of countries. (optional)
    * @param acceptMinusLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
    * @param tag Restricts the autocomplete search results to elements of specific OSM class and type.  Example - To restrict results to only class place and type city: tag&#x3D;place:city, To restrict the results to all of OSM class place: tag&#x3D;place (optional)
    * @return kotlin.Array<kotlin.Any>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun autocomplete(q: kotlin.String, normalizecity: kotlin.Int, limit: kotlin.Int?, viewbox: kotlin.String?, bounded: kotlin.Int?, countrycodes: kotlin.String?, acceptMinusLanguage: kotlin.String?, tag: kotlin.String?) : kotlin.Array<kotlin.Any> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("q", listOf(q.toString()))
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
                if (viewbox != null) {
                    put("viewbox", listOf(viewbox.toString()))
                }
                if (bounded != null) {
                    put("bounded", listOf(bounded.toString()))
                }
                if (countrycodes != null) {
                    put("countrycodes", listOf(countrycodes.toString()))
                }
                put("normalizecity", listOf(normalizecity.toString()))
                if (acceptMinusLanguage != null) {
                    put("acceptMinusLanguage", listOf(acceptMinusLanguage.toString()))
                }
                if (tag != null) {
                    put("tag", listOf(tag.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/autocomplete.php",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<kotlin.Any>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<kotlin.Any>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException(localVarError.body as? String ?: "Client error", localVarError.statusCode)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException(localVarError.message ?: "Server error", localVarError.statusCode)
            }
        }
    }

}