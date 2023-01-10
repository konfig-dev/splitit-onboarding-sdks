# DataApi

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCountries**](DataApi.md#getCountries) | **GET** /api/data/get-countries |  |
| [**getCurrencies**](DataApi.md#getCurrencies) | **GET** /api/data/get-currencies |  |
| [**getProcessors**](DataApi.md#getProcessors) | **GET** /api/data/get-processors |  |
| [**getVerticals**](DataApi.md#getVerticals) | **GET** /api/data/get-verticals |  |
| [**statusLegend**](DataApi.md#statusLegend) | **GET** /api/data/status-legend |  |


<a name="getCountries"></a>
# **getCountries**
> CountriesResponse getCountries()



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    try {
      CountriesResponse result = apiInstance.getCountries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#getCountries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CountriesResponse**](CountriesResponse.md)

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

<a name="getCurrencies"></a>
# **getCurrencies**
> CurrenciesResponse getCurrencies()



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    try {
      CurrenciesResponse result = apiInstance.getCurrencies();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#getCurrencies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrenciesResponse**](CurrenciesResponse.md)

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

<a name="getProcessors"></a>
# **getProcessors**
> ProcessorsResponse getProcessors()



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    try {
      ProcessorsResponse result = apiInstance.getProcessors();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#getProcessors");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProcessorsResponse**](ProcessorsResponse.md)

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

<a name="getVerticals"></a>
# **getVerticals**
> MerchantVerticalsResponse getVerticals()



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    try {
      MerchantVerticalsResponse result = apiInstance.getVerticals();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#getVerticals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MerchantVerticalsResponse**](MerchantVerticalsResponse.md)

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

<a name="statusLegend"></a>
# **statusLegend**
> List&lt;EnumDTO&gt; statusLegend()



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    try {
      List<EnumDTO> result = apiInstance.statusLegend();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#statusLegend");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EnumDTO&gt;**](EnumDTO.md)

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

