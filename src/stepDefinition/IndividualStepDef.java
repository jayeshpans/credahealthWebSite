package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.BaseClass;
import org.testng.Assert;
import pages.ChronicCarePage;
import pages.IndividualPage;

public class IndividualStepDef extends BaseClass {
    @Given("^click on individual menu$")
    public void click_on_individual_menu(){
        IndividualPage objIndividualPage = new IndividualPage(getDriver());
        objIndividualPage.openindividualpage();
    }
    @When("^validate page title as \"([^\"]*)\"$")
    public void validate_page_title_as(String arg1) {
        IndividualPage objIndividualPage = new IndividualPage(getDriver());
        Assert.assertEquals(objIndividualPage.getIndividualPageTitle(), arg1);
    }

    @Then("^display individual page title as \"([^\"]*)\"$")
    public void display_individual_page_title_as(String arg1) {
        IndividualPage objIndividualPage = new IndividualPage(getDriver());
        Assert.assertEquals(objIndividualPage.getIndividualPageMainTitle(), arg1);
    }

    @Then("^display individual page sub title as \"([^\"]*)\"$")
    public void display_individual_page_sub_title_as(String arg1) {
        IndividualPage objIndividualPage = new IndividualPage(getDriver());
        Assert.assertEquals(objIndividualPage.getIndividualPageSubTitle(), arg1);
    }

    @Then("^display credahelps section title as \"([^\"]*)\"$")
    public void display_credahelps_section_title_as(String arg1) {
        IndividualPage objIndividualPage = new IndividualPage(getDriver());
        Assert.assertEquals(objIndividualPage.getcredahelpsTitle(), arg1);
    }

    @Then("^display credahealps section description as \"([^\"]*)\"$")
    public void display_credahealps_section_description_as(String arg1) {
        IndividualPage objIndividualPage = new IndividualPage(getDriver());
        Assert.assertEquals(objIndividualPage.getcredahelpsDesc(), arg1);
    }

    @Then("^hover chronic care section$")
    public void hover_chronic_care_section() {
        IndividualPage objIndividualPage = new IndividualPage(getDriver());
        objIndividualPage.hoverChronicCareSection();
    }

    @Then("^validate chronic care title as \"([^\"]*)\"$")
    public void validate_chronic_care_title_as(String arg1) {
        IndividualPage objIndividualPage = new IndividualPage(getDriver());
        Assert.assertEquals(objIndividualPage.getChronicCareSectionTitle(), arg1);
    }

    @Then("^click on learn more button and validate title as \"([^\"]*)\"$")
    public void click_on_learn_more_button_and_validate_title_as(String arg1) {
        IndividualPage objIndividualPage = new IndividualPage(getDriver());
        Assert.assertEquals(objIndividualPage.getlearnMoreBtnTitle(), arg1);
        objIndividualPage.clickonlearnMoreBtnTitle();
    }

    @Then("^validate chronic care page title as \"([^\"]*)\"$")
    public void validate_chronic_care_page_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getobjChronicCarePageTitle(), arg1);
    }
}
