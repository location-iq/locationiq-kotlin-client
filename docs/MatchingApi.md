# MatchingApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**matching**](MatchingApi.md#matching) | **GET** /matching/driving/{coordinates} | Matching Service


<a name="matching"></a>
# **matching**
> DirectionsMinusMatching matching(coordinates, generateHints, approaches, exclude, bearings, radiuses, steps, annotations, geometries, overview, timestamps, gaps, tidy, waypoints)

Matching Service

Matching API matches or snaps given GPS points to the road network in the most plausible way.  Please note the request might result multiple sub-traces.  Large jumps in the timestamps (&gt; 60s) or improbable transitions lead to trace splits if a complete matching could not be found. The algorithm might not be able to match all points. Outliers are removed if they can not be matched successfully.

### Example
```kotlin
// Import classes:
//import locationiq.infrastructure.*
//import locationiq.models.*

val apiInstance = MatchingApi()
val coordinates : kotlin.String = "-0.16102,51.523854;-0.15797,51.52326;-0.161593,51.522550" // kotlin.String | String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google's polyline format with precision 5
val generateHints : kotlin.String = "false" // kotlin.String | Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String
val approaches : kotlin.String = "curb;curb;curb" // kotlin.String | Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default)
val exclude : kotlin.String = "toll" // kotlin.String | Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none.
val bearings : kotlin.String = "None" // kotlin.String | Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180
val radiuses : kotlin.String = "None" // kotlin.String | Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double >= 0 or unlimited (default)
val steps : kotlin.String = "true" // kotlin.String | Returned route steps for each route leg [ true, false (default) ]
val annotations : kotlin.String = "false" // kotlin.String | Returns additional metadata for each coordinate along the route geometry.  [ true, false (default), nodes, distance, duration, datasources, weight, speed ]
val geometries : kotlin.String = "polyline" // kotlin.String | Returned route geometry format (influences overview and per step) [ polyline (default), polyline6, geojson ]
val overview : kotlin.String = "simplified" // kotlin.String | Add overview geometry either full, simplified according to highest zoom level it could be display on, or not at all. [ simplified (default), full, false ]
val timestamps : kotlin.String = "200;300;900" // kotlin.String | Timestamps for the input locations in seconds since UNIX epoch. Timestamps need to be monotonically increasing. [ {timestamp};{timestamp}[;{timestamp} ...]  integer seconds since UNIX epoch
val gaps : kotlin.String = "ignore" // kotlin.String | Allows the input track splitting based on huge timestamp gaps between points. [ split (default), ignore ]
val tidy : kotlin.String = "false" // kotlin.String | Allows the input track modification to obtain better matching quality for noisy tracks. [ true, false (default) ]
val waypoints : kotlin.String = "0;1;2" // kotlin.String | Treats input coordinates indicated by given indices as waypoints in returned Match object. Default is to treat all input coordinates as waypoints. [ {index};{index};{index}... ]
try {
    val result : DirectionsMinusMatching = apiInstance.matching(coordinates, generateHints, approaches, exclude, bearings, radiuses, steps, annotations, geometries, overview, timestamps, gaps, tidy, waypoints)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchingApi#matching")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchingApi#matching")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coordinates** | **kotlin.String**| String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google&#39;s polyline format with precision 5 |
 **generateHints** | **kotlin.String**| Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String | [optional]
 **approaches** | **kotlin.String**| Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default) | [optional]
 **exclude** | **kotlin.String**| Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none. | [optional]
 **bearings** | **kotlin.String**| Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180 | [optional]
 **radiuses** | **kotlin.String**| Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double &gt;&#x3D; 0 or unlimited (default) | [optional]
 **steps** | **kotlin.String**| Returned route steps for each route leg [ true, false (default) ] | [optional]
 **annotations** | **kotlin.String**| Returns additional metadata for each coordinate along the route geometry.  [ true, false (default), nodes, distance, duration, datasources, weight, speed ] | [optional] [default to &#39;&quot;false&quot;&#39;]
 **geometries** | **kotlin.String**| Returned route geometry format (influences overview and per step) [ polyline (default), polyline6, geojson ] | [optional] [default to &#39;&quot;polyline&quot;&#39;]
 **overview** | **kotlin.String**| Add overview geometry either full, simplified according to highest zoom level it could be display on, or not at all. [ simplified (default), full, false ] | [optional] [default to &#39;&quot;simplified&quot;&#39;]
 **timestamps** | **kotlin.String**| Timestamps for the input locations in seconds since UNIX epoch. Timestamps need to be monotonically increasing. [ {timestamp};{timestamp}[;{timestamp} ...]  integer seconds since UNIX epoch | [optional]
 **gaps** | **kotlin.String**| Allows the input track splitting based on huge timestamp gaps between points. [ split (default), ignore ] | [optional] [default to &#39;&quot;split&quot;&#39;]
 **tidy** | **kotlin.String**| Allows the input track modification to obtain better matching quality for noisy tracks. [ true, false (default) ] | [optional] [default to &#39;&quot;false&quot;&#39;]
 **waypoints** | **kotlin.String**| Treats input coordinates indicated by given indices as waypoints in returned Match object. Default is to treat all input coordinates as waypoints. [ {index};{index};{index}... ] | [optional]

### Return type

[**DirectionsMinusMatching**](DirectionsMinusMatching.md)

### Authorization


Configure key:
    ApiClient.apiKey["key"] = ""
    ApiClient.apiKeyPrefix["key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

