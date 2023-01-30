/*
Splitit.OnBoarding.Api.V2

Splitit's Onboarding API

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package splitit

import (
	"bytes"
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
)


// MerchantsApiService MerchantsApi service
type MerchantsApiService service

type MerchantsApiCreateMerchantRequest struct {
	ctx context.Context
	ApiService *MerchantsApiService
	createMerchantRequest *CreateMerchantRequest
}

func (r MerchantsApiCreateMerchantRequest) CreateMerchantRequest(createMerchantRequest CreateMerchantRequest) MerchantsApiCreateMerchantRequest {
	r.createMerchantRequest = &createMerchantRequest
	return r
}

func (r MerchantsApiCreateMerchantRequest) Execute() (*CreateMerchantResponse, *http.Response, error) {
	return r.ApiService.CreateMerchantExecute(r)
}

/*
CreateMerchant Method for CreateMerchant

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return MerchantsApiCreateMerchantRequest
*/
func (a *MerchantsApiService) CreateMerchant() MerchantsApiCreateMerchantRequest {
	return MerchantsApiCreateMerchantRequest{
		ApiService: a,
		ctx: a.client.cfg.Context,
	}
}

// Execute executes the request
//  @return CreateMerchantResponse
func (a *MerchantsApiService) CreateMerchantExecute(r MerchantsApiCreateMerchantRequest) (*CreateMerchantResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *CreateMerchantResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "MerchantsApiService.CreateMerchant")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/merchants/create"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.createMerchantRequest == nil {
		return localVarReturnValue, nil, reportError("createMerchantRequest is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.createMerchantRequest
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v SelfOnBoardingErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type MerchantsApiGetMerchantDetailsRequest struct {
	ctx context.Context
	ApiService *MerchantsApiService
	merchantTempId *string
}

func (r MerchantsApiGetMerchantDetailsRequest) MerchantTempId(merchantTempId string) MerchantsApiGetMerchantDetailsRequest {
	r.merchantTempId = &merchantTempId
	return r
}

func (r MerchantsApiGetMerchantDetailsRequest) Execute() (*GetMerchantDetailsResponse, *http.Response, error) {
	return r.ApiService.GetMerchantDetailsExecute(r)
}

/*
GetMerchantDetails Method for GetMerchantDetails

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return MerchantsApiGetMerchantDetailsRequest
*/
func (a *MerchantsApiService) GetMerchantDetails() MerchantsApiGetMerchantDetailsRequest {
	return MerchantsApiGetMerchantDetailsRequest{
		ApiService: a,
		ctx: a.client.cfg.Context,
	}
}

// Execute executes the request
//  @return GetMerchantDetailsResponse
func (a *MerchantsApiService) GetMerchantDetailsExecute(r MerchantsApiGetMerchantDetailsRequest) (*GetMerchantDetailsResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *GetMerchantDetailsResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "MerchantsApiService.GetMerchantDetails")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/merchants/get-details"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.merchantTempId == nil {
		return localVarReturnValue, nil, reportError("merchantTempId is required and must be specified")
	}

	localVarQueryParams.Add("merchantTempId", parameterToString(*r.merchantTempId, ""))
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v SelfOnBoardingErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type MerchantsApiGetMerchantsRequest struct {
	ctx context.Context
	ApiService *MerchantsApiService
	numberOfRowsInPage *int32
	pageNumber *int32
	name *string
	legalName *string
	status *int32
}

func (r MerchantsApiGetMerchantsRequest) NumberOfRowsInPage(numberOfRowsInPage int32) MerchantsApiGetMerchantsRequest {
	r.numberOfRowsInPage = &numberOfRowsInPage
	return r
}

func (r MerchantsApiGetMerchantsRequest) PageNumber(pageNumber int32) MerchantsApiGetMerchantsRequest {
	r.pageNumber = &pageNumber
	return r
}

func (r MerchantsApiGetMerchantsRequest) Name(name string) MerchantsApiGetMerchantsRequest {
	r.name = &name
	return r
}

func (r MerchantsApiGetMerchantsRequest) LegalName(legalName string) MerchantsApiGetMerchantsRequest {
	r.legalName = &legalName
	return r
}

func (r MerchantsApiGetMerchantsRequest) Status(status int32) MerchantsApiGetMerchantsRequest {
	r.status = &status
	return r
}

func (r MerchantsApiGetMerchantsRequest) Execute() (*GetMerchantsResponse, *http.Response, error) {
	return r.ApiService.GetMerchantsExecute(r)
}

/*
GetMerchants Method for GetMerchants

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return MerchantsApiGetMerchantsRequest
*/
func (a *MerchantsApiService) GetMerchants() MerchantsApiGetMerchantsRequest {
	return MerchantsApiGetMerchantsRequest{
		ApiService: a,
		ctx: a.client.cfg.Context,
	}
}

// Execute executes the request
//  @return GetMerchantsResponse
func (a *MerchantsApiService) GetMerchantsExecute(r MerchantsApiGetMerchantsRequest) (*GetMerchantsResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *GetMerchantsResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "MerchantsApiService.GetMerchants")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/merchants/get"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.numberOfRowsInPage == nil {
		return localVarReturnValue, nil, reportError("numberOfRowsInPage is required and must be specified")
	}
	if r.pageNumber == nil {
		return localVarReturnValue, nil, reportError("pageNumber is required and must be specified")
	}

	localVarQueryParams.Add("NumberOfRowsInPage", parameterToString(*r.numberOfRowsInPage, ""))
	localVarQueryParams.Add("PageNumber", parameterToString(*r.pageNumber, ""))
	if r.name != nil {
		localVarQueryParams.Add("Name", parameterToString(*r.name, ""))
	}
	if r.legalName != nil {
		localVarQueryParams.Add("LegalName", parameterToString(*r.legalName, ""))
	}
	if r.status != nil {
		localVarQueryParams.Add("Status", parameterToString(*r.status, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v SelfOnBoardingErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
            		newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
            		newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
