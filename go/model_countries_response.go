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

// CountriesResponse struct for CountriesResponse
type CountriesResponse struct {
	Countries []CountryResponse `json:"countries"`
}

// NewCountriesResponse instantiates a new CountriesResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCountriesResponse(countries []CountryResponse) *CountriesResponse {
	this := CountriesResponse{}
	this.Countries = countries
	return &this
}

// NewCountriesResponseWithDefaults instantiates a new CountriesResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCountriesResponseWithDefaults() *CountriesResponse {
	this := CountriesResponse{}
	return &this
}

// GetCountries returns the Countries field value
func (o *CountriesResponse) GetCountries() []CountryResponse {
	if o == nil {
		var ret []CountryResponse
		return ret
	}

	return o.Countries
}

// GetCountriesOk returns a tuple with the Countries field value
// and a boolean to check if the value has been set.
func (o *CountriesResponse) GetCountriesOk() ([]CountryResponse, bool) {
	if o == nil {
    return nil, false
	}
	return o.Countries, true
}

// SetCountries sets field value
func (o *CountriesResponse) SetCountries(v []CountryResponse) {
	o.Countries = v
}

func (o CountriesResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["countries"] = o.Countries
	}
	return json.Marshal(toSerialize)
}

type NullableCountriesResponse struct {
	value *CountriesResponse
	isSet bool
}

func (v NullableCountriesResponse) Get() *CountriesResponse {
	return v.value
}

func (v *NullableCountriesResponse) Set(val *CountriesResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableCountriesResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableCountriesResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCountriesResponse(val *CountriesResponse) *NullableCountriesResponse {
	return &NullableCountriesResponse{value: val, isSet: true}
}

func (v NullableCountriesResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCountriesResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

