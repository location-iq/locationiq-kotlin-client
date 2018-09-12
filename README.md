# locationiq - Kotlin client library for LocationIQ

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://eu1.locationiq.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BalanceApi* | [**balance**](docs/BalanceApi.md#balance) | **GET** /balance.php | 
*ReverseApi* | [**reverse**](docs/ReverseApi.md#reverse) | **GET** /reverse.php | Reverse Geocoding
*SearchApi* | [**search**](docs/SearchApi.md#search) | **GET** /search.php | Forward Geocoding


<a name="documentation-for-models"></a>
## Documentation for Models

 - [locationiq.models.Address](docs/Address.md)
 - [locationiq.models.Balance](docs/Balance.md)
 - [locationiq.models.Daybalance](docs/Daybalance.md)
 - [locationiq.models.Error](docs/Error.md)
 - [locationiq.models.Location](docs/Location.md)
 - [locationiq.models.Namedetails](docs/Namedetails.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="key"></a>
### key

- **Type**: API key
- **API key parameter name**: key
- **Location**: URL query string

