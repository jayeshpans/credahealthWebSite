#Author: Jayesh
#Keywords Summary :
#Feature: providers us pages
#Scenario: validate providers page on web site
#Given:
#When:
#Then:
#And,But:

Feature: Validate providers page
  As a user of KYM App
  I should be able to see provider page

  Scenario: Open a provider page and validate it's text
    Given click on provider menu
    When validate clinics page "Clinics - CredaHealth"
    Then validate Patient Communication section as "Powerful Patient Communication at Scale"
    Then validate Patient Communication section img as "https://credahealth.com/wp-content/uploads/2023/04/B2B-CREDA-1.png"

#    Then validate patient engagement section as "Automate patient engagement so you can focus on patient care"
#   # Then validate patient engagement menus as "Colonoscopy" and "Sigmoidoscopy" and "Upper Endoscopy" and "Hemorrhoid"
#
#    Then validate awareness section as "Lack of Awareness Impact on Delays and Cancellation"
#    Then validate awareness descone as "Apprx. 30% of patient no- shows cost the healthcare industry $150 billion a year."
#    Then validate awareness dessec as "No-shows and late cancellations can have a greater impact on GI practices than in other medical specialties due to the prep time required for the GI procedures. For a primary care physician, each missed appointment equals roughly $150-$200 in lost revenue. For surgeons, this is closer to $500."
#    Then validate awareness descThrid as "Automatically triggering the right communication at the right time, Creda Health’s Patient Engagement Platform guides your patients through a premium care experience."
#    Then validate awareness img as "https://credahealth.com/wp-content/uploads/2023/04/Untitled-design-49-640x537.png"
#
#    Then validate reinforced education title as "Studies show the impact of reinforced education by telephone or short message service (SMS) leads to:"
#    Then validate reinforced education secone as "Reduction in same- day cancellations"
#    Then validate reinforced education secsecond as "Reduction in no- shows"
#
#    Then validate end to end patient title as "End-to-end patient engagement platform made for the enterprise."
#    Then validate end to end patient img as "https://credahealth.com/wp-content/uploads/2021/09/What-Are-the-Possible-Complications-of-Crohns-Disease.jpg"
#    Then click on more details button
#    Then validate contact us page "Contact Us - CredaHealth"
#    And Back to home pageLogo
#
#    Then validate interact with section as "Let us transform the way you interact with and educate your patients"
#    Then validate comprehensive section as "Comprehensive platform of solutions"
#    Then validate comprehensive subsection as "Design patient engagement strategy."
#
#    Then validate Customizable section as "Customizable content"
#    Then validate Customizable subsection as "Proven modules tailored to your patient needs."
#
#    Then validate Scalable section as "Scalable platform"
#    Then validate Scalable subsection as "Handle a growing no. of users. Quickly and easily provision additional computing and storage resources on demand."
#
#    Then validate Actionable section as "Actionable reporting"
#    Then validate Actionable subsection as "Identify areas for improvement and make data-driven decisions to optimize patient satisfaction."
#
#    Then validate Wondering section "Wondering if Creda is Fit for you"
#    Then validate Wondering sub section "Learn How our flexible platform brings value to different types of the healthcare organization."
#    Then click on See Who We Help button title as "See Who We Help"
#    Then validate contact us page "Contact Us - CredaHealth"
#    And Back to home pageLogo
#
#    Then validate question title section as "Do your patients have questions about their procedures?"
#    Then validate question descriptionone as "Our educational materials explain patient’s GI condition and how it can be managed."
#    Then validate question descriptiontwo as  "Well-informed patient can significantly reduce your costs due to last minute cancellations."
#    Then validate question descriptionthree as  "We aim for easing the process involved in prepping & to achieve a successful procedure."
#
#    Then validate case study title as "Case Study"
#    Then validate case study description as "The “Center for Advanced GI” is a Group Gastroenterology Practice in Central Florida specializing in Gastrointestinal, Diseases and liver disease. The clinic provides GI Consultations and Diagnostic Procedures for the Upper and Lower Gastrointestinal. Tract and the liver, such as Colonoscopy, Colon Screening, Upper Endoscopy, Capsule Endoscopy, Destruction of Internal Hemorrhoids, and Liver Biopsy."
#
#    Then validate implement engagement title as "Our Ready to Implement Engagement Modules"
#    Then validate implement engagement desc as "At Creda, we are changing patient-centered care outside of traditional settings by empowering your patients with the right information at the right time. We provide patient friendly and timely instructions and reminders."
#
#    Then validate preprocedure title as "PRE- PROCEDURE PREP"
#    Then validate preprocedure desc as "Improve the patient experience and ensure that patients are well-informed and prepared for their procedure with clear day-wise instructions."
#    Then click on enqurire now demo button and title is "Enquire For Demo"
#    Then validate contact us page "Contact Us - CredaHealth"
#    And Back to home pageLogo
#
#    Then validate postprocedure title as "POST- PROCEDURE CARE"
#    Then validate postprocedure desc as "Designed to provide patients with the necessary information and support to ensure a smooth recovery and minimize the risk of complications following their procedure."
#    Then click on enqurire now demo button and title is "Enquire For Demo"
#    Then validate contact us page "Contact Us - CredaHealth"
#    And Back to home pageLogo
#
#    Then validate healthcare landscape section title as "We work hard to fill the gaps in your healthcare landscape."
#    Then validate healthcare landscape sub title as "90% Rattings"
#    Then validate healthcare landscape secone desc as "90% of patients surveyed said they were pleased with our educational emails about their procedure."
#    Then validate healthcare landscape secsecond as "90% of clinic staff surveyed said they were pleased with the patient turnaround and their preparedness."
#
#    Then validate work systems title as "See How We Work With your Systems"
#    Then validate work system desc as "Looking to get started? Take the first steps towards discovering just how we can amplify the value of your existing technology."
#    Then click on Talk To Experts btn and validate title as "Talk To Experts"
#    Then validate contact us page "Contact Us - CredaHealth"
#    And Back to home pageLogo
#    Then click on Become a Partner btn and validate title as "Become a Partner"
#    Then validate contact us page "Contact Us - CredaHealth"
#    And Back to home pageLogo
#
#    Then validate creda clinice title as "Creda for Clinics"
#    Then validate creda clinice sub title as "Creda Health’s “Patient Engagement solution” provides GI clinics with a comprehensive solution for engaging patients throughout their healthcare journey."
#    Then validate creda clinics desc one as "Creda offers a suite of services that include patient education, reminder notifications, and personalized communication modules. The ultimate goal is to improve patient outcomes by helping patients become more involved in their own care and treatment, leading to better adherence to treatment plans, improved health outcomes, reduced healthcare costs."
#    Then validate creda clinics desc two as "Creda also provides analytics and reports that allow healthcare organizations to track patient engagement and monitor their progress. These services help clinics build better relationships with their patients, leading to increased trust and satisfaction."
#    Then Click on contact us btn and validate text as "Contact Us"
#    Then validate contact us page "Contact Us - CredaHealth"
#    And Back to home pageLogo