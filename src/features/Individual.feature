#Author: Jayesh
#Keywords Summary :
#Feature: providers us pages
#Scenario: validate individual page on web site
#Given:
#When:
#Then:
#And,But:

Feature: Validate individual page
  As a user of KYM App
  I should be able to see individual page

  Scenario: Open a individual page and validate it's text
    Given click on individual menu
    When validate page title as "Individual - CredaHealth"
    Then display individual page title as "Creda App"
    Then display individual page sub title as "Partner in Chronic Care"
    Then display credahelps section title as "How Creda Helps"
    Then display credahealps section description as "Reliable, comprehensive information about your health condition with expert guidance to address potential complications early on."

    Then hover chronic care section
    Then validate chronic care title as "Chronic Care"
    Then click on learn more button and validate title as "LEARN MORE"
    Then validate chronic care page title as "Chronic Care - CredaHealth"