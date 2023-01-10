/* tslint:disable */
/* eslint-disable */
/**
 * Splitit.OnBoarding.Api.V2
 * Splitit\'s Onboarding API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * https://konfigthis.com
 * Do not edit the class manually.
 */


import { Configuration } from './configuration';
import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from './common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from './base';

/**
 * 
 * @export
 * @interface CountriesResponse
 */
export interface CountriesResponse {
    /**
     * 
     * @type {Array<CountryResponse>}
     * @memberof CountriesResponse
     */
    'countries': Array<CountryResponse>;
}
/**
 * 
 * @export
 * @interface CountryResponse
 */
export interface CountryResponse {
    /**
     * 
     * @type {string}
     * @memberof CountryResponse
     */
    'id': string;
    /**
     * 
     * @type {string}
     * @memberof CountryResponse
     */
    'name': string;
    /**
     * 
     * @type {string}
     * @memberof CountryResponse
     */
    'isoA2': string;
    /**
     * 
     * @type {string}
     * @memberof CountryResponse
     */
    'isoA3': string;
    /**
     * 
     * @type {string}
     * @memberof CountryResponse
     */
    'isoNumber': string | null;
}
/**
 * 
 * @export
 * @interface CreateMerchantRequest
 */
export interface CreateMerchantRequest {
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'publicName': string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'email': string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'phoneNumber': string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'countryIso2': string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'legalName': string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'currencyCode': string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'tier'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'businessStreetAddress'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'businessCity'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'businessPostalCode'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'businessCountry'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'businessState'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'vertical'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'subVertical'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'nameOnBankAccount'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'incorporationCountry'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'accountNumber'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'routingNumber'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'taxIdNumber'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'totalAnnualSales'?: string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantRequest
     */
    'platformName'?: string;
}
/**
 * 
 * @export
 * @interface CreateMerchantResponse
 */
export interface CreateMerchantResponse {
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantResponse
     */
    'merchantTempId': string;
    /**
     * 
     * @type {string}
     * @memberof CreateMerchantResponse
     */
    'merchantStatus': string;
}
/**
 * 
 * @export
 * @interface CurrenciesResponse
 */
export interface CurrenciesResponse {
    /**
     * 
     * @type {Array<CurrencyResponse>}
     * @memberof CurrenciesResponse
     */
    'currencies': Array<CurrencyResponse>;
}
/**
 * 
 * @export
 * @interface CurrencyResponse
 */
export interface CurrencyResponse {
    /**
     * 
     * @type {string}
     * @memberof CurrencyResponse
     */
    'code'?: string;
    /**
     * 
     * @type {string}
     * @memberof CurrencyResponse
     */
    'name'?: string;
    /**
     * 
     * @type {string}
     * @memberof CurrencyResponse
     */
    'symbol'?: string;
    /**
     * 
     * @type {string}
     * @memberof CurrencyResponse
     */
    'isoNumber'?: string;
}
/**
 * 
 * @export
 * @interface EnumDTO
 */
export interface EnumDTO {
    /**
     * 
     * @type {number}
     * @memberof EnumDTO
     */
    'key': number;
    /**
     * 
     * @type {string}
     * @memberof EnumDTO
     */
    'name': string;
}
/**
 * 
 * @export
 * @interface GetMerchantDetailsResponse
 */
export interface GetMerchantDetailsResponse {
    /**
     * 
     * @type {string}
     * @memberof GetMerchantDetailsResponse
     */
    'publicName': string;
    /**
     * 
     * @type {string}
     * @memberof GetMerchantDetailsResponse
     */
    'legalName': string;
    /**
     * 
     * @type {string}
     * @memberof GetMerchantDetailsResponse
     */
    'phoneNumber': string;
    /**
     * 
     * @type {string}
     * @memberof GetMerchantDetailsResponse
     */
    'merchantTempId': string;
    /**
     * 
     * @type {string}
     * @memberof GetMerchantDetailsResponse
     */
    'email': string;
    /**
     * 
     * @type {string}
     * @memberof GetMerchantDetailsResponse
     */
    'merchantStatus': string;
}
/**
 * 
 * @export
 * @interface GetMerchantResponse
 */
