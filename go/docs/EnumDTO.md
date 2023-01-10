# EnumDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | **int32** |  | 
**Name** | **string** |  | 

## Methods

### NewEnumDTO

`func NewEnumDTO(key int32, name string, ) *EnumDTO`

NewEnumDTO instantiates a new EnumDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnumDTOWithDefaults

`func NewEnumDTOWithDefaults() *EnumDTO`

NewEnumDTOWithDefaults instantiates a new EnumDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKey

`func (o *EnumDTO) GetKey() int32`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *EnumDTO) GetKeyOk() (*int32, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *EnumDTO) SetKey(v int32)`

SetKey sets Key field to given value.


### GetName

`func (o *EnumDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EnumDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EnumDTO) SetName(v string)`

SetName sets Name field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


