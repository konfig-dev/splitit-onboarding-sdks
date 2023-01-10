# MerchantsApi

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMerchant**](MerchantsApi.md#createMerchant) | **POST** /api/merchants/create |  |
| [**getMerchantDetails**](MerchantsApi.md#getMerchantDetails) | **GET** /api/merchants/get-details |  |
| [**getMerchants**](MerchantsApi.md#getMerchants) | **GET** /api/merchants/get |  |


<a name="createMerchant"></a>
# **createMerchant**
> CreateMerchantResponse createMerchant(createMerchantRequest)



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.MerchantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    MerchantsApi apiInstance = new MerchantsApi(defaultClient);
    CreateMerchantRequest createMerchantRequest = new CreateMerchantRequest(); // CreateMerchantRequest | 
    try {
      CreateMerchantResponse result = apiInstance.createMerchant(createMerchantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#createMerchant");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createMerchantRequest** | [**CreateMerchantRequest**](CreateMerchantRequest.md)|  | |

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

<a name="getMerchantDetails"></a>
# **getMerchantDetails**
> GetMerchantDetailsResponse getMerchantDetails(merchantTempId)



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.MerchantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    MerchantsApi apiInstance = new MerchantsApi(defaultClient);
    String merchantTempId = "merchantTempId_example"; // String | 
    try {
      GetMerchantDetailsResponse result = apiInstance.getMerchantDetails(merchantTempId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#getMerchantDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantTempId** | **String**|  | |

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

<a name="getMerchants"></a>
# **getMerchants**
> GetMerchantsResponse getMerchants(numberOfRowsInPage, pageNumber, name, legalName, status)



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.MerchantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    MerchantsApi apiInstance = new MerchantsApi(defaultClient);
    Integer numberOfRowsInPage = 56; // Integer | 
    Integer pageNumber = 56; // Integer | 
    String name = "name_example"; // String | 
    String legalName = "legalName_example"; // String | 
    Integer status = 56; // Integer | 
    try {
      GetMerchantsResponse result = apiInstance.getMerchants(numberOfRowsInPage, pageNumber, name, legalName, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#getMerchants");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **numberOfRowsInPage** | **Integer**|  | |
| **pageNumber** | **Integer**|  | |
| **name** | **String**|  | [optional] |
| **legalName** | **String**|  | [optional] |
| **status** | **Integer**|  | [optional] |

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

