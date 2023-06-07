package stepDefinition;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.BaseClass;
import org.testng.Assert;
import pages.HomePage;
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
    public void validate_provider_section_title_as(String Providertitle) throws Throwable {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateproviderSec(),Providertitle);
    }

    @Then("^validate provider section sub title as \"([^\"]*)\"$")
    public void validate_provider_section_sub_title_as(String Providersubtitle) throws Throwable {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateproviderSubSec(),Providersubtitle);
    }

    @Then("^validate provider description as \"([^\"]*)\"$")
    public void validate_provider_description_as(String providerdesc) throws Throwable {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateproviderdesc(),providerdesc);
    }

    @Then("^scroll to secEmail$")
    public void scroll_to_secEmail() throws Throwable {
        HomePage objHomePage= new HomePage(getDriver());
        objHomePage.moveToProviderSecemailTitle();
    }

    @Then("^validate provider secemail title as \"([^\"]*)\"$")
    public void validate_provider_secemail_title_as(String secemailTitle){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateprovidersecemailTitle(), secemailTitle);
    }
    @Then("^validate provider secemail desc as \"([^\"]*)\"$")
    public void validate_provider_secemail_desc_as(String secEmailDesc){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateprovidersec1desc(), secEmailDesc);
    }

    @Then("^validate provider secemail image as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void validate_provider_secemail_image_as_and(String secEmailImg, String secEmailTitle){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateprovidersec1img(), secEmailImg);
        Assert.assertEquals(objHomePage.validateprovidersec1imgTitle(), secEmailTitle);
    }
    @Then("^validate provider secReduce title as \"([^\"]*)\"$")
    public void validate_provider_secReduce_title_as(String secReduceTitle){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateSecReduceTitle(secReduceTitle), secReduceTitle);
    }

    @Then("^validate provider secReduce desc as \"([^\"]*)\"$")
    public void validate_provider_secReduce_desc_as(String secReduceDesc){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateSecReduceDesc(), secReduceDesc);
    }

    @Then("^validate provider secReduce image as \"([^\"]*)\"$")
    public void validate_provider_secReduce_image_as(String secReduceImg) throws Throwable {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validatesecReduceImg(), secReduceImg);

    }

    @Then("^validate provider secQuality title as \"([^\"]*)\"$")
    public void validate_provider_secQuality_title_as(String getsecqualityTitle) throws Throwable {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateSecQualiyTitle(getsecqualityTitle), getsecqualityTitle);
    }

    @Then("^validate provider secQuality desc as \"([^\"]*)\"$")
    public void validate_provider_secQuality_desc_as(String secQualityDesc){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateSecQualityDesc(), secQualityDesc);
    }

    @Then("^validate provider secQualityu image as \"([^\"]*)\"$")
    public void validate_provider_secQualityu_image_as(String secQualityImg){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validatesecQualityImg(), secQualityImg);
    }

    @Then("^click on request for free demo button$")
    public void click_on_request_for_free_demo_button(){
        HomePage objHomePage= new HomePage(getDriver());
        objHomePage.clickOnRequestaFreeDemoBtn();
    }
    @Then("^validate request for free demo title \"([^\"]*)\"$")
    public void validate_request_for_free_demo_title(String getRequestTitle){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateRequestTitle(), getRequestTitle);
    }

    @Then("^validate contact us page \"([^\"]*)\"$")
    public void validate_contact_us_page(String contactUsTitle) {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateContactUsPage(), contactUsTitle);
    }

    @Then("^Back to home page$")
    public void back_to_home_page() throws InterruptedException {
        HomePage objHomePage= new HomePage(getDriver());
        objHomePage.OpenHomePage();
    }
    @Then("^validate patient process title as \"([^\"]*)\"$")
    public void validate_patient_process_title_as(String patientTitle){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validatePatientTitle(patientTitle), patientTitle);
    }

    @Then("^validate patient process subtitle as \"([^\"]*)\"$")
    public void validate_patient_process_subtitle_as(String patientSubTitle){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validatePatientSubtitle(), patientSubTitle);
    }

    @Then("^validate patient process subtitlesecond as \"([^\"]*)\"$")
    public void validate_patient_process_subtitlesecond_as(String subtitlesecond){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validatePatientSubtitleSecond(), subtitlesecond);
    }

    @Then("^validate patient process desc as \"([^\"]*)\"$")
    public void validate_patient_process_desc_as(String patientdesc){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validatePatientDesc(), patientdesc);
    }

    @Then("^display patient process img as \"([^\"]*)\"$")
    public void display_patient_process_img_as(String patientImg){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validatePatientImg(), patientImg);
    }
    @Then("^scroll to patient section$")
    public void scrolltopatientsection() throws InterruptedException {
        HomePage objHomePage= new HomePage(getDriver());
        objHomePage.scrollToPatientSec();
    }
    @Then("^validate communicate section title as \"([^\"]*)\"$")
    public void validate_communicate_section_title_as(String communicateTxt) throws InterruptedException {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateCommunicatextx(communicateTxt), communicateTxt);
    }

    @Then("^validate communicate section subtext as \"([^\"]*)\"$")
    public void validate_communicate_section_subtext_as(String communicateSubTxt){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateCommunicateSubTxt(), communicateSubTxt);
    }

    @Then("^validate supporting journey section title as \"([^\"]*)\"$")
    public void validate_supporting_journey_section_title_as(String supportTxt) throws InterruptedException {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateSupportTxt(supportTxt), supportTxt);
    }

    @Then("^validate engagement title as \"([^\"]*)\"$")
    public void validate_engagement_title_as(String engTitle) throws InterruptedException {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateEngagementTitle(engTitle), engTitle);
    }

    @Then("^validate engagement writer name as \"([^\"]*)\"$")
    public void validate_engagement_writer_name_as(String engWriterName){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateWriterName(), engWriterName);
    }

    @Then("^validate wondering section title as \"([^\"]*)\"$")
    public void validate_wondering_section_title_as(String wonderinTitle) throws InterruptedException {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateWonderingTitle(wonderinTitle), wonderinTitle);
    }

    @Then("^validate wondering section subtext as \"([^\"]*)\"$")
    public void validate_wondering_section_subtext_as(String wonderinSubTxt){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateWonderingSubtxt(), wonderinSubTxt);
    }
    @Then("^validate See Who We Help btn \"([^\"]*)\"$")
    public void validate_See_Who_We_Help_btn(String seeWhoBtn) throws InterruptedException {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.validateSeeWhoWeHelpBtn(), seeWhoBtn);
        Assert.assertEquals(objHomePage.validateSeeWhoWeHelpBtnTitle(), seeWhoBtn);
    }
    @Then("^click on See Who We Help btn$")
    public void click_on_See_Who_We_Help_btn(){
        HomePage objHomePage= new HomePage(getDriver());
        objHomePage.seeWhoWeHelpBtnClick();
    }
    @Then("^validate clinics page \"([^\"]*)\"$")
    public void validate_clinics_page(String clinicTitle){
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.getClinicsPageTitle(), clinicTitle);
    }
    @Then("^validate creda app for patient title \"([^\"]*)\"$")
    public void validate_creda_app_for_patient_title(String patientTitle) throws InterruptedException {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.getPatientTitle(patientTitle), patientTitle);
    }

    @Then("^validate creda app for patient desc \"([^\"]*)\"$")
    public void validate_creda_app_for_patient_desc(String patientdesc) throws Throwable {
        HomePage objHomePage= new HomePage(getDriver());
        objHomePage.getPatientDesc().contains(patientdesc);
        System.out.println(objHomePage.getPatientDesc());
    }

    @Then("^validate creda app for patient descsecond \"([^\"]*)\"$")
    public void validate_creda_app_for_patient_descsecond(String patientdescSecond) throws Throwable {
        HomePage objHomePage= new HomePage(getDriver());
        objHomePage.getPatientDesc().contains(patientdescSecond);
    }

    @Then("^validate labels for yourhealth as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void validate_labels_for_yourhealth_as_and_and_and_and_and_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9) throws Throwable {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.getIBs(), arg1);
        Assert.assertEquals(objHomePage.getlupus(), arg2);
        Assert.assertEquals(objHomePage.getHighCholesterol(), arg3);
        Assert.assertEquals(objHomePage.getDiabets(), arg4);
        Assert.assertEquals(objHomePage.getHypothyrodism(), arg5);
        Assert.assertEquals(objHomePage.getPrediabetis(), arg6);
        Assert.assertEquals(objHomePage.getPcos(), arg7);
        Assert.assertEquals(objHomePage.getObesity(), arg8);
        Assert.assertEquals(objHomePage.getIbd(), arg9);
    }
    @Then("^validate enroll today btn as \"([^\"]*)\"$")
    public void validate_enroll_today_btn_as(String enrollTodaytxt) throws InterruptedException {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.getEnrollTodaytxt(enrollTodaytxt), enrollTodaytxt);
        Assert.assertEquals(objHomePage.getEnrollTodayTitle(), enrollTodaytxt);
    }

    @Then("^click on enroll today btn$")
    public void click_on_enroll_today_btn(){
        HomePage objHomePage= new HomePage(getDriver());
        objHomePage.clickOnEnrollTodayBtn();
    }

    @Then("^validate get app page \"([^\"]*)\"$")
    public void validate_get_app_page(String getGetAppTitle) throws Throwable {
        HomePage objHomePage= new HomePage(getDriver());
        Assert.assertEquals(objHomePage.getGetAppTitle(), getGetAppTitle);
    }
}
