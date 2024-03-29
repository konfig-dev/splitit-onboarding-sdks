# coding: utf-8

"""
    Splitit.OnBoarding.Api.V2

    Splitit's Onboarding API

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from splitit_client.paths.api_data_get_countries.get import GetCountries
from splitit_client.paths.api_data_get_currencies.get import GetCurrencies
from splitit_client.paths.api_data_get_processors.get import GetProcessors
from splitit_client.paths.api_data_get_verticals.get import GetVerticals
from splitit_client.paths.api_data_status_legend.get import StatusLegend


class DataApi(
    GetCountries,
    GetCurrencies,
    GetProcessors,
    GetVerticals,
    StatusLegend,
):
    """NOTE: This class is auto generated by Konfig
    Ref: https://konfgithis.com

    Do not edit the class manually.
    """
    pass
