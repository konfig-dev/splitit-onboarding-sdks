# \DataApi

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCountries**](DataApi.md#GetCountries) | **Get** /api/data/get-countries | 
[**GetCurrencies**](DataApi.md#GetCurrencies) | **Get** /api/data/get-currencies | 
[**GetProcessors**](DataApi.md#GetProcessors) | **Get** /api/data/get-processors | 
[**GetVerticals**](DataApi.md#GetVerticals) | **Get** /api/data/get-verticals | 
[**StatusLegend**](DataApi.md#StatusLegend) | **Get** /api/data/status-legend | 



## GetCountries

> CountriesResponse GetCountries(ctx).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-onboarding-sdks/go"
)

func main() {

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.DataApi.GetCountries(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DataApi.GetCountries``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetCountries`: CountriesResponse
    fmt.Fprintf(os.Stdout, "Response from `DataApi.GetCountries`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetCountriesRequest struct via the builder pattern


### Return type

[**CountriesResponse**](CountriesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCurrencies

> CurrenciesResponse GetCurrencies(ctx).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-onboarding-sdks/go"
)

func main() {

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.DataApi.GetCurrencies(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DataApi.GetCurrencies``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetCurrencies`: CurrenciesResponse
    fmt.Fprintf(os.Stdout, "Response from `DataApi.GetCurrencies`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetCurrenciesRequest struct via the builder pattern


### Return type

[**CurrenciesResponse**](CurrenciesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetProcessors

> ProcessorsResponse GetProcessors(ctx).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-onboarding-sdks/go"
)

func main() {

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.DataApi.GetProcessors(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DataApi.GetProcessors``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetProcessors`: ProcessorsResponse
    fmt.Fprintf(os.Stdout, "Response from `DataApi.GetProcessors`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetProcessorsRequest struct via the builder pattern


### Return type

[**ProcessorsResponse**](ProcessorsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetVerticals

> MerchantVerticalsResponse GetVerticals(ctx).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-onboarding-sdks/go"
)

func main() {

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.DataApi.GetVerticals(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DataApi.GetVerticals``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetVerticals`: MerchantVerticalsResponse
    fmt.Fprintf(os.Stdout, "Response from `DataApi.GetVerticals`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetVerticalsRequest struct via the builder pattern


### Return type

[**MerchantVerticalsResponse**](MerchantVerticalsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StatusLegend

> []EnumDTO StatusLegend(ctx).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-onboarding-sdks/go"
)

func main() {

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.DataApi.StatusLegend(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DataApi.StatusLegend``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `StatusLegend`: []EnumDTO
    fmt.Fprintf(os.Stdout, "Response from `DataApi.StatusLegend`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiStatusLegendRequest struct via the builder pattern


### Return type

[**[]EnumDTO**](EnumDTO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

