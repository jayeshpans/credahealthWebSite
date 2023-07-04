package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import lib.BaseClass;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.apache.velocity.runtime.parser.node.ASTAssignment;
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
    }
    @Then("^validate journey section title as \"([^\"]*)\"$")
    public void validate_journey_section_title_as(String arg1) throws InterruptedException {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.journeyTitle(), arg1);
    }

    @Then("^validate journey section desc as \"([^\"]*)\"$")
    public void validate_journey_section_desc_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.journeyDesc();
    }

    @Then("^validate approach section as \"([^\"]*)\"$")
    public void validate_approach_section_as(String arg1) throws InterruptedException {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.approachTitle();
    }

    @Then("^validate approach sub section desc as \"([^\"]*)\"$")
    public void validate_approach_sub_section_desc_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.approachSubDescOne();
    }

    @Then("^validate approach sub desc as \"([^\"]*)\"$")
    public void validate_approach_sub_desc_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.approachSubDesctwo();
    }

    @Then("^validate collaborative section title as \"([^\"]*)\"$")
    public void validate_collaborative_section_title_as(String arg1) throws InterruptedException {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.collaborativeTitle();
    }

    @Then("^validate collaborative section sub title as \"([^\"]*)\"$")
    public void validate_collaborative_section_sub_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.collaborativeSubTitle();
    }

    @Then("^validate collaborative section desc as \"([^\"]*)\"$")
    public void validate_collaborative_section_desc_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.collaborativedesc();
    }

    @Then("^validate progress section title as \"([^\"]*)\"$")
    public void validate_progress_section_title_as(String arg1) throws InterruptedException {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.ProgressTitle();
    }

    @Then("^validate progress section desc as \"([^\"]*)\"$")
    public void validate_progress_section_desc_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.Progressdesc();
    }
    @Then("^validate what we care title as \"([^\"]*)\"$")
    public void validate_what_we_care_title_as(String arg1) throws InterruptedException {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.getWhatWeCareTitle();
    }

    @Then("^validate what we care sub title as \"([^\"]*)\"$")
    public void validate_what_we_care_sub_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        objChronicCarePage.getWhatWeCareSubTitle();
    }

    @Then("^validate Lupus section as \"([^\"]*)\"$")
    public void validate_Lupus_section_as(String arg1) throws InterruptedException {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getLupusTitle(), arg1);
    }

    @Then("^click on Enroll Today for Free button for lupus section and title as \"([^\"]*)\"$")
    public void click_on_Enroll_Today_for_Free_button_for_lupus_section_and_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getEnrollTodayBtnTitle(), arg1);
        objChronicCarePage.clickEnrollTodayBtn();
    }

    @Then("^validate IBD section as \"([^\"]*)\"$")
    public void validate_IBD_section_as(String arg1){
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getIBDTitle(), arg1);
    }

    @Then("^click on Enroll Today for Free button for IBD section and title as \"([^\"]*)\"$")
    public void click_on_Enroll_Today_for_Free_button_for_IBD_section_and_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getIBDEnrollTodayBtnTitle(), arg1);
        objChronicCarePage.clickIBDEnrollTodayBtn();
    }

    @Then("^validate IBS section as \"([^\"]*)\"$")
    public void validate_IBS_section_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getIBSTitle(), arg1);
    }

    @Then("^click on Enroll Today for Free button for IBS section and title as \"([^\"]*)\"$")
    public void click_on_Enroll_Today_for_Free_button_for_IBS_section_and_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getIBSEnrollTodayBtnTitle(), arg1);
        objChronicCarePage.clickIBSEnrollTodayBtn();
    }

    @Then("^validate diabetesone section as \"([^\"]*)\"$")
    public void validate_diabetesone_section_as(String arg1) throws InterruptedException {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getdiabesoneTitle(), arg1);
    }

    @Then("^click on Enroll Today for Free button for diabetesone section and title as \"([^\"]*)\"$")
    public void click_on_Enroll_Today_for_Free_button_for_diabetesone_section_and_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getDiabesonenErollTodayBtnTitle(), arg1);
        objChronicCarePage.clickDiabesoneEnrollTodayBtn();
    }

    @Then("^validate diabetestwo section as \"([^\"]*)\"$")
    public void validate_diabetestwo_section_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getdiabestwoTitle(), arg1);
    }

    @Then("^click on Enroll Today for Free button for diabetestwo section and title as \"([^\"]*)\"$")
    public void click_on_Enroll_Today_for_Free_button_for_diabetestwo_section_and_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getDiabesTwoErollTodayBtnTitle(), arg1);
        objChronicCarePage.clickDiabesTwoEnrollTodayBtn();
    }

    @Then("^validate hypertension section as \"([^\"]*)\"$")
    public void validate_hypertension_section_as(String arg1) throws Throwable {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getHypertensionTitle(), arg1);
    }

    @Then("^click on Enroll Today for Free button for hypertension section and title as \"([^\"]*)\"$")
    public void click_on_Enroll_Today_for_Free_button_for_hypertension_section_and_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getHypertensionErollTodayBtnTitle(), arg1);
        objChronicCarePage.clickHypertensionEnrollTodayBtn();
    }

    @Then("^validate prediabetes section as \"([^\"]*)\"$")
    public void validate_prediabetes_section_as(String arg1) throws InterruptedException {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getPrediabesTitle(), arg1);
    }

    @Then("^click on Enroll Today for Free button for prediabetes section and title as \"([^\"]*)\"$")
    public void click_on_Enroll_Today_for_Free_button_for_prediabetes_section_and_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getPrediabesErollTodayBtnTitle(), arg1);
        objChronicCarePage.clickPrediabesEnrollTodayBtn();
    }

    @Then("^validate overweight section as \"([^\"]*)\"$")
    public void validate_overweight_section_as(String arg1) throws Throwable {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getOverweightTitle(), arg1);
    }

    @Then("^click on Enroll Today for Free button for overweight section and title as \"([^\"]*)\"$")
    public void click_on_Enroll_Today_for_Free_button_for_overweight_section_and_title_as(String arg1){
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getOverweightErollTodayBtnTitle(), arg1);
        objChronicCarePage.clickOverweightEnrollTodayBtn();
    }

    @Then("^validate cholesterol section as \"([^\"]*)\"$")
    public void validate_cholesterol_section_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getCholesterolTitle(), arg1);
    }

    @Then("^click on Enroll Today for Free button for cholesterol section and title as \"([^\"]*)\"$")
    public void click_on_Enroll_Today_for_Free_button_for_cholesterol_section_and_title_as(String arg1) {
        ChronicCarePage objChronicCarePage = new ChronicCarePage(getDriver());
        Assert.assertEquals(objChronicCarePage.getCholesterolErollTodayBtnTitle(), arg1);
        objChronicCarePage.clickCholesterolEnrollTodayBtn();
    }
}
