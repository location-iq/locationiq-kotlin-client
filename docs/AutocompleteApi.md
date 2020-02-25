# AutocompleteApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**autocomplete**](AutocompleteApi.md#autocomplete) | **GET** /autocomplete.php | 


<a name="autocomplete"></a>
# **autocomplete**
> kotlin.Array&lt;kotlin.Any&gt; autocomplete(q, normalizecity, limit, viewbox, bounded, countrycodes, acceptMinusLanguage, tag)



The Autocomplete API is a variant of the Search API that returns place predictions in response to an HTTP request.  The request specifies a textual search string and optional geographic bounds.  The service can be used to provide autocomplete functionality for text-based geographic searches, by returning places such as businesses, addresses and points of interest as a user types. The Autocomplete API can match on full words as well as substrings. Applications can therefore send queries as the user types, to provide on-the-fly place predictions.

### Example
```kotlin
// Import classes:
//import locationiq.infrastructure.*
//import locationiq.models.*

val apiInstance = AutocompleteApi()
val q : kotlin.String = "Empire state" // kotlin.String | Address to geocode
val normalizecity : kotlin.Int = 1 // kotlin.Int | For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of returned results. Default is 10.
val viewbox : kotlin.String = "-132.84908,47.69382,-70.44674,30.82531" // kotlin.String | The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - `max_lon,max_lat,min_lon,min_lat` or `min_lon,min_lat,max_lon,max_lat` - are accepted in any order as long as they span a real box. 
val bounded : kotlin.Int = 1 // kotlin.Int | Restrict the results to only items contained with the viewbox
val countrycodes : kotlin.String = "us" // kotlin.String | Limit search to a list of countries.
val acceptMinusLanguage : kotlin.String = "en" // kotlin.String | Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language=native
val tag : kotlin.String = "place" // kotlin.String | Restricts the autocomplete search results to elements of specific OSM class and type.  Example - To restrict results to only class place and type city: tag=place:city, To restrict the results to all of OSM class place: tag=place
try {
    val result : kotlin.Array<kotlin.Any> = apiInstance.autocomplete(q, normalizecity, limit, viewbox, bounded, countrycodes, acceptMinusLanguage, tag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutocompleteApi#autocomplete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutocompleteApi#autocomplete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| Address to geocode |
 **normalizecity** | **kotlin.Int**| For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs. | [enum: 1]
 **limit** | **kotlin.Int**| Limit the number of returned results. Default is 10. | [optional] [default to 10]
 **viewbox** | **kotlin.String**| The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - &#x60;max_lon,max_lat,min_lon,min_lat&#x60; or &#x60;min_lon,min_lat,max_lon,max_lat&#x60; - are accepted in any order as long as they span a real box.  | [optional]
 **bounded** | **kotlin.Int**| Restrict the results to only items contained with the viewbox | [optional] [enum: 0, 1]
 **countrycodes** | **kotlin.String**| Limit search to a list of countries. | [optional]
 **acceptMinusLanguage** | **kotlin.String**| Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native | [optional]
 **tag** | **kotlin.String**| Restricts the autocomplete search results to elements of specific OSM class and type.  Example - To restrict results to only class place and type city: tag&#x3D;place:city, To restrict the results to all of OSM class place: tag&#x3D;place | [optional]

### Return type

[**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md)

### Authorization


Configure key:
    ApiClient.apiKey["key"] = ""
    ApiClient.apiKeyPrefix["key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

