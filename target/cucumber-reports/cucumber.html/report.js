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
  "duration": 119406400,
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
  "duration": 44298900,
  "status": "passed"
});
formatter.uri("Individual.feature");
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
      "value": "#Scenario: validate individual page on web site"
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
  "name": "Validate individual page",
  "description": "As a user of KYM App\r\nI should be able to see individual page",
  "id": "validate-individual-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 14,
  "name": "Open a individual page and validate it\u0027s text",
  "description": "",
  "id": "validate-individual-page;open-a-individual-page-and-validate-it\u0027s-text",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "click on individual menu",
  "keyword": "Given "
});
formatter.match({
  "location": "IndividualStepDef.click_on_individual_menu()"
});
formatter.result({
  "duration": 1131971600,
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
  "comments": [
    {
      "line": 21,
      "value": "# Then validate patient engagement menus as \"Colonoscopy\" and \"Sigmoidoscopy\" and \"Upper Endoscopy\" and \"Hemorrhoid\""
    }
  ],
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
formatter.step({
  "line": 29,
  "name": "validate reinforced education title as \"Studies show the impact of reinforced education by telephone or short message service (SMS) leads to:\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "validate reinforced education secone as \"Reduction in same- day cancellations\"",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "validate reinforced education secsecond as \"Reduction in no- shows\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "validate end to end patient title as \"End-to-end patient engagement platform made for the enterprise.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "validate end to end patient img as \"https://credahealth.com/wp-content/uploads/2021/09/What-Are-the-Possible-Complications-of-Crohns-Disease.jpg\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "click on more details button",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "validate contact us page \"Contact Us - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Back to home pageLogo",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "validate interact with section as \"Let us transform the way you interact with and educate your patients\"",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "validate comprehensive section as \"Comprehensive platform of solutions\"",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "validate comprehensive subsection as \"Design patient engagement strategy.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "validate Customizable section as \"Customizable content\"",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "validate Customizable subsection as \"Proven modules tailored to your patient needs.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "validate Scalable section as \"Scalable platform\"",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "validate Scalable subsection as \"Handle a growing no. of users. Quickly and easily provision additional computing and storage resources on demand.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "validate Actionable section as \"Actionable reporting\"",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "validate Actionable subsection as \"Identify areas for improvement and make data-driven decisions to optimize patient satisfaction.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "validate Wondering section \"Wondering if Creda is Fit for you\"",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "validate Wondering sub section \"Learn How our flexible platform brings value to different types of the healthcare organization.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "click on See Who We Help button title as \"See Who We Help\"",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "validate contact us page \"Contact Us - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "Back to home pageLogo",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "validate question title section as \"Do your patients have questions about their procedures?\"",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "validate question descriptionone as \"Our educational materials explain patient’s GI condition and how it can be managed.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "validate question descriptiontwo as  \"Well-informed patient can significantly reduce your costs due to last minute cancellations.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "validate question descriptionthree as  \"We aim for easing the process involved in prepping \u0026 to achieve a successful procedure.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "validate case study title as \"Case Study\"",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "validate case study description as \"The “Center for Advanced GI” is a Group Gastroenterology Practice in Central Florida specializing in Gastrointestinal, Diseases and liver disease. The clinic provides GI Consultations and Diagnostic Procedures for the Upper and Lower Gastrointestinal. Tract and the liver, such as Colonoscopy, Colon Screening, Upper Endoscopy, Capsule Endoscopy, Destruction of Internal Hemorrhoids, and Liver Biopsy.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "validate implement engagement title as \"Our Ready to Implement Engagement Modules\"",
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "validate implement engagement desc as \"At Creda, we are changing patient-centered care outside of traditional settings by empowering your patients with the right information at the right time. We provide patient friendly and timely instructions and reminders.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "validate preprocedure title as \"PRE- PROCEDURE PREP\"",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "validate preprocedure desc as \"Improve the patient experience and ensure that patients are well-informed and prepared for their procedure with clear day-wise instructions.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "click on enqurire now demo button and title is \"Enquire For Demo\"",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "validate contact us page \"Contact Us - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "Back to home pageLogo",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "validate postprocedure title as \"POST- PROCEDURE CARE\"",
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "validate postprocedure desc as \"Designed to provide patients with the necessary information and support to ensure a smooth recovery and minimize the risk of complications following their procedure.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 77,
  "name": "click on enqurire now demo button and title is \"Enquire For Demo\"",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "validate contact us page \"Contact Us - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "Back to home pageLogo",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "validate healthcare landscape section title as \"We work hard to fill the gaps in your healthcare landscape.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "validate healthcare landscape sub title as \"90% Rattings\"",
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "validate healthcare landscape secone desc as \"90% of patients surveyed said they were pleased with our educational emails about their procedure.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "validate healthcare landscape secsecond as \"90% of clinic staff surveyed said they were pleased with the patient turnaround and their preparedness.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "validate work systems title as \"See How We Work With your Systems\"",
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "validate work system desc as \"Looking to get started? Take the first steps towards discovering just how we can amplify the value of your existing technology.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "click on Talk To Experts btn and validate title as \"Talk To Experts\"",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "validate contact us page \"Contact Us - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "Back to home pageLogo",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "click on Become a Partner btn and validate title as \"Become a Partner\"",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "validate contact us page \"Contact Us - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 93,
  "name": "Back to home pageLogo",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "validate creda clinice title as \"Creda for Clinics\"",
  "keyword": "Then "
});
formatter.step({
  "line": 96,
  "name": "validate creda clinice sub title as \"Creda Health’s “Patient Engagement solution” provides GI clinics with a comprehensive solution for engaging patients throughout their healthcare journey.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 97,
  "name": "validate creda clinics desc one as \"Creda offers a suite of services that include patient education, reminder notifications, and personalized communication modules. The ultimate goal is to improve patient outcomes by helping patients become more involved in their own care and treatment, leading to better adherence to treatment plans, improved health outcomes, reduced healthcare costs.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "validate creda clinics desc two as \"Creda also provides analytics and reports that allow healthcare organizations to track patient engagement and monitor their progress. These services help clinics build better relationships with their patients, leading to increased trust and satisfaction.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 99,
  "name": "Click on contact us btn and validate text as \"Contact Us\"",
  "keyword": "Then "
});
formatter.step({
  "line": 100,
  "name": "validate contact us page \"Contact Us - CredaHealth\"",
  "keyword": "Then "
});
formatter.step({
  "line": 101,
  "name": "Back to home pageLogo",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderStepDef.click_on_provider_menu()"
});
formatter.result({
  "duration": 2594725500,
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
  "duration": 18766200,
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
  "duration": 58725200,
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
  "duration": 45823200,
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
  "duration": 787126000,
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
  "duration": 712572500,
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
  "duration": 29891700,
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
  "duration": 29363000,
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
  "duration": 30906900,
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
  "duration": 46550400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Studies show the impact of reinforced education by telephone or short message service (SMS) leads to:",
      "offset": 40
    }
  ],
  "location": "ProviderStepDef.validate_reinforced_education_title_as(String)"
});
formatter.result({
  "duration": 712806200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reduction in same- day cancellations",
      "offset": 41
    }
  ],
  "location": "ProviderStepDef.validate_reinforced_education_secone_as(String)"
});
formatter.result({
  "duration": 697200300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reduction in no- shows",
      "offset": 44
    }
  ],
  "location": "ProviderStepDef.validate_reinforced_education_secsecond_as(String)"
});
formatter.result({
  "duration": 33622200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "End-to-end patient engagement platform made for the enterprise.",
      "offset": 38
    }
  ],
  "location": "ProviderStepDef.validate_end_to_end_patient_title_as(String)"
});
formatter.result({
  "duration": 698346700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://credahealth.com/wp-content/uploads/2021/09/What-Are-the-Possible-Complications-of-Crohns-Disease.jpg",
      "offset": 36
    }
  ],
  "location": "ProviderStepDef.validate_end_to_end_patient_img_as(String)"
});
formatter.result({
  "duration": 33794200,
  "status": "passed"
});
formatter.match({
  "location": "ProviderStepDef.click_on_more_details_button()"
});
formatter.result({
  "duration": 2507901700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact Us - CredaHealth",
      "offset": 26
    }
  ],
  "location": "HomeStepDef.validate_contact_us_page(String)"
});
formatter.result({
  "duration": 9866600,
  "status": "passed"
});
formatter.match({
  "location": "ProviderStepDef.back_to_home_pageLogo()"
});
formatter.result({
  "duration": 5256737600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Let us transform the way you interact with and educate your patients",
      "offset": 35
    }
  ],
  "location": "ProviderStepDef.validate_interact_with_section_as(String)"
});
formatter.result({
  "duration": 716935400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Comprehensive platform of solutions",
      "offset": 35
    }
  ],
  "location": "ProviderStepDef.validate_comprehensive_section_as(String)"
});
formatter.result({
  "duration": 739686800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Design patient engagement strategy.",
      "offset": 38
    }
  ],
  "location": "ProviderStepDef.validate_comprehensive_subsection_as(String)"
});
formatter.result({
  "duration": 31971600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customizable content",
      "offset": 34
    }
  ],
  "location": "ProviderStepDef.validate_Customizable_section_as(String)"
});
formatter.result({
  "duration": 32272600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Proven modules tailored to your patient needs.",
      "offset": 37
    }
  ],
  "location": "ProviderStepDef.validate_Customizable_subsection_as(String)"
});
formatter.result({
  "duration": 29807000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Scalable platform",
      "offset": 30
    }
  ],
  "location": "ProviderStepDef.validate_Scalable_section_as(String)"
});
formatter.result({
  "duration": 31685700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Handle a growing no. of users. Quickly and easily provision additional computing and storage resources on demand.",
      "offset": 33
    }
  ],
  "location": "ProviderStepDef.validate_Scalable_subsection_as(String)"
});
formatter.result({
  "duration": 35308400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Actionable reporting",
      "offset": 32
    }
  ],
  "location": "ProviderStepDef.validate_Actionable_section_as(String)"
});
formatter.result({
  "duration": 29731800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Identify areas for improvement and make data-driven decisions to optimize patient satisfaction.",
      "offset": 35
    }
  ],
  "location": "ProviderStepDef.validate_Actionable_subsection_as(String)"
});
formatter.result({
  "duration": 30295600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wondering if Creda is Fit for you",
      "offset": 28
    }
  ],
  "location": "ProviderStepDef.validate_Wondering_section(String)"
});
formatter.result({
  "duration": 728489600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Learn How our flexible platform brings value to different types of the healthcare organization.",
      "offset": 32
    }
  ],
  "location": "ProviderStepDef.validate_Wondering_sub_section(String)"
});
formatter.result({
  "duration": 33911700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "See Who We Help",
      "offset": 42
    }
  ],
  "location": "ProviderStepDef.click_on_See_Who_We_Help_button_title_as(String)"
});
formatter.result({
  "duration": 710126800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact Us - CredaHealth",
      "offset": 26
    }
  ],
  "location": "HomeStepDef.validate_contact_us_page(String)"
});
formatter.result({
  "duration": 14161400,
  "status": "passed"
});
formatter.match({
  "location": "ProviderStepDef.back_to_home_pageLogo()"
});
formatter.result({
  "duration": 5429573200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Do your patients have questions about their procedures?",
      "offset": 36
    }
  ],
  "location": "ProviderStepDef.validate_question_title_section_as(String)"
});
formatter.result({
  "duration": 756810500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Our educational materials explain patient’s GI condition and how it can be managed.",
      "offset": 37
    }
  ],
  "location": "ProviderStepDef.validate_question_descriptionone_as(String)"
});
formatter.result({
  "duration": 35228600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Well-informed patient can significantly reduce your costs due to last minute cancellations.",
      "offset": 38
    }
  ],
  "location": "ProviderStepDef.validate_question_descriptiontwo_as(String)"
});
formatter.result({
  "duration": 28953600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "We aim for easing the process involved in prepping \u0026 to achieve a successful procedure.",
      "offset": 40
    }
  ],
  "location": "ProviderStepDef.validate_question_descriptionthree_as(String)"
});
formatter.result({
  "duration": 32148200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Case Study",
      "offset": 30
    }
  ],
  "location": "ProviderStepDef.validate_case_study_title_as(String)"
});
formatter.result({
  "duration": 703615500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The “Center for Advanced GI” is a Group Gastroenterology Practice in Central Florida specializing in Gastrointestinal, Diseases and liver disease. The clinic provides GI Consultations and Diagnostic Procedures for the Upper and Lower Gastrointestinal. Tract and the liver, such as Colonoscopy, Colon Screening, Upper Endoscopy, Capsule Endoscopy, Destruction of Internal Hemorrhoids, and Liver Biopsy.",
      "offset": 36
    }
  ],
  "location": "ProviderStepDef.validate_case_study_description_as(String)"
});
formatter.result({
  "duration": 753900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Our Ready to Implement Engagement Modules",
      "offset": 40
    }
  ],
  "location": "ProviderStepDef.validate_implement_engagement_title_as(String)"
});
formatter.result({
  "duration": 751396800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "At Creda, we are changing patient-centered care outside of traditional settings by empowering your patients with the right information at the right time. We provide patient friendly and timely instructions and reminders.",
      "offset": 39
    }
  ],
  "location": "ProviderStepDef.validate_implement_engagement_desc_as(String)"
});
formatter.result({
  "duration": 32829000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PRE- PROCEDURE PREP",
      "offset": 32
    }
  ],
  "location": "ProviderStepDef.validate_preprocedure_title_as(String)"
});
formatter.result({
  "duration": 733671800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Improve the patient experience and ensure that patients are well-informed and prepared for their procedure with clear day-wise instructions.",
      "offset": 31
    }
  ],
  "location": "ProviderStepDef.validate_preprocedure_desc_as(String)"
});
formatter.result({
  "duration": 59695800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enquire For Demo",
      "offset": 48
    }
  ],
  "location": "ProviderStepDef.click_on_enqurire_now_demo_button_and_title_is(String)"
});
formatter.result({
  "duration": 1405772700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact Us - CredaHealth",
      "offset": 26
    }
  ],
  "location": "HomeStepDef.validate_contact_us_page(String)"
});
formatter.result({
  "duration": 6718900,
  "status": "passed"
});
formatter.match({
  "location": "ProviderStepDef.back_to_home_pageLogo()"
});
formatter.result({
  "duration": 5225476200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "POST- PROCEDURE CARE",
      "offset": 33
    }
  ],
  "location": "ProviderStepDef.validate_postprocedure_title_as(String)"
});
formatter.result({
  "duration": 56321900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Designed to provide patients with the necessary information and support to ensure a smooth recovery and minimize the risk of complications following their procedure.",
      "offset": 32
    }
  ],
  "location": "ProviderStepDef.validate_postprocedure_desc_as(String)"
});
formatter.result({
  "duration": 27767800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enquire For Demo",
      "offset": 48
    }
  ],
  "location": "ProviderStepDef.click_on_enqurire_now_demo_button_and_title_is(String)"
});
formatter.result({
  "duration": 1596103800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact Us - CredaHealth",
      "offset": 26
    }
  ],
  "location": "HomeStepDef.validate_contact_us_page(String)"
});
formatter.result({
  "duration": 17349500,
  "status": "passed"
});
formatter.match({
  "location": "ProviderStepDef.back_to_home_pageLogo()"
});
formatter.result({
  "duration": 5235523500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "We work hard to fill the gaps in your healthcare landscape.",
      "offset": 48
    }
  ],
  "location": "ProviderStepDef.validate_healthcare_landscape_section_title_as(String)"
});
formatter.result({
  "duration": 786894300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "90% Rattings",
      "offset": 44
    }
  ],
  "location": "ProviderStepDef.validate_healthcare_landscape_sub_title_as(String)"
});
formatter.result({
  "duration": 45261400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "90% of patients surveyed said they were pleased with our educational emails about their procedure.",
      "offset": 46
    }
  ],
  "location": "ProviderStepDef.validate_healthcare_landscape_secone_desc_as(String)"
});
formatter.result({
  "duration": 332300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "90% of clinic staff surveyed said they were pleased with the patient turnaround and their preparedness.",
      "offset": 44
    }
  ],
  "location": "ProviderStepDef.validate_healthcare_landscape_secsecond_as(String)"
});
formatter.result({
  "duration": 277000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "See How We Work With your Systems",
      "offset": 32
    }
  ],
  "location": "ProviderStepDef.validate_work_systems_title_as(String)"
});
formatter.result({
  "duration": 727786300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Looking to get started? Take the first steps towards discovering just how we can amplify the value of your existing technology.",
      "offset": 30
    }
  ],
  "location": "ProviderStepDef.validate_work_system_desc_as(String)"
});
formatter.result({
  "duration": 37615300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Talk To Experts",
      "offset": 52
    }
  ],
  "location": "ProviderStepDef.click_on_Talk_To_Experts_btn_and_validate_title_as(String)"
});
formatter.result({
  "duration": 877515600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact Us - CredaHealth",
      "offset": 26
    }
  ],
  "location": "HomeStepDef.validate_contact_us_page(String)"
});
formatter.result({
  "duration": 13056500,
  "status": "passed"
});
formatter.match({
  "location": "ProviderStepDef.back_to_home_pageLogo()"
});
formatter.result({
  "duration": 5271219000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Become a Partner",
      "offset": 53
    }
  ],
  "location": "ProviderStepDef.click_on_Become_a_Partner_btn_and_validate_title_as(String)"
});
formatter.result({
  "duration": 951247700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact Us - CredaHealth",
      "offset": 26
    }
  ],
  "location": "HomeStepDef.validate_contact_us_page(String)"
});
formatter.result({
  "duration": 14793200,
  "status": "passed"
});
formatter.match({
  "location": "ProviderStepDef.back_to_home_pageLogo()"
});
formatter.result({
  "duration": 5214819700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Creda for Clinics",
      "offset": 33
    }
  ],
  "location": "ProviderStepDef.validate_creda_clinice_title_as(String)"
});
formatter.result({
  "duration": 758974700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Creda Health’s “Patient Engagement solution” provides GI clinics with a comprehensive solution for engaging patients throughout their healthcare journey.",
      "offset": 37
    }
  ],
  "location": "ProviderStepDef.validate_creda_clinice_sub_title_as(String)"
});
formatter.result({
  "duration": 48996900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Creda offers a suite of services that include patient education, reminder notifications, and personalized communication modules. The ultimate goal is to improve patient outcomes by helping patients become more involved in their own care and treatment, leading to better adherence to treatment plans, improved health outcomes, reduced healthcare costs.",
      "offset": 36
    }
  ],
  "location": "ProviderStepDef.validate_creda_clinics_desc_one_as(String)"
});
formatter.result({
  "duration": 31400400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Creda also provides analytics and reports that allow healthcare organizations to track patient engagement and monitor their progress. These services help clinics build better relationships with their patients, leading to increased trust and satisfaction.",
      "offset": 36
    }
  ],
  "location": "ProviderStepDef.validate_creda_clinics_desc_two_as(String)"
});
formatter.result({
  "duration": 27951500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact Us",
      "offset": 46
    }
  ],
  "location": "ProviderStepDef.click_on_contact_us_btn_and_validate_text_as(String)"
});
formatter.result({
  "duration": 916654800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact Us - CredaHealth",
      "offset": 26
    }
  ],
  "location": "HomeStepDef.validate_contact_us_page(String)"
});
formatter.result({
  "duration": 14982100,
  "status": "passed"
});
formatter.match({
  "location": "ProviderStepDef.back_to_home_pageLogo()"
});
formatter.result({
  "duration": 5231883600,
  "status": "passed"
});
});