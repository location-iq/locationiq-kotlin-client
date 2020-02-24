# SearchApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchApi.md#search) | **GET** /search.php | Forward Geocoding


<a name="search"></a>
# **search**
> kotlin.Array&lt;Location&gt; search(q, format, normalizecity, addressdetails, viewbox, bounded, limit, acceptMinusLanguage, countrycodes, namedetails, dedupe, extratags, statecode, matchquality, postaladdress)

Forward Geocoding

The Search API allows converting addresses, such as a street address, into geographic coordinates (latitude and longitude). These coordinates can serve various use-cases, from placing markers on a map to helping algorithms determine nearby bus stops. This process is also known as Forward Geocoding.

### Example
```kotlin
// Import classes:
//import locationiq.infrastructure.*
//import locationiq.models.*

val apiInstance = SearchApi()
val q : kotlin.String = "Empire state building" // kotlin.String | Address to geocode
val format : kotlin.String = "json" // kotlin.String | Format to geocode. Only JSON supported for SDKs
val normalizecity : kotlin.Int = 1 // kotlin.Int | For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs.
val addressdetails : kotlin.Int = 1 // kotlin.Int | Include a breakdown of the address into elements. Defaults to 0.
val viewbox : kotlin.String = "-132.84908,47.69382,-70.44674,30.82531" // kotlin.String | The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - `max_lon,max_lat,min_lon,min_lat` or `min_lon,min_lat,max_lon,max_lat` - are accepted in any order as long as they span a real box. 
val bounded : kotlin.Int = 1 // kotlin.Int | Restrict the results to only items contained with the viewbox
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of returned results. Default is 10.
val acceptMinusLanguage : kotlin.String = "en" // kotlin.String | Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language=native
val countrycodes : kotlin.String = "us" // kotlin.String | Limit search to a list of countries.
val namedetails : kotlin.Int = 1 // kotlin.Int | Include a list of alternative names in the results. These may include language variants, references, operator and brand.
val dedupe : kotlin.Int = 1 // kotlin.Int | Sometimes you have several objects in OSM identifying the same place or object in reality. The simplest case is a street being split in many different OSM ways due to different characteristics. Nominatim will attempt to detect such duplicates and only return one match; this is controlled by the dedupe parameter which defaults to 1. Since the limit is, for reasons of efficiency, enforced before and not after de-duplicating, it is possible that de-duplicating leaves you with less results than requested.
val extratags : kotlin.Int = 0 // kotlin.Int | Include additional information in the result if available, e.g. wikipedia link, opening hours.
val statecode : kotlin.Int = 0 // kotlin.Int | Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0
val matchquality : kotlin.Int = 0 // kotlin.Int | Returns additional information about quality of the result in a matchquality object. Read more Defaults to 0 [0,1]
val postaladdress : kotlin.Int = 0 // kotlin.Int | Returns address inside the postaladdress key, that is specifically formatted for each country. Currently supported for addresses in Germany. Defaults to 0 [0,1]
try {
    val result : kotlin.Array<Location> = apiInstance.search(q, format, normalizecity, addressdetails, viewbox, bounded, limit, acceptMinusLanguage, countrycodes, namedetails, dedupe, extratags, statecode, matchquality, postaladdress)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#search")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#search")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| Address to geocode |
 **format** | **kotlin.String**| Format to geocode. Only JSON supported for SDKs | [enum: json]
 **normalizecity** | **kotlin.Int**| For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs. | [enum: 1]
 **addressdetails** | **kotlin.Int**| Include a breakdown of the address into elements. Defaults to 0. | [optional] [enum: 0, 1]
 **viewbox** | **kotlin.String**| The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - &#x60;max_lon,max_lat,min_lon,min_lat&#x60; or &#x60;min_lon,min_lat,max_lon,max_lat&#x60; - are accepted in any order as long as they span a real box.  | [optional]
 **bounded** | **kotlin.Int**| Restrict the results to only items contained with the viewbox | [optional] [enum: 0, 1]
 **limit** | **kotlin.Int**| Limit the number of returned results. Default is 10. | [optional] [default to 10]
 **acceptMinusLanguage** | **kotlin.String**| Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native | [optional]
 **countrycodes** | **kotlin.String**| Limit search to a list of countries. | [optional]
 **namedetails** | **kotlin.Int**| Include a list of alternative names in the results. These may include language variants, references, operator and brand. | [optional] [enum: 0, 1]
 **dedupe** | **kotlin.Int**| Sometimes you have several objects in OSM identifying the same place or object in reality. The simplest case is a street being split in many different OSM ways due to different characteristics. Nominatim will attempt to detect such duplicates and only return one match; this is controlled by the dedupe parameter which defaults to 1. Since the limit is, for reasons of efficiency, enforced before and not after de-duplicating, it is possible that de-duplicating leaves you with less results than requested. | [optional] [enum: 0, 1]
 **extratags** | **kotlin.Int**| Include additional information in the result if available, e.g. wikipedia link, opening hours. | [optional] [enum: 0, 1]
 **statecode** | **kotlin.Int**| Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0 | [optional] [enum: 0, 1]
 **matchquality** | **kotlin.Int**| Returns additional information about quality of the result in a matchquality object. Read more Defaults to 0 [0,1] | [optional]
 **postaladdress** | **kotlin.Int**| Returns address inside the postaladdress key, that is specifically formatted for each country. Currently supported for addresses in Germany. Defaults to 0 [0,1] | [optional]

### Return type

[**kotlin.Array&lt;Location&gt;**](Location.md)

### Authorization


Configure key:
    ApiClient.apiKey["key"] = ""
    ApiClient.apiKeyPrefix["key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

