# MerchantsApi

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](MerchantsApi.md#create) | **POST** /api/merchants/create |  |
| [**createDeveloper**](MerchantsApi.md#createDeveloper) | **POST** /api/merchants/create/developer |  |
| [**get**](MerchantsApi.md#get) | **GET** /api/merchants/get |  |
| [**getDetails**](MerchantsApi.md#getDetails) | **GET** /api/merchants/get-details |  |


<a name="create"></a>
# **create**
> CreateMerchantResponse create(createMerchantRequest).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.MerchantsApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");    

    MerchantsApi apiInstance = new MerchantsApi(apiClient);
    CreateMerchantRequest createMerchantRequest = new CreateMerchantRequest(); // CreateMerchantRequest | 
    try {
      CreateMerchantResponse result = apiInstance.create(createMerchantRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#create");
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

<a name="createDeveloper"></a>
# **createDeveloper**
> CreateMerchantResponse createDeveloper(createDeveloperRequest).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.MerchantsApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");    

    MerchantsApi apiInstance = new MerchantsApi(apiClient);
    CreateDeveloperRequest createDeveloperRequest = new CreateDeveloperRequest(); // CreateDeveloperRequest | 
    try {
      CreateMerchantResponse result = apiInstance.createDeveloper(createDeveloperRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#createDeveloper");
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
| **createDeveloperRequest** | [**CreateDeveloperRequest**](CreateDeveloperRequest.md)|  | |

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

<a name="get"></a>
# **get**
> GetMerchantsResponse get(numberOfRowsInPage, pageNumber).name(name).legalName(legalName).status(status).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.MerchantsApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");    

    MerchantsApi apiInstance = new MerchantsApi(apiClient);
    Integer numberOfRowsInPage = 56; // Integer | 
    Integer pageNumber = 56; // Integer | 
    String name = "name_example"; // String | 
    String legalName = "legalName_example"; // String | 
    Integer status = 56; // Integer | 
    try {
      GetMerchantsResponse result = apiInstance.get(numberOfRowsInPage, pageNumber)
            .name(name)
            .legalName(legalName)
            .status(status)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#get");
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

<a name="getDetails"></a>
# **getDetails**
> GetMerchantDetailsResponse getDetails(merchantTempId).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.MerchantsApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");    

    MerchantsApi apiInstance = new MerchantsApi(apiClient);
    String merchantTempId = "merchantTempId_example"; // String | 
    try {
      GetMerchantDetailsResponse result = apiInstance.getDetails(merchantTempId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#getDetails");
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

