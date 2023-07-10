#Author: Jayesh
#Keywords Summary :
#Feature: Get the app pages
#Scenario: validate get the app page on web site
#Given:
#When:
#Then:
#And,But:


Feature: Validate get the app page
  As a user of KYM App
  I should be able to see get the app page

  Scenario: Open a get the app page and validate it's text
    Given click on get the app menu
    When verify get the app title as "Get The App - CredaHealth"
    Then verify page title as "Get the App"
    Then verify page desc as "A chronic condition management app that solves all your healthcare challenges."
    Then verify try it free title as "Try it free"
    Then verify try it free desc as "Creda will help you stay on top of your game. You'll get 24/7 support from our digital health assistant and guidance."
    Then verify app links title as "Get the App"
    Then verify app store link "https://apps.apple.com/in/app/knowyourmeds-com/id1373272399"
    Then verify play store link as "https://play.google.com/store/apps/details?id=com.knowyourmeds&amp;hl=en_IN&amp;gl=US"
    Then verify play store logo as "https://credahealth.com/wp-content/uploads/2023/03/Creda_GetTheApp_QR-160x160.png"
