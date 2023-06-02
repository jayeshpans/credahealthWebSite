package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googlePage {
    private WebDriver driver;
    public googlePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath="//*[@id=\"APjFqb\"]")
    WebElement googleInpt;

    @FindBy(xpath="//*[@id=\"jZ2SBf\"]/div[1]/span")
    WebElement googleOption1;


    public void searchGoogleText(String googletxt) {
        googleInpt.sendKeys(googletxt);
    }

    public String getSearchResult() {
        return googleOption1.getText();
    }
}
