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

    Then validate patient engagement section as "Automate patient engagement so you can focus on patient care"
    Then validate patient engagement menus as "Colonoscopy" and "Sigmoidoscopy" and "Upper Endoscopy" and "Hemorrhoid"

    Then validate awareness section as "Lack of Awareness Impact on Delays and Cancellation"
    Then validate awareness descone as "Apprx. 30% of patient no- shows cost the healthcare industry $150 billion a year."
    Then validate awareness dessec as "No-shows and late cancellations can have a greater impact on GI practices than in other medical specialties due to the prep time required for the GI procedures. For a primary care physician, each missed appointment equals roughly $150-$200 in lost revenue. For surgeons, this is closer to $500."
    Then validate awareness descThrid as "Automatically triggering the right communication at the right time, Creda Health’s Patient Engagement Platform guides your patients through a premium care experience."
    Then validate awareness img as "https://credahealth.com/wp-content/uploads/2023/04/Untitled-design-49-640x537.png"

    Then validate reinforced education title as "Studies show the impact of reinforced education by telephone or short message service (SMS) leads to:"
    Then validate reinforced education secone as "Reduction in same- day cancellations"
    Then validate reinforced education secsecond as "Reduction in no- shows"
#
#    Then validate end to end patient title as "End-to-end patient engagement platform made for the enterprise."
#    Then validate end to end patient img as "https://credahealth.com/wp-content/uploads/2021/09/What-Are-the-Possible-Complications-of-Crohns-Disease.jpg"
#    Then validate contact us page "Contact Us - CredaHealth"
#    And Back to home page