export interface GetMerchantResponse {
    /**
     * 
     * @type {string}
     * @memberof GetMerchantResponse
     */
    'name': string;
    /**
     * 
     * @type {string}
     * @memberof GetMerchantResponse
     */
    'legalName': string;
    /**
     * 
     * @type {string}
     * @memberof GetMerchantResponse
     */
    'phone': string;
    /**
     * 
     * @type {string}
     * @memberof GetMerchantResponse
     */
    'country': string;
    /**
     * 
     * @type {string}
     * @memberof GetMerchantResponse
     */
    'annualSales': string;
    /**
     * 
     * @type {string}
     * @memberof GetMerchantResponse
     */
    'status': string;
    /**
     * 
     * @type {string}
     * @memberof GetMerchantResponse
     */
    'merchantTempId': string;
}
/**
 * 
 * @export
 * @interface GetMerchantsResponse
 */
export interface GetMerchantsResponse {
    /**
     * 
     * @type {Array<GetMerchantResponse>}
     * @memberof GetMerchantsResponse
     */
    'merchants': Array<GetMerchantResponse>;
}
/**
 * 
 * @export
 * @interface MerchantVerticalResponse
 */
export interface MerchantVerticalResponse {
    /**
     * 
     * @type {string}
     * @memberof MerchantVerticalResponse
     */
    'verticalDisplayName': string;
    /**
     * 
     * @type {string}
     * @memberof MerchantVerticalResponse
     */
    'verticalSplititName': string;
    /**
     * 
     * @type {Array<string>}
     * @memberof MerchantVerticalResponse
     */
    'subCategories': Array<string>;
}
/**
 * 
 * @export
 * @interface MerchantVerticalsResponse
 */
export interface MerchantVerticalsResponse {
    /**
     * 
     * @type {Array<MerchantVerticalResponse>}
     * @memberof MerchantVerticalsResponse
     */
    'merchantVerticals': Array<MerchantVerticalResponse>;
}
/**
 * 
 * @export
 * @interface ProcessorAuthenticationParametersRequest
 */
export interface ProcessorAuthenticationParametersRequest {
    /**
     * 
     * @type {string}
     * @memberof ProcessorAuthenticationParametersRequest
     */
    'key': string;
}
/**
 * 
 * @export
 * @interface ProcessorResponse
 */
export interface ProcessorResponse {
    /**
     * 
     * @type {number}
     * @memberof ProcessorResponse
     */
    'id': number;
    /**
     * 
     * @type {string}
     * @memberof ProcessorResponse
     */
    'name': string;
    /**
     * 
     * @type {Array<ProcessorAuthenticationParametersRequest>}
     * @memberof ProcessorResponse
     */
    'processorAuthenticationParametersRequest': Array<ProcessorAuthenticationParametersRequest>;
}
/**
 * 
 * @export
 * @interface ProcessorsResponse
 */
export interface ProcessorsResponse {
    /**
     * 
     * @type {Array<ProcessorResponse>}
     * @memberof ProcessorsResponse
     */
    'processors': Array<ProcessorResponse>;
}
/**
 * 
 * @export
 * @interface SelfOnBoardingErrorResponse
 */
export interface SelfOnBoardingErrorResponse {
    /**
     * 
     * @type {string}
     * @memberof SelfOnBoardingErrorResponse
     */
    'message'?: string;
    /**
     * 
     * @type {number}
     * @memberof SelfOnBoardingErrorResponse
     */
    'errorCode'?: number;
    /**
     * 
     * @type {string}
     * @memberof SelfOnBoardingErrorResponse
     */
    'paramName'?: string;
    /**
     * 
     * @type {string}
     * @memberof SelfOnBoardingErrorResponse
     */
    'traceId'?: string;
}

