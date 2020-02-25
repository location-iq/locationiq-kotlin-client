# NearestApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nearest**](NearestApi.md#nearest) | **GET** /nearest/driving/{coordinates} | Nearest Service


<a name="nearest"></a>
# **nearest**
> DirectionsMinusNearest nearest(coordinates, generateHints, exclude, bearings, radiuses, approaches, number)

Nearest Service

Snaps a coordinate to the street network and returns the nearest n matches. Where coordinates only supports a single {longitude},{latitude} entry.

### Example
```kotlin
// Import classes:
//import locationiq.infrastructure.*
//import locationiq.models.*

val apiInstance = NearestApi()
val coordinates : kotlin.String = "-0.16102,51.523854" // kotlin.String | String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google's polyline format with precision 5
val generateHints : kotlin.String = "false" // kotlin.String | Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String
val exclude : kotlin.String = "toll" // kotlin.String | Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none.
val bearings : kotlin.String = "10,20" // kotlin.String | Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180
val radiuses : kotlin.String = "1000" // kotlin.String | Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double >= 0 or unlimited (default)
val approaches : kotlin.String = "curb" // kotlin.String | Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default)
val number : kotlin.Int = 3 // kotlin.Int | Number of nearest segments that should be returned. [ integer >= 1 (default 1) ]
try {
    val result : DirectionsMinusNearest = apiInstance.nearest(coordinates, generateHints, exclude, bearings, radiuses, approaches, number)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NearestApi#nearest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NearestApi#nearest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coordinates** | **kotlin.String**| String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google&#39;s polyline format with precision 5 |
 **generateHints** | **kotlin.String**| Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String | [optional]
 **exclude** | **kotlin.String**| Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none. | [optional]
 **bearings** | **kotlin.String**| Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180 | [optional]
 **radiuses** | **kotlin.String**| Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double &gt;&#x3D; 0 or unlimited (default) | [optional]
 **approaches** | **kotlin.String**| Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default) | [optional]
 **number** | **kotlin.Int**| Number of nearest segments that should be returned. [ integer &gt;&#x3D; 1 (default 1) ] | [optional]

### Return type

[**DirectionsMinusNearest**](DirectionsMinusNearest.md)

### Authorization


Configure key:
    ApiClient.apiKey["key"] = ""
    ApiClient.apiKeyPrefix["key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

