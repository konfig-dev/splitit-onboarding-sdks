/*
Splitit.OnBoarding.Api.V2

Splitit's Onboarding API

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package splitit

import (
	"encoding/json"
)

// CreateDeveloperRequest struct for CreateDeveloperRequest
type CreateDeveloperRequest struct {
	FullName string `json:"fullName"`
	Email string `json:"email"`
	CompanyName string `json:"companyName"`
	TermsAndConditions bool `json:"termsAndConditions"`
	CountryCode string `json:"countryCode"`
	FullCountryName string `json:"fullCountryName"`
	RequestHeader RequestHeaderSlim `json:"requestHeader"`
}

// NewCreateDeveloperRequest instantiates a new CreateDeveloperRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateDeveloperRequest(fullName string, email string, companyName string, termsAndConditions bool, countryCode string, fullCountryName string, requestHeader RequestHeaderSlim) *CreateDeveloperRequest {
	this := CreateDeveloperRequest{}
	this.FullName = fullName
	this.Email = email
	this.CompanyName = companyName
	this.TermsAndConditions = termsAndConditions
	this.CountryCode = countryCode
	this.FullCountryName = fullCountryName
	this.RequestHeader = requestHeader
	return &this
}

// NewCreateDeveloperRequestWithDefaults instantiates a new CreateDeveloperRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateDeveloperRequestWithDefaults() *CreateDeveloperRequest {
	this := CreateDeveloperRequest{}
	return &this
}

// GetFullName returns the FullName field value
func (o *CreateDeveloperRequest) GetFullName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.FullName
}

// GetFullNameOk returns a tuple with the FullName field value
// and a boolean to check if the value has been set.
func (o *CreateDeveloperRequest) GetFullNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.FullName, true
}

// SetFullName sets field value
func (o *CreateDeveloperRequest) SetFullName(v string) {
	o.FullName = v
}

// GetEmail returns the Email field value
func (o *CreateDeveloperRequest) GetEmail() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Email
}

// GetEmailOk returns a tuple with the Email field value
// and a boolean to check if the value has been set.
func (o *CreateDeveloperRequest) GetEmailOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Email, true
}

// SetEmail sets field value
func (o *CreateDeveloperRequest) SetEmail(v string) {
	o.Email = v
}

// GetCompanyName returns the CompanyName field value
func (o *CreateDeveloperRequest) GetCompanyName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.CompanyName
}

// GetCompanyNameOk returns a tuple with the CompanyName field value
// and a boolean to check if the value has been set.
func (o *CreateDeveloperRequest) GetCompanyNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.CompanyName, true
}

// SetCompanyName sets field value
func (o *CreateDeveloperRequest) SetCompanyName(v string) {
	o.CompanyName = v
}

// GetTermsAndConditions returns the TermsAndConditions field value
func (o *CreateDeveloperRequest) GetTermsAndConditions() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.TermsAndConditions
}

// GetTermsAndConditionsOk returns a tuple with the TermsAndConditions field value
// and a boolean to check if the value has been set.
func (o *CreateDeveloperRequest) GetTermsAndConditionsOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.TermsAndConditions, true
}

// SetTermsAndConditions sets field value
func (o *CreateDeveloperRequest) SetTermsAndConditions(v bool) {
	o.TermsAndConditions = v
}

// GetCountryCode returns the CountryCode field value
func (o *CreateDeveloperRequest) GetCountryCode() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.CountryCode
}

// GetCountryCodeOk returns a tuple with the CountryCode field value
// and a boolean to check if the value has been set.
func (o *CreateDeveloperRequest) GetCountryCodeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.CountryCode, true
}

// SetCountryCode sets field value
func (o *CreateDeveloperRequest) SetCountryCode(v string) {
	o.CountryCode = v
}

// GetFullCountryName returns the FullCountryName field value
func (o *CreateDeveloperRequest) GetFullCountryName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.FullCountryName
}

// GetFullCountryNameOk returns a tuple with the FullCountryName field value
// and a boolean to check if the value has been set.
func (o *CreateDeveloperRequest) GetFullCountryNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.FullCountryName, true
}

// SetFullCountryName sets field value
func (o *CreateDeveloperRequest) SetFullCountryName(v string) {
	o.FullCountryName = v
}

// GetRequestHeader returns the RequestHeader field value
func (o *CreateDeveloperRequest) GetRequestHeader() RequestHeaderSlim {
	if o == nil {
		var ret RequestHeaderSlim
		return ret
	}

	return o.RequestHeader
}

// GetRequestHeaderOk returns a tuple with the RequestHeader field value
// and a boolean to check if the value has been set.
func (o *CreateDeveloperRequest) GetRequestHeaderOk() (*RequestHeaderSlim, bool) {
	if o == nil {
    return nil, false
	}
	return &o.RequestHeader, true
}

// SetRequestHeader sets field value
func (o *CreateDeveloperRequest) SetRequestHeader(v RequestHeaderSlim) {
	o.RequestHeader = v
}

func (o CreateDeveloperRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["fullName"] = o.FullName
	}
	if true {
		toSerialize["email"] = o.Email
	}
	if true {
		toSerialize["companyName"] = o.CompanyName
	}
	if true {
		toSerialize["termsAndConditions"] = o.TermsAndConditions
	}
	if true {
		toSerialize["countryCode"] = o.CountryCode
	}
	if true {
		toSerialize["fullCountryName"] = o.FullCountryName
	}
	if true {
		toSerialize["requestHeader"] = o.RequestHeader
	}
	return json.Marshal(toSerialize)
}

type NullableCreateDeveloperRequest struct {
	value *CreateDeveloperRequest
	isSet bool
}

func (v NullableCreateDeveloperRequest) Get() *CreateDeveloperRequest {
	return v.value
}

func (v *NullableCreateDeveloperRequest) Set(val *CreateDeveloperRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateDeveloperRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateDeveloperRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateDeveloperRequest(val *CreateDeveloperRequest) *NullableCreateDeveloperRequest {
	return &NullableCreateDeveloperRequest{value: val, isSet: true}
}

func (v NullableCreateDeveloperRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateDeveloperRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

