/* tslint:disable */
/* eslint-disable */
/**
 * Splitit.OnBoarding.Api.V2
 * Splitit\'s Onboarding API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This file is auto generated by Konfig (https://konfigthis.com).
 * https://konfigthis.com
 * Do not edit the class manually.
 */


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
    'vertical': string;
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

