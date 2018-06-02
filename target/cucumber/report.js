$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("newcontactus.feature");
formatter.feature({
  "line": 2,
  "name": "Submit data to webdriveruniveristy.com using contact us form",
  "description": "",
  "id": "submit-data-to-webdriveruniveristy.com-using-contact-us-form",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@newFramework1"
    }
  ]
});
formatter.before({
  "duration": 3684266488,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Submit valid data via contact us form",
  "description": "",
  "id": "submit-data-to-webdriveruniveristy.com-using-contact-us-form;submit-valid-data-via-contact-us-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I access webdriveruniversity contact us form",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter a valid firstname",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter a valided last name",
  "rows": [
    {
      "cells": [
        "woods",
        "jackson",
        "jones"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "i enter a valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "i enter comments",
  "rows": [
    {
      "cells": [
        "example comment one",
        "example comment two"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "i click on the submit button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the information should be successfully submitted via the contact us form",
  "keyword": "Then "
});
formatter.match({
  "location": "NewContactUsSteps.i_access_webdriveruniversity_contact_us_form()"
});
formatter.result({
  "duration": 959878342,
  "status": "passed"
});
formatter.match({
  "location": "NewContactUsSteps.i_enter_a_valid_firstname()"
});
formatter.result({
  "duration": 137322049,
  "status": "passed"
});
formatter.match({
  "location": "NewContactUsSteps.i_enter_a_valid_last_name(DataTable)"
});
formatter.result({
  "duration": 124887152,
  "status": "passed"
});
formatter.match({
  "location": "NewContactUsSteps.i_enter_a_valid_email_address()"
});
formatter.result({
  "duration": 158753786,
  "status": "passed"
});
formatter.match({
  "location": "NewContactUsSteps.i_enter_comments(DataTable)"
});
formatter.result({
  "duration": 138855623,
  "status": "passed"
});
formatter.match({
  "location": "NewContactUsSteps.i_click_on_the_submit_button()"
});
formatter.result({
  "duration": 879706784,
  "status": "passed"
});
formatter.match({
  "location": "NewContactUsSteps.the_information_should_be_successfully_submitted_via_the_contact_us_form()"
});
formatter.result({
  "duration": 98106087,
  "status": "passed"
});
formatter.after({
  "duration": 805008674,
  "status": "passed"
});
formatter.uri("products.feature");
formatter.feature({
  "line": 1,
  "name": "Products page",
  "description": "",
  "id": "products-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "validate promo code alert is visible when clicking on the special offers link",
  "description": "",
  "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@newFramework1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user navigates to \"\u003curl\u003e\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on \"\u003cbutton\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be presented with a promo alert",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;",
  "rows": [
    {
      "cells": [
        "url",
        "button"
      ],
      "line": 10,
      "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;;1"
    },
    {
      "cells": [
        "http://www.webdriveruniversity.com/Page-Object-Model/products.html",
        "#container-special-offers"
      ],
      "line": 11,
      "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3090889124,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "validate promo code alert is visible when clicking on the special offers link",
  "description": "",
  "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@newFramework1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user navigates to \"http://www.webdriveruniversity.com/Page-Object-Model/products.html\" website",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on \"#container-special-offers\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be presented with a promo alert",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.webdriveruniversity.com/Page-Object-Model/products.html",
      "offset": 19
    }
  ],
  "location": "ProductSteps.user_navigates_to_website(String)"
});
formatter.result({
  "duration": 1474924146,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "#container-special-offers",
      "offset": 16
    }
  ],
  "location": "ProductSteps.user_clicks_on(String)"
});
formatter.result({
  "duration": 116844008,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.user_should_be_presented_with_a_promo_alert()"
});
formatter.result({
  "duration": 710987916,
  "status": "passed"
});
formatter.after({
  "duration": 729930444,
  "status": "passed"
});
});