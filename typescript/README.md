## splitit-onboarding-typescript-sdk@2.0.0

This library that utilizes [axios](https://github.com/axios/axios). The generated Node module can be used in the following environments:

Environment
* Node.js
* Webpack
* Browserify

Language level
* ES5 - you must have a Promises/A+ library installed
* ES6

Module system
* CommonJS
* ES6 module system

### Building

To build and compile the typescript sources to javascript use:
```
npm install
npm run build
```

### Consuming

navigate to the folder of your consuming project and run the following command.

```
npm install splitit-onboarding-typescript-sdk@2.0.0 --save
```

### Getting Started

```typescript
import { Splitit } from "splitit-onboarding-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://onboarding-v2.sandbox.splitit.com
    // basePath: "https://onboarding-v2.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const getCountriesResponse = await splitit.data.getCountries()

console.log(getCountriesResponse)

```

## Documentation for API Endpoints

All URIs are relative to *https://onboarding-v2.sandbox.splitit.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataApi* | [**getCountries**](docs/DataApi.md#getCountries) | **GET** /api/data/get-countries | 
*DataApi* | [**getCurrencies**](docs/DataApi.md#getCurrencies) | **GET** /api/data/get-currencies | 
*DataApi* | [**getProcessors**](docs/DataApi.md#getProcessors) | **GET** /api/data/get-processors | 
*DataApi* | [**getVerticals**](docs/DataApi.md#getVerticals) | **GET** /api/data/get-verticals | 
*DataApi* | [**statusLegend**](docs/DataApi.md#statusLegend) | **GET** /api/data/status-legend | 
*MerchantsApi* | [**create**](docs/MerchantsApi.md#create) | **POST** /api/merchants/create | 
*MerchantsApi* | [**get**](docs/MerchantsApi.md#get) | **GET** /api/merchants/get | 
*MerchantsApi* | [**getDetails**](docs/MerchantsApi.md#getDetails) | **GET** /api/merchants/get-details | 


