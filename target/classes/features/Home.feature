#Author: Jayesh
#Keywords Summary :
#Feature: home us pages
#Scenario: validate home page on web site
#Given:
#When:
#Then:
#And,But:

Feature: Validate home page
  As a user of KYM App
  I should be able to see home page

  Scenario: Open a home page
    Given Browse credaHealth web site
    When display home page title as "Digital Health Engagement - CredaHealth"
    Then verify WebSite logo
    Then display header menu
    Then validate feature section text as "Future of Healthcare Communication"
    Then validate feature section description as "We help you connect fragmented communication touchpoints and create a seamless channel minimizing redundant tasks and enabling staff to focus on serving patients."
    Then validate feature section backend image as "https://credahealth.com/wp-content/uploads/2021/08/hero_home_01-1.jpg"

    Then validate provider section title as "For Providers"
    Then validate provider section sub title as "Patient Engagement Service"
    Then validate provider description as "Managing the full scope of a patient's journey: Delivering happier staff, healthier patients,and more profitable organizations"

    Then validate provider sec1 title as "Deliver Email, Voice, and Text Message Reminders"
    Then validate provider sec1 desc as "Patient engagement services tremendously benefit healthcare providers and organizations. By empowering patients to take a more active role in their care, providers can reduce the burden on staff, streamline care delivery, and increase patient satisfaction. This leads to improved patient retention, increased referrals, and a more profitable organization."
    Then validate provider sec1 image as "https://credahealth.com/wp-content/uploads/2023/04/uncel-on-mobile.jpg"

    Then validate provider sec2 title as "Reduce No-shows with Automated Patient Reminders"
    Then validate provider sec2 desc as "No-shows can be a significant problem for healthcare providers, leading to missed appointments, wasted resources decreased patient satisfaction. Automated patient reminders can be an effective way to reduce the number of no-shows in healthcare practices. Using automated patient reminders, providers can increase appointment attendance rates and improve practice efficiency."
    Then validate provider sec2 image as "https://credahealth.com/wp-content/uploads/2023/04/doctor-writing-medical-reports-while-talking-patient.jpeg"

    Then validate provider sec3 title as "Improve Both Patient Care Quality and Patient Experience"
    Then validate provider sec3 desc as "Care coordination involves working collaboratively across healthcare settings and providers to ensure patients receive the right care at the right time. Educate patients about their conditions, treatment options, and preventive measures to help them achieve better outcomes and reduce healthcare costs."
    Then validate provider sec3 image as "https://credahealth.com/wp-content/uploads/2023/04/f30c4ee8-f0d8-4ba5-8797-2bd5e23cdfff.jpeg"

    Then validate patient process title as "Why You Need To Automate Patient Processes"
    Then validate patient process subtitle as "Due to the busy nature of your medical practice, your staff may often struggle to keep track of patient appointments, follow-up visits, and follow-up communications."
    Then validate patient process subtitle1 as "You may’ve noticed that some of your patients are slipping through the cracks and are concerned they’re not receiving the care they need. To address this issue, you need to implement an automated communication system."
    Then validate patient process desc as "Creda’s Patient engagement service allows patients to schedule appointments and receive automated reminders and personalized communication on pre-visit prep instructions and post-visit care that send follow-up messages to patients on time. With these systems in place, you can streamline your patient processes and ensure that your patients receive the care they need while freeing up your time to focus on providing quality medical care."
    Then display patient process img as "https://credahealth.com/wp-content/uploads/2021/08/hero_image_01.png"

    Then validate communicate section title as "Ways We Communicate With Your Patients"
    Then validate communicate section subtext as "Transform the way you interact with and educate your patients"

    Then validate supporting journey section title as "Supporting Patient Journey"

    Then validate engagement title as ""Creda Health's Patient Engagement Platform effectively reduces patient anxiety and improves preparedness through education"
    Then validate engagement writer name as "- Clinic Admin"

    Then validate wondering section title as "Wondering if Creda is Fit for you"
    Then validate wondering section subtext as "Learn How our flexible platform brings value to different types of the healthcare organization."
    Then click on see who we help