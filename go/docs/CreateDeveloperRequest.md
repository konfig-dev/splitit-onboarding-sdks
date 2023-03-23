# CreateDeveloperRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FullName** | **string** |  | 
**Email** | **string** |  | 
**CompanyName** | **string** |  | 
**TermsAndConditions** | **bool** |  | 
**CountryCode** | **string** |  | 
**FullCountryName** | **string** |  | 
**RequestHeader** | [**RequestHeaderSlim**](RequestHeaderSlim.md) |  | 

## Methods

### NewCreateDeveloperRequest

`func NewCreateDeveloperRequest(fullName string, email string, companyName string, termsAndConditions bool, countryCode string, fullCountryName string, requestHeader RequestHeaderSlim, ) *CreateDeveloperRequest`

NewCreateDeveloperRequest instantiates a new CreateDeveloperRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateDeveloperRequestWithDefaults

`func NewCreateDeveloperRequestWithDefaults() *CreateDeveloperRequest`

NewCreateDeveloperRequestWithDefaults instantiates a new CreateDeveloperRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFullName

`func (o *CreateDeveloperRequest) GetFullName() string`

GetFullName returns the FullName field if non-nil, zero value otherwise.

### GetFullNameOk

`func (o *CreateDeveloperRequest) GetFullNameOk() (*string, bool)`

GetFullNameOk returns a tuple with the FullName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullName

`func (o *CreateDeveloperRequest) SetFullName(v string)`

SetFullName sets FullName field to given value.


### GetEmail

`func (o *CreateDeveloperRequest) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *CreateDeveloperRequest) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *CreateDeveloperRequest) SetEmail(v string)`

SetEmail sets Email field to given value.


### GetCompanyName

`func (o *CreateDeveloperRequest) GetCompanyName() string`

GetCompanyName returns the CompanyName field if non-nil, zero value otherwise.

### GetCompanyNameOk

`func (o *CreateDeveloperRequest) GetCompanyNameOk() (*string, bool)`

GetCompanyNameOk returns a tuple with the CompanyName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanyName

`func (o *CreateDeveloperRequest) SetCompanyName(v string)`

SetCompanyName sets CompanyName field to given value.


### GetTermsAndConditions

`func (o *CreateDeveloperRequest) GetTermsAndConditions() bool`

GetTermsAndConditions returns the TermsAndConditions field if non-nil, zero value otherwise.

### GetTermsAndConditionsOk

`func (o *CreateDeveloperRequest) GetTermsAndConditionsOk() (*bool, bool)`

GetTermsAndConditionsOk returns a tuple with the TermsAndConditions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTermsAndConditions

`func (o *CreateDeveloperRequest) SetTermsAndConditions(v bool)`

SetTermsAndConditions sets TermsAndConditions field to given value.


### GetCountryCode

`func (o *CreateDeveloperRequest) GetCountryCode() string`

GetCountryCode returns the CountryCode field if non-nil, zero value otherwise.

### GetCountryCodeOk

`func (o *CreateDeveloperRequest) GetCountryCodeOk() (*string, bool)`

GetCountryCodeOk returns a tuple with the CountryCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountryCode

`func (o *CreateDeveloperRequest) SetCountryCode(v string)`

SetCountryCode sets CountryCode field to given value.


### GetFullCountryName

`func (o *CreateDeveloperRequest) GetFullCountryName() string`

GetFullCountryName returns the FullCountryName field if non-nil, zero value otherwise.

### GetFullCountryNameOk

`func (o *CreateDeveloperRequest) GetFullCountryNameOk() (*string, bool)`

GetFullCountryNameOk returns a tuple with the FullCountryName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullCountryName

`func (o *CreateDeveloperRequest) SetFullCountryName(v string)`

SetFullCountryName sets FullCountryName field to given value.


### GetRequestHeader

`func (o *CreateDeveloperRequest) GetRequestHeader() RequestHeaderSlim`

GetRequestHeader returns the RequestHeader field if non-nil, zero value otherwise.

### GetRequestHeaderOk

`func (o *CreateDeveloperRequest) GetRequestHeaderOk() (*RequestHeaderSlim, bool)`

GetRequestHeaderOk returns a tuple with the RequestHeader field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestHeader

`func (o *CreateDeveloperRequest) SetRequestHeader(v RequestHeaderSlim)`

SetRequestHeader sets RequestHeader field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


