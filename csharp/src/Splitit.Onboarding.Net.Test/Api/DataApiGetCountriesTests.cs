/*
 * Splitit.OnBoarding.Api.V2
 *
 * Splitit's Onboarding API
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */

using System;
using Xunit;

using Splitit.Onboarding.Net.Client;
using Splitit.Onboarding.Net.Api;
// uncomment below to import models
//using Splitit.Onboarding.Net.Model;

namespace Splitit.Onboarding.Net.Test.Api
{
    /// <summary>
    ///  Class for testing DataApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Konfig (https://konfigthis.com).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class DataApiGetCountriesTests : IDisposable
    {
        private DataApi instance;

        public DataApiGetCountriesTests()
        {
            Configuration config = new Configuration();
            string clientId = System.Environment.GetEnvironmentVariable("ONBOARDING_SPLITIT_CLIENT_ID");
            string clientSecret = System.Environment.GetEnvironmentVariable("ONBOARDING_SPLITIT_CLIENT_SECRET");
            config.OAuthClientId = clientId;
            config.OAuthClientSecret = clientSecret;
            instance = new DataApi(config);
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test GetCountries
        /// </summary>
        [Fact]
        public void GetCountriesTest()
        {
            var response = instance.GetCountries();
            Assert.NotNull(response);
        }

    }
}
