package stepDefinition;

import cucumber.api.java.en.Given;
import lib.BaseClass;
import pages.IndividualPage;

public class IndividualStepDef extends BaseClass {
    @Given("^click on individual menu$")
    public void click_on_individual_menu(){
        IndividualPage objIndividualPage = new IndividualPage(getDriver());
        objIndividualPage.openindividualpage(getDriver());
    }
}
