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
import com.konfigthis.splitit.client.model.CountriesResponse;
import com.konfigthis.splitit.client.model.CurrenciesResponse;
import com.konfigthis.splitit.client.model.EnumDTO;
import com.konfigthis.splitit.client.model.MerchantVerticalsResponse;
import com.konfigthis.splitit.client.model.ProcessorsResponse;
import com.konfigthis.splitit.client.model.SelfOnBoardingErrorResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataApi
 */
@Disabled
public class DataApiTest {

    private final DataApi api = new DataApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCountriesTest() throws ApiException {
        CountriesResponse response = api.getCountries();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrenciesTest() throws ApiException {
        CurrenciesResponse response = api.getCurrencies();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProcessorsTest() throws ApiException {
        ProcessorsResponse response = api.getProcessors();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVerticalsTest() throws ApiException {
        MerchantVerticalsResponse response = api.getVerticals();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void statusLegendTest() throws ApiException {
        List<EnumDTO> response = api.statusLegend();
        // TODO: test validations
    }

}
