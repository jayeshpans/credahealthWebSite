$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
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
      "value": "#Feature: home us pages"
    },
    {
      "line": 4,
      "value": "#Scenario: validate home page on web site"
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
  "name": "Validate home page",
  "description": "As a user of KYM App\r\nI should be able to see home page",
  "id": "validate-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 14,
  "name": "Open a home page",
  "description": "",
  "id": "validate-home-page;open-a-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Browse credaHealth web site",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "display home page title as \"Digital Health Engagement - CredaHealth\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomeStepDef.browse_credaHealth_web_site()"
});
formatter.result({
  "duration": 83476500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Health Engagement - CredaHealth",
      "offset": 28
    }
  ],
  "location": "HomeStepDef.display_home_page_title_as(String)"
});
formatter.result({
  "duration": 37847600,
  "status": "passed"
});
formatter.uri("Providers.feature");
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
      "value": "#Feature: providers us pages"
    },
    {
      "line": 4,
      "value": "#Scenario: validate providers page on web site"
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
  "name": "Validate providers page",
  "description": "As a user of KYM App\r\nI should be able to see provider page",
  "id": "validate-providers-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 14,
  "name": "Open a provider page and validate it\u0027s text",
  "description": "",
  "id": "validate-providers-page;open-a-provider-page-and-validate-it\u0027s-text",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "click on provider menu",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "validate clinics page \"Clinics - CredaHealth\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "validate Patient Communication section as \"Powerful Patient Communication at Scale\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "validate Patient Communication section img as \"https://credahealth.com/wp-content/uploads/2023/04/B2B-CREDA-1.png\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "validate patient engagement section as \"Automate patient engagement so you can focus on patient care\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "validate patient engagement menus as \"Colonoscopy\" and \"Sigmoidoscopy\" and \"Upper Endoscopy\" and \"Hemorrhoid\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "validate awareness section as \"Lack of Awareness Impact on Delays and Cancellation\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "validate awareness descone as \"Apprx. 30% of patient no- shows cost the healthcare industry $150 billion a year.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "validate awareness dessec as \"No-shows and late cancellations can have a greater impact on GI practices than in other medical specialties due to the prep time required for the GI procedures. For a primary care physician, each missed appointment equals roughly $150-$200 in lost revenue. For surgeons, this is closer to $500.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "validate awareness descThrid as \"Automatically triggering the right communication at the right time, Creda Health’s Patient Engagement Platform guides your patients through a premium care experience.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "validate awareness img as \"https://credahealth.com/wp-content/uploads/2023/04/Untitled-design-49-640x537.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProviderStepDef.click_on_provider_menu()"
});
formatter.result({
  "duration": 2474473100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Clinics - CredaHealth",
      "offset": 23
    }
  ],
  "location": "HomeStepDef.validate_clinics_page(String)"
});
formatter.result({
  "duration": 16146300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Powerful Patient Communication at Scale",
      "offset": 43
    }
  ],
  "location": "ProviderStepDef.validate_Patient_Communication_section_as(String)"
});
formatter.result({
  "duration": 58906300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://credahealth.com/wp-content/uploads/2023/04/B2B-CREDA-1.png",
      "offset": 47
    }
  ],
  "location": "ProviderStepDef.validate_Patient_Communication_section_img_as(String)"
});
formatter.result({
  "duration": 90786000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automate patient engagement so you can focus on patient care",
      "offset": 40
    }
  ],
  "location": "ProviderStepDef.validate_patient_engagement_section_as(String)"
});
formatter.result({
  "duration": 768429700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Colonoscopy",
      "offset": 38
    },
    {
      "val": "Sigmoidoscopy",
      "offset": 56
    },
    {
      "val": "Upper Endoscopy",
      "offset": 76
    },
    {
      "val": "Hemorrhoid",
      "offset": 98
    }
  ],
  "location": "ProviderStepDef.validate_patient_engagement_menus_as_and_and_and(String,String,String,String)"
});
formatter.result({
  "duration": 1176115700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lack of Awareness Impact on Delays and Cancellation",
      "offset": 31
    }
  ],
  "location": "ProviderStepDef.validate_awareness_section_as(String)"
});
formatter.result({
  "duration": 700844000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apprx. 30% of patient no- shows cost the healthcare industry $150 billion a year.",
      "offset": 31
    }
  ],
  "location": "ProviderStepDef.validate_awareness_descone_as(String)"
});
formatter.result({
  "duration": 32563900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No-shows and late cancellations can have a greater impact on GI practices than in other medical specialties due to the prep time required for the GI procedures. For a primary care physician, each missed appointment equals roughly $150-$200 in lost revenue. For surgeons, this is closer to $500.",
      "offset": 30
    }
  ],
  "location": "ProviderStepDef.validate_awareness_dessec_as(String)"
});
formatter.result({
  "duration": 30285700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automatically triggering the right communication at the right time, Creda Health’s Patient Engagement Platform guides your patients through a premium care experience.",
      "offset": 33
    }
  ],
  "location": "ProviderStepDef.validate_awareness_descThrid_as(String)"
});
formatter.result({
  "duration": 31692500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://credahealth.com/wp-content/uploads/2023/04/Untitled-design-49-640x537.png",
      "offset": 27
    }
  ],
  "location": "ProviderStepDef.validate_awareness_img_as(String)"
});
formatter.result({
  "duration": 48032300,
  "status": "passed"
});
});