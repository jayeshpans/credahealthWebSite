$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Jayesh"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: home us pages"
    },
    {
      "line": 4,
      "value": "#Scenario: validate home page on web site"
    },
    {
      "line": 5,
      "value": "#Given:"
    },
    {
      "line": 6,
      "value": "#When:"
    },
    {
      "line": 7,
      "value": "#Then:"
    },
    {
      "line": 8,
      "value": "#And,But:"
    }
  ],
  "line": 10,
  "name": "Validate home page",
  "description": "As a user of KYM App\r\nI should be able to see home page",
  "id": "validate-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 14,
  "name": "Open a home page",
  "description": "",
  "id": "validate-home-page;open-a-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Browse credaHealth web site",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "display home page title as \"Digital Health Engagement - CredaHealth\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "verify WebSite logo",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "display header menu",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "validate feature section text as \"Future of Healthcare Communication\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "validate feature section description as \"We help you connect fragmented communication touchpoints and create a seamless channel minimizing redundant tasks and enabling staff to focus on serving patients.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "validate feature section backend image as \"https://credahealth.com/wp-content/uploads/2021/08/hero_home_01-1.jpg\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDef.browse_credaHealth_web_site()"
});
formatter.result({
  "duration": 267313100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Health Engagement - CredaHealth",
      "offset": 28
    }
  ],
  "location": "HomeStepDef.display_home_page_title_as(String)"
});
formatter.result({
  "duration": 71638400,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.verify_WebSite_logo()"
});
formatter.result({
  "duration": 422300,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.display_header_menu()"
});
formatter.result({
  "duration": 949191200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Future of Healthcare Communication",
      "offset": 34
    }
  ],
  "location": "HomeStepDef.validate_feature_section_text_as(String)"
});
formatter.result({
  "duration": 45165100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "We help you connect fragmented communication touchpoints and create a seamless channel minimizing redundant tasks and enabling staff to focus on serving patients.",
      "offset": 41
    }
  ],
  "location": "HomeStepDef.validate_feature_section_description_as(String)"
});
formatter.result({
  "duration": 66526000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://credahealth.com/wp-content/uploads/2021/08/hero_home_01-1.jpg",
      "offset": 43
    }
  ],
  "location": "HomeStepDef.validate_feature_section_backend_image_as(String)"
});
formatter.result({
  "duration": 82467000,
  "status": "passed"
});
});