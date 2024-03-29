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
> CountriesResponse getCountries().execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");    

    DataApi apiInstance = new DataApi(apiClient);
    try {
      CountriesResponse result = apiInstance.getCountries()
            .execute();
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
> CurrenciesResponse getCurrencies().execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");    

    DataApi apiInstance = new DataApi(apiClient);
    try {
      CurrenciesResponse result = apiInstance.getCurrencies()
            .execute();
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
> ProcessorsResponse getProcessors().execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");    

    DataApi apiInstance = new DataApi(apiClient);
    try {
      ProcessorsResponse result = apiInstance.getProcessors()
            .execute();
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
> MerchantVerticalsResponse getVerticals().execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");    

    DataApi apiInstance = new DataApi(apiClient);
    try {
      MerchantVerticalsResponse result = apiInstance.getVerticals()
            .execute();
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
> List&lt;EnumDTO&gt; statusLegend().execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://onboarding-v2.sandbox.splitit.com");    

    DataApi apiInstance = new DataApi(apiClient);
    try {
      List<EnumDTO> result = apiInstance.statusLegend()
            .execute();
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

