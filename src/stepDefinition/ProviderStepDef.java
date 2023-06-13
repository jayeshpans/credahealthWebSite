package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
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
    public void validate_reinforced_education_title_as(String arg1) {
        ProviderPage objProviderPage = new ProviderPage(getDriver());

    }

    @Then("^validate reinforced education secone as \"([^\"]*)\"$")
    public void validate_reinforced_education_secone_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate reinforced education secsecond as \"([^\"]*)\"$")
    public void validate_reinforced_education_secsecond_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate end to end patient title as \"([^\"]*)\"$")
    public void validate_end_to_end_patient_title_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^validate end to end patient img as \"([^\"]*)\"$")
    public void validate_end_to_end_patient_img_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
