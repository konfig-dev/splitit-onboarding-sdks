# \MerchantsApi

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateMerchant**](MerchantsApi.md#CreateMerchant) | **Post** /api/merchants/create | 
[**GetMerchantDetails**](MerchantsApi.md#GetMerchantDetails) | **Get** /api/merchants/get-details | 
[**GetMerchants**](MerchantsApi.md#GetMerchants) | **Get** /api/merchants/get | 



## CreateMerchant

> CreateMerchantResponse CreateMerchant(ctx).CreateMerchantRequest(createMerchantRequest).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    createMerchantRequest := *openapiclient.NewCreateMerchantRequest("PublicName_example", "Email_example", "PhoneNumber_example", "CountryIso2_example", "LegalName_example", "CurrencyCode_example") // CreateMerchantRequest | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MerchantsApi.CreateMerchant(context.Background()).CreateMerchantRequest(createMerchantRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MerchantsApi.CreateMerchant``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateMerchant`: CreateMerchantResponse
    fmt.Fprintf(os.Stdout, "Response from `MerchantsApi.CreateMerchant`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateMerchantRequest struct via the builder pattern


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


## GetMerchantDetails

> GetMerchantDetailsResponse GetMerchantDetails(ctx).MerchantTempId(merchantTempId).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    merchantTempId := "merchantTempId_example" // string | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MerchantsApi.GetMerchantDetails(context.Background()).MerchantTempId(merchantTempId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MerchantsApi.GetMerchantDetails``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetMerchantDetails`: GetMerchantDetailsResponse
    fmt.Fprintf(os.Stdout, "Response from `MerchantsApi.GetMerchantDetails`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetMerchantDetailsRequest struct via the builder pattern


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


## GetMerchants

> GetMerchantsResponse GetMerchants(ctx).NumberOfRowsInPage(numberOfRowsInPage).PageNumber(pageNumber).Name(name).LegalName(legalName).Status(status).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    numberOfRowsInPage := int32(56) // int32 | 
    pageNumber := int32(56) // int32 | 
    name := "name_example" // string |  (optional)
    legalName := "legalName_example" // string |  (optional)
    status := int32(56) // int32 |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MerchantsApi.GetMerchants(context.Background()).NumberOfRowsInPage(numberOfRowsInPage).PageNumber(pageNumber).Name(name).LegalName(legalName).Status(status).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MerchantsApi.GetMerchants``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetMerchants`: GetMerchantsResponse
    fmt.Fprintf(os.Stdout, "Response from `MerchantsApi.GetMerchants`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetMerchantsRequest struct via the builder pattern


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

