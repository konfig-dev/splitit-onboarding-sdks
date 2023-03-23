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

// RequestHeaderSlim struct for RequestHeaderSlim
type RequestHeaderSlim struct {
	SessionId string `json:"sessionId"`
}

// NewRequestHeaderSlim instantiates a new RequestHeaderSlim object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRequestHeaderSlim(sessionId string) *RequestHeaderSlim {
	this := RequestHeaderSlim{}
	this.SessionId = sessionId
	return &this
}

// NewRequestHeaderSlimWithDefaults instantiates a new RequestHeaderSlim object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRequestHeaderSlimWithDefaults() *RequestHeaderSlim {
	this := RequestHeaderSlim{}
	return &this
}

// GetSessionId returns the SessionId field value
func (o *RequestHeaderSlim) GetSessionId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SessionId
}

// GetSessionIdOk returns a tuple with the SessionId field value
// and a boolean to check if the value has been set.
func (o *RequestHeaderSlim) GetSessionIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.SessionId, true
}

// SetSessionId sets field value
func (o *RequestHeaderSlim) SetSessionId(v string) {
	o.SessionId = v
}

func (o RequestHeaderSlim) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["sessionId"] = o.SessionId
	}
	return json.Marshal(toSerialize)
}

type NullableRequestHeaderSlim struct {
	value *RequestHeaderSlim
	isSet bool
}

func (v NullableRequestHeaderSlim) Get() *RequestHeaderSlim {
	return v.value
}

func (v *NullableRequestHeaderSlim) Set(val *RequestHeaderSlim) {
	v.value = val
	v.isSet = true
}

func (v NullableRequestHeaderSlim) IsSet() bool {
	return v.isSet
}

func (v *NullableRequestHeaderSlim) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRequestHeaderSlim(val *RequestHeaderSlim) *NullableRequestHeaderSlim {
	return &NullableRequestHeaderSlim{value: val, isSet: true}
}

func (v NullableRequestHeaderSlim) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRequestHeaderSlim) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


