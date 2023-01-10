package com.konfigthis.splitit.client.api;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.model.CountriesResponse;

public class DataApiGetCountriesTest {

        /**
         * @throws ApiException if the Api call fails
         */
        @Test
        public void createInstallmentPlanTest() throws ApiException {
                String clientId = System.getenv("ONBOARDING_SPLITIT_CLIENT_ID");
                String secretId = System.getenv("ONBOARDING_SPLITIT_CLIENT_SECRET");
                ApiClient client = new ApiClient(clientId, secretId, null);
                DataApi api = new DataApi(client);
                CountriesResponse countries = api.getCountries();
                assertNotNull("Received null response", countries);
        }
}
