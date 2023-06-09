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
  "comments": [
    {
      "line": 23,
      "value": "#    Then validate provider section title as \"For Providers\""
    },
    {
      "line": 24,
      "value": "#    Then validate provider section sub title as \"Patient Engagement Service\""
    },
    {
      "line": 25,
      "value": "#    Then validate provider description as \"Managing the full scope of a patient\u0027s journey: Delivering happier staff, healthier patients, and more profitable organizations\""
    },
    {
      "line": 26,
      "value": "#"
    },
    {
      "line": 27,
      "value": "#    Then scroll to secEmail"
    },
    {
      "line": 28,
      "value": "#    Then validate provider secemail title as \"Deliver Email, Voice, and Text Message Reminders\""
    },
    {
      "line": 29,
      "value": "#    Then validate provider secemail desc as \"Patient engagement services tremendously benefit healthcare providers and organizations. By empowering patients to take a more active role in their care, providers can reduce the burden on staff, streamline care delivery, and increase patient satisfaction. This leads to improved patient retention, increased referrals, and a more profitable organization.\""
    },
    {
      "line": 30,
      "value": "#    Then validate provider secemail image as \"https://credahealth.com/wp-content/uploads/2023/04/uncel-on-mobile.jpg\" and \"uncel on mobile\""
    },
    {
      "line": 31,
      "value": "#"
    },
    {
      "line": 32,
      "value": "#    Then validate provider secReduce title as \"Reduce No-shows with Automated Patient Reminders\""
    },
    {
      "line": 33,
      "value": "#    Then validate provider secReduce desc as \"No-shows can be a significant problem for healthcare providers, leading to missed appointments, wasted resources decreased patient satisfaction. Automated patient reminders can be an effective way to reduce the number of no-shows in healthcare practices. Using automated patient reminders, providers can increase appointment attendance rates and improve practice efficiency.\""
    },
    {
      "line": 34,
      "value": "#    Then validate provider secReduce image as \"https://credahealth.com/wp-content/uploads/2023/04/doctor-writing-medical-reports-while-talking-patient.jpeg\""
    },
    {
      "line": 35,
      "value": "#"
    },
    {
      "line": 36,
      "value": "#    Then validate provider secQuality title as \"Improve Both Patient Care Quality and Patient Experience\""
    },
    {
      "line": 37,
      "value": "#    Then validate provider secQuality desc as \"Care coordination involves working collaboratively across healthcare settings and providers to ensure patients receive the right care at the right time. Educate patients about their conditions, treatment options, and preventive measures to help them achieve better outcomes and reduce healthcare costs.\""
    },
    {
      "line": 38,
      "value": "#    Then validate provider secQualityu image as \"https://credahealth.com/wp-content/uploads/2023/04/f30c4ee8-f0d8-4ba5-8797-2bd5e23cdfff.jpeg\""
    },
    {
      "line": 39,
      "value": "#"
    },
    {
      "line": 40,
      "value": "#    Then validate request for free demo title \"Request a Free Demo\""
    },
    {
      "line": 41,
      "value": "#    Then click on request for free demo button"
    },
    {
      "line": 42,
      "value": "#    And validate contact us page \"Contact Us - CredaHealth\""
    },
    {
      "line": 43,
      "value": "#    And Back to home page"
    },
    {
      "line": 44,
      "value": "#"
    },
    {
      "line": 45,
      "value": "#    Then scroll to patient section"
    },
    {
      "line": 46,
      "value": "#    Then validate patient process title as \"Why You Need To Automate Patient Processes\""
    },
    {
      "line": 47,
      "value": "#    Then validate patient process subtitle as \"Due to the busy nature of your medical practice, your staff may often struggle to keep track of patient appointments, follow-up visits, and follow-up communications.\""
    },
    {
      "line": 48,
      "value": "#    Then validate patient process subtitlesecond as \"You may’ve noticed that some of your patients are slipping through the cracks and are concerned they’re not receiving the care they need. To address this issue, you need to implement an automated communication system.\""
    },
    {
      "line": 49,
      "value": "#    Then validate patient process desc as \"Creda’s Patient engagement service allows patients to schedule appointments and receive automated reminders and personalized communication on pre-visit prep instructions and post-visit care that send follow-up messages to patients on time. With these systems in place, you can streamline your patient processes and ensure that your patients receive the care they need while freeing up your time to focus on providing quality medical care.\""
    },
    {
      "line": 50,
      "value": "#    Then display patient process img as \"https://credahealth.com/wp-content/uploads/2021/08/hero_image_01.png\""
    },
    {
      "line": 51,
      "value": "#"
    },
    {
      "line": 52,
      "value": "#    Then validate communicate section title as \"Ways We Communicate With Your Patients\""
    },
    {
      "line": 53,
      "value": "#    Then validate communicate section subtext as \"Transform the way you interact with and educate your patients\""
    },
    {
      "line": 54,
      "value": "#"
    },
    {
      "line": 55,
      "value": "#    Then validate supporting journey section title as \"Supporting Patient Journey\""
    },
    {
      "line": 56,
      "value": "#"
    },
    {
      "line": 57,
      "value": "#    Then validate engagement title as \"Creda Health\u0027s Patient Engagement Platform effectively reduces patient anxiety and improves preparedness through education\""
    },
    {
      "line": 58,
      "value": "#    Then validate engagement writer name as \"- Clinic Admin\""
    },
    {
      "line": 59,
      "value": "#"
    },
    {
      "line": 60,
      "value": "#    Then validate wondering section title as \"Wondering if Creda is Fit for you\""
    },
    {
      "line": 61,
      "value": "#    Then validate wondering section subtext as \"Learn How our flexible platform brings value to different types of the healthcare organization.\""
    },
    {
      "line": 62,
      "value": "#"
    },
    {
      "line": 63,
      "value": "#    Then validate See Who We Help btn \"See Who We Help\""
    },
    {
      "line": 64,
      "value": "#    And click on See Who We Help btn"
    },
    {
      "line": 65,
      "value": "#    And validate clinics page \"Clinics - CredaHealth\""
    },
    {
      "line": 66,
      "value": "#    And Back to home page"
    },
    {
      "line": 67,
      "value": "#"
    },
    {
      "line": 68,
      "value": "#    Then validate creda app for patient title \"The Creda App For Patients\""
    },
    {
      "line": 69,
      "value": "#    And validate creda app for patient desc \"Whether you are recently diagnosed or you’ve been living with a chronic condition for some time, Creda Health is your one-stop destination for staying on top of your health.\""
    },
    {
      "line": 70,
      "value": "#    And validate creda app for patient descsecond \"Our condition-specific care models analyse your symptoms, medications, vitals, labs, nutrition and lifestyle elements, and monitor your disease progression and treatment effectiveness. We send you reminders, alerts, warnings, articles, actions to take and things to talk to your doctor – all to help you stay on top of your health.\""
    },
    {
      "line": 71,
      "value": "#    And validate labels for yourhealth as \"IBS\" and \"Lupus\" and \"High Cholesterol\" and \"Diabetes\" and \"Hypothyroidism\" and \"Prediabetes\" and \"PCOS\" and \"Obesity\" and \"IBD\""
    },
    {
      "line": 72,
      "value": "#"
    },
    {
      "line": 73,
      "value": "#    Then validate enroll today btn as \"Enroll Today\""
    },
    {
      "line": 74,
      "value": "#    And click on enroll today btn"
    },
    {
      "line": 75,
      "value": "#    And validate get app page \"Get The App - CredaHealth\""
    },
    {
      "line": 76,
      "value": "#    And Back to home page"
    },
    {
      "line": 77,
      "value": "#"
    },
    {
      "line": 78,
      "value": "#    Then validate chronic condition title as \"We are on a mission to ease the lives of people dealing with chronic conditions. Chronic Condition Management App\""
    },
    {
      "line": 79,
      "value": "#    And validate chronic condition image \"https://credahealth.com/wp-content/uploads/2021/08/background_07.jpg\""
    },
    {
      "line": 80,
      "value": "#    And validate watch now btn \"Watch Now\""
    },
    {
      "line": 81,
      "value": "#    And click on watch now btn"
    },
    {
      "line": 82,
      "value": "#    And validate watch now video title as \"Creda Health App Features\""
    },
    {
      "line": 83,
      "value": "#    And Back to home page"
    }
  ],
  "line": 85,
  "name": "validate FAQ section as \"FAQ\"",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "validate faqF section as \"What is patient engagement, and why is it important for healthcare providers?\"",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 87,
      "value": "#    Then click on faqF section and validate desc as \"Patient engagement guides and supports patients through the healthcare system to help them actively participate in their care.#This involves providing patients with information, resources, and support to help them make informed decisions about their health.#Patient engagement is important for healthcare providers because it can lead to improved patient outcomes and satisfaction.#When patients are supported and empowered to take an active role in their healthcare, they are more likely to adhere to treatment plans, manage chronic conditions, and make lifestyle changes that improve their health.\"#Patient engagement can help healthcare providers reduce healthcare costs by preventing unnecessary hospitalizations and emergency room visits.#By providing patients with the information and support they need to manage their health, healthcare providers can help prevent complications and identify potential health issues before they become more serious.\""
    }
  ],
  "line": 89,
  "name": "validate faqS section as \"How does your patient engagement process work?\"",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "click on faqs setion and validate desc as \"Patient engagement is a collaborative process between healthcare providers and patients that involves patients in decision-making, self-care, and health management.#This process can involve several steps, such as:\"",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "validate faqscomm as \"Communication: Healthcare providers should establish clear and effective communication with patients, involving them in the decision-making process and explaining their health condition, treatment options, and any potential risks and benefits.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "validte faqsEdu as \"Education: Healthcare providers should provide patients with the necessary education and online resources to make informed decisions about their health.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 93,
  "name": "validate faqsMon as \"Monitoring patient progress: Healthcare providers can monitor patient progress to ensure that patients adhere to their treatment plans and progress toward their health goals.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 94,
  "name": "validate faqsFeed as \"Feedback: Healthcare providers should gather patient feedback on their experiences and adjust their approach to improve Patient engagement and outcomes.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 95,
  "name": "validate faqsFooter as \"Healthcare providers should use technology to engage patients in their care. Implement platforms that support telemedicine visits, remote monitoring, and mobile health applications that give patients real-time access to their health information.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 97,
  "name": "validate faqT section as \"What types of patient engagement services do you offer?\"",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "validate faqTTitle as \"Here’s a brief overview of each of the services we offer:\"",
  "keyword": "Then "
});
formatter.step({
  "line": 99,
  "name": "validate faqTPre as \"Pre-visit Prep: This service helps patients prepare for their upcoming appointments by providing information about their condition, what to expect during their visit, and how to prepare for any necessary tests or procedures. Pre-visit prep can help patients feel more confident and informed about their care, leading to better patient experiences.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 100,
  "name": "validate faqTpost as \"Post-Visit Care: This service provides patients with follow-up care after their visit, such as reminders to take their medications, follow-up appointments, and access to educational resources. Post-visit care can help ensure that patients adhere to their treatment plans and manage their health effectively, leading to improved health outcomes.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 101,
  "name": "validate faqTchronic as \"Chronic Condition Management App: This service provides patients with a mobile application to monitor or manage their chronic condition. The app includes medication reminders, health metrics and symptom tracking, and access to educational resources. By providing patients with tools to manage their condition outside the clinical setting, healthcare providers can help improve Patient outcomes and reduce healthcare costs.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 103,
  "name": "validate faqForth section as \"How can patient engagement services help me improve patient outcomes and satisfaction?\"",
  "keyword": "Then "
});
formatter.step({
  "line": 104,
  "name": "validate faqForthBetter section \"Better adherence to treatment plans: When patients are engaged in their healthcare, they are more likely to adhere to their treatment plans, including taking medications as prescribed, attending follow-up appointments, and making lifestyle changes leading to reduced healthcare costs.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 105,
  "name": "validate faqForthImprove section as \"Improved communication with healthcare providers: Multi-channel communication allows patients to access healthcare information and communicate with their healthcare providers through various channels, such as phone, email, or text. This way, patients feel more connected to their healthcare providers and engaged in their care, improving patient satisfaction and outcomes.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 106,
  "name": "validate faqForthcare section as \"Improved Care Coordination: Patient engagement services can help improve care coordination by providing patients with information and support to navigate the healthcare system. For example, healthcare providers can use secure messaging to communicate with patients about their care, send appointment reminders, and provide follow-up care instructions. This can help reduce the risk of miscommunication and improve patient outcomes. It will also help prevent unnecessary hospitalizations and emergency room visits and ensure patients receive timely and appropriate care.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 107,
  "name": "validate faqForthPatience section as \"Increased Patient Satisfaction: Patient engagement services can lead to increased patient satisfaction by providing patients with a more personalized and supportive healthcare experience. When patients feel more involved in their care, they are more likely to feel satisfied with the care they receive, leading to better Patient retention and loyalty.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDef.browse_credaHealth_web_site()"
});
formatter.result({
  "duration": 85965300,
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
  "duration": 37054000,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.verify_WebSite_logo()"
});
formatter.result({
  "duration": 1250800,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.display_header_menu()"
});
formatter.result({
  "duration": 358434500,
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
  "duration": 43117200,
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
  "duration": 202736400,
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
  "duration": 53880700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FAQ",
      "offset": 25
    }
  ],
  "location": "HomeStepDef.validate_FAQ_section_as(String)"
});
formatter.result({
  "duration": 1447167800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "What is patient engagement, and why is it important for healthcare providers?",
      "offset": 26
    }
  ],
  "location": "HomeStepDef.validate_faqF_section_as(String)"
});
formatter.result({
  "duration": 38760100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "How does your patient engagement process work?",
      "offset": 26
    }
  ],
  "location": "HomeStepDef.validate_faqS_section_as(String)"
});
formatter.result({
  "duration": 627239600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patient engagement is a collaborative process between healthcare providers and patients that involves patients in decision-making, self-care, and health management.#This process can involve several steps, such as:",
      "offset": 43
    }
  ],
  "location": "HomeStepDef.click_on_faqs_setion_and_validate_desc_as(String)"
});
formatter.result({
  "duration": 688800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Communication: Healthcare providers should establish clear and effective communication with patients, involving them in the decision-making process and explaining their health condition, treatment options, and any potential risks and benefits.",
      "offset": 22
    }
  ],
  "location": "HomeStepDef.validate_faqscomm_as(String)"
});
formatter.result({
  "duration": 403000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Education: Healthcare providers should provide patients with the necessary education and online resources to make informed decisions about their health.",
      "offset": 20
    }
  ],
  "location": "HomeStepDef.validte_faqsEdu_as(String)"
});
formatter.result({
  "duration": 453800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Monitoring patient progress: Healthcare providers can monitor patient progress to ensure that patients adhere to their treatment plans and progress toward their health goals.",
      "offset": 21
    }
  ],
  "location": "HomeStepDef.validate_faqsMon_as(String)"
});
formatter.result({
  "duration": 331200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Feedback: Healthcare providers should gather patient feedback on their experiences and adjust their approach to improve Patient engagement and outcomes.",
      "offset": 22
    }
  ],
  "location": "HomeStepDef.validate_faqsFeed_as(String)"
});
formatter.result({
  "duration": 282900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Healthcare providers should use technology to engage patients in their care. Implement platforms that support telemedicine visits, remote monitoring, and mobile health applications that give patients real-time access to their health information.",
      "offset": 24
    }
  ],
  "location": "HomeStepDef.validate_faqsFooter_as(String)"
});
formatter.result({
  "duration": 305200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "What types of patient engagement services do you offer?",
      "offset": 26
    }
  ],
  "location": "HomeStepDef.validate_faqT_section_as(String)"
});
formatter.result({
  "duration": 106990100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Here’s a brief overview of each of the services we offer:",
      "offset": 23
    }
  ],
  "location": "HomeStepDef.validate_faqTTitle_as(String)"
});
formatter.result({
  "duration": 891500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pre-visit Prep: This service helps patients prepare for their upcoming appointments by providing information about their condition, what to expect during their visit, and how to prepare for any necessary tests or procedures. Pre-visit prep can help patients feel more confident and informed about their care, leading to better patient experiences.",
      "offset": 21
    }
  ],
  "location": "HomeStepDef.validate_faqTPre_as(String)"
});
formatter.result({
  "duration": 349300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Post-Visit Care: This service provides patients with follow-up care after their visit, such as reminders to take their medications, follow-up appointments, and access to educational resources. Post-visit care can help ensure that patients adhere to their treatment plans and manage their health effectively, leading to improved health outcomes.",
      "offset": 22
    }
  ],
  "location": "HomeStepDef.validate_faqTpost_as(String)"
});
formatter.result({
  "duration": 424300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chronic Condition Management App: This service provides patients with a mobile application to monitor or manage their chronic condition. The app includes medication reminders, health metrics and symptom tracking, and access to educational resources. By providing patients with tools to manage their condition outside the clinical setting, healthcare providers can help improve Patient outcomes and reduce healthcare costs.",
      "offset": 25
    }
  ],
  "location": "HomeStepDef.validate_faqTchronic_as(String)"
});
formatter.result({
  "duration": 343000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "How can patient engagement services help me improve patient outcomes and satisfaction?",
      "offset": 30
    }
  ],
  "location": "HomeStepDef.validate_faqForth_section_as(String)"
});
formatter.result({
  "duration": 106454700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Better adherence to treatment plans: When patients are engaged in their healthcare, they are more likely to adhere to their treatment plans, including taking medications as prescribed, attending follow-up appointments, and making lifestyle changes leading to reduced healthcare costs.",
      "offset": 33
    }
  ],
  "location": "HomeStepDef.validate_faqForthBetter_section(String)"
});
formatter.result({
  "duration": 1248000,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinition.HomeStepDef.validate_faqForthBetter_section(HomeStepDef.java:440)\r\n\tat ✽.Then validate faqForthBetter section \"Better adherence to treatment plans: When patients are engaged in their healthcare, they are more likely to adhere to their treatment plans, including taking medications as prescribed, attending follow-up appointments, and making lifestyle changes leading to reduced healthcare costs.\"(Home.feature:104)\r\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "Improved communication with healthcare providers: Multi-channel communication allows patients to access healthcare information and communicate with their healthcare providers through various channels, such as phone, email, or text. This way, patients feel more connected to their healthcare providers and engaged in their care, improving patient satisfaction and outcomes.",
      "offset": 37
    }
  ],
  "location": "HomeStepDef.validate_faqForthImprove_section_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Improved Care Coordination: Patient engagement services can help improve care coordination by providing patients with information and support to navigate the healthcare system. For example, healthcare providers can use secure messaging to communicate with patients about their care, send appointment reminders, and provide follow-up care instructions. This can help reduce the risk of miscommunication and improve patient outcomes. It will also help prevent unnecessary hospitalizations and emergency room visits and ensure patients receive timely and appropriate care.",
      "offset": 34
    }
  ],
  "location": "HomeStepDef.validate_faqForthcare_section_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Increased Patient Satisfaction: Patient engagement services can lead to increased patient satisfaction by providing patients with a more personalized and supportive healthcare experience. When patients feel more involved in their care, they are more likely to feel satisfied with the care they receive, leading to better Patient retention and loyalty.",
      "offset": 38
    }
  ],
  "location": "HomeStepDef.validate_faqForthPatience_section_as(String)"
});
formatter.result({
  "status": "skipped"
});
});