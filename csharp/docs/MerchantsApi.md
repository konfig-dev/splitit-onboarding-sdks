# Splitit.Onboarding.Net.Api.MerchantsApi

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**Create**](MerchantsApi.md#create) | **POST** /api/merchants/create |  |
| [**CreateDeveloper**](MerchantsApi.md#createdeveloper) | **POST** /api/merchants/create/developer |  |
| [**Get**](MerchantsApi.md#get) | **GET** /api/merchants/get |  |
| [**GetDetails**](MerchantsApi.md#getdetails) | **GET** /api/merchants/get-details |  |

<a name="create"></a>
# **Create**
> CreateMerchantResponse Create (CreateMerchantRequest createMerchantRequest)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Onboarding.Net.Api;
using Splitit.Onboarding.Net.Client;
using Splitit.Onboarding.Net.Model;

namespace Example
{
    public class CreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://onboarding-v2.sandbox.splitit.com";
            // Configure OAuth2 access token for authorization: oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new MerchantsApi(config);
            var createMerchantRequest = new CreateMerchantRequest(); // CreateMerchantRequest | 

            try
            {
                CreateMerchantResponse result = apiInstance.Create(createMerchantRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MerchantsApi.Create: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CreateMerchantResponse> response = apiInstance.CreateWithHttpInfo(createMerchantRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MerchantsApi.CreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createMerchantRequest** | [**CreateMerchantRequest**](CreateMerchantRequest.md) |  |  |

### Return type

[**CreateMerchantResponse**](CreateMerchantResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createdeveloper"></a>
# **CreateDeveloper**
> CreateMerchantResponse CreateDeveloper (CreateDeveloperRequest createDeveloperRequest)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Onboarding.Net.Api;
using Splitit.Onboarding.Net.Client;
using Splitit.Onboarding.Net.Model;

namespace Example
{
    public class CreateDeveloperExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://onboarding-v2.sandbox.splitit.com";
            // Configure OAuth2 access token for authorization: oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new MerchantsApi(config);
            var createDeveloperRequest = new CreateDeveloperRequest(); // CreateDeveloperRequest | 

            try
            {
                CreateMerchantResponse result = apiInstance.CreateDeveloper(createDeveloperRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MerchantsApi.CreateDeveloper: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateDeveloperWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CreateMerchantResponse> response = apiInstance.CreateDeveloperWithHttpInfo(createDeveloperRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MerchantsApi.CreateDeveloperWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createDeveloperRequest** | [**CreateDeveloperRequest**](CreateDeveloperRequest.md) |  |  |

### Return type

[**CreateMerchantResponse**](CreateMerchantResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="get"></a>
# **Get**
> GetMerchantsResponse Get (int numberOfRowsInPage, int pageNumber, string name = null, string legalName = null, int? status = null)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Onboarding.Net.Api;
using Splitit.Onboarding.Net.Client;
using Splitit.Onboarding.Net.Model;

namespace Example
{
    public class GetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://onboarding-v2.sandbox.splitit.com";
            // Configure OAuth2 access token for authorization: oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new MerchantsApi(config);
            var numberOfRowsInPage = 56;  // int | 
            var pageNumber = 56;  // int | 
            var name = "name_example";  // string |  (optional) 
            var legalName = "legalName_example";  // string |  (optional) 
            var status = 56;  // int? |  (optional) 

            try
            {
                GetMerchantsResponse result = apiInstance.Get(numberOfRowsInPage, pageNumber, name, legalName, status);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MerchantsApi.Get: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<GetMerchantsResponse> response = apiInstance.GetWithHttpInfo(numberOfRowsInPage, pageNumber, name, legalName, status);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MerchantsApi.GetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **numberOfRowsInPage** | **int** |  |  |
| **pageNumber** | **int** |  |  |
| **name** | **string** |  | [optional]  |
| **legalName** | **string** |  | [optional]  |
| **status** | **int?** |  | [optional]  |

### Return type

[**GetMerchantsResponse**](GetMerchantsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdetails"></a>
# **GetDetails**
> GetMerchantDetailsResponse GetDetails (string merchantTempId)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Onboarding.Net.Api;
using Splitit.Onboarding.Net.Client;
using Splitit.Onboarding.Net.Model;

namespace Example
{
    public class GetDetailsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://onboarding-v2.sandbox.splitit.com";
            // Configure OAuth2 access token for authorization: oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new MerchantsApi(config);
            var merchantTempId = "merchantTempId_example";  // string | 

            try
            {
                GetMerchantDetailsResponse result = apiInstance.GetDetails(merchantTempId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MerchantsApi.GetDetails: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetDetailsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<GetMerchantDetailsResponse> response = apiInstance.GetDetailsWithHttpInfo(merchantTempId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling MerchantsApi.GetDetailsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **merchantTempId** | **string** |  |  |

### Return type

[**GetMerchantDetailsResponse**](GetMerchantDetailsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

