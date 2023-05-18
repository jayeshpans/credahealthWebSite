package stepDefinition;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
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
}
