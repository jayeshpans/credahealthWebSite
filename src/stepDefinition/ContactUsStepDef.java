package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.BaseClass;
import org.testng.Assert;
import pages.ContactUsPage;

public class ContactUsStepDef extends BaseClass {
    @Given("^click on contact us menu$")
    public void click_on_contact_us_menu() {
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        objContactUsPage.clickOnContactUsMenu();
    }
    @Then("^validate contact Us page title as \"([^\"]*)\"$")
    public void validate_contact_Us_page_title_as(String arg1){
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        Assert.assertEquals(objContactUsPage.getContactUsPageTitle(), arg1);
    }

    @Then("^validate contact us desc as \"([^\"]*)\"$")
    public void validate_contact_us_desc_as(String arg1) {
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        Assert.assertEquals(objContactUsPage.getContactUsDesc(), arg1);
    }

    @Then("^validate get touch title as \"([^\"]*)\"$")
    public void validate_get_touch_title_as(String arg1) throws Throwable {
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        Assert.assertEquals(objContactUsPage.getTouchTitle(), arg1);
    }

    @Then("^validate get touch desc as \"([^\"]*)\"$")
    public void validate_get_touch_desc_as(String arg1) {
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        Assert.assertEquals(objContactUsPage.getTouchDesc(), arg1);
    }

    @Then("^validate USA address as \"([^\"]*)\"$")
    public void validate_USA_address_as(String arg1){
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        Assert.assertEquals(objContactUsPage.getUSAAdress(), arg1);
    }

    @Then("^validate USA email addess as \"([^\"]*)\"$")
    public void validate_USA_email_addess_as(String arg1) throws Throwable {
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        Assert.assertEquals(objContactUsPage.getUSAEmailTitle(), arg1);
        Assert.assertEquals(objContactUsPage.getUSAEmailAddrsss(), arg1);
    }

    @Then("^validate india address as \"([^\"]*)\"$")
    public void validate_india_address_as(String arg1) {
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        Assert.assertEquals(objContactUsPage.getIndEmailAddrsss(), arg1);
    }
    @Given("^open contact us page$")
    public void open_contact_us_page() {

    }


    @Then("^validate contact us form \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void validate_contact_us_form_and_and_and(String arg1, String arg2, String arg3, String arg4) {
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        Assert.assertEquals(objContactUsPage.getYourname(), arg1);
        Assert.assertEquals(objContactUsPage.getYourEmail(), arg2);
        Assert.assertEquals(objContactUsPage.getSubject(), arg3);
        Assert.assertEquals(objContactUsPage.getYourMessage(), arg4);
    }

    @When("^Enter invalid input for Your name as \"([^\"]*)\"$")
    public void enter_invalid_input_for_Your_name_as(String arg1) {
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        objContactUsPage.sendInputToName(arg1);
    }

    @When("^Enter invalid input for Your email as \"([^\"]*)\"$")
    public void enter_invalid_input_for_Your_email_as(String arg1) {
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        objContactUsPage.sendInputToEmail(arg1);
    }

    @When("^Enter invalid input for Subject as \"([^\"]*)\"$")
    public void enter_invalid_input_for_Subject_as(String arg1) {
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        objContactUsPage.sendInputToSubject(arg1);
    }

    @When("^Enter invalid input for Your message as \"([^\"]*)\"$")
    public void enter_invalid_input_for_Your_message_as(String arg1) {
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        objContactUsPage.sendInputToMessage(arg1);
    }

    @When("^click on submit button$")
    public void click_on_submit_button() {
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        objContactUsPage.clickOnSubmitBtn();
    }

    @Then("^display an error message as \"([^\"]*)\"$")
    public void display_an_error_message_as(String arg1) throws Throwable {
        ContactUsPage objContactUsPage = new ContactUsPage(getDriver());
        Assert.assertEquals(objContactUsPage.getContactUsErrorMessage(), arg1);
    }
}
