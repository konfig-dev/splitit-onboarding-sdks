# MerchantsApi

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](MerchantsApi.md#create) | **POST** /api/merchants/create | 
[**createDeveloper**](MerchantsApi.md#createDeveloper) | **POST** /api/merchants/create/developer | 
[**get**](MerchantsApi.md#get) | **GET** /api/merchants/get | 
[**getDetails**](MerchantsApi.md#getDetails) | **GET** /api/merchants/get-details | 


# **create**

#### **POST** /api/merchants/create


### Example


```typescript
import { Splitit } from "splitit-onboarding-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    // basePath: "https://onboarding-v2.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const createResponse = await splitit.merchants.create({
        "public_name": "public_name_example",
        "email": "email_example",
        "phone_number": "phone_number_example",
        "country_iso2": "country_iso2_example",
        "legal_name": "legal_name_example",
        "currency_code": "currency_code_example",
        "vertical": "vertical_example",
    })

console.log(createResponse)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createMerchantRequest** | **CreateMerchantRequest**|  |


### Return type

**CreateMerchantResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **createDeveloper**

#### **POST** /api/merchants/create/developer


### Example


```typescript
import { Splitit } from "splitit-onboarding-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    // basePath: "https://onboarding-v2.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const createDeveloperResponse = await splitit.merchants.createDeveloper({
        "full_name": "full_name_example",
        "email": "email_example",
        "company_name": "company_name_example",
        "terms_and_conditions": true,
        "country_code": "country_code_example",
        "full_country_name": "full_country_name_example",
        "request_header": {
            "session_id": "session_id_example",
        },
    })

console.log(createDeveloperResponse)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDeveloperRequest** | **CreateDeveloperRequest**|  |


### Return type

**CreateMerchantResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **get**

#### **GET** /api/merchants/get


### Example


```typescript
import { Splitit } from "splitit-onboarding-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    // basePath: "https://onboarding-v2.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const getResponse = await splitit.merchants.get({
        "numberOfRowsInPage": 1,
        "pageNumber": 1,
    })

console.log(getResponse)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberOfRowsInPage** | [**number**] |  | defaults to undefined
 **pageNumber** | [**number**] |  | defaults to undefined
 **name** | [**string**] |  | (optional) defaults to undefined
 **legalName** | [**string**] |  | (optional) defaults to undefined
 **status** | [**number**] |  | (optional) defaults to undefined


### Return type

**GetMerchantsResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getDetails**

#### **GET** /api/merchants/get-details


### Example


```typescript
import { Splitit } from "splitit-onboarding-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    // basePath: "https://onboarding-v2.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const getDetailsResponse = await splitit.merchants.getDetails({
        "merchantTempId": "merchantTempId_example",
    })

console.log(getDetailsResponse)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantTempId** | [**string**] |  | defaults to undefined


### Return type

**GetMerchantDetailsResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


