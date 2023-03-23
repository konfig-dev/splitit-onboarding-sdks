# CreateMerchantRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PublicName** | **string** |  | 
**Email** | **string** |  | 
**PhoneNumber** | **string** |  | 
**CountryIso2** | **string** |  | 
**LegalName** | **string** |  | 
**CurrencyCode** | **string** |  | 
**Vertical** | **string** |  | 
**Tier** | Pointer to **string** |  | [optional] 
**BusinessStreetAddress** | Pointer to **string** |  | [optional] 
**BusinessCity** | Pointer to **string** |  | [optional] 
**BusinessPostalCode** | Pointer to **string** |  | [optional] 
**BusinessCountry** | Pointer to **string** |  | [optional] 
**BusinessState** | Pointer to **string** |  | [optional] 
**SubVertical** | Pointer to **string** |  | [optional] 
**NameOnBankAccount** | Pointer to **string** |  | [optional] 
**IncorporationCountry** | Pointer to **string** |  | [optional] 
**AccountNumber** | Pointer to **string** |  | [optional] 
**RoutingNumber** | Pointer to **string** |  | [optional] 
**TaxIdNumber** | Pointer to **string** |  | [optional] 
**TotalAnnualSales** | Pointer to **string** |  | [optional] 
**PlatformName** | Pointer to **string** |  | [optional] 

## Methods

### NewCreateMerchantRequest

`func NewCreateMerchantRequest(publicName string, email string, phoneNumber string, countryIso2 string, legalName string, currencyCode string, vertical string, ) *CreateMerchantRequest`

NewCreateMerchantRequest instantiates a new CreateMerchantRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateMerchantRequestWithDefaults

`func NewCreateMerchantRequestWithDefaults() *CreateMerchantRequest`

NewCreateMerchantRequestWithDefaults instantiates a new CreateMerchantRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPublicName

`func (o *CreateMerchantRequest) GetPublicName() string`

GetPublicName returns the PublicName field if non-nil, zero value otherwise.

### GetPublicNameOk

`func (o *CreateMerchantRequest) GetPublicNameOk() (*string, bool)`

GetPublicNameOk returns a tuple with the PublicName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublicName

`func (o *CreateMerchantRequest) SetPublicName(v string)`

SetPublicName sets PublicName field to given value.


### GetEmail

`func (o *CreateMerchantRequest) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *CreateMerchantRequest) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *CreateMerchantRequest) SetEmail(v string)`

SetEmail sets Email field to given value.


### GetPhoneNumber

`func (o *CreateMerchantRequest) GetPhoneNumber() string`

GetPhoneNumber returns the PhoneNumber field if non-nil, zero value otherwise.

### GetPhoneNumberOk

`func (o *CreateMerchantRequest) GetPhoneNumberOk() (*string, bool)`

GetPhoneNumberOk returns a tuple with the PhoneNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhoneNumber

`func (o *CreateMerchantRequest) SetPhoneNumber(v string)`

SetPhoneNumber sets PhoneNumber field to given value.


### GetCountryIso2

`func (o *CreateMerchantRequest) GetCountryIso2() string`

GetCountryIso2 returns the CountryIso2 field if non-nil, zero value otherwise.

### GetCountryIso2Ok

`func (o *CreateMerchantRequest) GetCountryIso2Ok() (*string, bool)`

GetCountryIso2Ok returns a tuple with the CountryIso2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountryIso2

`func (o *CreateMerchantRequest) SetCountryIso2(v string)`

SetCountryIso2 sets CountryIso2 field to given value.


### GetLegalName

`func (o *CreateMerchantRequest) GetLegalName() string`

GetLegalName returns the LegalName field if non-nil, zero value otherwise.

### GetLegalNameOk

`func (o *CreateMerchantRequest) GetLegalNameOk() (*string, bool)`

GetLegalNameOk returns a tuple with the LegalName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLegalName

`func (o *CreateMerchantRequest) SetLegalName(v string)`

SetLegalName sets LegalName field to given value.


### GetCurrencyCode

`func (o *CreateMerchantRequest) GetCurrencyCode() string`

GetCurrencyCode returns the CurrencyCode field if non-nil, zero value otherwise.

### GetCurrencyCodeOk

`func (o *CreateMerchantRequest) GetCurrencyCodeOk() (*string, bool)`

GetCurrencyCodeOk returns a tuple with the CurrencyCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrencyCode

`func (o *CreateMerchantRequest) SetCurrencyCode(v string)`

SetCurrencyCode sets CurrencyCode field to given value.


### GetVertical

`func (o *CreateMerchantRequest) GetVertical() string`

GetVertical returns the Vertical field if non-nil, zero value otherwise.

### GetVerticalOk

`func (o *CreateMerchantRequest) GetVerticalOk() (*string, bool)`

