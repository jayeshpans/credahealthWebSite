package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.BaseClass;
import pages.GetTheAppPage;

public class GetTheAppStepDef extends BaseClass {
    @Given("^click on get the app menu$")
    public void click_on_get_the_app_menu() throws Throwable {
        GetTheAppPage objGetTheAppPage= new GetTheAppPage(getDriver());
        objGetTheAppPage.clickOngetTheApp();
    }
    @When("^verify get the app title as \"([^\"]*)\"$")
    public void verify_get_the_app_title_as(String arg1) {
        GetTheAppPage objGetTheAppPage= new GetTheAppPage(getDriver());
        objGetTheAppPage.getTheAppTitle();
    }

    @Then("^verify page title as \"([^\"]*)\"$")
    public void verify_page_title_as(String arg1) {
        GetTheAppPage objGetTheAppPage= new GetTheAppPage(getDriver());
        objGetTheAppPage.getpageTitle();
    }

    @Then("^verify page desc as \"([^\"]*)\"$")
    public void verify_page_desc_as(String arg1){
        GetTheAppPage objGetTheAppPage= new GetTheAppPage(getDriver());
        objGetTheAppPage.getpageDesc();
    }

    @Then("^verify try it free title as \"([^\"]*)\"$")
    public void verify_try_it_free_title_as(String arg1){
        GetTheAppPage objGetTheAppPage= new GetTheAppPage(getDriver());
        objGetTheAppPage.getTryItFreeTitle();
    }

    @Then("^verify try it free desc as \"([^\"]*)\"$")
    public void verify_try_it_free_desc_as(String arg1) {
        GetTheAppPage objGetTheAppPage= new GetTheAppPage(getDriver());
        objGetTheAppPage.getTryItFreeDesc();
    }

    @Then("^verify app links title as \"([^\"]*)\"$")
    public void verify_app_links_title_as(String arg1) {
        GetTheAppPage objGetTheAppPage= new GetTheAppPage(getDriver());
        objGetTheAppPage.getAppLinkTitle();
    }

    @Then("^verify app store link \"([^\"]*)\"$")
    public void verify_app_store_link(String arg1) {
        GetTheAppPage objGetTheAppPage= new GetTheAppPage(getDriver());
        objGetTheAppPage.getAppStoreLink();
    }

    @Then("^verify play store link as \"([^\"]*)\"$")
    public void verify_play_store_link_as(String arg1) {
        GetTheAppPage objGetTheAppPage= new GetTheAppPage(getDriver());
        objGetTheAppPage.getPlayStoreLink();
    }

    @Then("^verify play store logo as \"([^\"]*)\"$")
    public void verify_play_store_logo_as(String arg1) {
        GetTheAppPage objGetTheAppPage= new GetTheAppPage(getDriver());
        objGetTheAppPage.getPlayStoreLogoLink();
    }
}
