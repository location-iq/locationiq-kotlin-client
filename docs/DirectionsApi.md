# DirectionsApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**directions**](DirectionsApi.md#directions) | **GET** /directions/driving/{coordinates} | Directions Service


<a name="directions"></a>
# **directions**
> DirectionsMinusDirections directions(coordinates, bearings, radiuses, generateHints, approaches, exclude, alternatives, steps, annotations, geometries, overview, continueStraight)

Directions Service

Finds the fastest route between coordinates in the supplied order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DirectionsApi()
val coordinates : kotlin.String = "-0.16102,51.523854;-0.15797,51.52326;-0.161593,51.522550" // kotlin.String | String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google's polyline format with precision 5
val bearings : kotlin.String = "10,20;40,30;30,9" // kotlin.String | Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180
val radiuses : kotlin.String = "500;200;300" // kotlin.String | Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double >= 0 or unlimited (default)
val generateHints : kotlin.String = "false" // kotlin.String | Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String
val approaches : kotlin.String = "curb;curb;curb" // kotlin.String | Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default)
val exclude : kotlin.String = "toll" // kotlin.String | Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none.
val alternatives : java.math.BigDecimal = 0 // java.math.BigDecimal | Search for alternative routes. Passing a number alternatives=n searches for up to n alternative routes. [ true, false (default), or Number ]
val steps : kotlin.String = "true" // kotlin.String | Returned route steps for each route leg [ true, false (default) ]
val annotations : kotlin.String = "false" // kotlin.String | Returns additional metadata for each coordinate along the route geometry.  [ true, false (default), nodes, distance, duration, datasources, weight, speed ]
val geometries : kotlin.String = "polyline" // kotlin.String | Returned route geometry format (influences overview and per step) [ polyline (default), polyline6, geojson ]
val overview : kotlin.String = "simplified" // kotlin.String | Add overview geometry either full, simplified according to highest zoom level it could be display on, or not at all. [ simplified (default), full, false ]
val continueStraight : kotlin.String = "default" // kotlin.String | Forces the route to keep going straight at waypoints constraining uturns there even if it would be faster. Default value depends on the profile [ default (default), true, false ]
try {
    val result : DirectionsMinusDirections = apiInstance.directions(coordinates, bearings, radiuses, generateHints, approaches, exclude, alternatives, steps, annotations, geometries, overview, continueStraight)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectionsApi#directions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectionsApi#directions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coordinates** | **kotlin.String**| String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google&#39;s polyline format with precision 5 |
 **bearings** | **kotlin.String**| Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180 | [optional]
 **radiuses** | **kotlin.String**| Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double &gt;&#x3D; 0 or unlimited (default) | [optional]
 **generateHints** | **kotlin.String**| Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String | [optional]
 **approaches** | **kotlin.String**| Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default) | [optional]
 **exclude** | **kotlin.String**| Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none. | [optional]
 **alternatives** | **java.math.BigDecimal**| Search for alternative routes. Passing a number alternatives&#x3D;n searches for up to n alternative routes. [ true, false (default), or Number ] | [optional]
 **steps** | **kotlin.String**| Returned route steps for each route leg [ true, false (default) ] | [optional]
 **annotations** | **kotlin.String**| Returns additional metadata for each coordinate along the route geometry.  [ true, false (default), nodes, distance, duration, datasources, weight, speed ] | [optional] [default to &#39;&quot;false&quot;&#39;]
 **geometries** | **kotlin.String**| Returned route geometry format (influences overview and per step) [ polyline (default), polyline6, geojson ] | [optional] [default to &#39;&quot;polyline&quot;&#39;]
 **overview** | **kotlin.String**| Add overview geometry either full, simplified according to highest zoom level it could be display on, or not at all. [ simplified (default), full, false ] | [optional] [default to &#39;&quot;simplified&quot;&#39;]
 **continueStraight** | **kotlin.String**| Forces the route to keep going straight at waypoints constraining uturns there even if it would be faster. Default value depends on the profile [ default (default), true, false ] | [optional] [default to &#39;&quot;default&quot;&#39;]

### Return type

[**DirectionsMinusDirections**](DirectionsMinusDirections.md)

### Authorization


Configure key:
    ApiClient.apiKey["key"] = ""
    ApiClient.apiKeyPrefix["key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

