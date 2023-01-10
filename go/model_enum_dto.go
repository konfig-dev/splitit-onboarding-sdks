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

// EnumDTO struct for EnumDTO
type EnumDTO struct {
	Key int32 `json:"key"`
	Name string `json:"name"`
}

// NewEnumDTO instantiates a new EnumDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEnumDTO(key int32, name string) *EnumDTO {
	this := EnumDTO{}
	this.Key = key
	this.Name = name
	return &this
}

// NewEnumDTOWithDefaults instantiates a new EnumDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEnumDTOWithDefaults() *EnumDTO {
	this := EnumDTO{}
	return &this
}

// GetKey returns the Key field value
func (o *EnumDTO) GetKey() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Key
}

// GetKeyOk returns a tuple with the Key field value
// and a boolean to check if the value has been set.
func (o *EnumDTO) GetKeyOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Key, true
}

// SetKey sets field value
func (o *EnumDTO) SetKey(v int32) {
	o.Key = v
}

// GetName returns the Name field value
func (o *EnumDTO) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *EnumDTO) GetNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *EnumDTO) SetName(v string) {
	o.Name = v
}

func (o EnumDTO) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["key"] = o.Key
	}
	if true {
		toSerialize["name"] = o.Name
	}
	return json.Marshal(toSerialize)
}

type NullableEnumDTO struct {
	value *EnumDTO
	isSet bool
}

func (v NullableEnumDTO) Get() *EnumDTO {
	return v.value
}

func (v *NullableEnumDTO) Set(val *EnumDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableEnumDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableEnumDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEnumDTO(val *EnumDTO) *NullableEnumDTO {
	return &NullableEnumDTO{value: val, isSet: true}
}

func (v NullableEnumDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEnumDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


