"""
    Splitit.OnBoarding.Api.V2

    Splitit's Onboarding API  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""


import re  # noqa: F401
import sys  # noqa: F401

from splitit_client.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
    OpenApiModel
)
from splitit_client.exceptions import ApiAttributeError



class CreateMerchantRequest(ModelNormal):
    """NOTE: This class is auto generated by Konfig.
    Ref: https://konfigthis.com

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
        ('public_name',): {
            'min_length': 1,
        },
        ('email',): {
            'min_length': 1,
        },
        ('phone_number',): {
            'min_length': 1,
        },
        ('country_iso2',): {
            'min_length': 1,
        },
        ('legal_name',): {
            'min_length': 1,
        },
        ('currency_code',): {
            'min_length': 1,
        },
    }

    additional_properties_type = None

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        return {
            'public_name': (str,),  # noqa: E501
            'email': (str,),  # noqa: E501
            'phone_number': (str,),  # noqa: E501
            'country_iso2': (str,),  # noqa: E501
            'legal_name': (str,),  # noqa: E501
            'currency_code': (str,),  # noqa: E501
            'tier': (str,),  # noqa: E501
            'business_street_address': (str,),  # noqa: E501
            'business_city': (str,),  # noqa: E501
            'business_postal_code': (str,),  # noqa: E501
            'business_country': (str,),  # noqa: E501
            'business_state': (str,),  # noqa: E501
            'vertical': (str,),  # noqa: E501
            'sub_vertical': (str,),  # noqa: E501
            'name_on_bank_account': (str,),  # noqa: E501
            'incorporation_country': (str,),  # noqa: E501
            'account_number': (str,),  # noqa: E501
            'routing_number': (str,),  # noqa: E501
            'tax_id_number': (str,),  # noqa: E501
            'total_annual_sales': (str,),  # noqa: E501
            'platform_name': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'public_name': 'publicName',  # noqa: E501
        'email': 'email',  # noqa: E501
        'phone_number': 'phoneNumber',  # noqa: E501
        'country_iso2': 'countryIso2',  # noqa: E501
        'legal_name': 'legalName',  # noqa: E501
        'currency_code': 'currencyCode',  # noqa: E501
        'tier': 'tier',  # noqa: E501
        'business_street_address': 'businessStreetAddress',  # noqa: E501
        'business_city': 'businessCity',  # noqa: E501
        'business_postal_code': 'businessPostalCode',  # noqa: E501
        'business_country': 'businessCountry',  # noqa: E501
        'business_state': 'businessState',  # noqa: E501
        'vertical': 'vertical',  # noqa: E501
        'sub_vertical': 'subVertical',  # noqa: E501
        'name_on_bank_account': 'nameOnBankAccount',  # noqa: E501
        'incorporation_country': 'incorporationCountry',  # noqa: E501
        'account_number': 'accountNumber',  # noqa: E501
        'routing_number': 'routingNumber',  # noqa: E501
        'tax_id_number': 'taxIdNumber',  # noqa: E501
        'total_annual_sales': 'totalAnnualSales',  # noqa: E501
        'platform_name': 'platformName',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, public_name, email, phone_number, country_iso2, legal_name, currency_code, *args, **kwargs):  # noqa: E501
        """CreateMerchantRequest - a model defined in OpenAPI

        Args:
            public_name (str):
            email (str):
            phone_number (str):
            country_iso2 (str):
            legal_name (str):
            currency_code (str):

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            tier (str): [optional]  # noqa: E501
            business_street_address (str): [optional]  # noqa: E501
            business_city (str): [optional]  # noqa: E501
            business_postal_code (str): [optional]  # noqa: E501
            business_country (str): [optional]  # noqa: E501
            business_state (str): [optional]  # noqa: E501
            vertical (str): [optional]  # noqa: E501
            sub_vertical (str): [optional]  # noqa: E501
            name_on_bank_account (str): [optional]  # noqa: E501
            incorporation_country (str): [optional]  # noqa: E501
            account_number (str): [optional]  # noqa: E501
            routing_number (str): [optional]  # noqa: E501
            tax_id_number (str): [optional]  # noqa: E501
            total_annual_sales (str): [optional]  # noqa: E501
            platform_name (str): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', True)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        self = super(OpenApiModel, cls).__new__(cls)

        if args:
            for arg in args:
                if isinstance(arg, dict):
                    kwargs.update(arg)
                else:
                    raise ApiTypeError(
                        "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                            args,
                            self.__class__.__name__,
                        ),
                        path_to_item=_path_to_item,
                        valid_classes=(self.__class__,),
                    )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        self.public_name = public_name
        self.email = email
        self.phone_number = phone_number
        self.country_iso2 = country_iso2
        self.legal_name = legal_name
        self.currency_code = currency_code
        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
        return self

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, public_name, email, phone_number, country_iso2, legal_name, currency_code, *args, **kwargs):  # noqa: E501
        """CreateMerchantRequest - a model defined in OpenAPI

        Args:
            public_name (str):
            email (str):
            phone_number (str):
            country_iso2 (str):
            legal_name (str):
            currency_code (str):

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            tier (str): [optional]  # noqa: E501
            business_street_address (str): [optional]  # noqa: E501
            business_city (str): [optional]  # noqa: E501
            business_postal_code (str): [optional]  # noqa: E501
            business_country (str): [optional]  # noqa: E501
            business_state (str): [optional]  # noqa: E501
            vertical (str): [optional]  # noqa: E501
            sub_vertical (str): [optional]  # noqa: E501
            name_on_bank_account (str): [optional]  # noqa: E501
            incorporation_country (str): [optional]  # noqa: E501
            account_number (str): [optional]  # noqa: E501
            routing_number (str): [optional]  # noqa: E501
            tax_id_number (str): [optional]  # noqa: E501
            total_annual_sales (str): [optional]  # noqa: E501
            platform_name (str): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            for arg in args:
                if isinstance(arg, dict):
                    kwargs.update(arg)
                else:
                    raise ApiTypeError(
                        "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                            args,
                            self.__class__.__name__,
                        ),
                        path_to_item=_path_to_item,
                        valid_classes=(self.__class__,),
                    )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        self.public_name = public_name
        self.email = email
        self.phone_number = phone_number
        self.country_iso2 = country_iso2
        self.legal_name = legal_name
        self.currency_code = currency_code
        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
            if var_name in self.read_only_vars:
                raise ApiAttributeError(f"`{var_name}` is a read-only attribute. Use `from_openapi_data` to instantiate "
                                     f"class with read only attributes.")
