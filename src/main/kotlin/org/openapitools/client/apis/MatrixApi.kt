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
package org.openapitools.client.apis

import org.openapitools.client.models.DirectionsMinusMatrix
import org.openapitools.client.models.Error

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class MatrixApi(basePath: kotlin.String = "https://eu1.locationiq.com/v1") : ApiClient(basePath) {

    /**
    * Matrix Service
    * Computes duration of the fastest route between all pairs of supplied coordinates. Returns the durations or distances or both between the coordinate pairs. Note that the distances are not the shortest distance between two coordinates, but rather the distances of the fastest routes.
    * @param coordinates String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google&#39;s polyline format with precision 5 
    * @param bearings Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180 (optional)
    * @param radiuses Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double &gt;&#x3D; 0 or unlimited (default) (optional)
    * @param generateHints Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String (optional)
    * @param approaches Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default) (optional)
    * @param exclude Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none. (optional)
    * @param annotations Returns additional metadata for each coordinate along the route geometry.  [ true, false (default), nodes, distance, duration, datasources, weight, speed ] (optional)
    * @param sources Use location with given index as source. [ {index};{index}[;{index} ...] or all (default) ] &#x3D;&gt; index  0 &lt;&#x3D; integer &lt; #locations (optional)
    * @param destinations Use location with given index as destination. [ {index};{index}[;{index} ...] or all (default) ] (optional)
    * @param fallbackSpeed If no route found between a source/destination pair, calculate the as-the-crow-flies distance,  then use this speed to estimate duration. double &gt; 0 (optional)
    * @param fallbackCoordinate When using a fallback_speed, use the user-supplied coordinate (input), or the snapped location (snapped) for calculating distances. [ input (default), or snapped ] (optional, default to '"input"')
    * @return DirectionsMinusMatrix
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun matrix(coordinates: kotlin.String, bearings: kotlin.String?, radiuses: kotlin.String?, generateHints: kotlin.String?, approaches: kotlin.String?, exclude: kotlin.String?, annotations: kotlin.String?, sources: kotlin.Int?, destinations: kotlin.Int?, fallbackSpeed: java.math.BigDecimal?, fallbackCoordinate: kotlin.String?) : DirectionsMinusMatrix {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (bearings != null) {
                    put("bearings", listOf(bearings.toString()))
                }
                if (radiuses != null) {
                    put("radiuses", listOf(radiuses.toString()))
                }
                if (generateHints != null) {
                    put("generateHints", listOf(generateHints.toString()))
                }
                if (approaches != null) {
                    put("approaches", listOf(approaches.toString()))
                }
                if (exclude != null) {
                    put("exclude", listOf(exclude.toString()))
                }
                if (annotations != null) {
                    put("annotations", listOf(annotations.toString()))
                }
                if (sources != null) {
                    put("sources", listOf(sources.toString()))
                }
                if (destinations != null) {
                    put("destinations", listOf(destinations.toString()))
                }
                if (fallbackSpeed != null) {
                    put("fallbackSpeed", listOf(fallbackSpeed.toString()))
                }
                if (fallbackCoordinate != null) {
                    put("fallbackCoordinate", listOf(fallbackCoordinate.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/matrix/driving/{coordinates}".replace("{"+"coordinates"+"}", "$coordinates"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<DirectionsMinusMatrix>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as DirectionsMinusMatrix
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
