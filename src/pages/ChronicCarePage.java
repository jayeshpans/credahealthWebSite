package pages;

import lib.PageAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.soap.SAAJResult;

public class ChronicCarePage extends PageAction {
    private final WebDriver driver;
    public ChronicCarePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(linkText = "Chronic Care")
    WebElement chroniccareMenu;
    @FindBy(linkText="Individual")
    WebElement Individualbtn;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/div/div/div[1]/div/div[1]/div/div/header/h2/span/span")
    WebElement getTheAppTitle;
    @FindBy(xpath = "//div[text()=\"Take Back Your Life\"]")
    WebElement takeBackYourLifeTxt;
    @FindBy(xpath = "//span[text()=\"Download App\"]/parent::a[@class=\"bt_bb_icon_holder\"]")
    WebElement downloadBtn;
    @FindBy(xpath = "//span[text()=\"Chronic Condition Management\"]")
    WebElement chronicConditionTitle;
    @FindBy(xpath = "//span[text()=\"Chronic Condition Management\"]/parent::span/parent::h2/following-sibling::div")
    WebElement chronicConditiondesc;
    @FindBy(xpath = "//span[text()=\"Chronic Condition Management\"]/parent::span/parent::h2/parent::header/following-sibling::header/h2/span")
    WebElement chronicQuote;
    @FindBy(xpath = "//h3[text()=\"The Big Picture\"]")
    WebElement bigPicTitle;
    @FindBy(xpath = "//h3[text()=\"The Big Picture\"]/parent::div/following-sibling::p")
    WebElement bigPicDesc;
    @FindBy(xpath = "//h3[text()=\"Real Support from Real Experts\"]")
    WebElement realExportTitle;
    @FindBy(xpath = "//h3[text()=\"Real Support from Real Experts\"]/parent::div/parent::div/following-sibling::div/section/div/p")
    WebElement realExportDesc;
    @FindBy(xpath = "//h3[text()=\"Savor a Wholesome Solution\"]")
    WebElement wholesomeTitle;
    @FindBy(xpath = "//h3[text()=\"Savor a Wholesome Solution\"]/parent::div/following-sibling::div/p")
    WebElement wholesomeDesc;
    public String getobjChronicCarePageTitle() {
        return "Chronic Care - CredaHealth";
    }
    public void clickonchronicmenu() {
        Actions action = new Actions(driver);
        action.moveToElement(Individualbtn).build().perform();
        chroniccareMenu.click();
    }
    public String validatecaretitle() {
        return getTheAppTitle.getText();
    }
    public String getDownloadAppBtn() {
        return downloadBtn.getAttribute("title");
    }
    public void clickOnDownloadAppBtn() {
        downloadBtn.click();
    }
    public String getTheAppPageTitle() {
        return driver.getTitle();
    }
    public String conditionSecTitle() throws InterruptedException {
        moveToElement(driver, chronicConditionTitle);
        return chronicConditionTitle.getText();
    }

    public String conditionSecSubTitle() {
        return chronicConditiondesc.getText();
    }

    public String conditionQuote() {
        return chronicQuote.getText();
    }

    public String bigPicTitle() {
        return bigPicTitle.getText();
    }

    public String bigPicDesc() {
        return bigPicDesc.getText();
    }

    public String realExportTitle() {
        return realExportTitle.getText();
    }

    public String realExportDesc() {
        return realExportDesc.getText();
    }

    public String wholesomeTitle() throws InterruptedException {
        moveToElement(driver, wholesomeTitle);
        return wholesomeTitle.getText();
    }

    public String wholesomeDesc() {
        return wholesomeDesc.getText();
    }

    public String validatecareSubtitle() {
        return takeBackYourLifeTxt.getText();
    }
}
