<a name="__pageTop"></a>
# splitit_client.apis.tags.merchants_api.MerchantsApi

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](#create) | **post** /api/merchants/create | 
[**create_developer**](#create_developer) | **post** /api/merchants/create/developer | 
[**get**](#get) | **get** /api/merchants/get | 
[**get_details**](#get_details) | **get** /api/merchants/get-details | 

# **create**
<a name="create"></a>
> CreateMerchantResponse create(create_merchant_request)



### Example

```python
from pprint import pprint
from splitit_client import Splitit

splitit = Splitit(
    # Defining the host is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host = "https://onboarding-v2.sandbox.splitit.com",

    # Configure OAuth2 access token for authorization: oauth2
    access_token = 'YOUR_ACCESS_TOKEN'
)

create_response = splitit.merchants.create(
    body = {
        "public_name": "public_name_example",
        "email": "email_example",
        "phone_number": "phone_number_example",
        "country_iso2": "country_iso2_example",
        "legal_name": "legal_name_example",
        "currency_code": "currency_code_example",
        "vertical": "vertical_example",
    },
)
try:
    pprint(create_response.body["merchant_temp_id"])
    pprint(create_response.body["merchant_status"])
    pprint(create_response.body["response_header"])
    pprint(create_response.headers)
    pprint(create_response.status)
except ApiException as e:
    print("Exception when calling CreateMerchantResponse.create: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CreateMerchantRequest**](../../models/CreateMerchantRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
201 | [ApiResponseFor201](#create.ApiResponseFor201) | 
400 | [ApiResponseFor400](#create.ApiResponseFor400) | 

#### create.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CreateMerchantResponse**](../../models/CreateMerchantResponse.md) |  | 


#### create.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**SelfOnBoardingErrorResponse**](../../models/SelfOnBoardingErrorResponse.md) |  | 


### Authorization

[oauth2](../../../README.md#oauth2)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **create_developer**
<a name="create_developer"></a>
> CreateMerchantResponse create_developer(create_developer_request)



### Example

```python
from pprint import pprint
from splitit_client import Splitit

splitit = Splitit(
    # Defining the host is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host = "https://onboarding-v2.sandbox.splitit.com",

    # Configure OAuth2 access token for authorization: oauth2
    access_token = 'YOUR_ACCESS_TOKEN'
)

create_developer_response = splitit.merchants.create_developer(
    body = {
        "full_name": "full_name_example",
        "email": "email_example",
        "company_name": "company_name_example",
        "terms_and_conditions": True,
        "country_code": "country_code_example",
        "full_country_name": "full_country_name_example",
        "request_header": {
            "session_id": "session_id_example",
        },
    },
)
try:
    pprint(create_developer_response.body["merchant_temp_id"])
    pprint(create_developer_response.body["merchant_status"])
    pprint(create_developer_response.body["response_header"])
    pprint(create_developer_response.headers)
    pprint(create_developer_response.status)
except ApiException as e:
    print("Exception when calling CreateMerchantResponse.create_developer: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CreateDeveloperRequest**](../../models/CreateDeveloperRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
201 | [ApiResponseFor201](#create_developer.ApiResponseFor201) | 
400 | [ApiResponseFor400](#create_developer.ApiResponseFor400) | 

#### create_developer.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CreateMerchantResponse**](../../models/CreateMerchantResponse.md) |  | 


#### create_developer.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**SelfOnBoardingErrorResponse**](../../models/SelfOnBoardingErrorResponse.md) |  | 


### Authorization

[oauth2](../../../README.md#oauth2)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get**
<a name="get"></a>
> GetMerchantsResponse get(number_of_rows_in_pagepage_number)



### Example

```python
from pprint import pprint
from splitit_client import Splitit

splitit = Splitit(
    # Defining the host is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host = "https://onboarding-v2.sandbox.splitit.com",

    # Configure OAuth2 access token for authorization: oauth2
    access_token = 'YOUR_ACCESS_TOKEN'
)

get_response = splitit.merchants.get(
    query_params = {
        'NumberOfRowsInPage': 1,
        'PageNumber': 1,
        'Name': "string_example",
        'LegalName': "string_example",
        'Status': 1,
    },
)
try:
    pprint(get_response.body["merchants"])
    pprint(get_response.headers)
    pprint(get_response.status)
except ApiException as e:
    print("Exception when calling GetMerchantsResponse.get: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
NumberOfRowsInPage | NumberOfRowsInPageSchema | | 
PageNumber | PageNumberSchema | | 
Name | NameSchema | | optional
LegalName | LegalNameSchema | | optional
Status | StatusSchema | | optional


# NumberOfRowsInPageSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer

# PageNumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer

# NameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LegalNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# StatusSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get.ApiResponseFor200) | 
400 | [ApiResponseFor400](#get.ApiResponseFor400) | 

#### get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**GetMerchantsResponse**](../../models/GetMerchantsResponse.md) |  | 


#### get.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**SelfOnBoardingErrorResponse**](../../models/SelfOnBoardingErrorResponse.md) |  | 


### Authorization

[oauth2](../../../README.md#oauth2)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_details**
<a name="get_details"></a>
> GetMerchantDetailsResponse get_details(merchant_temp_id)



### Example

```python
from pprint import pprint
from splitit_client import Splitit

splitit = Splitit(
    # Defining the host is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host = "https://onboarding-v2.sandbox.splitit.com",

    # Configure OAuth2 access token for authorization: oauth2
    access_token = 'YOUR_ACCESS_TOKEN'
)

get_details_response = splitit.merchants.get_details(
    query_params = {
        'merchantTempId': "merchantTempId_example",
    },
)
try:
    pprint(get_details_response.body["public_name"])
    pprint(get_details_response.body["legal_name"])
    pprint(get_details_response.body["phone_number"])
    pprint(get_details_response.body["merchant_temp_id"])
    pprint(get_details_response.body["email"])
    pprint(get_details_response.body["merchant_status"])
    pprint(get_details_response.headers)
    pprint(get_details_response.status)
except ApiException as e:
    print("Exception when calling GetMerchantDetailsResponse.get_details: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
merchantTempId | MerchantTempIdSchema | | 


# MerchantTempIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_details.ApiResponseFor200) | 
400 | [ApiResponseFor400](#get_details.ApiResponseFor400) | 

#### get_details.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**GetMerchantDetailsResponse**](../../models/GetMerchantDetailsResponse.md) |  | 


#### get_details.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**SelfOnBoardingErrorResponse**](../../models/SelfOnBoardingErrorResponse.md) |  | 


### Authorization

[oauth2](../../../README.md#oauth2)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

