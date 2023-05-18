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
