package pages;

import lib.PageAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
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
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[3]/div/div/div/div/div/div[1]/div/div/header/h1/span/span")
    WebElement journeyTitle;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[3]/div/div/div/div/div/div[1]/div/div/header/div")
    WebElement journeyDesc;
    @FindBy(xpath = "//span[contains(text(), \"Personalizing\")]")
    WebElement personalizingTitle;
    @FindBy(xpath = "//span[contains(text(), \"Personalizing\")]/parent::span/parent::h1/following-sibling::div")
    WebElement personalizingDesc;
    @FindBy(xpath = "//span[contains(text(), \"Building Continuous\")]")
    WebElement buildingTitle;
    @FindBy(xpath = "//span[contains(text(), \"Building Continuous\")]/parent::span/parent::h1/following-sibling::div")
    WebElement buildingDesc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[6]/div/div/div/div/div/div[2]/div/div/header/h1/span/span")
    WebElement progressTitle;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[6]/div/div/div/div/div/div[2]/div/div/header/div")
    WebElement progressDesc;
    @FindBy(xpath = "//span[text()=\"What We Care For \"] ")
    WebElement whatwecareTitle;
    @FindBy(xpath = "//span[text()=\"What We Care For \"]/parent::span/parent::h2/following-sibling::div")
    WebElement whatwecareDesc;
    @FindBy(xpath = "//span[text()=\"Lupus\"]")
    WebElement lupusTitle;
    @FindBy(xpath = "//span[text()=\"Lupus\"]/parent::span/parent::h4/parent::header/following-sibling::div[3]/a")
    WebElement lupusEnrollBtn;
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
    public String journeyTitle() throws InterruptedException {
        moveToElement(driver, journeyTitle);
        return journeyTitle.getText().replaceAll("\\s+", " ");
    }
    public String  journeyDesc() {
        return journeyDesc.getText();
    }

    public String  approachTitle() throws InterruptedException {
        moveToElement(driver, personalizingTitle);
        return personalizingTitle.getText().replaceAll("\\s+", " ");
    }

    public String approachSubDescOne() {
        return personalizingDesc.getText();
    }

    public String approachSubDesctwo() {
        return personalizingDesc.getText();
    }

    public String collaborativeTitle() throws InterruptedException {
        moveToElement(driver, buildingTitle);
        return buildingTitle.getText();
    }

    public String collaborativedesc() {
        return buildingDesc.getText();
    }

    public String collaborativeSubTitle() {
        return buildingDesc.getText();
    }

    public String ProgressTitle() throws InterruptedException {
        moveToElement(driver, progressTitle);
        return progressTitle.getText();
    }

    public String Progressdesc() {
        return progressDesc.getText();
    }

    public String getWhatWeCareTitle() throws InterruptedException {
        moveToElement(driver, whatwecareTitle);
        return whatwecareTitle.getText();
    }

    public String getWhatWeCareSubTitle() {
        return whatwecareDesc.getText();
    }

    public String getLupusTitle() throws InterruptedException {
        moveToElement(driver, lupusTitle);
        Actions action = new Actions(driver);
        action.moveToElement(lupusTitle).build().perform();
        return lupusTitle.getText();
    }

    public String getEnrollTodayBtnTitle() {
        return lupusEnrollBtn.getAttribute("title");
    }

    public void clickEnrollTodayBtn() {
        lupusEnrollBtn.click();
    }

    public void getIBDTitle() {
    }

    public void getIBDEnrollTodayBtnTitle() {
    }

    public void clickIBDEnrollTodayBtn() {
    }

    public void getIBSTitle() {
    }

    public void getIBSEnrollTodayBtnTitle() {
    }

    public void clickIBSEnrollTodayBtn() {
    }

    public void getdiabesoneTitle() {
    }

    public void getDiabesonenErollTodayBtnTitle() {
    }

    public void clickDiabesoneEnrollTodayBtn() {
    }

    public void getdiabestwoTitle() {
    }

    public void getDiabesTwoErollTodayBtnTitle() {
    }

    public void clickDiabesTwoEnrollTodayBtn() {
    }

    public void getHypertensionTitle() {
    }

    public void getHypertensionErollTodayBtnTitle() {
    }

    public void clickHypertensionEnrollTodayBtn() {
    }

    public void getPrediabesTitle() {
    }

    public void getPrediabesErollTodayBtnTitle() {
    }

    public void clickPrediabesEnrollTodayBtn() {
    }

    public void getOverweightTitle() {
    }

    public void getOverweightErollTodayBtnTitle() {
    }

    public void clickOverweightEnrollTodayBtn() {
    }

    public void getCholesterolTitle() {
    }

    public void getCholesterolErollTodayBtnTitle() {
    }

    public void clickCholesterolEnrollTodayBtn() {
    }
}
