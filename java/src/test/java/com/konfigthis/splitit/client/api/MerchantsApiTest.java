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


package com.konfigthis.splitit.client.api;

import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.model.CreateDeveloperRequest;
import com.konfigthis.splitit.client.model.CreateMerchantRequest;
import com.konfigthis.splitit.client.model.CreateMerchantResponse;
import com.konfigthis.splitit.client.model.GetMerchantDetailsResponse;
import com.konfigthis.splitit.client.model.GetMerchantsResponse;
import com.konfigthis.splitit.client.model.SelfOnBoardingErrorResponse;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantsApi
 */
@Ignore
public class MerchantsApiTest {

    private static MerchantsApi api;

    
    @BeforeClass
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new MerchantsApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        CreateMerchantRequest createMerchantRequest = null;
        CreateMerchantResponse response = api.create(createMerchantRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDeveloperTest() throws ApiException {
        CreateDeveloperRequest createDeveloperRequest = null;
        CreateMerchantResponse response = api.createDeveloper(createDeveloperRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        Integer numberOfRowsInPage = null;
        Integer pageNumber = null;
        String name = null;
        String legalName = null;
        Integer status = null;
        GetMerchantsResponse response = api.get(numberOfRowsInPage, pageNumber)
                .name(name)
                .legalName(legalName)
                .status(status)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String merchantTempId = null;
        GetMerchantDetailsResponse response = api.getDetails(merchantTempId)
                .execute();
        // TODO: test validations
    }

}
