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
  "line": 55,
  "name": "validate Lupus section as \"Lupus\"",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "click on Enroll Today for Free button for lupus section and title as \"Enroll Today for Free\"",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "validate get the app page as \"Get The App - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "back to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "validate IBD section as \"IBD\"",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "click on Enroll Today for Free button for IBD section and title as \"Enroll Today for Free\"",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "validate get the app page as \"Get The App - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "back to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "validate IBS section as \"IBS\"",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "click on Enroll Today for Free button for IBS section and title as \"Enroll Today for Free\"",
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "validate get the app page as \"Get The App - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 68,
  "name": "back to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "validate diabetesone section as \"Diabetes Type 1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "click on Enroll Today for Free button for diabetesone section and title as \"Enroll Today for Free\"",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "validate get the app page as \"Get The App - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "back to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "validate diabetestwo section as \"Diabetes Type 2\"",
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "click on Enroll Today for Free button for diabetestwo section and title as \"Enroll Today for Free\"",
  "keyword": "Then "
});
formatter.step({
  "line": 77,
  "name": "validate get the app page as \"Get The App - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "back to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 80,
  "name": "validate hypertension section as \"Hypertension\"",
  "keyword": "Then "
});
formatter.step({
  "line": 81,
  "name": "click on Enroll Today for Free button for hypertension section and title as \"Enroll Today for Free\"",
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "validate get the app page as \"Get The App - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "back to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "validate prediabetes section as \"Prediabetes\"",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "click on Enroll Today for Free button for prediabetes section and title as \"Enroll Today for Free\"",
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "validate get the app page as \"Get The App - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "back to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "validate overweight section as \"Overweight / Obesity\"",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "click on Enroll Today for Free button for overweight section and title as \"Enroll Today for Free\"",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "validate get the app page as \"Get The App - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 93,
  "name": "back to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 95,
  "name": "validate cholesterol section as \"High Cholesterol\"",
  "keyword": "Then "
});
formatter.step({
  "line": 96,
  "name": "click on Enroll Today for Free button for cholesterol section and title as \"Enroll Today for Free\"",
  "keyword": "Then "
});
formatter.step({
  "line": 97,
  "name": "validate get the app page as \"Get The App - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "back to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "ChroniccareStepDef.click_on_chronic_care_menu()"
});
formatter.result({
  "duration": 2317589400,
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
  "duration": 9823199,
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
  "duration": 76628000,
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
  "duration": 58622201,
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
  "duration": 2877887500,
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
  "duration": 16103500,
  "status": "passed"
});
formatter.match({
  "location": "ChroniccareStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 331237200,
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
  "duration": 765609799,
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
  "duration": 34002200,
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
  "duration": 29479001,
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
  "duration": 97207000,
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
  "duration": 42456700,
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
  "duration": 51620101,
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
  "duration": 42466001,
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
  "duration": 743890899,
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
  "duration": 36446400,
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
  "duration": 726968500,
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
  "duration": 34330100,
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
  "duration": 684353700,
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
  "duration": 36891399,
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
  "duration": 27782201,
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
  "duration": 719139100,
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
  "duration": 33633000,
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
  "duration": 22619401,
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
  "duration": 704025500,
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
  "duration": 38045501,
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
  "duration": 709148301,
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
  "duration": 34329100,
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
  "duration": 857795500,
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
  "duration": 820263300,
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
  "duration": 9552000,
  "status": "passed"
});
formatter.match({
  "location": "ChroniccareStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 238744801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IBD",
      "offset": 25
    }
  ],
  "location": "ChroniccareStepDef.validate_IBD_section_as(String)"
});
formatter.result({
  "duration": 507467500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enroll Today for Free",
      "offset": 68
    }
  ],
  "location": "ChroniccareStepDef.click_on_Enroll_Today_for_Free_button_for_IBD_section_and_title_as(String)"
});
formatter.result({
  "duration": 1017803901,
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
  "duration": 9925301,
  "status": "passed"
});
formatter.match({
  "location": "ChroniccareStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 253498500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IBS",
      "offset": 25
    }
  ],
  "location": "ChroniccareStepDef.validate_IBS_section_as(String)"
});
formatter.result({
  "duration": 268881400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enroll Today for Free",
      "offset": 68
    }
  ],
  "location": "ChroniccareStepDef.click_on_Enroll_Today_for_Free_button_for_IBS_section_and_title_as(String)"
});
formatter.result({
  "duration": 876678301,
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
  "duration": 9930499,
  "status": "passed"
});
formatter.match({
  "location": "ChroniccareStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 298055301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Diabetes Type 1",
      "offset": 33
    }
  ],
  "location": "ChroniccareStepDef.validate_diabetesone_section_as(String)"
});
formatter.result({
  "duration": 1014816100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enroll Today for Free",
      "offset": 76
    }
  ],
  "location": "ChroniccareStepDef.click_on_Enroll_Today_for_Free_button_for_diabetesone_section_and_title_as(String)"
});
formatter.result({
  "duration": 1023409899,
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
  "duration": 32473000,
  "status": "passed"
});
formatter.match({
  "location": "ChroniccareStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 340925300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Diabetes Type 2",
      "offset": 33
    }
  ],
  "location": "ChroniccareStepDef.validate_diabetestwo_section_as(String)"
});
formatter.result({
  "duration": 374830600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enroll Today for Free",
      "offset": 76
    }
  ],
  "location": "ChroniccareStepDef.click_on_Enroll_Today_for_Free_button_for_diabetestwo_section_and_title_as(String)"
});
formatter.result({
  "duration": 1050839400,
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
  "duration": 17918000,
  "status": "passed"
});
formatter.match({
  "location": "ChroniccareStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 432305100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hypertension",
      "offset": 34
    }
  ],
  "location": "ChroniccareStepDef.validate_hypertension_section_as(String)"
});
formatter.result({
  "duration": 391884600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enroll Today for Free",
      "offset": 77
    }
  ],
  "location": "ChroniccareStepDef.click_on_Enroll_Today_for_Free_button_for_hypertension_section_and_title_as(String)"
});
formatter.result({
  "duration": 980274800,
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
  "duration": 31416700,
  "status": "passed"
});
formatter.match({
  "location": "ChroniccareStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 363430500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prediabetes",
      "offset": 33
    }
  ],
  "location": "ChroniccareStepDef.validate_prediabetes_section_as(String)"
});
formatter.result({
  "duration": 1123942700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enroll Today for Free",
      "offset": 76
    }
  ],
  "location": "ChroniccareStepDef.click_on_Enroll_Today_for_Free_button_for_prediabetes_section_and_title_as(String)"
});
formatter.result({
  "duration": 859391200,
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
  "duration": 22688000,
  "status": "passed"
});
formatter.match({
  "location": "ChroniccareStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 244597200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Overweight / Obesity",
      "offset": 32
    }
  ],
  "location": "ChroniccareStepDef.validate_overweight_section_as(String)"
});
formatter.result({
  "duration": 287964700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enroll Today for Free",
      "offset": 75
    }
  ],
  "location": "ChroniccareStepDef.click_on_Enroll_Today_for_Free_button_for_overweight_section_and_title_as(String)"
});
formatter.result({
  "duration": 824511499,
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
  "duration": 11057999,
  "status": "passed"
});
formatter.match({
  "location": "ChroniccareStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 232963100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "High Cholesterol",
      "offset": 33
    }
  ],
  "location": "ChroniccareStepDef.validate_cholesterol_section_as(String)"
});
formatter.result({
  "duration": 301931201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enroll Today for Free",
      "offset": 76
    }
  ],
  "location": "ChroniccareStepDef.click_on_Enroll_Today_for_Free_button_for_cholesterol_section_and_title_as(String)"
});
formatter.result({
  "duration": 869632600,
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
  "duration": 11966600,
  "status": "passed"
});
formatter.match({
  "location": "ChroniccareStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 265302599,
  "status": "passed"
});
});