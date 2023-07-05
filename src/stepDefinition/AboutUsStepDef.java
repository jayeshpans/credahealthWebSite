package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import lib.BaseClass;
import org.testng.Assert;
import pages.AboutUsPage;

public class AboutUsStepDef extends BaseClass {
    @Given("^click on about us menu$")
    public void click_on_about_us_menu() {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.clickOnAboutUsMenu();
    }

    @Then("^display about us page title as \"([^\"]*)\"$")
    public void display_about_us_page_title_as(String arg1) {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getAboutUsTitle(), arg1);
    }

    @Then("^display about creda health title as \"([^\"]*)\"$")
    public void display_about_creda_health_title_as(String arg1) throws InterruptedException {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getCredaHealthTitle(), arg1);
    }

    @Then("^display about creda health desc as \"([^\"]*)\"$")
    public void display_about_creda_health_desc_as(String arg1) {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        objAboutUsPage.getcredaHealthDesc();
    }

    @Then("^click on start today btn and validate title as \"([^\"]*)\"$")
    public void click_on_start_today_btn_and_validate_title_as(String arg1) {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getStartTodayBtnTitle(), arg1);
        objAboutUsPage.clickOnStartTodaybtn();
    }

    @Then("^validate our team title as \"([^\"]*)\"$")
    public void validate_our_team_title_as(String arg1) throws InterruptedException {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        System.out.println(objAboutUsPage.getOurTeamTitle());
        Assert.assertEquals(objAboutUsPage.getOurTeamTitle(), arg1);
    }

    @Then("^validate venkat srinivasan title as \"([^\"]*)\"$")
    public void validate_venkat_srinivasan_title_as(String arg1) {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getvenkatName(), arg1);
    }

    @Then("^validate venkat srinivasan profile pic as \"([^\"]*)\"$")
    public void validate_venkat_srinivasan_profile_pic_as(String arg1) {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getvenkatProfilePicURL(), arg1);
    }

    @Then("^validate kim shah title as \"([^\"]*)\"$")
    public void validate_kim_shah_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getkimshaName(), arg1);
    }

    @Then("^validate kim shah profile pic as \"([^\"]*)\"$")
    public void validate_kim_shah_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getkimProfilePicURL(), arg1);
    }

    @Then("^validate monty title as \"([^\"]*)\"$")
    public void validate_monty_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getmontyName(), arg1);
    }

    @Then("^validate monty profile pic as \"([^\"]*)\"$")
    public void validate_monty_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getmontyProfPicURL(), arg1);
    }

    @Then("^validate sanjiv luthra title as \"([^\"]*)\"$")
    public void validate_sanjiv_luthra_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getsanjivName(), arg1);
    }

    @Then("^validate sanjiv luthra profile pic as \"([^\"]*)\"$")
    public void validate_sanjiv_luthra_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getsanjivProfPicURL(), arg1);
    }

    @Then("^validate mamta title as \"([^\"]*)\"$")
    public void validate_mamta_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getmantaName(), arg1);
    }

    @Then("^validate mamta profile pic as \"([^\"]*)\"$")
    public void validate_mamta_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getmamtaProfPicURL(), arg1);
    }

    @Then("^validate medical advisory title as \"([^\"]*)\"$")
    public void validate_medical_advisory_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getmedicalAdvisoryTitle(), arg1);
    }

    @Then("^validate sanjiv chopra title as \"([^\"]*)\"$")
    public void validate_sanjiv_chopra_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getsanjivChopraName(), arg1);
    }

    @Then("^validate sanjiv chopra profile pic as \"([^\"]*)\"$")
    public void validate_sanjiv_chopra_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getsanjivChopraProfPicURL(), arg1);
    }

    @Then("^validate joseph mikhael title as \"([^\"]*)\"$")
    public void validate_joseph_mikhael_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getjosephName(), arg1);
    }

    @Then("^validate joseph mikhael profile pic as \"([^\"]*)\"$")
    public void validate_joseph_mikhael_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getjosephProfPicURL(), arg1);
    }

    @Then("^validate duane title as \"([^\"]*)\"$")
    public void validate_duane_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getDuaneName(), arg1);
    }

    @Then("^validate duane profile pic as \"([^\"]*)\"$")
    public void validate_duane_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getDuanePrfilePicURL(), arg1);
    }

    @Then("^validate frank title as \"([^\"]*)\"$")
    public void validate_frank_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getfrankName(), arg1);
    }

    @Then("^validate frank profile pic as \"([^\"]*)\"$")
    public void validate_frank_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getFrankPrfilePicURL(), arg1);
    }

    @Then("^validate jay gupta title as \"([^\"]*)\"$")
    public void validate_jay_gupta_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getJayGuptaName(), arg1);
    }

    @Then("^validate jay gupta profile pic as \"([^\"]*)\"$")
    public void validate_jay_gupta_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getJayGuptaPrfilePicURL(), arg1);
    }

    @Then("^validate martin title as \"([^\"]*)\"$")
    public void validate_martin_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getMartinName(), arg1);
    }

    @Then("^validate martin profile pic as \"([^\"]*)\"$")
    public void validate_martin_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getMartinPrfilePicURL(), arg1);
    }

    @Then("^validate robert title as \"([^\"]*)\"$")
    public void validate_robert_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getRobertName(), arg1);
    }

    @Then("^validate robert profile pic as \"([^\"]*)\"$")
    public void validate_robert_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getRobertPrfilePicURL(), arg1);
    }

    @Then("^validate jill title as \"([^\"]*)\"$")
    public void validate_jill_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getJillName(), arg1);
    }

    @Then("^validate jill profile pic as \"([^\"]*)\"$")
    public void validate_jill_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getJillPrfilePicURL(), arg1);
    }

    @Then("^validate john title as \"([^\"]*)\"$")
    public void validate_john_title_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getJohnName(), arg1);
    }

    @Then("^validate john profile pic as \"([^\"]*)\"$")
    public void validate_john_profile_pic_as(String arg1) throws Throwable {
        AboutUsPage objAboutUsPage = new AboutUsPage(getDriver());
        Assert.assertEquals(objAboutUsPage.getJohnPrfilePicURL(), arg1);
    }

}
