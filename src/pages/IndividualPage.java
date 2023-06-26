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
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[2]/div[2]/div/div/div/div/div[1]/div/div/header/h2/span/span")
    WebElement credaAppTitle;
    @FindBy(xpath = "//div[text()=\"Partner in Chronic Care\"]")
    WebElement credaAppSubTitle;
    @FindBy(xpath = "//span[text()=\"How Creda Helps\"]")
    WebElement howcredahelpsTitle;
    @FindBy(xpath = "//span[text()=\"How Creda Helps\"]/parent::span/parent::h2/following-sibling::div")
    WebElement howcredahelpsDesc;
    @FindBy(xpath = "//span[text()=\"Chronic Care\"]")
    WebElement chronicCareTitle;
    @FindBy(xpath = "//span[text()=\"LEARN MORE\"]/parent::a")
    WebElement learnMoreBtn;
    public void openindividualpage() {
        Individualbtn.click();
    }

    public String getIndividualPageTitle() {
        return driver.getTitle();
    }

    public String getIndividualPageMainTitle() {
        return credaAppTitle.getText();
    }

    public String getIndividualPageSubTitle() {
        return credaAppSubTitle.getText();
    }

    public String getcredahelpsTitle() {
        return howcredahelpsTitle.getText();
    }

    public String getcredahelpsDesc() {
        return howcredahelpsDesc.getText();
    }

    public void hoverChronicCareSection() {
    }

    public String getChronicCareSectionTitle() {
        return chronicCareTitle.getText();
    }

    public String getlearnMoreBtnTitle() {
        return learnMoreBtn.getAttribute("title");
    }

    public void clickonlearnMoreBtnTitle() {
        learnMoreBtn.click();
    }
}
