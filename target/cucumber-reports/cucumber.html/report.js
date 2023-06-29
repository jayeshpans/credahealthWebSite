$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/features/Chroniccare.feature");
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
      "value": "#Feature: chronic care us pages"
    },
    {
      "line": 4,
      "value": "#Scenario: validate chronic care page on web site"
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
  "line": 10,
  "name": "Validate chronic care page",
  "description": "As a user of KYM App\r\nI should be able to see chronic care page",
  "id": "validate-chronic-care-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 14,
  "name": "Open a chronic care page and validate it\u0027s text",
  "description": "",
  "id": "validate-chronic-care-page;open-a-chronic-care-page-and-validate-it\u0027s-text",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "click on chronic care menu",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "validate chronic care page title as \"Chronic Care - CredaHealth\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "validate chronic care pages title as \"Creda App\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "validate chronic care sub title as \"Take Back Your Life\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "validate download app button and display title as \"Download App\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "validate get the app page as \"Get The App - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "back to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "validate condition sec title as \"Chronic Condition Management\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "validate condition sec sub title as \"Track vitals, diet, medications and symptoms easily on the go. Got questions? Your Creda Care Crew is waiting with answers.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "validate condition sec quote as \"The measure of who we are is what we do with what we have.”\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "valdate big pic title as \"The Big Picture\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "validate big pic desc as \"You deserve personalized care that is realistic, simplified, and holistic. At Creda, we offer next-level communication between patient and provider for a healthier you. Take control of your health and manage your condition like never before. It’s easier than ever to get started.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "validate real export title as \"Real Support from Real Experts\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "validate real export desc as \"Living with a chronic disease is overwhelming and   emotionally draining. Who has time to track symptoms and vitals, remember to take medications, plan diet and exercise, and take proactive steps to prevent progression? Well, we do. We make it easier to tackle day-to-day challenges. Learn the foundational behaviors critical for good health.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "validate wholesome title as \"Savor a Wholesome Solution\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "validate wholesome desc as \"With our holistic approach combining science and technology, we help you live your best life, keeping your condition in check with a seamless continuum of care and real, measurable results.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ChroniccareStepDef.click_on_chronic_care_menu()"
});
formatter.result({
  "duration": 2353400200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chronic Care - CredaHealth",
      "offset": 37
    }
  ],
  "location": "IndividualStepDef.validate_chronic_care_page_title_as(String)"
});
formatter.result({
  "duration": 14337400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Creda App",
      "offset": 38
    }
  ],
  "location": "ChroniccareStepDef.validate_chronic_care_pages_title_as(String)"
});
formatter.result({
  "duration": 143348800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Take Back Your Life",
      "offset": 36
    }
  ],
  "location": "ChroniccareStepDef.validate_chronic_care_sub_title_as(String)"
});
formatter.result({
  "duration": 38694900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Download App",
      "offset": 51
    }
  ],
  "location": "ChroniccareStepDef.validate_download_app_button_and_display_title_as(String)"
});
formatter.result({
  "duration": 1650386300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Get The App - CredaHealth",
      "offset": 30
    }
  ],
  "location": "ChroniccareStepDef.validate_get_the_app_page_as(String)"
});
formatter.result({
  "duration": 48310800,
  "status": "passed"
});
formatter.match({
  "location": "ChroniccareStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 295712600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chronic Condition Management",
      "offset": 33
    }
  ],
  "location": "ChroniccareStepDef.validate_condition_sec_title_as(String)"
});
formatter.result({
  "duration": 747501300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Track vitals, diet, medications and symptoms easily on the go. Got questions? Your Creda Care Crew is waiting with answers.",
      "offset": 37
    }
  ],
  "location": "ChroniccareStepDef.validate_condition_sec_sub_title_as(String)"
});
formatter.result({
  "duration": 42446500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The measure of who we are is what we do with what we have.”",
      "offset": 33
    }
  ],
  "location": "ChroniccareStepDef.validate_condition_sec_quote_as(String)"
});
formatter.result({
  "duration": 48007900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The Big Picture",
      "offset": 26
    }
  ],
  "location": "ChroniccareStepDef.valdate_big_pic_title_as(String)"
});
formatter.result({
  "duration": 50429400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You deserve personalized care that is realistic, simplified, and holistic. At Creda, we offer next-level communication between patient and provider for a healthier you. Take control of your health and manage your condition like never before. It’s easier than ever to get started.",
      "offset": 26
    }
  ],
  "location": "ChroniccareStepDef.validate_big_pic_desc_as(String)"
});
formatter.result({
  "duration": 46573000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Real Support from Real Experts",
      "offset": 31
    }
  ],
  "location": "ChroniccareStepDef.validate_real_export_title_as(String)"
});
formatter.result({
  "duration": 40325600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Living with a chronic disease is overwhelming and   emotionally draining. Who has time to track symptoms and vitals, remember to take medications, plan diet and exercise, and take proactive steps to prevent progression? Well, we do. We make it easier to tackle day-to-day challenges. Learn the foundational behaviors critical for good health.",
      "offset": 30
    }
  ],
  "location": "ChroniccareStepDef.validate_real_export_desc_as(String)"
});
formatter.result({
  "duration": 44848000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Savor a Wholesome Solution",
      "offset": 29
    }
  ],
  "location": "ChroniccareStepDef.validate_wholesome_title_as(String)"
});
formatter.result({
  "duration": 46346000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "With our holistic approach combining science and technology, we help you live your best life, keeping your condition in check with a seamless continuum of care and real, measurable results.",
      "offset": 28
    }
  ],
  "location": "ChroniccareStepDef.validate_wholesome_desc_as(String)"
});
formatter.result({
  "duration": 46221800,
  "status": "passed"
});
});