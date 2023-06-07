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
formatter.step({
  "line": 17,
  "name": "verify WebSite logo",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "display header menu",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "validate feature section text as \"Future of Healthcare Communication\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "validate feature section description as \"We help you connect fragmented communication touchpoints and create a seamless channel minimizing redundant tasks and enabling staff to focus on serving patients.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "validate feature section backend image as \"https://credahealth.com/wp-content/uploads/2021/08/hero_home_01-1.jpg\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "validate provider section title as \"For Providers\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "validate provider section sub title as \"Patient Engagement Service\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "validate provider description as \"Managing the full scope of a patient\u0027s journey: Delivering happier staff, healthier patients, and more profitable organizations\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "scroll to secEmail",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "validate provider secemail title as \"Deliver Email, Voice, and Text Message Reminders\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "validate provider secemail desc as \"Patient engagement services tremendously benefit healthcare providers and organizations. By empowering patients to take a more active role in their care, providers can reduce the burden on staff, streamline care delivery, and increase patient satisfaction. This leads to improved patient retention, increased referrals, and a more profitable organization.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "validate provider secemail image as \"https://credahealth.com/wp-content/uploads/2023/04/uncel-on-mobile.jpg\" and \"uncel on mobile\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "validate provider secReduce title as \"Reduce No-shows with Automated Patient Reminders\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "validate provider secReduce desc as \"No-shows can be a significant problem for healthcare providers, leading to missed appointments, wasted resources decreased patient satisfaction. Automated patient reminders can be an effective way to reduce the number of no-shows in healthcare practices. Using automated patient reminders, providers can increase appointment attendance rates and improve practice efficiency.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "validate provider secReduce image as \"https://credahealth.com/wp-content/uploads/2023/04/doctor-writing-medical-reports-while-talking-patient.jpeg\"",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "validate provider secQuality title as \"Improve Both Patient Care Quality and Patient Experience\"",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "validate provider secQuality desc as \"Care coordination involves working collaboratively across healthcare settings and providers to ensure patients receive the right care at the right time. Educate patients about their conditions, treatment options, and preventive measures to help them achieve better outcomes and reduce healthcare costs.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "validate provider secQualityu image as \"https://credahealth.com/wp-content/uploads/2023/04/f30c4ee8-f0d8-4ba5-8797-2bd5e23cdfff.jpeg\"",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "validate request for free demo title \"Request a Free Demo\"",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "click on request for free demo button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "validate contact us page \"Contact Us - CredaHealth\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Back to home page",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "scroll to patient section",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "validate patient process title as \"Why You Need To Automate Patient Processes\"",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "validate patient process subtitle as \"Due to the busy nature of your medical practice, your staff may often struggle to keep track of patient appointments, follow-up visits, and follow-up communications.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "validate patient process subtitlesecond as \"You may’ve noticed that some of your patients are slipping through the cracks and are concerned they’re not receiving the care they need. To address this issue, you need to implement an automated communication system.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "validate patient process desc as \"Creda’s Patient engagement service allows patients to schedule appointments and receive automated reminders and personalized communication on pre-visit prep instructions and post-visit care that send follow-up messages to patients on time. With these systems in place, you can streamline your patient processes and ensure that your patients receive the care they need while freeing up your time to focus on providing quality medical care.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "display patient process img as \"https://credahealth.com/wp-content/uploads/2021/08/hero_image_01.png\"",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "validate communicate section title as \"Ways We Communicate With Your Patients\"",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "validate communicate section subtext as \"Transform the way you interact with and educate your patients\"",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "validate supporting journey section title as \"Supporting Patient Journey\"",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "validate engagement title as \"Creda Health\u0027s Patient Engagement Platform effectively reduces patient anxiety and improves preparedness through education\"",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "validate engagement writer name as \"- Clinic Admin\"",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "validate wondering section title as \"Wondering if Creda is Fit for you\"",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "validate wondering section subtext as \"Learn How our flexible platform brings value to different types of the healthcare organization.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "validate See Who We Help btn \"See Who We Help\"",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "click on See Who We Help btn",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "validate clinics page \"Clinics - CredaHealth\"",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "Back to home page",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "validate creda app for patient title \"The Creda App For Patients\"",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "validate creda app for patient desc \"Whether you are recently diagnosed or you’ve been living with a chronic condition for some time, Creda Health is your one-stop destination for staying on top of your health.\"",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "validate creda app for patient descsecond \"Our condition-specific care models analyse your symptoms, medications, vitals, labs, nutrition and lifestyle elements, and monitor your disease progression and treatment effectiveness. We send you reminders, alerts, warnings, articles, actions to take and things to talk to your doctor – all to help you stay on top of your health.\"",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "validate labels for yourhealth as \"IBS\" and \"Lupus\" and \"High Cholesterol\" and \"Diabetes\" and \"Hypothyroidism\" and \"Prediabetes\" and \"PCOS\" and \"Obesity\" and \"IBD\"",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "validate enroll today btn as \"Enroll Today\"",
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "click on enroll today btn",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "validate get app page \"Get The App - CredaHealth\"",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Back to home page",
  "keyword": "And "
});
formatter.match({
  "location": "HomeStepDef.browse_credaHealth_web_site()"
});
formatter.result({
  "duration": 107359600,
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
  "duration": 40669400,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.verify_WebSite_logo()"
});
formatter.result({
  "duration": 855600,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.display_header_menu()"
});
formatter.result({
  "duration": 362417900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Future of Healthcare Communication",
      "offset": 34
    }
  ],
  "location": "HomeStepDef.validate_feature_section_text_as(String)"
});
formatter.result({
  "duration": 33051000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "We help you connect fragmented communication touchpoints and create a seamless channel minimizing redundant tasks and enabling staff to focus on serving patients.",
      "offset": 41
    }
  ],
  "location": "HomeStepDef.validate_feature_section_description_as(String)"
});
formatter.result({
  "duration": 45033600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://credahealth.com/wp-content/uploads/2021/08/hero_home_01-1.jpg",
      "offset": 43
    }
  ],
  "location": "HomeStepDef.validate_feature_section_backend_image_as(String)"
});
formatter.result({
  "duration": 90577400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "For Providers",
      "offset": 36
    }
  ],
  "location": "HomeStepDef.validate_provider_section_title_as(String)"
});
formatter.result({
  "duration": 29097800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patient Engagement Service",
      "offset": 40
    }
  ],
  "location": "HomeStepDef.validate_provider_section_sub_title_as(String)"
});
formatter.result({
  "duration": 30209000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Managing the full scope of a patient\u0027s journey: Delivering happier staff, healthier patients, and more profitable organizations",
      "offset": 34
    }
  ],
  "location": "HomeStepDef.validate_provider_description_as(String)"
});
formatter.result({
  "duration": 55447500,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.scroll_to_secEmail()"
});
formatter.result({
  "duration": 699453600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deliver Email, Voice, and Text Message Reminders",
      "offset": 37
    }
  ],
  "location": "HomeStepDef.validate_provider_secemail_title_as(String)"
});
formatter.result({
  "duration": 39022200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patient engagement services tremendously benefit healthcare providers and organizations. By empowering patients to take a more active role in their care, providers can reduce the burden on staff, streamline care delivery, and increase patient satisfaction. This leads to improved patient retention, increased referrals, and a more profitable organization.",
      "offset": 36
    }
  ],
  "location": "HomeStepDef.validate_provider_secemail_desc_as(String)"
});
formatter.result({
  "duration": 35482100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://credahealth.com/wp-content/uploads/2023/04/uncel-on-mobile.jpg",
      "offset": 37
    },
    {
      "val": "uncel on mobile",
      "offset": 114
    }
  ],
  "location": "HomeStepDef.validate_provider_secemail_image_as_and(String,String)"
});
formatter.result({
  "duration": 90613000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reduce No-shows with Automated Patient Reminders",
      "offset": 38
    }
  ],
  "location": "HomeStepDef.validate_provider_secReduce_title_as(String)"
});
formatter.result({
  "duration": 106647000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No-shows can be a significant problem for healthcare providers, leading to missed appointments, wasted resources decreased patient satisfaction. Automated patient reminders can be an effective way to reduce the number of no-shows in healthcare practices. Using automated patient reminders, providers can increase appointment attendance rates and improve practice efficiency.",
      "offset": 37
    }
  ],
  "location": "HomeStepDef.validate_provider_secReduce_desc_as(String)"
});
formatter.result({
  "duration": 33807600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://credahealth.com/wp-content/uploads/2023/04/doctor-writing-medical-reports-while-talking-patient.jpeg",
      "offset": 38
    }
  ],
  "location": "HomeStepDef.validate_provider_secReduce_image_as(String)"
});
formatter.result({
  "duration": 59337200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Improve Both Patient Care Quality and Patient Experience",
      "offset": 39
    }
  ],
  "location": "HomeStepDef.validate_provider_secQuality_title_as(String)"
});
formatter.result({
  "duration": 59321500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Care coordination involves working collaboratively across healthcare settings and providers to ensure patients receive the right care at the right time. Educate patients about their conditions, treatment options, and preventive measures to help them achieve better outcomes and reduce healthcare costs.",
      "offset": 38
    }
  ],
  "location": "HomeStepDef.validate_provider_secQuality_desc_as(String)"
});
formatter.result({
  "duration": 31645000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://credahealth.com/wp-content/uploads/2023/04/f30c4ee8-f0d8-4ba5-8797-2bd5e23cdfff.jpeg",
      "offset": 40
    }
  ],
  "location": "HomeStepDef.validate_provider_secQualityu_image_as(String)"
});
formatter.result({
  "duration": 31743900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Request a Free Demo",
      "offset": 38
    }
  ],
  "location": "HomeStepDef.validate_request_for_free_demo_title(String)"
});
formatter.result({
  "duration": 44408800,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.click_on_request_for_free_demo_button()"
});
formatter.result({
  "duration": 1784360100,
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
  "duration": 13124000,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 5439040900,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.scrolltopatientsection()"
});
formatter.result({
  "duration": 738911700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Why You Need To Automate Patient Processes",
      "offset": 35
    }
  ],
  "location": "HomeStepDef.validate_patient_process_title_as(String)"
});
formatter.result({
  "duration": 68058800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Due to the busy nature of your medical practice, your staff may often struggle to keep track of patient appointments, follow-up visits, and follow-up communications.",
      "offset": 38
    }
  ],
  "location": "HomeStepDef.validate_patient_process_subtitle_as(String)"
});
formatter.result({
  "duration": 33770900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You may’ve noticed that some of your patients are slipping through the cracks and are concerned they’re not receiving the care they need. To address this issue, you need to implement an automated communication system.",
      "offset": 44
    }
  ],
  "location": "HomeStepDef.validate_patient_process_subtitlesecond_as(String)"
});
formatter.result({
  "duration": 32828500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Creda’s Patient engagement service allows patients to schedule appointments and receive automated reminders and personalized communication on pre-visit prep instructions and post-visit care that send follow-up messages to patients on time. With these systems in place, you can streamline your patient processes and ensure that your patients receive the care they need while freeing up your time to focus on providing quality medical care.",
      "offset": 34
    }
  ],
  "location": "HomeStepDef.validate_patient_process_desc_as(String)"
});
formatter.result({
  "duration": 28546600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://credahealth.com/wp-content/uploads/2021/08/hero_image_01.png",
      "offset": 32
    }
  ],
  "location": "HomeStepDef.display_patient_process_img_as(String)"
});
formatter.result({
  "duration": 44700100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ways We Communicate With Your Patients",
      "offset": 39
    }
  ],
  "location": "HomeStepDef.validate_communicate_section_title_as(String)"
});
formatter.result({
  "duration": 770185600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transform the way you interact with and educate your patients",
      "offset": 41
    }
  ],
  "location": "HomeStepDef.validate_communicate_section_subtext_as(String)"
});
formatter.result({
  "duration": 27980700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Supporting Patient Journey",
      "offset": 46
    }
  ],
  "location": "HomeStepDef.validate_supporting_journey_section_title_as(String)"
});
formatter.result({
  "duration": 831284500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Creda Health\u0027s Patient Engagement Platform effectively reduces patient anxiety and improves preparedness through education",
      "offset": 30
    }
  ],
  "location": "HomeStepDef.validate_engagement_title_as(String)"
});
formatter.result({
  "duration": 838518200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "- Clinic Admin",
      "offset": 36
    }
  ],
  "location": "HomeStepDef.validate_engagement_writer_name_as(String)"
});
formatter.result({
  "duration": 38809500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wondering if Creda is Fit for you",
      "offset": 37
    }
  ],
  "location": "HomeStepDef.validate_wondering_section_title_as(String)"
});
formatter.result({
  "duration": 738705500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Learn How our flexible platform brings value to different types of the healthcare organization.",
      "offset": 39
    }
  ],
  "location": "HomeStepDef.validate_wondering_section_subtext_as(String)"
});
formatter.result({
  "duration": 35138300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "See Who We Help",
      "offset": 30
    }
  ],
  "location": "HomeStepDef.validate_See_Who_We_Help_btn(String)"
});
formatter.result({
  "duration": 730019500,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.click_on_See_Who_We_Help_btn()"
});
formatter.result({
  "duration": 2815133900,
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
  "duration": 14721100,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 5326263800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The Creda App For Patients",
      "offset": 38
    }
  ],
  "location": "HomeStepDef.validate_creda_app_for_patient_title(String)"
});
formatter.result({
  "duration": 795961500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Whether you are recently diagnosed or you’ve been living with a chronic condition for some time, Creda Health is your one-stop destination for staying on top of your health.",
      "offset": 37
    }
  ],
  "location": "HomeStepDef.validate_creda_app_for_patient_desc(String)"
});
formatter.result({
  "duration": 70746100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Our condition-specific care models analyse your symptoms, medications, vitals, labs, nutrition and lifestyle elements, and monitor your disease progression and treatment effectiveness. We send you reminders, alerts, warnings, articles, actions to take and things to talk to your doctor – all to help you stay on top of your health.",
      "offset": 43
    }
  ],
  "location": "HomeStepDef.validate_creda_app_for_patient_descsecond(String)"
});
formatter.result({
  "duration": 27679300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IBS",
      "offset": 35
    },
    {
      "val": "Lupus",
      "offset": 45
    },
    {
      "val": "High Cholesterol",
      "offset": 57
    },
    {
      "val": "Diabetes",
      "offset": 80
    },
    {
      "val": "Hypothyroidism",
      "offset": 95
    },
    {
      "val": "Prediabetes",
      "offset": 116
    },
    {
      "val": "PCOS",
      "offset": 134
    },
    {
      "val": "Obesity",
      "offset": 145
    },
    {
      "val": "IBD",
      "offset": 159
    }
  ],
  "location": "HomeStepDef.validate_labels_for_yourhealth_as_and_and_and_and_and_and_and_and(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 278960500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enroll Today",
      "offset": 30
    }
  ],
  "location": "HomeStepDef.validate_enroll_today_btn_as(String)"
});
formatter.result({
  "duration": 6432811200,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.click_on_enroll_today_btn()"
});
formatter.result({
  "duration": 1984040700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Get The App - CredaHealth",
      "offset": 23
    }
  ],
  "location": "HomeStepDef.validate_get_app_page(String)"
});
formatter.result({
  "duration": 14626200,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.back_to_home_page()"
});
formatter.result({
  "duration": 5468111400,
  "status": "passed"
});
});