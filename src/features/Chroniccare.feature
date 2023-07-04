#Author: Jayesh
#Keywords Summary :
#Feature: chronic care us pages
#Scenario: validate chronic care page on web site
#Given:
#When:
#Then:
#And,But:

Feature: Validate chronic care page
  As a user of KYM App
  I should be able to see chronic care page

  Scenario: Open a chronic care page and validate it's text
    Given click on chronic care menu
    When validate chronic care page title as "Chronic Care - CredaHealth"
    Then validate chronic care pages title as "Creda App"
    Then validate chronic care sub title as "Take Back Your Life"
    Then validate download app button and display title as "Download App"
    Then validate get the app page as "Get The App - CredaHealth"
    Then back to home page
    Then validate condition sec title as "Chronic Condition Management"
    Then validate condition sec sub title as "Track vitals, diet, medications and symptoms easily on the go. Got questions? Your Creda Care Crew is waiting with answers."
    Then validate condition sec quote as "The measure of who we are is what we do with what we have.”"

    Then valdate big pic title as "The Big Picture"
    Then validate big pic desc as "You deserve personalized care that is realistic, simplified, and holistic. At Creda, we offer next-level communication between patient and provider for a healthier you. Take control of your health and manage your condition like never before. It’s easier than ever to get started."

    Then validate real export title as "Real Support from Real Experts"
    Then validate real export desc as "Living with a chronic disease is overwhelming and   emotionally draining. Who has time to track symptoms and vitals, remember to take medications, plan diet and exercise, and take proactive steps to prevent progression? Well, we do. We make it easier to tackle day-to-day challenges. Learn the foundational behaviors critical for good health."

    Then validate wholesome title as "Savor a Wholesome Solution"
    Then validate wholesome desc as "With our holistic approach combining science and technology, we help you live your best life, keeping your condition in check with a seamless continuum of care and real, measurable results."

    Then validate journey section title as "Understanding You And Your Journey:"
    Then validate journey section desc as "We understand your health profile, including all the modifiable risk factors you may ave that can increase your risk of health problems and complications."
#    Then validte journey background image as ""

    Then validate approach section as "Personalizing The Approach To You"
    Then validate approach sub section desc as "We customize the app features to guide you to achieve your health goals."
    Then validate approach sub desc as "You can start tracking vitals, medications, food, and exercise along with access to content like articles, factsheets and videos personalized to your concerns."
#    Then validate approach background image as ""

    Then validate collaborative section title as "Building Continuous, Coordinated, Collaborative Care"
    Then validate collaborative section sub title as "You are assigned a care team comprising of nutrition and health experts who help you set realistic and achievable health goals."
    Then validate collaborative section desc as "They customize their support to your health needs, hand hold you, and tweak your program as they become more familiar with your lifestyle through continuous communication andmonitoring all the metrics you track in the app. The digital health assistant also provides mindful nudges and insights into your health and habits."
#    Then validate collaboractive background image as ""

    Then validate progress section title as "Evaluating Your Progress/Putting Together The Big Picture"
    Then validate progress section desc as "Through regular check-ins and health related questionnaires on your symptoms and disease we ensure that you stay on top of any onset of complications or disease progression. Weekly health reports that include metrics on your medication adherence, symptoms, food with macro and micro nutrients, vitals, and exercise along with a care team reviewing all of this in the backend, we enable you, your physician, and us to connect the dots so that you can take proactive steps to prevent complications."

    Then validate what we care title as "What We Care For"
    Then validate what we care sub title as "Making professional therapy accessible"

    Then validate Lupus section as "Lupus"
    Then click on Enroll Today for Free button for lupus section and title as "Enroll Today for Free"
    Then validate get the app page as "Get The App - CredaHealth"
    Then back to home page

    Then validate IBD section as "IBD"
    Then click on Enroll Today for Free button for IBD section and title as "Enroll Today for Free"
    Then validate get the app page as "Get The App - CredaHealth"
    Then back to home page

    Then validate IBS section as "IBS"
    Then click on Enroll Today for Free button for IBS section and title as "Enroll Today for Free"
    Then validate get the app page as "Get The App - CredaHealth"
    Then back to home page

    Then validate diabetesone section as "Diabetes Type 1"
    Then click on Enroll Today for Free button for diabetesone section and title as "Enroll Today for Free"
    Then validate get the app page as "Get The App - CredaHealth"
    Then back to home page

    Then validate diabetestwo section as "Diabetes Type 2"
    Then click on Enroll Today for Free button for diabetestwo section and title as "Enroll Today for Free"
    Then validate get the app page as "Get The App - CredaHealth"
    Then back to home page

    Then validate hypertension section as "Hypertension"
    Then click on Enroll Today for Free button for hypertension section and title as "Enroll Today for Free"
    Then validate get the app page as "Get The App - CredaHealth"
    Then back to home page

    Then validate prediabetes section as "Prediabetes"
    Then click on Enroll Today for Free button for prediabetes section and title as "Enroll Today for Free"
    Then validate get the app page as "Get The App - CredaHealth"
    Then back to home page

    Then validate overweight section as "Overweight / Obesity"
    Then click on Enroll Today for Free button for overweight section and title as "Enroll Today for Free"
    Then validate get the app page as "Get The App - CredaHealth"
    Then back to home page

    Then validate cholesterol section as "High Cholesterol"
    Then click on Enroll Today for Free button for cholesterol section and title as "Enroll Today for Free"
    Then validate get the app page as "Get The App - CredaHealth"
    Then back to home page