GetVerticalOk returns a tuple with the Vertical field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVertical

`func (o *CreateMerchantRequest) SetVertical(v string)`

SetVertical sets Vertical field to given value.


### GetTier

`func (o *CreateMerchantRequest) GetTier() string`

GetTier returns the Tier field if non-nil, zero value otherwise.

### GetTierOk

`func (o *CreateMerchantRequest) GetTierOk() (*string, bool)`

GetTierOk returns a tuple with the Tier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTier

`func (o *CreateMerchantRequest) SetTier(v string)`

SetTier sets Tier field to given value.

### HasTier

`func (o *CreateMerchantRequest) HasTier() bool`

HasTier returns a boolean if a field has been set.

### GetBusinessStreetAddress

`func (o *CreateMerchantRequest) GetBusinessStreetAddress() string`

GetBusinessStreetAddress returns the BusinessStreetAddress field if non-nil, zero value otherwise.

### GetBusinessStreetAddressOk

`func (o *CreateMerchantRequest) GetBusinessStreetAddressOk() (*string, bool)`

GetBusinessStreetAddressOk returns a tuple with the BusinessStreetAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessStreetAddress

`func (o *CreateMerchantRequest) SetBusinessStreetAddress(v string)`

SetBusinessStreetAddress sets BusinessStreetAddress field to given value.

### HasBusinessStreetAddress

`func (o *CreateMerchantRequest) HasBusinessStreetAddress() bool`

HasBusinessStreetAddress returns a boolean if a field has been set.

### GetBusinessCity

`func (o *CreateMerchantRequest) GetBusinessCity() string`

GetBusinessCity returns the BusinessCity field if non-nil, zero value otherwise.

### GetBusinessCityOk

`func (o *CreateMerchantRequest) GetBusinessCityOk() (*string, bool)`

GetBusinessCityOk returns a tuple with the BusinessCity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessCity

`func (o *CreateMerchantRequest) SetBusinessCity(v string)`

SetBusinessCity sets BusinessCity field to given value.

### HasBusinessCity

`func (o *CreateMerchantRequest) HasBusinessCity() bool`

HasBusinessCity returns a boolean if a field has been set.

### GetBusinessPostalCode

`func (o *CreateMerchantRequest) GetBusinessPostalCode() string`

GetBusinessPostalCode returns the BusinessPostalCode field if non-nil, zero value otherwise.

### GetBusinessPostalCodeOk

`func (o *CreateMerchantRequest) GetBusinessPostalCodeOk() (*string, bool)`

GetBusinessPostalCodeOk returns a tuple with the BusinessPostalCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessPostalCode

`func (o *CreateMerchantRequest) SetBusinessPostalCode(v string)`

SetBusinessPostalCode sets BusinessPostalCode field to given value.

### HasBusinessPostalCode

`func (o *CreateMerchantRequest) HasBusinessPostalCode() bool`

HasBusinessPostalCode returns a boolean if a field has been set.

### GetBusinessCountry

`func (o *CreateMerchantRequest) GetBusinessCountry() string`

GetBusinessCountry returns the BusinessCountry field if non-nil, zero value otherwise.

### GetBusinessCountryOk

`func (o *CreateMerchantRequest) GetBusinessCountryOk() (*string, bool)`

GetBusinessCountryOk returns a tuple with the BusinessCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessCountry

`func (o *CreateMerchantRequest) SetBusinessCountry(v string)`

SetBusinessCountry sets BusinessCountry field to given value.

### HasBusinessCountry

`func (o *CreateMerchantRequest) HasBusinessCountry() bool`

HasBusinessCountry returns a boolean if a field has been set.

### GetBusinessState

`func (o *CreateMerchantRequest) GetBusinessState() string`

GetBusinessState returns the BusinessState field if non-nil, zero value otherwise.

### GetBusinessStateOk

`func (o *CreateMerchantRequest) GetBusinessStateOk() (*string, bool)`

GetBusinessStateOk returns a tuple with the BusinessState field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessState

`func (o *CreateMerchantRequest) SetBusinessState(v string)`

SetBusinessState sets BusinessState field to given value.

### HasBusinessState

`func (o *CreateMerchantRequest) HasBusinessState() bool`

HasBusinessState returns a boolean if a field has been set.

### GetSubVertical

`func (o *CreateMerchantRequest) GetSubVertical() string`

GetSubVertical returns the SubVertical field if non-nil, zero value otherwise.

### GetSubVerticalOk

`func (o *CreateMerchantRequest) GetSubVerticalOk() (*string, bool)`

GetSubVerticalOk returns a tuple with the SubVertical field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubVertical

`func (o *CreateMerchantRequest) SetSubVertical(v string)`

SetSubVertical sets SubVertical field to given value.

