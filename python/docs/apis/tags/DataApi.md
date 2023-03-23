<a name="__pageTop"></a>
# splitit_client.apis.tags.data_api.DataApi

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_countries**](#get_countries) | **get** /api/data/get-countries | 
[**get_currencies**](#get_currencies) | **get** /api/data/get-currencies | 
[**get_processors**](#get_processors) | **get** /api/data/get-processors | 
[**get_verticals**](#get_verticals) | **get** /api/data/get-verticals | 
[**status_legend**](#status_legend) | **get** /api/data/status-legend | 

# **get_countries**
<a name="get_countries"></a>
> CountriesResponse get_countries()



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

get_countries_response = splitit.data.get_countries()
try:
    pprint(get_countries_response.body["countries"])
    pprint(get_countries_response.headers)
    pprint(get_countries_response.status)
except ApiException as e:
    print("Exception when calling CountriesResponse.get_countries: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_countries.ApiResponseFor200) | 
400 | [ApiResponseFor400](#get_countries.ApiResponseFor400) | 

#### get_countries.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CountriesResponse**](../../models/CountriesResponse.md) |  | 


#### get_countries.ApiResponseFor400
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

# **get_currencies**
<a name="get_currencies"></a>
> CurrenciesResponse get_currencies()



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

get_currencies_response = splitit.data.get_currencies()
try:
    pprint(get_currencies_response.body["currencies"])
    pprint(get_currencies_response.headers)
    pprint(get_currencies_response.status)
except ApiException as e:
    print("Exception when calling CurrenciesResponse.get_currencies: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_currencies.ApiResponseFor200) | 
400 | [ApiResponseFor400](#get_currencies.ApiResponseFor400) | 

#### get_currencies.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CurrenciesResponse**](../../models/CurrenciesResponse.md) |  | 


#### get_currencies.ApiResponseFor400
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

# **get_processors**
<a name="get_processors"></a>
> ProcessorsResponse get_processors()



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

get_processors_response = splitit.data.get_processors()
try:
    pprint(get_processors_response.body["processors"])
    pprint(get_processors_response.headers)
    pprint(get_processors_response.status)
except ApiException as e:
    print("Exception when calling ProcessorsResponse.get_processors: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_processors.ApiResponseFor200) | 
400 | [ApiResponseFor400](#get_processors.ApiResponseFor400) | 

#### get_processors.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ProcessorsResponse**](../../models/ProcessorsResponse.md) |  | 


#### get_processors.ApiResponseFor400
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

# **get_verticals**
<a name="get_verticals"></a>
> MerchantVerticalsResponse get_verticals()



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

get_verticals_response = splitit.data.get_verticals()
try:
    pprint(get_verticals_response.body["merchant_verticals"])
    pprint(get_verticals_response.headers)
    pprint(get_verticals_response.status)
except ApiException as e:
    print("Exception when calling MerchantVerticalsResponse.get_verticals: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_verticals.ApiResponseFor200) | 
400 | [ApiResponseFor400](#get_verticals.ApiResponseFor400) | 

#### get_verticals.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**MerchantVerticalsResponse**](../../models/MerchantVerticalsResponse.md) |  | 


#### get_verticals.ApiResponseFor400
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

# **status_legend**
<a name="status_legend"></a>
> StatusLegendResponse status_legend()



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

status_legend_response = splitit.data.status_legend()
try:
    pprint(status_legend_response.headers)
    pprint(status_legend_response.status)
except ApiException as e:
    print("Exception when calling StatusLegendResponse.status_legend: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#status_legend.ApiResponseFor200) | 
400 | [ApiResponseFor400](#status_legend.ApiResponseFor400) | 

#### status_legend.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**StatusLegendResponse**](../../models/StatusLegendResponse.md) |  | 


#### status_legend.ApiResponseFor400
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

