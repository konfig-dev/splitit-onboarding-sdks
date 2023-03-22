# \MerchantsApi

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Create**](MerchantsApi.md#Create) | **Post** /api/merchants/create | 
[**Get**](MerchantsApi.md#Get) | **Get** /api/merchants/get | 
[**GetDetails**](MerchantsApi.md#GetDetails) | **Get** /api/merchants/get-details | 



## Create

> CreateMerchantResponse Create(ctx).CreateMerchantRequest(createMerchantRequest).Execute()



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
    createMerchantRequest := *splitit.NewCreateMerchantRequest("PublicName_example", "Email_example", "PhoneNumber_example", "CountryIso2_example", "LegalName_example", "CurrencyCode_example") // CreateMerchantRequest | 

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.MerchantsApi.Create(context.Background()).CreateMerchantRequest(createMerchantRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MerchantsApi.Create``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Create`: CreateMerchantResponse
    fmt.Fprintf(os.Stdout, "Response from `MerchantsApi.Create`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createMerchantRequest** | [**CreateMerchantRequest**](CreateMerchantRequest.md) |  | 

### Return type

[**CreateMerchantResponse**](CreateMerchantResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Get

> GetMerchantsResponse Get(ctx).NumberOfRowsInPage(numberOfRowsInPage).PageNumber(pageNumber).Name(name).LegalName(legalName).Status(status).Execute()



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
    numberOfRowsInPage := int32(56) // int32 | 
    pageNumber := int32(56) // int32 | 
    name := "name_example" // string |  (optional)
    legalName := "legalName_example" // string |  (optional)
    status := int32(56) // int32 |  (optional)

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.MerchantsApi.Get(context.Background()).NumberOfRowsInPage(numberOfRowsInPage).PageNumber(pageNumber).Name(name).LegalName(legalName).Status(status).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MerchantsApi.Get``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Get`: GetMerchantsResponse
    fmt.Fprintf(os.Stdout, "Response from `MerchantsApi.Get`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberOfRowsInPage** | **int32** |  | 
 **pageNumber** | **int32** |  | 
 **name** | **string** |  | 
 **legalName** | **string** |  | 
 **status** | **int32** |  | 

### Return type

[**GetMerchantsResponse**](GetMerchantsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetDetails

> GetMerchantDetailsResponse GetDetails(ctx).MerchantTempId(merchantTempId).Execute()



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
    merchantTempId := "merchantTempId_example" // string | 

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.MerchantsApi.GetDetails(context.Background()).MerchantTempId(merchantTempId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MerchantsApi.GetDetails``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetDetails`: GetMerchantDetailsResponse
    fmt.Fprintf(os.Stdout, "Response from `MerchantsApi.GetDetails`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetDetailsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantTempId** | **string** |  | 

### Return type

[**GetMerchantDetailsResponse**](GetMerchantDetailsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

