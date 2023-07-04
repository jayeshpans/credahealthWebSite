package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.BaseClass;
import pages.AboutUsPage;

public class AboutUsStepDef extends BaseClass {
    @Given("^click on about us menu$")
    public void click_on_about_us_menu() {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.clickOnAboutUsMenu();
    }

    @When("^validate page title as \"([^\"]*)\"$")
    public void validate_page_title_as(String arg1) {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getAboutUsPageTitle();
    }

    @Then("^display about us page title as \"([^\"]*)\"$")
    public void display_about_us_page_title_as(String arg1) {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getAboutUsTitle();
    }

    @Then("^display about creda health title as \"([^\"]*)\"$")
    public void display_about_creda_health_title_as(String arg1) throws InterruptedException {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getCredaHealthTitle();
    }

    @Then("^display about creda health desc as \"([^\"]*)\"$")
    public void display_about_creda_health_desc_as(String arg1) {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getcredaHealthDesc();
    }

    @Then("^click on start today btn and validate title as \"([^\"]*)\"$")
    public void click_on_start_today_btn_and_validate_title_as(String arg1) {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getStartTodayBtnTitle();
        objAboutUsPage.clickOnStartTodaybtn();
    }

    @Then("^validate our team title as \"([^\"]*)\"$")
    public void validate_our_team_title_as(String arg1) {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getOurTeamTitle();
    }

    @Then("^validate venkat srinivasan title as \"([^\"]*)\"$")
    public void validate_venkat_srinivasan_title_as(String arg1) {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getvenkatName();
    }

    @Then("^validate venkat srinivasan profile pic as \"([^\"]*)\"$")
    public void validate_venkat_srinivasan_profile_pic_as(String arg1) {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getvenkatProfilePicURL();
    }

    @Then("^validate kim shah title as \"([^\"]*)\"$")
    public void validate_kim_shah_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getkimshaName();
    }

    @Then("^validate kim shah profile pic as \"([^\"]*)\"$")
    public void validate_kim_shah_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getkimProfilePicURL();
    }

    @Then("^validate monty title as \"([^\"]*)\"$")
    public void validate_monty_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getmontyName();
    }

    @Then("^validate monty profile pic as \"([^\"]*)\"$")
    public void validate_monty_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getmontyProfPicURL();
    }

    @Then("^validate sanjiv luthra title as \"([^\"]*)\"$")
    public void validate_sanjiv_luthra_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getsanjivName();
    }

    @Then("^validate sanjiv luthra profile pic as \"([^\"]*)\"$")
    public void validate_sanjiv_luthra_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getsanjivProfPicURL();
    }

    @Then("^validate mamta title as \"([^\"]*)\"$")
    public void validate_mamta_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getmantaName();
    }

    @Then("^validate mamta profile pic as \"([^\"]*)\"$")
    public void validate_mamta_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getmamtaProfPicURL();
    }

    @Then("^validate medical advisory title as \"([^\"]*)\"$")
    public void validate_medical_advisory_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getmedicalAdvisoryTitle();
    }

    @Then("^validate sanjiv chopra title as \"([^\"]*)\"$")
    public void validate_sanjiv_chopra_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getsanjivChopraName();
    }

    @Then("^validate sanjiv chopra profile pic as \"([^\"]*)\"$")
    public void validate_sanjiv_chopra_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getsanjivChopraProfPicURL();
    }

    @Then("^validate joseph mikhael title as \"([^\"]*)\"$")
    public void validate_joseph_mikhael_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getjosephName();
    }

    @Then("^validate joseph mikhael profile pic as \"([^\"]*)\"$")
    public void validate_joseph_mikhael_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getjosephProfPicURL();
    }

    @Then("^validate duane title as \"([^\"]*)\"$")
    public void validate_duane_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getDuaneName();
    }

    @Then("^validate duane profile pic as \"([^\"]*)\"$")
    public void validate_duane_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getDuanePrfilePicURL();
    }

    @Then("^validate frank title as \"([^\"]*)\"$")
    public void validate_frank_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getfrankName();
    }

    @Then("^validate frank profile pic as \"([^\"]*)\"$")
    public void validate_frank_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getFrankPrfilePicURL();
    }

    @Then("^validate jay gupta title as \"([^\"]*)\"$")
    public void validate_jay_gupta_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getJayGuptaName();
    }

    @Then("^validate jay gupta profile pic as \"([^\"]*)\"$")
    public void validate_jay_gupta_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getJayGuptaPrfilePicURL();
    }

    @Then("^validate martin title as \"([^\"]*)\"$")
    public void validate_martin_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getMartinName();
    }

    @Then("^validate martin profile pic as \"([^\"]*)\"$")
    public void validate_martin_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getMartinPrfilePicURL();
    }

    @Then("^validate robert title as \"([^\"]*)\"$")
    public void validate_robert_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getRobertName();
    }

    @Then("^validate robert profile pic as \"([^\"]*)\"$")
    public void validate_robert_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getRobertPrfilePicURL();
    }

    @Then("^validate jill title as \"([^\"]*)\"$")
    public void validate_jill_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getJillName();
    }

    @Then("^validate jill profile pic as \"([^\"]*)\"$")
    public void validate_jill_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getJillPrfilePicURL();
    }

    @Then("^validate john title as \"([^\"]*)\"$")
    public void validate_john_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getJohnName();
    }

    @Then("^validate john profile pic as \"([^\"]*)\"$")
    public void validate_john_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getJohnPrfilePicURL();
    }

}
