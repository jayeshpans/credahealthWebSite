package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.BaseClass;
import org.testng.Assert;
import pages.googlePage;

public class googleStepDef extends BaseClass {
    @Given("^Browse google web site$")
    public void browse_google_web_site() throws Throwable {

    }

    @When("^search text as \"([^\"]*)\"$")
    public void search_text_as(String googletxt) throws Throwable {
        //googlePage objgooglePage = new googlePage(getDriver());
        //.searchGoogleText(googletxt);
    }

    @Then("^validate search$")
    public void validate_search() throws Throwable {
        //googlePage objgooglePage = new googlePage(getDriver());
        //objgooglePage.getSearchResult();
        //Assert.assertEquals(objgooglePage.getSearchResult(),"pythonjayesh");
        // System.out.println(objgooglePage.getSearchResult());
    }
    @Then("^assignment(\\d+)$")
    public void assignment(int arg1) throws Throwable {
        String str = "If you did know for whom I gave the ring And would conceive for what I gave the ring And how unwillingly I left the ring, When naught would be accepted but the ring, You would abate the strength of your displeasure.";
        String[] arr = null;
        arr = str.split(" ");
        int j=1;
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i].contains("ring")){
                System.out.println(arr[i]);
                j++;
            }

        }
        System.out.println(j);
    }
}
