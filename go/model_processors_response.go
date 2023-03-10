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

// ProcessorsResponse struct for ProcessorsResponse
type ProcessorsResponse struct {
	Processors []ProcessorResponse `json:"processors"`
}

// NewProcessorsResponse instantiates a new ProcessorsResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewProcessorsResponse(processors []ProcessorResponse) *ProcessorsResponse {
	this := ProcessorsResponse{}
	this.Processors = processors
	return &this
}

// NewProcessorsResponseWithDefaults instantiates a new ProcessorsResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewProcessorsResponseWithDefaults() *ProcessorsResponse {
	this := ProcessorsResponse{}
	return &this
}

// GetProcessors returns the Processors field value
func (o *ProcessorsResponse) GetProcessors() []ProcessorResponse {
	if o == nil {
		var ret []ProcessorResponse
		return ret
	}

	return o.Processors
}

// GetProcessorsOk returns a tuple with the Processors field value
// and a boolean to check if the value has been set.
func (o *ProcessorsResponse) GetProcessorsOk() ([]ProcessorResponse, bool) {
	if o == nil {
    return nil, false
	}
	return o.Processors, true
}

// SetProcessors sets field value
func (o *ProcessorsResponse) SetProcessors(v []ProcessorResponse) {
	o.Processors = v
}

func (o ProcessorsResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["processors"] = o.Processors
	}
	return json.Marshal(toSerialize)
}

type NullableProcessorsResponse struct {
	value *ProcessorsResponse
	isSet bool
}

func (v NullableProcessorsResponse) Get() *ProcessorsResponse {
	return v.value
}

func (v *NullableProcessorsResponse) Set(val *ProcessorsResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableProcessorsResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableProcessorsResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableProcessorsResponse(val *ProcessorsResponse) *NullableProcessorsResponse {
	return &NullableProcessorsResponse{value: val, isSet: true}
}

func (v NullableProcessorsResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableProcessorsResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