### HasSubVertical

`func (o *CreateMerchantRequest) HasSubVertical() bool`

HasSubVertical returns a boolean if a field has been set.

### GetNameOnBankAccount

`func (o *CreateMerchantRequest) GetNameOnBankAccount() string`

GetNameOnBankAccount returns the NameOnBankAccount field if non-nil, zero value otherwise.

### GetNameOnBankAccountOk

`func (o *CreateMerchantRequest) GetNameOnBankAccountOk() (*string, bool)`

GetNameOnBankAccountOk returns a tuple with the NameOnBankAccount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNameOnBankAccount

`func (o *CreateMerchantRequest) SetNameOnBankAccount(v string)`

SetNameOnBankAccount sets NameOnBankAccount field to given value.

### HasNameOnBankAccount

`func (o *CreateMerchantRequest) HasNameOnBankAccount() bool`

HasNameOnBankAccount returns a boolean if a field has been set.

### GetIncorporationCountry

`func (o *CreateMerchantRequest) GetIncorporationCountry() string`

GetIncorporationCountry returns the IncorporationCountry field if non-nil, zero value otherwise.

### GetIncorporationCountryOk

`func (o *CreateMerchantRequest) GetIncorporationCountryOk() (*string, bool)`

GetIncorporationCountryOk returns a tuple with the IncorporationCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncorporationCountry

`func (o *CreateMerchantRequest) SetIncorporationCountry(v string)`

SetIncorporationCountry sets IncorporationCountry field to given value.

### HasIncorporationCountry

`func (o *CreateMerchantRequest) HasIncorporationCountry() bool`

HasIncorporationCountry returns a boolean if a field has been set.

### GetAccountNumber

`func (o *CreateMerchantRequest) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *CreateMerchantRequest) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *CreateMerchantRequest) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.

### HasAccountNumber

`func (o *CreateMerchantRequest) HasAccountNumber() bool`

HasAccountNumber returns a boolean if a field has been set.

### GetRoutingNumber

`func (o *CreateMerchantRequest) GetRoutingNumber() string`

GetRoutingNumber returns the RoutingNumber field if non-nil, zero value otherwise.

### GetRoutingNumberOk

`func (o *CreateMerchantRequest) GetRoutingNumberOk() (*string, bool)`

GetRoutingNumberOk returns a tuple with the RoutingNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoutingNumber

`func (o *CreateMerchantRequest) SetRoutingNumber(v string)`

SetRoutingNumber sets RoutingNumber field to given value.

### HasRoutingNumber

`func (o *CreateMerchantRequest) HasRoutingNumber() bool`

HasRoutingNumber returns a boolean if a field has been set.

### GetTaxIdNumber

`func (o *CreateMerchantRequest) GetTaxIdNumber() string`

GetTaxIdNumber returns the TaxIdNumber field if non-nil, zero value otherwise.

### GetTaxIdNumberOk

`func (o *CreateMerchantRequest) GetTaxIdNumberOk() (*string, bool)`

GetTaxIdNumberOk returns a tuple with the TaxIdNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxIdNumber

`func (o *CreateMerchantRequest) SetTaxIdNumber(v string)`

SetTaxIdNumber sets TaxIdNumber field to given value.

### HasTaxIdNumber

`func (o *CreateMerchantRequest) HasTaxIdNumber() bool`

HasTaxIdNumber returns a boolean if a field has been set.

### GetTotalAnnualSales

`func (o *CreateMerchantRequest) GetTotalAnnualSales() string`

GetTotalAnnualSales returns the TotalAnnualSales field if non-nil, zero value otherwise.

### GetTotalAnnualSalesOk

`func (o *CreateMerchantRequest) GetTotalAnnualSalesOk() (*string, bool)`

GetTotalAnnualSalesOk returns a tuple with the TotalAnnualSales field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalAnnualSales

`func (o *CreateMerchantRequest) SetTotalAnnualSales(v string)`

SetTotalAnnualSales sets TotalAnnualSales field to given value.

### HasTotalAnnualSales

`func (o *CreateMerchantRequest) HasTotalAnnualSales() bool`

HasTotalAnnualSales returns a boolean if a field has been set.

### GetPlatformName

`func (o *CreateMerchantRequest) GetPlatformName() string`

GetPlatformName returns the PlatformName field if non-nil, zero value otherwise.

### GetPlatformNameOk

`func (o *CreateMerchantRequest) GetPlatformNameOk() (*string, bool)`

GetPlatformNameOk returns a tuple with the PlatformName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlatformName

`func (o *CreateMerchantRequest) SetPlatformName(v string)`

SetPlatformName sets PlatformName field to given value.

### HasPlatformName

`func (o *CreateMerchantRequest) HasPlatformName() bool`

HasPlatformName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


