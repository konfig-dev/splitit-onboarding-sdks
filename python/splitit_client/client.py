# coding: utf-8
"""
    Splitit.OnBoarding.Api.V2

    Splitit's Onboarding API

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from splitit_client.configuration import Configuration
from splitit_client.api_client import ApiClient
from splitit_client.apis.tags.data_api import DataApi
from splitit_client.apis.tags.merchants_api import MerchantsApi


class Splitit:

    def __init__(self, configuration: Configuration = None, **kwargs):
        if (len(kwargs) > 0):
            configuration = Configuration(**kwargs)
        if (configuration is None):
            raise Exception("configuration is required")
        api_client = ApiClient(configuration)
        self.data = DataApi(api_client)
        self.merchants = MerchantsApi(api_client)