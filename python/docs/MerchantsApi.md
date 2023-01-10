# splitit_client.MerchantsApi

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_merchant**](MerchantsApi.md#create_merchant) | **POST** /api/merchants/create | 
[**get_merchant_details**](MerchantsApi.md#get_merchant_details) | **GET** /api/merchants/get-details | 
[**get_merchants**](MerchantsApi.md#get_merchants) | **GET** /api/merchants/get | 


# **create_merchant**
> CreateMerchantResponse create_merchant(create_merchant_request)



### Example

* OAuth Authentication (oauth2):

```python
import time
import splitit_client
from splitit_client.api import merchants_api
from splitit_client.model.self_on_boarding_error_response import SelfOnBoardingErrorResponse
from splitit_client.model.create_merchant_request import CreateMerchantRequest
from splitit_client.model.create_merchant_response import CreateMerchantResponse
from pprint import pprint
# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.
client_id = os.environ["CLIENT_ID"]
client_secret = os.environ["CLIENT_SECRET"]
configuration = splitit_client.Configuration(
    # Defining the host is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host = 'https://onboarding-v2.sandbox.splitit.com'
    client_id=client_id,
    client_secret=client_secret
)

# Enter a context with an instance of the API client
with splitit_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = merchants_api.MerchantsApi(api_client)
    create_merchant_request = CreateMerchantRequest(
        public_name="public_name_example",
        email="email_example",
        phone_number="phone_number_example",
        country_iso2="country_iso2_example",
        legal_name="legal_name_example",
        currency_code="currency_code_example",
        tier="tier_example",
        business_street_address="business_street_address_example",
        business_city="business_city_example",
        business_postal_code="business_postal_code_example",
        business_country="business_country_example",
        business_state="business_state_example",
        vertical="vertical_example",
        sub_vertical="sub_vertical_example",
        name_on_bank_account="name_on_bank_account_example",
        incorporation_country="incorporation_country_example",
        account_number="account_number_example",
        routing_number="routing_number_example",
        tax_id_number="tax_id_number_example",
        total_annual_sales="total_annual_sales_example",
        platform_name="platform_name_example",
    ) # CreateMerchantRequest | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.create_merchant(create_merchant_request)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling MerchantsApi->create_merchant: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_merchant_request** | [**CreateMerchantRequest**](CreateMerchantRequest.md)|  |

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
**201** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_merchant_details**
> GetMerchantDetailsResponse get_merchant_details(merchant_temp_id)



### Example

* OAuth Authentication (oauth2):

```python
import time
import splitit_client
from splitit_client.api import merchants_api
from splitit_client.model.self_on_boarding_error_response import SelfOnBoardingErrorResponse
from splitit_client.model.get_merchant_details_response import GetMerchantDetailsResponse
from pprint import pprint
# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.
client_id = os.environ["CLIENT_ID"]
client_secret = os.environ["CLIENT_SECRET"]
configuration = splitit_client.Configuration(
    # Defining the host is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host = 'https://onboarding-v2.sandbox.splitit.com'
    client_id=client_id,
    client_secret=client_secret
)

# Enter a context with an instance of the API client
with splitit_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = merchants_api.MerchantsApi(api_client)
    merchant_temp_id = "merchantTempId_example" # str | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_merchant_details(merchant_temp_id)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling MerchantsApi->get_merchant_details: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchant_temp_id** | **str**|  |

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
**200** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_merchants**
> GetMerchantsResponse get_merchants(number_of_rows_in_page, page_number)



### Example

* OAuth Authentication (oauth2):

```python
import time
import splitit_client
from splitit_client.api import merchants_api
from splitit_client.model.self_on_boarding_error_response import SelfOnBoardingErrorResponse
from splitit_client.model.get_merchants_response import GetMerchantsResponse
from pprint import pprint
# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.
client_id = os.environ["CLIENT_ID"]
client_secret = os.environ["CLIENT_SECRET"]
configuration = splitit_client.Configuration(
    # Defining the host is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host = 'https://onboarding-v2.sandbox.splitit.com'
    client_id=client_id,
    client_secret=client_secret
)

# Enter a context with an instance of the API client
with splitit_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = merchants_api.MerchantsApi(api_client)
    number_of_rows_in_page = 1 # int | 
    page_number = 1 # int | 
    name = "Name_example" # str |  (optional)
    legal_name = "LegalName_example" # str |  (optional)
    status = 1 # int |  (optional)

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_merchants(number_of_rows_in_page, page_number)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling MerchantsApi->get_merchants: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        api_response = api_instance.get_merchants(number_of_rows_in_page, page_number, name=name, legal_name=legal_name, status=status)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling MerchantsApi->get_merchants: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number_of_rows_in_page** | **int**|  |
 **page_number** | **int**|  |
 **name** | **str**|  | [optional]
 **legal_name** | **str**|  | [optional]
 **status** | **int**|  | [optional]

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
**200** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

