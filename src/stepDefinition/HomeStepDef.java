package stepDefinition;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.BaseClass;
import org.testng.Assert;
import pages.HomePage;

import java.lang.reflect.Array;
import java.util.HashSet;

public class HomeStepDef extends BaseClass {

    @Given("^Browse credaHealth web site$")
    public void browse_credaHealth_web_site(){

    }

    @When("^display home page title as \"([^\"]*)\"$")
    public void display_home_page_title_as(String pageTitle) throws Throwable {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.getHomePageTitle(getDriver()), pageTitle);

    }
    @When("^display home page$")
    public void display_home_page(){
          }
    @Then("^verify WebSite logo$")
    public void verify_WebSite_logo(){
        HomePage objHomePage= new HomePage(getDriver());
        //System.out.println(objHomePage.verifyWebSiteLogo(getDriver()));
    }
    @Then("^display header menu$")
    public void display_header_menu(){
        HomePage objHomePage= new HomePage(getDriver());
        HashSet listOfHeaderMenu = new HashSet<>();
        listOfHeaderMenu.add("Home");
        listOfHeaderMenu.add("Providers");
        listOfHeaderMenu.add("Individual");
        listOfHeaderMenu.add("About Us");
        listOfHeaderMenu.add("Contact Us");
        listOfHeaderMenu.add("Blog");

        if(!objHomePage.getheaderMenu(getDriver()).isEmpty()){
            for (int i=1; i<objHomePage.getheaderMenu(getDriver()).size(); i++){
                Assert.assertTrue(listOfHeaderMenu.contains(objHomePage.getheaderMenu(getDriver()).get(i).getText()));
            }
        }else {
            System.out.println("No header is available.");
        }
        Assert.assertEquals(objHomePage.getDownloadBtnTxt(), "Download App");
    }
    @Then("^validate feature section text as \"([^\"]*)\"$")
    public void validate_feature_section_text_as(String feaheader){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateFeatureSecHeader(), feaheader);
    }

    @Then("^validate feature section description as \"([^\"]*)\"$")
    public void validate_feature_section_description_as(String featxt) throws Throwable {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateFeatureSecTxt(), featxt);
    }

    @Then("^validate feature section backend image as \"([^\"]*)\"$")
    public void validate_feature_section_backend_image_as(String feaimgUrl) throws Throwable {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateFeatureBackImage(), feaimgUrl);
    }

    @Then("^validate provider section title as \"([^\"]*)\"$")
    public void validate_provider_section_title_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate provider section sub title as \"([^\"]*)\"$")
    public void validate_provider_section_sub_title_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate provider description as \"([^\"]*)\"$")
    public void validate_provider_description_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate provider sec(\\d+) title as \"([^\"]*)\"$")
    public void validate_provider_sec_title_as(int arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate provider sec(\\d+) desc as \"([^\"]*)\"$")
    public void validate_provider_sec_desc_as(int arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate provider sec(\\d+) image as \"([^\"]*)\"$")
    public void validate_provider_sec_image_as(int arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate patient process title as \"([^\"]*)\"$")
    public void validate_patient_process_title_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate patient process subtitle as \"([^\"]*)\"$")
    public void validate_patient_process_subtitle_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate patient process subtitle(\\d+) as \"([^\"]*)\"$")
    public void validate_patient_process_subtitle_as(int arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate patient process desc as \"([^\"]*)\"$")
    public void validate_patient_process_desc_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^display patient process img as \"([^\"]*)\"$")
    public void display_patient_process_img_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate communicate section title as \"([^\"]*)\"$")
    public void validate_communicate_section_title_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate communicate section subtext as \"([^\"]*)\"$")
    public void validate_communicate_section_subtext_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate supporting journey section title as \"([^\"]*)\"$")
    public void validate_supporting_journey_section_title_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate engagement title as \"([^\"]*)\"Creda Health's Patient Engagement Platform effectively reduces patient anxiety and improves preparedness through education\"$")
    public void validate_engagement_title_as_Creda_Health_s_Patient_Engagement_Platform_effectively_reduces_patient_anxiety_and_improves_preparedness_through_education(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate engagement writer name as \"([^\"]*)\"$")
    public void validate_engagement_writer_name_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate wondering section title as \"([^\"]*)\"$")
    public void validate_wondering_section_title_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate wondering section subtext as \"([^\"]*)\"$")
    public void validate_wondering_section_subtext_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^click on see who we help$")
    public void click_on_see_who_we_help() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate engagement title as \"([^\"]*)\"$")
    public void validateEngagementTitleAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
