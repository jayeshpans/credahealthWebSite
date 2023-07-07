$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/features/ContactUs.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Jayesh"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: contact Us us pages"
    },
    {
      "line": 4,
      "value": "#Scenario: validate contact us page on web site"
    },
    {
      "line": 5,
      "value": "#Given:"
    },
    {
      "line": 6,
      "value": "#When:"
    },
    {
      "line": 7,
      "value": "#Then:"
    },
    {
      "line": 8,
      "value": "#And,But:"
    }
  ],
  "line": 11,
  "name": "Validate contact us page",
  "description": "As a user of KYM App\r\nI should be able to see contact us page",
  "id": "validate-contact-us-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 15,
  "name": "Open a contact us page and validate it\u0027s text",
  "description": "",
  "id": "validate-contact-us-page;open-a-contact-us-page-and-validate-it\u0027s-text",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "click on contact us menu",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "validate page title as \"Contact Us - CredaHealth\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "validate contact Us page title as \"Contact\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "validate contact us desc as \"A chronic condition management app that solves all your healthcare challenges.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "validate get touch title as \"Get In Touch\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "validate get touch desc as \"Delivering world class health care\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "validate USA address as \"1 Central Street, #884 Norwood, MA 02062\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "validate USA email addess as \"info@credahealth.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "validate india address as \"Survey #1156, Shukrawar Peth, Pune, 411002\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "validate contact us form \"Your name\" and \"Your email\" and \"Subject\" and \"Your message (optional)\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Enter invalid input for Your name as \"Test\"",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Enter invalid input for Your email as \"Your email\"",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Enter invalid input for Subject as \"test\"",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Enter invalid input for Your message as \"test test\"",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "display an error message as \"One or more fields have an error. Please check and try again.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsStepDef.click_on_contact_us_menu()"
});
formatter.result({
  "duration": 2006760900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact Us - CredaHealth",
      "offset": 24
    }
  ],
  "location": "IndividualStepDef.validate_page_title_as(String)"
});
formatter.result({
  "duration": 16347100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact",
      "offset": 35
    }
  ],
  "location": "ContactUsStepDef.validate_contact_Us_page_title_as(String)"
});
formatter.result({
  "duration": 42530500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A chronic condition management app that solves all your healthcare challenges.",
      "offset": 29
    }
  ],
  "location": "ContactUsStepDef.validate_contact_us_desc_as(String)"
});
formatter.result({
  "duration": 56504400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Get In Touch",
      "offset": 29
    }
  ],
  "location": "ContactUsStepDef.validate_get_touch_title_as(String)"
});
formatter.result({
  "duration": 998345100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Delivering world class health care",
      "offset": 28
    }
  ],
  "location": "ContactUsStepDef.validate_get_touch_desc_as(String)"
});
formatter.result({
  "duration": 36710900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Central Street, #884 Norwood, MA 02062",
      "offset": 25
    }
  ],
  "location": "ContactUsStepDef.validate_USA_address_as(String)"
});
formatter.result({
  "duration": 34980800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "info@credahealth.com",
      "offset": 30
    }
  ],
  "location": "ContactUsStepDef.validate_USA_email_addess_as(String)"
});
formatter.result({
  "duration": 1451253700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Survey #1156, Shukrawar Peth, Pune, 411002",
      "offset": 27
    }
  ],
  "location": "ContactUsStepDef.validate_india_address_as(String)"
});
formatter.result({
  "duration": 28453700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your name",
      "offset": 26
    },
    {
      "val": "Your email",
      "offset": 42
    },
    {
      "val": "Subject",
      "offset": 59
    },
    {
      "val": "Your message (optional)",
      "offset": 73
    }
  ],
  "location": "ContactUsStepDef.validate_contact_us_form_and_and_and(String,String,String,String)"
});
formatter.result({
  "duration": 127877000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 38
    }
  ],
  "location": "ContactUsStepDef.enter_invalid_input_for_Your_name_as(String)"
});
formatter.result({
  "duration": 107696600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your email",
      "offset": 39
    }
  ],
  "location": "ContactUsStepDef.enter_invalid_input_for_Your_email_as(String)"
});
formatter.result({
  "duration": 93123900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 36
    }
  ],
  "location": "ContactUsStepDef.enter_invalid_input_for_Subject_as(String)"
});
formatter.result({
  "duration": 97236900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test test",
      "offset": 41
    }
  ],
  "location": "ContactUsStepDef.enter_invalid_input_for_Your_message_as(String)"
});
formatter.result({
  "duration": 87781200,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsStepDef.click_on_submit_button()"
});
formatter.result({
  "duration": 99071600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "One or more fields have an error. Please check and try again.",
      "offset": 29
    }
  ],
  "location": "ContactUsStepDef.display_an_error_message_as(String)"
});
formatter.result({
  "duration": 406318900,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "validate contact us page with invalid input",
  "description": "",
  "id": "validate-contact-us-page;validate-contact-us-page-with-invalid-input",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "contact us form available \"Your name\" and \"Your email\" and \"Subject\" and \"Your message (optional)\"",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Enter invalid input for Your name as \"Test\"",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "Enter invalid input for Your email as \"Your email\"",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "Enter invalid input for Subject as \"test\"",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Enter invalid input for Your message as \"test test\"",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "display an error message as \"One or more fields have an error. Please check and try again.\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 38
    }
  ],
  "location": "ContactUsStepDef.enter_invalid_input_for_Your_name_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Your email",
      "offset": 39
    }
  ],
  "location": "ContactUsStepDef.enter_invalid_input_for_Your_email_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 36
    }
  ],
  "location": "ContactUsStepDef.enter_invalid_input_for_Subject_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "test test",
      "offset": 41
    }
  ],
  "location": "ContactUsStepDef.enter_invalid_input_for_Your_message_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ContactUsStepDef.click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "One or more fields have an error. Please check and try again.",
      "offset": 29
    }
  ],
  "location": "ContactUsStepDef.display_an_error_message_as(String)"
});
formatter.result({
  "status": "skipped"
});
});