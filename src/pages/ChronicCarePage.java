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
    @FindBy(xpath = "//span[text()=\" IBD \"]")
    WebElement ibdTitle;
    @FindBy(xpath = "//span[text()=\" IBD \"]/parent::span/parent::h4/parent::header/following-sibling::div[3]/a")
    WebElement ibdEnrollBtn;
    @FindBy(xpath = "//span[text()=\" IBS\"]")
    WebElement ibsTitle;
    @FindBy(xpath = "//span[text()=\" IBS\"]/parent::span/parent::h4/parent::header/following-sibling::div[4]/a")
    WebElement ibsEnrollBtn;
    @FindBy(xpath = "//span[text()=\" Diabetes Type 1\"]")
    WebElement diabetes1Title;
    @FindBy(xpath = "//span[text()=\" Diabetes Type 1\"]/parent::span/parent::h4/parent::header/following-sibling::div[6]/a")
    WebElement diabetes1EnrollBtn;
    @FindBy(xpath = "//span[text()=\" Diabetes Type 2\"]")
    WebElement diabetes2Title;
    @FindBy(xpath = "//span[text()=\" Diabetes Type 2\"]/parent::span/parent::h4/parent::header/following-sibling::div[5]/a")
    WebElement diabetes2EnrollBtn;
    @FindBy(xpath = "//span[text()=\"Hypertension\"]")
    WebElement hypertensionTitle;
    @FindBy(xpath = "//span[text()=\"Hypertension\"]/parent::span/parent::h4/parent::header/following-sibling::div[5]/a")
    WebElement hypertensionEnrollBtn;
    @FindBy(xpath = "//span[text()=\"Prediabetes\"]")
    WebElement prediabetesTitle;
    @FindBy(xpath = "//span[text()=\"Prediabetes\"]/parent::span/parent::h4/parent::header/following-sibling::div[2]/a")
    WebElement prediabetesEnrollBtn;
    @FindBy(xpath = "//span[text()=\"Overweight / Obesity\"]")
    WebElement overweightTitle;
    @FindBy(xpath = "//span[text()=\"Overweight / Obesity\"]/parent::span/parent::h4/parent::header/following-sibling::div[4]/a")
    WebElement overweightEnrollBtn;
    @FindBy(xpath = "//span[text()=\"High Cholesterol\"]")
    WebElement cholesterolTitle;
    @FindBy(xpath = "//span[text()=\"High Cholesterol\"]/parent::span/parent::h4/parent::header/following-sibling::div[4]/a")
    WebElement cholesterolEnrollBtn;
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

    public String getIBDTitle() {
        Actions action = new Actions(driver);
        action.moveToElement(ibdTitle).build().perform();
        return ibdTitle.getText();
    }

    public String getIBDEnrollTodayBtnTitle() {
        return ibdEnrollBtn.getAttribute("title");
    }

    public void clickIBDEnrollTodayBtn() {
        ibdEnrollBtn.click();
    }

    public String getIBSTitle() {
        Actions action = new Actions(driver);
        action.moveToElement(ibsTitle).build().perform();
        return ibsTitle.getText();
    }

    public String getIBSEnrollTodayBtnTitle() {
        return ibsEnrollBtn.getAttribute("title");
    }

    public void clickIBSEnrollTodayBtn() {
        ibsEnrollBtn.click();
    }

    public String getdiabesoneTitle() throws InterruptedException {
        moveToElement(driver, diabetes1Title);
        Actions action = new Actions(driver);
        action.moveToElement(diabetes1Title).build().perform();
        return diabetes1Title.getText();
    }

    public String getDiabesonenErollTodayBtnTitle() {
        return diabetes1EnrollBtn.getAttribute("title");
    }

    public void clickDiabesoneEnrollTodayBtn() {
        diabetes1EnrollBtn.click();
    }

    public String getdiabestwoTitle() {
        Actions action = new Actions(driver);
        action.moveToElement(diabetes2Title).build().perform();
        return diabetes2Title.getText();
    }

    public String getDiabesTwoErollTodayBtnTitle() {
        return diabetes2EnrollBtn.getAttribute("title");
    }

    public void clickDiabesTwoEnrollTodayBtn() {
        diabetes2EnrollBtn.click();
    }

    public String getHypertensionTitle() {
        Actions action = new Actions(driver);
        action.moveToElement(hypertensionTitle).build().perform();
        return hypertensionTitle.getText();
    }

    public String getHypertensionErollTodayBtnTitle() {
        return hypertensionEnrollBtn.getAttribute("title");
    }

    public void clickHypertensionEnrollTodayBtn() {
        hypertensionEnrollBtn.click();
    }

    public String getPrediabesTitle() throws InterruptedException {
        moveToElement(driver, prediabetesTitle);
        Actions action = new Actions(driver);
        action.moveToElement(prediabetesTitle).build().perform();
        return prediabetesTitle.getText();

    }

    public String getPrediabesErollTodayBtnTitle() {
        return prediabetesEnrollBtn.getAttribute("title");
    }

    public void clickPrediabesEnrollTodayBtn() {
        prediabetesEnrollBtn.click();
    }

    public String  getOverweightTitle() {
        Actions action = new Actions(driver);
        action.moveToElement(overweightTitle).build().perform();
        return overweightTitle.getText();
    }

    public String getOverweightErollTodayBtnTitle() {
        return overweightEnrollBtn.getAttribute("title");
    }

    public void clickOverweightEnrollTodayBtn() {
        overweightEnrollBtn.click();
    }

    public String getCholesterolTitle() {
        Actions action = new Actions(driver);
        action.moveToElement(cholesterolTitle).build().perform();
        return cholesterolTitle.getText();
    }

    public String getCholesterolErollTodayBtnTitle() {
        return cholesterolEnrollBtn.getAttribute("title");
    }

    public void clickCholesterolEnrollTodayBtn() {
        cholesterolEnrollBtn.click();
    }
}
