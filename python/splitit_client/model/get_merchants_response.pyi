# coding: utf-8

"""
    Splitit.OnBoarding.Api.V2

    Splitit's Onboarding API

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from splitit_client import schemas  # noqa: F401


class GetMerchantsResponse(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by Konfig.
    Ref: https://konfigthis.com

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "merchants",
        }
        
        class properties:
            
            
            class merchants(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['GetMerchantResponse']:
                        return GetMerchantResponse
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['GetMerchantResponse'], typing.List['GetMerchantResponse']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'merchants':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'GetMerchantResponse':
                    return super().__getitem__(i)
            __annotations__ = {
                "merchants": merchants,
            }
    
    merchants: MetaOapg.properties.merchants
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["merchants"]) -> MetaOapg.properties.merchants: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["merchants", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["merchants"]) -> MetaOapg.properties.merchants: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["merchants", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        merchants: typing.Union[MetaOapg.properties.merchants, list, tuple, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'GetMerchantsResponse':
        return super().__new__(
            cls,
            *args,
            merchants=merchants,
            _configuration=_configuration,
            **kwargs,
        )

from splitit_client.model.get_merchant_response import GetMerchantResponse
