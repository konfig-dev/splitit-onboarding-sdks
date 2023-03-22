# DataApi

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCountries**](DataApi.md#getCountries) | **GET** /api/data/get-countries | 
[**getCurrencies**](DataApi.md#getCurrencies) | **GET** /api/data/get-currencies | 
[**getProcessors**](DataApi.md#getProcessors) | **GET** /api/data/get-processors | 
[**getVerticals**](DataApi.md#getVerticals) | **GET** /api/data/get-verticals | 
[**statusLegend**](DataApi.md#statusLegend) | **GET** /api/data/status-legend | 


# **getCountries**

#### **GET** /api/data/get-countries


### Example


```typescript
import { Splitit } from "splitit-onboarding-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    // basePath: "https://onboarding-v2.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const getCountriesResponse = await splitit.data.getCountries()

console.log(getCountriesResponse)

```


### Parameters
This endpoint does not need any parameter.


### Return type

**CountriesResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getCurrencies**

#### **GET** /api/data/get-currencies


### Example


```typescript
import { Splitit } from "splitit-onboarding-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    // basePath: "https://onboarding-v2.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const getCurrenciesResponse = await splitit.data.getCurrencies()

console.log(getCurrenciesResponse)

```


### Parameters
This endpoint does not need any parameter.


### Return type

**CurrenciesResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getProcessors**

#### **GET** /api/data/get-processors


### Example


```typescript
import { Splitit } from "splitit-onboarding-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    // basePath: "https://onboarding-v2.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const getProcessorsResponse = await splitit.data.getProcessors()

console.log(getProcessorsResponse)

```


### Parameters
This endpoint does not need any parameter.


### Return type

**ProcessorsResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getVerticals**

#### **GET** /api/data/get-verticals


### Example


```typescript
import { Splitit } from "splitit-onboarding-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    // basePath: "https://onboarding-v2.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const getVerticalsResponse = await splitit.data.getVerticals()

console.log(getVerticalsResponse)

```


### Parameters
This endpoint does not need any parameter.


### Return type

**MerchantVerticalsResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **statusLegend**

#### **GET** /api/data/status-legend


### Example


```typescript
import { Splitit } from "splitit-onboarding-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    // basePath: "https://onboarding-v2.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const statusLegendResponse = await splitit.data.statusLegend()

console.log(statusLegendResponse)

```


### Parameters
This endpoint does not need any parameter.


### Return type

**Array<EnumDTO>**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


