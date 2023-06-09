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
    When validate provider page title
    Then validate Patient Communication section as "Powerful Patient Communication at Scale"
    Then validate Patient Communication section img as "https://credahealth.com/wp-content/uploads/2023/04/B2B-CREDA-1.png"