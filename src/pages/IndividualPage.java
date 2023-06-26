package pages;

import lib.PageAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndividualPage extends PageAction {
    private final WebDriver driver;
    public IndividualPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(linkText="Individual")
    WebElement Individualbtn;

    public void openindividualpage(WebDriver driver) {
        Individualbtn.click();
    }
}
