$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PA_001_Login.feature");
formatter.feature({
  "line": 2,
  "name": "Test Wireless Office application for Provider Admin - Login functionality",
  "description": "",
  "id": "test-wireless-office-application-for-provider-admin---login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@WO2.1"
    },
    {
      "line": 1,
      "name": "@providerAdmin"
    },
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "To Test login functionality in Masterview portal",
  "description": "",
  "id": "test-wireless-office-application-for-provider-admin---login-functionality;to-test-login-functionality-in-masterview-portal",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@paLogin"
    },
    {
      "line": 4,
      "name": "@paLoginPositive"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Admin launching the Provider Admin Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Admin enters credentials \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "comments": [
    {
      "line": 8,
      "value": "# Then Admin clicks on login button"
    },
    {
      "line": 9,
      "value": "# Then Admin fetchs otp from email for \"\u003cemail\u003e\""
    },
    {
      "line": 10,
      "value": "# Then Admin clicks on Complete button"
    },
    {
      "line": 11,
      "value": "# Then Admin is in HomePage"
    }
  ],
  "line": 13,
  "name": "",
  "description": "",
  "id": "test-wireless-office-application-for-provider-admin---login-functionality;to-test-login-functionality-in-masterview-portal;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 14,
      "id": "test-wireless-office-application-for-provider-admin---login-functionality;to-test-login-functionality-in-masterview-portal;;1"
    },
    {
      "cells": [
        "serviceprovider@yopmail.com",
        "ERic7$ft@$sson"
      ],
      "line": 15,
      "id": "test-wireless-office-application-for-provider-admin---login-functionality;to-test-login-functionality-in-masterview-portal;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1238522000,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "To Test login functionality in Masterview portal",
  "description": "",
  "id": "test-wireless-office-application-for-provider-admin---login-functionality;to-test-login-functionality-in-masterview-portal;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@providerAdmin"
    },
    {
      "line": 4,
      "name": "@paLoginPositive"
    },
    {
      "line": 1,
      "name": "@Smoke"
    },
    {
      "line": 4,
      "name": "@paLogin"
    },
    {
      "line": 1,
      "name": "@WO2.1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Admin launching the Provider Admin Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Admin enters credentials \"serviceprovider@yopmail.com\" and \"ERic7$ft@$sson\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.match({
  "location": "PA_LoginStep.user_launching_provider_admin_url()"
});
formatter.result({
  "duration": 10920146800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "serviceprovider@yopmail.com",
      "offset": 26
    },
    {
      "val": "ERic7$ft@$sson",
      "offset": 60
    }
  ],
  "location": "PA_LoginStep.Admin_enterscredentials_email_and_password(String,String)"
});
formatter.result({
  "duration": 2310603500,
  "status": "passed"
});
formatter.after({
  "duration": 77737600,
  "status": "passed"
});
});