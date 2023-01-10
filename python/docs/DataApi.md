# splitit_client.DataApi

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_countries**](DataApi.md#get_countries) | **GET** /api/data/get-countries | 
[**get_currencies**](DataApi.md#get_currencies) | **GET** /api/data/get-currencies | 
[**get_processors**](DataApi.md#get_processors) | **GET** /api/data/get-processors | 
[**get_verticals**](DataApi.md#get_verticals) | **GET** /api/data/get-verticals | 
[**status_legend**](DataApi.md#status_legend) | **GET** /api/data/status-legend | 


# **get_countries**
> CountriesResponse get_countries()



### Example

* OAuth Authentication (oauth2):

```python
import time
import splitit_client
from splitit_client.api import data_api
from splitit_client.model.self_on_boarding_error_response import SelfOnBoardingErrorResponse
from splitit_client.model.countries_response import CountriesResponse
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
    api_instance = data_api.DataApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.get_countries()
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling DataApi->get_countries: %s\n" % e)
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
**200** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_currencies**
> CurrenciesResponse get_currencies()



### Example

* OAuth Authentication (oauth2):

```python
import time
import splitit_client
from splitit_client.api import data_api
from splitit_client.model.currencies_response import CurrenciesResponse
from splitit_client.model.self_on_boarding_error_response import SelfOnBoardingErrorResponse
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
    api_instance = data_api.DataApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.get_currencies()
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling DataApi->get_currencies: %s\n" % e)
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
**200** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_processors**
> ProcessorsResponse get_processors()



### Example

* OAuth Authentication (oauth2):

```python
import time
import splitit_client
from splitit_client.api import data_api
from splitit_client.model.self_on_boarding_error_response import SelfOnBoardingErrorResponse
from splitit_client.model.processors_response import ProcessorsResponse
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
    api_instance = data_api.DataApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.get_processors()
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling DataApi->get_processors: %s\n" % e)
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
**200** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_verticals**
> MerchantVerticalsResponse get_verticals()



### Example

* OAuth Authentication (oauth2):

```python
import time
import splitit_client
from splitit_client.api import data_api
from splitit_client.model.self_on_boarding_error_response import SelfOnBoardingErrorResponse
from splitit_client.model.merchant_verticals_response import MerchantVerticalsResponse
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
    api_instance = data_api.DataApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.get_verticals()
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling DataApi->get_verticals: %s\n" % e)
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
**200** |  |  -  |
**400** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **status_legend**
> [EnumDTO] status_legend()



### Example

* OAuth Authentication (oauth2):

```python
import time
import splitit_client
from splitit_client.api import data_api
from splitit_client.model.self_on_boarding_error_response import SelfOnBoardingErrorResponse
from splitit_client.model.enum_dto import EnumDTO
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
    api_instance = data_api.DataApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.status_legend()
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling DataApi->status_legend: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[EnumDTO]**](EnumDTO.md)

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

