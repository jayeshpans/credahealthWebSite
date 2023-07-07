#Author: Jayesh
#Keywords Summary :
#Feature: contact Us us pages
#Scenario: validate contact us page on web site
#Given:
#When:
#Then:
#And,But:


Feature: Validate contact us page
  As a user of KYM App
  I should be able to see contact us page

  Scenario: Open a contact us page and validate it's text
    Given click on contact us menu
    When validate page title as "Contact Us - CredaHealth"
    Then validate contact Us page title as "Contact"
    Then validate contact us desc as "A chronic condition management app that solves all your healthcare challenges."
    Then validate get touch title as "Get In Touch"
    Then validate get touch desc as "Delivering world class health care"
    Then validate USA address as "1 Central Street, #884 Norwood, MA 02062"
    Then validate USA email addess as "info@credahealth.com"
    Then validate india address as "Survey #1156, Shukrawar Peth, Pune, 411002"

    Then validate contact us form "Your name" and "Your email" and "Subject" and "Your message (optional)"
    When Enter invalid input for Your name as "Test"
    When Enter invalid input for Your email as "Your email"
    When Enter invalid input for Subject as "test"
    When Enter invalid input for Your message as "test test"
    When click on submit button
    Then display an error message as "One or more fields have an error. Please check and try again."