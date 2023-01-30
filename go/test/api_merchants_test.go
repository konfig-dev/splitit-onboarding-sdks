/*
Splitit.OnBoarding.Api.V2

Testing MerchantsApiService

*/

// Code generated by Konfig (https://konfigthis.com);

package splitit

import (
    "github.com/stretchr/testify/assert"
    "github.com/stretchr/testify/require"
    "testing"
    splitit "github.com/konfig-dev/splitit-onboarding-sdks/go"
)

func Test_splitit_MerchantsApiService(t *testing.T) {

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)

    t.Run("Test MerchantsApiService CreateMerchant", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.MerchantsApi.CreateMerchant().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test MerchantsApiService GetMerchantDetails", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.MerchantsApi.GetMerchantDetails().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test MerchantsApiService GetMerchants", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.MerchantsApi.GetMerchants().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}
