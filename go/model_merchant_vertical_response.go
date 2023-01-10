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

// MerchantVerticalResponse struct for MerchantVerticalResponse
type MerchantVerticalResponse struct {
	VerticalDisplayName string `json:"verticalDisplayName"`
	VerticalSplititName string `json:"verticalSplititName"`
	SubCategories []string `json:"subCategories"`
}

// NewMerchantVerticalResponse instantiates a new MerchantVerticalResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMerchantVerticalResponse(verticalDisplayName string, verticalSplititName string, subCategories []string) *MerchantVerticalResponse {
	this := MerchantVerticalResponse{}
	this.VerticalDisplayName = verticalDisplayName
	this.VerticalSplititName = verticalSplititName
	this.SubCategories = subCategories
	return &this
}

// NewMerchantVerticalResponseWithDefaults instantiates a new MerchantVerticalResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMerchantVerticalResponseWithDefaults() *MerchantVerticalResponse {
	this := MerchantVerticalResponse{}
	return &this
}

// GetVerticalDisplayName returns the VerticalDisplayName field value
func (o *MerchantVerticalResponse) GetVerticalDisplayName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.VerticalDisplayName
}

// GetVerticalDisplayNameOk returns a tuple with the VerticalDisplayName field value
// and a boolean to check if the value has been set.
func (o *MerchantVerticalResponse) GetVerticalDisplayNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.VerticalDisplayName, true
}

// SetVerticalDisplayName sets field value
func (o *MerchantVerticalResponse) SetVerticalDisplayName(v string) {
	o.VerticalDisplayName = v
}

// GetVerticalSplititName returns the VerticalSplititName field value
func (o *MerchantVerticalResponse) GetVerticalSplititName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.VerticalSplititName
}

// GetVerticalSplititNameOk returns a tuple with the VerticalSplititName field value
// and a boolean to check if the value has been set.
func (o *MerchantVerticalResponse) GetVerticalSplititNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.VerticalSplititName, true
}

// SetVerticalSplititName sets field value
func (o *MerchantVerticalResponse) SetVerticalSplititName(v string) {
	o.VerticalSplititName = v
}

// GetSubCategories returns the SubCategories field value
func (o *MerchantVerticalResponse) GetSubCategories() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.SubCategories
}

// GetSubCategoriesOk returns a tuple with the SubCategories field value
// and a boolean to check if the value has been set.
func (o *MerchantVerticalResponse) GetSubCategoriesOk() ([]string, bool) {
	if o == nil {
    return nil, false
	}
	return o.SubCategories, true
}

// SetSubCategories sets field value
func (o *MerchantVerticalResponse) SetSubCategories(v []string) {
	o.SubCategories = v
}

func (o MerchantVerticalResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["verticalDisplayName"] = o.VerticalDisplayName
	}
	if true {
		toSerialize["verticalSplititName"] = o.VerticalSplititName
	}
	if true {
		toSerialize["subCategories"] = o.SubCategories
	}
	return json.Marshal(toSerialize)
}

type NullableMerchantVerticalResponse struct {
	value *MerchantVerticalResponse
	isSet bool
}

func (v NullableMerchantVerticalResponse) Get() *MerchantVerticalResponse {
	return v.value
}

func (v *NullableMerchantVerticalResponse) Set(val *MerchantVerticalResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableMerchantVerticalResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableMerchantVerticalResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMerchantVerticalResponse(val *MerchantVerticalResponse) *NullableMerchantVerticalResponse {
	return &NullableMerchantVerticalResponse{value: val, isSet: true}
}

func (v NullableMerchantVerticalResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMerchantVerticalResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


