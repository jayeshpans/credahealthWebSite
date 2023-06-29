package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import lib.BaseClass;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.testng.Assert;
import pages.ChronicCarePage;

public class ChroniccareStepDef extends BaseClass {
    @Given("^click on chronic care menu$")
    public void click_on_chronic_care_menu() {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.clickonchronicmenu();
    }
    @Then("^validate chronic care sub title as \"([^\"]*)\"$")
    public void validate_chronic_care_sub_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.validatecareSubtitle(), arg1);
    }

    @Then("^validate download app button and display title as \"([^\"]*)\"$")
    public void validate_download_app_button_and_display_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getDownloadAppBtn(), arg1);
        objChronicCarePage.clickOnDownloadAppBtn();
    }

    @Then("^validate condition sec title as \"([^\"]*)\"$")
    public void validate_condition_sec_title_as(String arg1) throws InterruptedException {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.conditionSecTitle(), arg1);
    }

    @Then("^validate condition sec sub title as \"([^\"]*)\"$")
    public void validate_condition_sec_sub_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.conditionSecSubTitle(), arg1);
    }

    @Then("^validate condition sec quote as \"([^\"]*)\"$")
    public void validate_condition_sec_quote_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.conditionQuote(), '"'+arg1);
    }

    @Then("^valdate big pic title as \"([^\"]*)\"$")
    public void valdate_big_pic_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.bigPicTitle(), arg1);
    }

    @Then("^validate big pic desc as \"([^\"]*)\"$")
    public void validate_big_pic_desc_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.bigPicDesc();
    }

    @Then("^validate real export title as \"([^\"]*)\"$")
    public void validate_real_export_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.realExportTitle(), arg1);
    }

    @Then("^validate real export desc as \"([^\"]*)\"$")
    public void validate_real_export_desc_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.realExportDesc();
    }

    @Then("^validate wholesome title as \"([^\"]*)\"$")
    public void validate_wholesome_title_as(String arg1) throws InterruptedException {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.wholesomeTitle(), arg1);
    }

    @Then("^validate wholesome desc as \"([^\"]*)\"$")
    public void validate_wholesome_desc_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.wholesomeDesc();
    }
    @Then("^validate get the app page as \"([^\"]*)\"$")
    public void validate_get_the_app_page_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        System.out.println(objChronicCarePage.getTheAppPageTitle());
        Assert.assertEquals(objChronicCarePage.getTheAppPageTitle(), arg1);
    }

    @Then("^back to home page$")
    public void back_to_home_page() throws Throwable {
        getDriver().navigate().back();
    }
    @Then("^validate chronic care pages title as \"([^\"]*)\"$")
    public void validate_chronic_care_pages_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.validatecaretitle(), arg1);
        System.out.println(objChronicCarePage.validatecaretitle());
    }
    @Then("^validate journey section title as \"([^\"]*)\"$")
    public void validate_journey_section_title_as(String arg1) {

    }

    @Then("^validate journey section desc as \"([^\"]*)\"$")
    public void validate_journey_section_desc_as(String arg1) {

    }

    @Then("^validate approach section as \"([^\"]*)\"$")
    public void validate_approach_section_as(String arg1) {

    }

    @Then("^validate approach sub section desc as \"([^\"]*)\"$")
    public void validate_approach_sub_section_desc_as(String arg1) {

    }

    @Then("^validate approach sub desc as \"([^\"]*)\"$")
    public void validate_approach_sub_desc_as(String arg1) {

    }

    @Then("^validate collaborative section title as \"([^\"]*)\"$")
    public void validate_collaborative_section_title_as(String arg1) {

    }

    @Then("^validate collaborative section sub title as \"([^\"]*)\"$")
    public void validate_collaborative_section_sub_title_as(String arg1) {

    }

    @Then("^validate collaborative section desc as \"([^\"]*)\"$")
    public void validate_collaborative_section_desc_as(String arg1) {

    }

    @Then("^validate progress section title as \"([^\"]*)\"$")
    public void validate_progress_section_title_as(String arg1) {

    }

    @Then("^validate progress section desc as \"([^\"]*)\"$")
    public void validate_progress_section_desc_as(String arg1) {

    }
}
