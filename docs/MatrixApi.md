# MatrixApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**matrix**](MatrixApi.md#matrix) | **GET** /matrix/driving/{coordinates} | Matrix Service


<a name="matrix"></a>
# **matrix**
> DirectionsMinusMatrix matrix(coordinates, bearings, radiuses, generateHints, approaches, exclude, annotations, sources, destinations, fallbackSpeed, fallbackCoordinate)

Matrix Service

Computes duration of the fastest route between all pairs of supplied coordinates. Returns the durations or distances or both between the coordinate pairs. Note that the distances are not the shortest distance between two coordinates, but rather the distances of the fastest routes.

### Example
```kotlin
// Import classes:
//import locationiq.infrastructure.*
//import locationiq.models.*

val apiInstance = MatrixApi()
val coordinates : kotlin.String = "-0.16102,51.523854;-0.15797,51.52326;-0.161593,51.522550" // kotlin.String | String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google's polyline format with precision 5
val bearings : kotlin.String = "10,20;40,30;30,9" // kotlin.String | Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180
val radiuses : kotlin.String = "500;200;300" // kotlin.String | Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double >= 0 or unlimited (default)
val generateHints : kotlin.String = "false" // kotlin.String | Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String
val approaches : kotlin.String = "curb;curb;curb" // kotlin.String | Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default)
val exclude : kotlin.String = "toll" // kotlin.String | Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none.
val annotations : kotlin.String = "distance" // kotlin.String | Returns additional metadata for each coordinate along the route geometry.  [ true, false (default), nodes, distance, duration, datasources, weight, speed ]
val sources : kotlin.Int = 0 // kotlin.Int | Use location with given index as source. [ {index};{index}[;{index} ...] or all (default) ] => index  0 <= integer < #locations
val destinations : kotlin.Int = 2 // kotlin.Int | Use location with given index as destination. [ {index};{index}[;{index} ...] or all (default) ]
val fallbackSpeed : java.math.BigDecimal = 25.65 // java.math.BigDecimal | If no route found between a source/destination pair, calculate the as-the-crow-flies distance,  then use this speed to estimate duration. double > 0
val fallbackCoordinate : kotlin.String = "snapped" // kotlin.String | When using a fallback_speed, use the user-supplied coordinate (input), or the snapped location (snapped) for calculating distances. [ input (default), or snapped ]
try {
    val result : DirectionsMinusMatrix = apiInstance.matrix(coordinates, bearings, radiuses, generateHints, approaches, exclude, annotations, sources, destinations, fallbackSpeed, fallbackCoordinate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatrixApi#matrix")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatrixApi#matrix")
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
 **annotations** | **kotlin.String**| Returns additional metadata for each coordinate along the route geometry.  [ true, false (default), nodes, distance, duration, datasources, weight, speed ] | [optional]
 **sources** | **kotlin.Int**| Use location with given index as source. [ {index};{index}[;{index} ...] or all (default) ] &#x3D;&gt; index  0 &lt;&#x3D; integer &lt; #locations | [optional]
 **destinations** | **kotlin.Int**| Use location with given index as destination. [ {index};{index}[;{index} ...] or all (default) ] | [optional]
 **fallbackSpeed** | **java.math.BigDecimal**| If no route found between a source/destination pair, calculate the as-the-crow-flies distance,  then use this speed to estimate duration. double &gt; 0 | [optional]
 **fallbackCoordinate** | **kotlin.String**| When using a fallback_speed, use the user-supplied coordinate (input), or the snapped location (snapped) for calculating distances. [ input (default), or snapped ] | [optional] [default to &#39;&quot;input&quot;&#39;]

### Return type

[**DirectionsMinusMatrix**](DirectionsMinusMatrix.md)

### Authorization


Configure key:
    ApiClient.apiKey["key"] = ""
    ApiClient.apiKeyPrefix["key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

