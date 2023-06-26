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
formatter.match({
  "location": "HomeStepDef.browse_credaHealth_web_site()"
});
formatter.result({
  "duration": 114565700,
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
  "duration": 47909000,
  "status": "passed"
});
formatter.uri("Individual.feature");
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
      "value": "#Feature: providers us pages"
    },
    {
      "line": 4,
      "value": "#Scenario: validate individual page on web site"
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
  "name": "Validate individual page",
  "description": "As a user of KYM App\r\nI should be able to see individual page",
  "id": "validate-individual-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 14,
  "name": "Open a individual page and validate it\u0027s text",
  "description": "",
  "id": "validate-individual-page;open-a-individual-page-and-validate-it\u0027s-text",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "click on individual menu",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "validate page title as \"Individual - CredaHealth\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "display individual page title as \"Creda App\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "display individual page sub title as \"Partner in Chronic Care\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "display credahelps section title as \"How Creda Helps\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "display credahealps section description as \"Reliable, comprehensive information about your health condition with expert guidance to address potential complications early on.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "hover chronic care section",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "validate chronic care title as \"Chronic Care\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "click on learn more button and validate title as \"LEARN MORE\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "validate chronic care page title as \"Chronic Care - CredaHealth\"",
  "keyword": "Then "
});
formatter.match({
  "location": "IndividualStepDef.click_on_individual_menu()"
});
formatter.result({
  "duration": 1371723400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Individual - CredaHealth",
      "offset": 24
    }
  ],
  "location": "IndividualStepDef.validate_page_title_as(String)"
});
formatter.result({
  "duration": 9902000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Creda App",
      "offset": 34
    }
  ],
  "location": "IndividualStepDef.display_individual_page_title_as(String)"
});
formatter.result({
  "duration": 49046400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Partner in Chronic Care",
      "offset": 38
    }
  ],
  "location": "IndividualStepDef.display_individual_page_sub_title_as(String)"
});
formatter.result({
  "duration": 56097800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "How Creda Helps",
      "offset": 37
    }
  ],
  "location": "IndividualStepDef.display_credahelps_section_title_as(String)"
});
formatter.result({
  "duration": 62386700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reliable, comprehensive information about your health condition with expert guidance to address potential complications early on.",
      "offset": 44
    }
  ],
  "location": "IndividualStepDef.display_credahealps_section_description_as(String)"
});
formatter.result({
  "duration": 32839800,
  "status": "passed"
});
formatter.match({
  "location": "IndividualStepDef.hover_chronic_care_section()"
});
formatter.result({
  "duration": 216600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chronic Care",
      "offset": 32
    }
  ],
  "location": "IndividualStepDef.validate_chronic_care_title_as(String)"
});
formatter.result({
  "duration": 30004600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LEARN MORE",
      "offset": 50
    }
  ],
  "location": "IndividualStepDef.click_on_learn_more_button_and_validate_title_as(String)"
});
formatter.result({
  "duration": 1697059800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chronic Care - CredaHealth",
      "offset": 37
    }
  ],
  "location": "IndividualStepDef.validate_chronic_care_page_title_as(String)"
});
formatter.result({
  "duration": 9053700,
  "status": "passed"
});
formatter.uri("Providers.feature");
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
      "value": "#Feature: providers us pages"
    },
    {
      "line": 4,
      "value": "#Scenario: validate providers page on web site"
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
  "name": "Validate providers page",
  "description": "As a user of KYM App\r\nI should be able to see provider page",
  "id": "validate-providers-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 14,
  "name": "Open a provider page and validate it\u0027s text",
  "description": "",
  "id": "validate-providers-page;open-a-provider-page-and-validate-it\u0027s-text",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "click on provider menu",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "validate clinics page \"Clinics - CredaHealth\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "validate Patient Communication section as \"Powerful Patient Communication at Scale\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "validate Patient Communication section img as \"https://credahealth.com/wp-content/uploads/2023/04/B2B-CREDA-1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProviderStepDef.click_on_provider_menu()"
});
formatter.result({
  "duration": 2722563300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Clinics - CredaHealth",
      "offset": 23
    }
  ],
  "location": "HomeStepDef.validate_clinics_page(String)"
});
formatter.result({
  "duration": 11667700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Powerful Patient Communication at Scale",
      "offset": 43
    }
  ],
  "location": "ProviderStepDef.validate_Patient_Communication_section_as(String)"
});
formatter.result({
  "duration": 46608600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://credahealth.com/wp-content/uploads/2023/04/B2B-CREDA-1.png",
      "offset": 47
    }
  ],
  "location": "ProviderStepDef.validate_Patient_Communication_section_img_as(String)"
});
formatter.result({
  "duration": 69306900,
  "status": "passed"
});
});