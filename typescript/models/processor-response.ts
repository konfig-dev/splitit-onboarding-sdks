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

// May contain unused imports in some cases
// @ts-ignore
import { ProcessorAuthenticationParametersRequest } from './processor-authentication-parameters-request';

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