/**
 * DataApi - axios parameter creator
 * @export
 */
export const DataApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCountries: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/data/get-countries`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oauth2 required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oauth2", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCurrencies: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/data/get-currencies`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oauth2 required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oauth2", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getProcessors: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/data/get-processors`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oauth2 required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oauth2", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVerticals: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/data/get-verticals`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oauth2 required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oauth2", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        statusLegend: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/data/status-legend`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oauth2 required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oauth2", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * DataApi - functional programming interface
 * @export
 */
export const DataApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = DataApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getCountries(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<CountriesResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getCountries(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getCurrencies(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<CurrenciesResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getCurrencies(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getProcessors(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<ProcessorsResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getProcessors(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getVerticals(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<MerchantVerticalsResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getVerticals(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async statusLegend(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<EnumDTO>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.statusLegend(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * DataApi - factory interface
 * @export
 */
export const DataApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = DataApiFp(configuration)
    return {
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCountries(options?: any): AxiosPromise<CountriesResponse> {
            return localVarFp.getCountries(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCurrencies(options?: any): AxiosPromise<CurrenciesResponse> {
            return localVarFp.getCurrencies(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getProcessors(options?: any): AxiosPromise<ProcessorsResponse> {
            return localVarFp.getProcessors(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getVerticals(options?: any): AxiosPromise<MerchantVerticalsResponse> {
            return localVarFp.getVerticals(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        statusLegend(options?: any): AxiosPromise<Array<EnumDTO>> {
            return localVarFp.statusLegend(options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * DataApi - object-oriented interface
 * @export
 * @class DataApi
 * @extends {BaseAPI}
 */
export class DataApi extends BaseAPI {
    /**
     * 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DataApi
     */
    public getCountries(options?: AxiosRequestConfig) {
        return DataApiFp(this.configuration).getCountries(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DataApi
     */
    public getCurrencies(options?: AxiosRequestConfig) {
        return DataApiFp(this.configuration).getCurrencies(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DataApi
     */
    public getProcessors(options?: AxiosRequestConfig) {
        return DataApiFp(this.configuration).getProcessors(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DataApi
     */
    public getVerticals(options?: AxiosRequestConfig) {
        return DataApiFp(this.configuration).getVerticals(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DataApi
     */
    public statusLegend(options?: AxiosRequestConfig) {
        return DataApiFp(this.configuration).statusLegend(options).then((request) => request(this.axios, this.basePath));
    }
}


/**
 * MerchantsApi - axios parameter creator
 * @export
 */
export const MerchantsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @param {CreateMerchantRequest} createMerchantRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createMerchant: async (createMerchantRequest: CreateMerchantRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'createMerchantRequest' is not null or undefined
            assertParamExists('createMerchant', 'createMerchantRequest', createMerchantRequest)
            const localVarPath = `/api/merchants/create`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oauth2 required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oauth2", [], configuration)


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(createMerchantRequest, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @param {string} merchantTempId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMerchantDetails: async (merchantTempId: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'merchantTempId' is not null or undefined
            assertParamExists('getMerchantDetails', 'merchantTempId', merchantTempId)
            const localVarPath = `/api/merchants/get-details`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oauth2 required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oauth2", [], configuration)

            if (merchantTempId !== undefined) {
                localVarQueryParameter['merchantTempId'] = merchantTempId;
            }


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @param {number} numberOfRowsInPage 
         * @param {number} pageNumber 
         * @param {string} [name] 
         * @param {string} [legalName] 
         * @param {number} [status] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMerchants: async (numberOfRowsInPage: number, pageNumber: number, name?: string, legalName?: string, status?: number, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'numberOfRowsInPage' is not null or undefined
            assertParamExists('getMerchants', 'numberOfRowsInPage', numberOfRowsInPage)
            // verify required parameter 'pageNumber' is not null or undefined
            assertParamExists('getMerchants', 'pageNumber', pageNumber)
            const localVarPath = `/api/merchants/get`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oauth2 required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oauth2", [], configuration)

            if (numberOfRowsInPage !== undefined) {
                localVarQueryParameter['NumberOfRowsInPage'] = numberOfRowsInPage;
            }

            if (pageNumber !== undefined) {
                localVarQueryParameter['PageNumber'] = pageNumber;
            }

            if (name !== undefined) {
                localVarQueryParameter['Name'] = name;
            }

            if (legalName !== undefined) {
                localVarQueryParameter['LegalName'] = legalName;
            }

            if (status !== undefined) {
                localVarQueryParameter['Status'] = status;
            }


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * MerchantsApi - functional programming interface
 * @export
 */
export const MerchantsApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = MerchantsApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @param {CreateMerchantRequest} createMerchantRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async createMerchant(createMerchantRequest: CreateMerchantRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<CreateMerchantResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.createMerchant(createMerchantRequest, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @param {string} merchantTempId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getMerchantDetails(merchantTempId: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<GetMerchantDetailsResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getMerchantDetails(merchantTempId, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @param {number} numberOfRowsInPage 
         * @param {number} pageNumber 
         * @param {string} [name] 
         * @param {string} [legalName] 
         * @param {number} [status] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getMerchants(numberOfRowsInPage: number, pageNumber: number, name?: string, legalName?: string, status?: number, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<GetMerchantsResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getMerchants(numberOfRowsInPage, pageNumber, name, legalName, status, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * MerchantsApi - factory interface
 * @export
 */
export const MerchantsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = MerchantsApiFp(configuration)
    return {
        /**
         * 
         * @param {CreateMerchantRequest} createMerchantRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createMerchant(createMerchantRequest: CreateMerchantRequest, options?: any): AxiosPromise<CreateMerchantResponse> {
            return localVarFp.createMerchant(createMerchantRequest, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @param {string} merchantTempId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMerchantDetails(merchantTempId: string, options?: any): AxiosPromise<GetMerchantDetailsResponse> {
            return localVarFp.getMerchantDetails(merchantTempId, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @param {number} numberOfRowsInPage 
         * @param {number} pageNumber 
         * @param {string} [name] 
         * @param {string} [legalName] 
         * @param {number} [status] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMerchants(numberOfRowsInPage: number, pageNumber: number, name?: string, legalName?: string, status?: number, options?: any): AxiosPromise<GetMerchantsResponse> {
            return localVarFp.getMerchants(numberOfRowsInPage, pageNumber, name, legalName, status, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * MerchantsApi - object-oriented interface
 * @export
 * @class MerchantsApi
 * @extends {BaseAPI}
 */
export class MerchantsApi extends BaseAPI {
    /**
     * 
     * @param {CreateMerchantRequest} createMerchantRequest 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof MerchantsApi
     */
    public createMerchant(createMerchantRequest: CreateMerchantRequest, options?: AxiosRequestConfig) {
        return MerchantsApiFp(this.configuration).createMerchant(createMerchantRequest, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @param {string} merchantTempId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof MerchantsApi
     */
    public getMerchantDetails(merchantTempId: string, options?: AxiosRequestConfig) {
        return MerchantsApiFp(this.configuration).getMerchantDetails(merchantTempId, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @param {number} numberOfRowsInPage 
     * @param {number} pageNumber 
     * @param {string} [name] 
     * @param {string} [legalName] 
     * @param {number} [status] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof MerchantsApi
     */
    public getMerchants(numberOfRowsInPage: number, pageNumber: number, name?: string, legalName?: string, status?: number, options?: AxiosRequestConfig) {
        return MerchantsApiFp(this.configuration).getMerchants(numberOfRowsInPage, pageNumber, name, legalName, status, options).then((request) => request(this.axios, this.basePath));
    }
}


