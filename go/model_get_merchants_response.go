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

// GetMerchantsResponse struct for GetMerchantsResponse
type GetMerchantsResponse struct {
	Merchants []GetMerchantResponse `json:"merchants"`
}

// NewGetMerchantsResponse instantiates a new GetMerchantsResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetMerchantsResponse(merchants []GetMerchantResponse) *GetMerchantsResponse {
	this := GetMerchantsResponse{}
	this.Merchants = merchants
	return &this
}

// NewGetMerchantsResponseWithDefaults instantiates a new GetMerchantsResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetMerchantsResponseWithDefaults() *GetMerchantsResponse {
	this := GetMerchantsResponse{}
	return &this
}

// GetMerchants returns the Merchants field value
func (o *GetMerchantsResponse) GetMerchants() []GetMerchantResponse {
	if o == nil {
		var ret []GetMerchantResponse
		return ret
	}

	return o.Merchants
}

// GetMerchantsOk returns a tuple with the Merchants field value
// and a boolean to check if the value has been set.
func (o *GetMerchantsResponse) GetMerchantsOk() ([]GetMerchantResponse, bool) {
	if o == nil {
    return nil, false
	}
	return o.Merchants, true
}

// SetMerchants sets field value
func (o *GetMerchantsResponse) SetMerchants(v []GetMerchantResponse) {
	o.Merchants = v
}

func (o GetMerchantsResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["merchants"] = o.Merchants
	}
	return json.Marshal(toSerialize)
}

type NullableGetMerchantsResponse struct {
	value *GetMerchantsResponse
	isSet bool
}

func (v NullableGetMerchantsResponse) Get() *GetMerchantsResponse {
	return v.value
}

func (v *NullableGetMerchantsResponse) Set(val *GetMerchantsResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableGetMerchantsResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableGetMerchantsResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetMerchantsResponse(val *GetMerchantsResponse) *NullableGetMerchantsResponse {
	return &NullableGetMerchantsResponse{value: val, isSet: true}
}

func (v NullableGetMerchantsResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetMerchantsResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


