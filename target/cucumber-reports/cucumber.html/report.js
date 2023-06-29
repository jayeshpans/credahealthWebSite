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
formatter.step({
  "line": 35,
  "name": "validate journey section title as \"Understanding You And Your Journey:\"",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "validate journey section desc as \"We understand your health profile, including all the modifiable risk factors you may ave that can increase your risk of health problems and complications.\"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 37,
      "value": "#    Then validte journey background image as \"\""
    }
  ],
  "line": 39,
  "name": "validate approach section as \"Personalizing The Approach To You\"",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "validate approach sub section desc as \"We customize the app features to guide you to achieve your health goals.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "validate approach sub desc as \"You can start tracking vitals, medications, food, and exercise along with access to content like articles, factsheets and videos personalized to your concerns.\"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 42,
      "value": "#    Then validate approach background image as \"\""
    }
  ],
  "line": 44,
  "name": "validate collaborative section title as \"Building Continuous, Coordinated, Collaborative Care\"",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "validate collaborative section sub title as \"You are assigned a care team comprising of nutrition and health experts who help you set realistic and achievable health goals.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "validate collaborative section desc as \"They customize their support to your health needs, hand hold you, and tweak your program as they become more familiar with your lifestyle through continuous communication andmonitoring all the metrics you track in the app. The digital health assistant also provides mindful nudges and insights into your health and habits.\"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 47,
      "value": "#    Then validate collaboractive background image as \"\""
    }
  ],
  "line": 49,
  "name": "validate progress section title as \"Evaluating Your Progress/Putting Together The Big Picture\"",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "validate progress section desc as \"Through regular check-ins and health related questionnaires on your symptoms and disease we ensure that you stay on top of any onset of complications or disease progression. Weekly health reports that include metrics on your medication adherence, symptoms, food with macro and micro nutrients, vitals, and exercise along with a care team reviewing all of this in the backend, we enable you, your physician, and us to connect the dots so that you can take proactive steps to prevent complications.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "validate what we care title as \"What We Care For\"",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "validate what we care sub title as \"Making professional therapy accessible\"",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "validate Lupus section as \"Lupus\"",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "click on Enroll Today for Free button for lupus section and title as \"Enroll Today for Free\"",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "validate get the app page as \"Get The App - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "back to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "ChroniccareStepDef.click_on_chronic_care_menu()"
});
formatter.result({
  "duration": 2196218700,
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
  "duration": 13051800,
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
  "duration": 82448900,
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
  "duration": 42616000,
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
  "duration": 1986016500,
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
  "duration": 52847500,
  "status": "passed"
});
formatter.match({
  "location": "ChroniccareStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 272785200,
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
  "duration": 806622400,
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
  "duration": 31098600,
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
  "duration": 29672000,
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
  "duration": 31154900,
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
  "duration": 31843300,
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
  "duration": 29129800,
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
  "duration": 31031400,
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
  "duration": 774614300,
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
  "duration": 76305000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Understanding You And Your Journey:",
      "offset": 35
    }
  ],
  "location": "ChroniccareStepDef.validate_journey_section_title_as(String)"
});
formatter.result({
  "duration": 751457800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "We understand your health profile, including all the modifiable risk factors you may ave that can increase your risk of health problems and complications.",
      "offset": 34
    }
  ],
  "location": "ChroniccareStepDef.validate_journey_section_desc_as(String)"
});
formatter.result({
  "duration": 46090200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Personalizing The Approach To You",
      "offset": 30
    }
  ],
  "location": "ChroniccareStepDef.validate_approach_section_as(String)"
});
formatter.result({
  "duration": 711896200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "We customize the app features to guide you to achieve your health goals.",
      "offset": 39
    }
  ],
  "location": "ChroniccareStepDef.validate_approach_sub_section_desc_as(String)"
});
formatter.result({
  "duration": 35255900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You can start tracking vitals, medications, food, and exercise along with access to content like articles, factsheets and videos personalized to your concerns.",
      "offset": 31
    }
  ],
  "location": "ChroniccareStepDef.validate_approach_sub_desc_as(String)"
});
formatter.result({
  "duration": 26717300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Building Continuous, Coordinated, Collaborative Care",
      "offset": 41
    }
  ],
  "location": "ChroniccareStepDef.validate_collaborative_section_title_as(String)"
});
formatter.result({
  "duration": 714918500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You are assigned a care team comprising of nutrition and health experts who help you set realistic and achievable health goals.",
      "offset": 45
    }
  ],
  "location": "ChroniccareStepDef.validate_collaborative_section_sub_title_as(String)"
});
formatter.result({
  "duration": 35704400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "They customize their support to your health needs, hand hold you, and tweak your program as they become more familiar with your lifestyle through continuous communication andmonitoring all the metrics you track in the app. The digital health assistant also provides mindful nudges and insights into your health and habits.",
      "offset": 40
    }
  ],
  "location": "ChroniccareStepDef.validate_collaborative_section_desc_as(String)"
});
formatter.result({
  "duration": 25287300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Evaluating Your Progress/Putting Together The Big Picture",
      "offset": 36
    }
  ],
  "location": "ChroniccareStepDef.validate_progress_section_title_as(String)"
});
formatter.result({
  "duration": 690919400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Through regular check-ins and health related questionnaires on your symptoms and disease we ensure that you stay on top of any onset of complications or disease progression. Weekly health reports that include metrics on your medication adherence, symptoms, food with macro and micro nutrients, vitals, and exercise along with a care team reviewing all of this in the backend, we enable you, your physician, and us to connect the dots so that you can take proactive steps to prevent complications.",
      "offset": 35
    }
  ],
  "location": "ChroniccareStepDef.validate_progress_section_desc_as(String)"
});
formatter.result({
  "duration": 33366000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "What We Care For",
      "offset": 32
    }
  ],
  "location": "ChroniccareStepDef.validate_what_we_care_title_as(String)"
});
formatter.result({
  "duration": 704047500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Making professional therapy accessible",
      "offset": 36
    }
  ],
  "location": "ChroniccareStepDef.validate_what_we_care_sub_title_as(String)"
});
formatter.result({
  "duration": 33184200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lupus",
      "offset": 27
    }
  ],
  "location": "ChroniccareStepDef.validate_Lupus_section_as(String)"
});
formatter.result({
  "duration": 703620800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enroll Today for Free",
      "offset": 70
    }
  ],
  "location": "ChroniccareStepDef.click_on_Enroll_Today_for_Free_button_for_lupus_section_and_title_as(String)"
});
formatter.result({
  "duration": 858028400,
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
  "duration": 34829300,
  "status": "passed"
});
formatter.match({
  "location": "ChroniccareStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 217635700,
  "status": "passed"
});
});