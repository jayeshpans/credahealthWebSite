#Author: Jayesh
#Keywords Summary :
#Feature: about us us pages
#Scenario: validate about us page on web site
#Given:
#When:
#Then:
#And,But:

Feature: Validate about us page
  As a user of KYM App
  I should be able to see about us page

  Scenario: Open a about us page and validate it's text
    Given click on about us menu
    When validate page title as "About Us - CredaHealth"
    Then display about us page title as "About Us"
    Then display about creda health title as "About Creda Health"
    Then display about creda health desc as "Our mission is to address the critical care gap by enabling a continuum of care between patient and provider. We aim to decrease wait times, increase access to healthcare and improve compliance, with the goal of achieving better patient outcomes. Oh, and lower costs all around."
    Then click on start today btn and validate title as "Start Today!"
    Then validate get the app page as "Get The App - CredaHealth"
    Then back to home page

    Then validate our team title as "Our team"

    Then validate venkat srinivasan title as "Dr. Venkat Srinivasan"
    Then validate venkat srinivasan profile pic as "https://credahealth.com/wp-content/uploads/2023/03/Dr.-Venkat-Srinivasan.png"

    Then validate kim shah title as "Kim Shah"
    Then validate kim shah profile pic as "https://credahealth.com/wp-content/uploads/2023/03/Kim-Shah.png"

    Then validate monty title as "Monty Kothiwale"
    Then validate monty profile pic as "https://credahealth.com/wp-content/uploads/2023/03/Monty-Kothiwale.png"

    Then validate sanjiv luthra title as "Sanjiv Luthra"
    Then validate sanjiv luthra profile pic as "https://credahealth.com/wp-content/uploads/2023/03/Sanjiv-Luthra.png"

    Then validate mamta title as "Dr. Mamta Kothiwale"
    Then validate mamta profile pic as "https://credahealth.com/wp-content/uploads/2023/03/Dr.-Mamta-Kothiwale.png"

    Then validate medical advisory title as "Medical Advisory Panel"

    Then validate sanjiv chopra title as "Dr. Sanjiv Chopra"
    Then validate sanjiv chopra profile pic as "https://credahealth.com/wp-content/uploads/2023/03/Dr.-Sanjiv-Chopra.png"

    Then validate joseph mikhael title as "Dr. Joseph Mikhael"
    Then validate joseph mikhael profile pic as "https://credahealth.com/wp-content/uploads/2023/03/Dr.-Joseph-Mikhael.png"

    Then validate duane title as "Dr. Duane S. Pinto"
    Then validate duane profile pic as "https://credahealth.com/wp-content/uploads/2023/03/Dr.-Duane-S.-Pinto.png"

    Then validate frank title as "Dr. Frank J. Domino"
    Then validate frank profile pic as ""

    Then validate jay gupta title as "Jay Gupta"
    Then validate jay gupta profile pic as ""

    Then validate martin title as "Dr. Martin J. Abrahamson"
    Then validate martin profile pic as ""

    Then validate robert title as "Dr. Robert H. Shmerling"
    Then validate robert profile pic as ""

    Then validate jill title as "Dr. Jill Grimes"
    Then validate jill profile pic as ""

    Then validate john title as "Dr. John Sharp"
    Then validate john profile pic as ""