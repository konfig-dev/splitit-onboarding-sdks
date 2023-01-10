/*
 * Splitit.OnBoarding.Api.V2
 * Splitit's Onboarding API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.splitit.client.api;

import com.splitit.client.ApiException;
import com.splitit.client.model.CreateMerchantRequest;
import com.splitit.client.model.CreateMerchantResponse;
import com.splitit.client.model.GetMerchantDetailsResponse;
import com.splitit.client.model.GetMerchantsResponse;
import com.splitit.client.model.SelfOnBoardingErrorResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantsApi
 */
@Disabled
public class MerchantsApiTest {

    private final MerchantsApi api = new MerchantsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMerchantTest() throws ApiException {
        CreateMerchantRequest createMerchantRequest = null;
        CreateMerchantResponse response = api.createMerchant(createMerchantRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMerchantDetailsTest() throws ApiException {
        String merchantTempId = null;
        GetMerchantDetailsResponse response = api.getMerchantDetails(merchantTempId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMerchantsTest() throws ApiException {
        Integer numberOfRowsInPage = null;
        Integer pageNumber = null;
        String name = null;
        String legalName = null;
        Integer status = null;
        GetMerchantsResponse response = api.getMerchants(numberOfRowsInPage, pageNumber, name, legalName, status);
        // TODO: test validations
    }

}