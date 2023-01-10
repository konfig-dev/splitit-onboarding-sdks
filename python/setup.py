"""
    Splitit.OnBoarding.Api.V2

    Splitit's Onboarding API  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""


from setuptools import setup, find_packages  # noqa: H301

NAME = "splitit-onboarding-python-sdk"
VERSION = "1.0.0"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

# read the contents of README file
from pathlib import Path
this_directory = Path(__file__).parent
long_description = (this_directory / "README.md").read_text()

REQUIRES = [
  "urllib3 >= 1.25.3",
  "python-dateutil",
]

setup(
    name=NAME,
    version=VERSION,
    description="Splitit.OnBoarding.Api.V2",
    author="Konfig",
    author_email="engineering@konfigthis.com",
    url="https://github.com/konfig-dev/splitit-onboarding-sdks/tree/main/python",
    keywords=["Konfig", "Splitit.OnBoarding.Api.V2"],
    python_requires=">=3.6",
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    long_description=long_description,
    long_description_content_type='text/markdown'
)