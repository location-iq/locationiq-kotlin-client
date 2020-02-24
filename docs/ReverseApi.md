# ReverseApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reverse**](ReverseApi.md#reverse) | **GET** /reverse.php | Reverse Geocoding


<a name="reverse"></a>
# **reverse**
> Location reverse(lat, lon, format, normalizecity, addressdetails, acceptMinusLanguage, namedetails, extratags, statecode, showdistance, postaladdress)

Reverse Geocoding

Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.

### Example
```kotlin
// Import classes:
//import locationiq.infrastructure.*
//import locationiq.models.*

val apiInstance = ReverseApi()
val lat : java.math.BigDecimal = 40.7487727 // java.math.BigDecimal | Latitude of the location to generate an address for.
val lon : java.math.BigDecimal = -73.9849336 // java.math.BigDecimal | Longitude of the location to generate an address for.
val format : kotlin.String = "json" // kotlin.String | Format to geocode. Only JSON supported for SDKs
val normalizecity : kotlin.Int = 1 // kotlin.Int | Normalizes village to city level data to city
val addressdetails : kotlin.Int = 1 // kotlin.Int | Include a breakdown of the address into elements. Defaults to 1.
val acceptMinusLanguage : kotlin.String = "en" // kotlin.String | Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language=native
val namedetails : kotlin.Int = 0 // kotlin.Int | Include a list of alternative names in the results. These may include language variants, references, operator and brand.
val extratags : kotlin.Int = 0 // kotlin.Int | Include additional information in the result if available, e.g. wikipedia link, opening hours.
val statecode : kotlin.Int = 0 // kotlin.Int | Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0
val showdistance : kotlin.Int = 0 // kotlin.Int | Returns the straight line distance (meters) between the input location and the result's location. Value is set in the distance key of the response. Defaults to 0 [0,1]
val postaladdress : kotlin.Int = 0 // kotlin.Int | Returns address inside the postaladdress key, that is specifically formatted for each country. Currently supported for addresses in Germany. Defaults to 0 [0,1]
try {
    val result : Location = apiInstance.reverse(lat, lon, format, normalizecity, addressdetails, acceptMinusLanguage, namedetails, extratags, statecode, showdistance, postaladdress)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReverseApi#reverse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReverseApi#reverse")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lat** | **java.math.BigDecimal**| Latitude of the location to generate an address for. |
 **lon** | **java.math.BigDecimal**| Longitude of the location to generate an address for. |
 **format** | **kotlin.String**| Format to geocode. Only JSON supported for SDKs | [enum: json]
 **normalizecity** | **kotlin.Int**| Normalizes village to city level data to city | [enum: 1]
 **addressdetails** | **kotlin.Int**| Include a breakdown of the address into elements. Defaults to 1. | [optional] [default to 1] [enum: 0, 1]
 **acceptMinusLanguage** | **kotlin.String**| Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native | [optional]
 **namedetails** | **kotlin.Int**| Include a list of alternative names in the results. These may include language variants, references, operator and brand. | [optional] [enum: 0, 1]
 **extratags** | **kotlin.Int**| Include additional information in the result if available, e.g. wikipedia link, opening hours. | [optional] [enum: 0, 1]
 **statecode** | **kotlin.Int**| Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0 | [optional] [enum: 0, 1]
 **showdistance** | **kotlin.Int**| Returns the straight line distance (meters) between the input location and the result&#39;s location. Value is set in the distance key of the response. Defaults to 0 [0,1] | [optional]
 **postaladdress** | **kotlin.Int**| Returns address inside the postaladdress key, that is specifically formatted for each country. Currently supported for addresses in Germany. Defaults to 0 [0,1] | [optional]

### Return type

[**Location**](Location.md)

### Authorization


Configure key:
    ApiClient.apiKey["key"] = ""
    ApiClient.apiKeyPrefix["key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

