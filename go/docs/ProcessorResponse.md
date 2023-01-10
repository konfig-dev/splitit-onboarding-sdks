# ProcessorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** |  | 
**Name** | **string** |  | 
**ProcessorAuthenticationParametersRequest** | [**[]ProcessorAuthenticationParametersRequest**](ProcessorAuthenticationParametersRequest.md) |  | 

## Methods

### NewProcessorResponse

`func NewProcessorResponse(id int64, name string, processorAuthenticationParametersRequest []ProcessorAuthenticationParametersRequest, ) *ProcessorResponse`

NewProcessorResponse instantiates a new ProcessorResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProcessorResponseWithDefaults

`func NewProcessorResponseWithDefaults() *ProcessorResponse`

NewProcessorResponseWithDefaults instantiates a new ProcessorResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ProcessorResponse) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ProcessorResponse) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ProcessorResponse) SetId(v int64)`

SetId sets Id field to given value.


### GetName

`func (o *ProcessorResponse) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ProcessorResponse) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ProcessorResponse) SetName(v string)`

SetName sets Name field to given value.


### GetProcessorAuthenticationParametersRequest

`func (o *ProcessorResponse) GetProcessorAuthenticationParametersRequest() []ProcessorAuthenticationParametersRequest`

GetProcessorAuthenticationParametersRequest returns the ProcessorAuthenticationParametersRequest field if non-nil, zero value otherwise.

### GetProcessorAuthenticationParametersRequestOk

`func (o *ProcessorResponse) GetProcessorAuthenticationParametersRequestOk() (*[]ProcessorAuthenticationParametersRequest, bool)`

GetProcessorAuthenticationParametersRequestOk returns a tuple with the ProcessorAuthenticationParametersRequest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessorAuthenticationParametersRequest

`func (o *ProcessorResponse) SetProcessorAuthenticationParametersRequest(v []ProcessorAuthenticationParametersRequest)`

SetProcessorAuthenticationParametersRequest sets ProcessorAuthenticationParametersRequest field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


