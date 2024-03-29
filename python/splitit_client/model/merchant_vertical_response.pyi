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


class MerchantVerticalResponse(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by Konfig.
    Ref: https://konfigthis.com

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "verticalSplititName",
            "verticalDisplayName",
            "subCategories",
        }
        
        class properties:
            verticalDisplayName = schemas.StrSchema
            verticalSplititName = schemas.StrSchema
            
            
            class subCategories(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    items = schemas.StrSchema
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, str, ]], typing.List[typing.Union[MetaOapg.items, str, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'subCategories':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            __annotations__ = {
                "verticalDisplayName": verticalDisplayName,
                "verticalSplititName": verticalSplititName,
                "subCategories": subCategories,
            }
    
    verticalSplititName: MetaOapg.properties.verticalSplititName
    verticalDisplayName: MetaOapg.properties.verticalDisplayName
    subCategories: MetaOapg.properties.subCategories
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["verticalDisplayName"]) -> MetaOapg.properties.verticalDisplayName: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["verticalSplititName"]) -> MetaOapg.properties.verticalSplititName: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["subCategories"]) -> MetaOapg.properties.subCategories: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["verticalDisplayName", "verticalSplititName", "subCategories", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["verticalDisplayName"]) -> MetaOapg.properties.verticalDisplayName: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["verticalSplititName"]) -> MetaOapg.properties.verticalSplititName: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["subCategories"]) -> MetaOapg.properties.subCategories: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["verticalDisplayName", "verticalSplititName", "subCategories", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        verticalSplititName: typing.Union[MetaOapg.properties.verticalSplititName, str, ],
        verticalDisplayName: typing.Union[MetaOapg.properties.verticalDisplayName, str, ],
        subCategories: typing.Union[MetaOapg.properties.subCategories, list, tuple, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'MerchantVerticalResponse':
        return super().__new__(
            cls,
            *args,
            verticalSplititName=verticalSplititName,
            verticalDisplayName=verticalDisplayName,
            subCategories=subCategories,
            _configuration=_configuration,
            **kwargs,
        )
