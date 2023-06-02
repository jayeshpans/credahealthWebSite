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
    Given Browse google web site
    When search text as "python"
    Then validate search
    Then assignment1