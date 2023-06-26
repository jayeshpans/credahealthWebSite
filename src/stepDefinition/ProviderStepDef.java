package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import lib.BaseClass;
import org.testng.Assert;
import pages.HomePage;
import pages.ProviderPage;

public class ProviderStepDef extends BaseClass {
    @Given("^click on provider menu$")
    public void click_on_provider_menu(){
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        objProviderPage.clickProviderPage();
    }
    @Then("^validate Patient Communication section as \"([^\"]*)\"$")
    public void validate_Patient_Communication_section_as(String powerfulPatientTxt){
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validatePowerfulPatientSec(), powerfulPatientTxt);
    }
    @Then("^validate Patient Communication section img as \"([^\"]*)\"$")
    public void validate_Patient_Communication_section_img_as(String powerfulPatientImg){
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validatePatientCommImg(), powerfulPatientImg);
    }
    @Then("^validate patient engagement section as \"([^\"]*)\"$")
    public void validate_patient_engagement_section_as(String patientEngTitle) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validatePatientEngagementTitle(patientEngTitle), patientEngTitle);
    }
    @Then("^validate patient engagement menus as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void validate_patient_engagement_menus_as_and_and_and(String arg1, String arg2, String arg3, String arg4) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.Colonoscopy(), arg1);
        Assert.assertEquals(objProviderPage.Sigmoidoscopy(), arg2);
        Assert.assertEquals(objProviderPage.UpperEndoscopy(), arg3);
        Assert.assertEquals(objProviderPage.Hemorrhoid(), arg4);
    }
    @Then("^validate awareness section as \"([^\"]*)\"$")
    public void validate_awareness_section_as(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.awarenessTxt(), arg1);
    }
    @Then("^validate awareness descone as \"([^\"]*)\"$")
    public void validate_awareness_descone_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.awarenessDesc(), arg1);
    }
    @Then("^validate awareness dessec as \"([^\"]*)\"$")
    public void validate_awareness_dessec_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        objProviderPage.awarenessDescSecond();
    }
    @Then("^validate awareness descThrid as \"([^\"]*)\"$")
    public void validate_awareness_descThrid_as(String arg1){
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.awarenessDescThrid(), arg1);
    }
    @Then("^validate awareness img as \"([^\"]*)\"$")
    public void validate_awareness_img_as(String arg1){
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.awarenessimg(), arg1);
    }
    @Then("^validate reinforced education title as \"([^\"]*)\"$")
    public void validate_reinforced_education_title_as(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validatereinforceTitle(), arg1);
    }
    @Then("^validate reinforced education secone as \"([^\"]*)\"$")
    public void validate_reinforced_education_secone_as(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validatereinforceOneSection(), arg1);
    }
    @Then("^validate reinforced education secsecond as \"([^\"]*)\"$")
    public void validate_reinforced_education_secsecond_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validatereinforceSecondSection(), arg1);
    }
    @Then("^validate end to end patient title as \"([^\"]*)\"$")
    public void validate_end_to_end_patient_title_as(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.endtoendPatientTitle(), arg1);
    }
    @Then("^validate end to end patient img as \"([^\"]*)\"$")
    public void validate_end_to_end_patient_img_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.endtoendPatientImg(), arg1);
    }
    @Then("^click on more details button$")
    public void click_on_more_details_button() throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getMoreDetailsTitle(),"More Details");
        objProviderPage.clickOnMoreDetailsBtn();
    }
    @Then("^Back to home pageLogo$")
    public void back_to_home_pageLogo() throws InterruptedException {
        HomePage objHomePage= new HomePage(getDriver());
        objHomePage.OpenHomePage();
    }
    @Then("^validate interact with section as \"([^\"]*)\"$")
    public void validate_interact_with_section_as(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validateInteractSection(arg1), arg1);
    }
    @Then("^validate comprehensive section as \"([^\"]*)\"$")
    public void validate_comprehensive_section_as(String arg1) throws Throwable {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals( objProviderPage.validatecomprehensiveTitle(arg1), arg1);
    }
    @Then("^validate comprehensive subsection as \"([^\"]*)\"$")
    public void validate_comprehensive_subsection_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validatecomprehensiveTxt(), arg1);
    }
    @Then("^validate Customizable section as \"([^\"]*)\"$")
    public void validate_Customizable_section_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validateCustomizableTitle(), arg1);
    }
    @Then("^validate Customizable subsection as \"([^\"]*)\"$")
    public void validate_Customizable_subsection_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validateCustomizabletxt(), arg1);
    }
    @Then("^validate Scalable section as \"([^\"]*)\"$")
    public void validate_Scalable_section_as(String arg1){
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.ScalableTitle(), arg1);
    }
    @Then("^validate Scalable subsection as \"([^\"]*)\"$")
    public void validate_Scalable_subsection_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.Scalabledesc(), arg1);
    }
    @Then("^validate Actionable section as \"([^\"]*)\"$")
    public void validate_Actionable_section_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validateActionableTitle(), arg1);
    }
    @Then("^validate Actionable subsection as \"([^\"]*)\"$")
    public void validate_Actionable_subsection_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validateActionableDesc(), arg1);
    }
    @Then("^validate Wondering section \"([^\"]*)\"$")
    public void validate_Wondering_section(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validateWonderingTitle(arg1), arg1);
    }
    @Then("^validate Wondering sub section \"([^\"]*)\"$")
    public void validate_Wondering_sub_section(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validateWonderingDesc(), arg1);
    }
    @Then("^click on See Who We Help button title as \"([^\"]*)\"$")
    public void click_on_See_Who_We_Help_button_title_as(String arg1) throws Throwable {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validateSeeWhoWeHelpTitle(), arg1);
        objProviderPage.clickonSeeWhoWeHelpBtn();
    }
    @Then("^validate question title section as \"([^\"]*)\"$")
    public void validate_question_title_section_as(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validatequestionTitle(), arg1);
    }
    @Then("^validate question descriptionone as \"([^\"]*)\"$")
    public void validate_question_descriptionone_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validatequestiondescOne(), arg1);
    }
    @Then("^validate question descriptiontwo as  \"([^\"]*)\"$")
    public void validate_question_descriptiontwo_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validatequestiondescTwo(), arg1);
    }
    @Then("^validate question descriptionthree as  \"([^\"]*)\"$")
    public void validate_question_descriptionthree_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.validatequestiondescThree(), arg1);
    }
    @Then("^validate case study title as \"([^\"]*)\"$")
    public void validate_case_study_title_as(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getcaseStudyTitle(), arg1);
    }
    @Then("^validate case study description as \"([^\"]*)\"$")
    public void validate_case_study_description_as(String arg1){
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        //Assert.assertEquals(objProviderPage.getcaseStudyDesc(), arg1);
    }
    @Then("^validate implement engagement title as \"([^\"]*)\"$")
    public void validate_implement_engagement_title_as(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getEnagementTitle(), arg1);
    }
    @Then("^validate implement engagement desc as \"([^\"]*)\"$")
    public void validate_implement_engagement_desc_as(String arg1){
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getEnagementDesc(), arg1);
    }
    @Then("^validate preprocedure title as \"([^\"]*)\"$")
    public void validate_preprocedure_title_as(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getpreprocedureTitle(), arg1);
    }
    @Then("^validate preprocedure desc as \"([^\"]*)\"$")
    public void validate_preprocedure_desc_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getpreprocedureDesc(), arg1);
    }
    @Then("^click on enqurire now demo button and title is \"([^\"]*)\"$")
    public void click_on_enqurire_now_demo_button_and_title_is(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        String getenquireBtnTitle = objProviderPage.getenquireBtnTitle();
        Assert.assertEquals(getenquireBtnTitle, arg1);
        objProviderPage.clickonEnquireBtnTitle();
    }
    @Then("^validate postprocedure title as \"([^\"]*)\"$")
    public void validate_postprocedure_title_as(String arg1){
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getpostprocedureTitle(), arg1);
    }
    @Then("^validate postprocedure desc as \"([^\"]*)\"$")
    public void validate_postprocedure_desc_as(String arg1){
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getpostprocedureDesc(), arg1);
    }
    @Then("^validate healthcare landscape section title as \"([^\"]*)\"$")
    public void validate_healthcare_landscape_section_title_as(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getHealthcarelandscapeTitle(), arg1);
    }
    @Then("^validate healthcare landscape sub title as \"([^\"]*)\"$")
    public void validate_healthcare_landscape_sub_title_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getHealthcarelandscapeSubTitle(), arg1);
    }
    @Then("^validate healthcare landscape secone desc as \"([^\"]*)\"$")
    public void validate_healthcare_landscape_secone_desc_as(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        //Assert.assertEquals(objProviderPage.getHealthcarelandscapeSectionOne(), arg1);
    }
    @Then("^validate healthcare landscape secsecond as \"([^\"]*)\"$")
    public void validate_healthcare_landscape_secsecond_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
      //  Assert.assertEquals(objProviderPage.getHealthcarelandscapeSectionSecond(), arg1);
    }
    @Then("^validate work systems title as \"([^\"]*)\"$")
    public void validate_work_systems_title_as(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getWorkSystemsTitle(), arg1);
    }
    @Then("^validate work system desc as \"([^\"]*)\"$")
    public void validate_work_system_desc_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        objProviderPage.getWorkSystemDesc();
    }
    @Then("^click on Talk To Experts btn and validate title as \"([^\"]*)\"$")
    public void click_on_Talk_To_Experts_btn_and_validate_title_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getTalkToExportTitle(), arg1);
        objProviderPage.clickonTalkToExportBtn();
    }
    @Then("^click on Become a Partner btn and validate title as \"([^\"]*)\"$")
    public void click_on_Become_a_Partner_btn_and_validate_title_as(String arg1) throws Throwable {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getTalkToPartnerTitle(), arg1);
        objProviderPage.clickonPartnerBtn();
    }
    @Then("^validate creda clinice title as \"([^\"]*)\"$")
    public void validate_creda_clinice_title_as(String arg1) throws InterruptedException {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getCredaClinicsTitle(), arg1);
    }
    @Then("^validate creda clinice sub title as \"([^\"]*)\"$")
    public void validate_creda_clinice_sub_title_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        objProviderPage.getCredaClinicsSubTitle();
    }
    @Then("^validate creda clinics desc one as \"([^\"]*)\"$")
    public void validate_creda_clinics_desc_one_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        objProviderPage.getCredaClinicsDescOne();
    }
    @Then("^validate creda clinics desc two as \"([^\"]*)\"$")
    public void validate_creda_clinics_desc_two_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        objProviderPage.getCredaClinicsDesctwo();
    }
    @Then("^Click on contact us btn and validate text as \"([^\"]*)\"$")
    public void click_on_contact_us_btn_and_validate_text_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());
        Assert.assertEquals(objProviderPage.getContactUsTitle(), arg1);
        objProviderPage.clickOnContactUsBtn();
    }
}
