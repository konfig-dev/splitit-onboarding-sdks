## splitit-onboarding-typescript-sdk@1.1.0

This generator creates TypeScript/JavaScript client that utilizes [axios](https://github.com/axios/axios). The generated Node module can be used in the following environments:

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

It can be used in both TypeScript and JavaScript. In TypeScript, the definition should be automatically resolved via `package.json`. ([Reference](http://www.typescriptlang.org/docs/handbook/typings-for-npm-packages.html))

### Building

To build and compile the typescript sources to javascript use:
```
npm install
npm run build
```

### Consuming

navigate to the folder of your consuming project and run the following command.

```
npm install splitit-onboarding-typescript-sdk@1.1.0 --save
```

### Getting Started

```typescript

import { Configuration, DataApi, SelfOnBoardingErrorResponse, CountriesResponse } from "splitit-onboarding-typescript-sdk";

const oauthClientId = process.env.CLIENT_ID;
const oauthClientSecret = process.env.CLIENT_SECRET;
const config = new Configuration({ oauthClientId, oauthClientSecret });

const api = new DataApi(config);


const request = api.getCountries();
request.then(result => {
    console.log(result)
})

```
