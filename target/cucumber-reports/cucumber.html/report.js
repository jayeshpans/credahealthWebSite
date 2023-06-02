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
  "name": "Browse google web site",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "search text as \"python\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "validate search",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "assignment1",
  "keyword": "Then "
});
formatter.match({
  "location": "googleStepDef.browse_google_web_site()"
});
formatter.result({
  "duration": 112129800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "python",
      "offset": 16
    }
  ],
  "location": "googleStepDef.search_text_as(String)"
});
formatter.result({
  "duration": 2719800,
  "status": "passed"
});
formatter.match({
  "location": "googleStepDef.validate_search()"
});
formatter.result({
  "duration": 19800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 10
    }
  ],
  "location": "googleStepDef.assignment(int)"
});
formatter.result({
  "duration": 803000,
  "status": "passed"
});
});