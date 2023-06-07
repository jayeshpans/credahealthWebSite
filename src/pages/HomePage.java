package pages;

import cucumber.api.java.zh_cn.假如;
import gherkin.lexer.Th;
import lib.PageAction;
import lib.WaitActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;

public class HomePage extends PageAction {
   private WebDriver driver;
    public HomePage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath="//div[@id=\"top\"]/div/div[2]/div/span/a/img")
    WebElement pageLogo;
    @FindBy(xpath = "//div[@class=\"port\"]/div[3]/div/div/div[2]/a/span[1]")
    WebElement downloadBtn;
    @FindBy(xpath = "//div[@class=\"bt-content\"]/div/section/div[2]/div/div/div/div/div/div/div/header/h2/span")
    WebElement feaHeadertxt;
    @FindBy(xpath = "//div[@class=\"bt-content\"]/div/section/div[2]/div/div/div/div/div/div/div/header/div")
    WebElement feaDescription;
    @FindBy(xpath = "//div[@class=\"bt-content\"]/div/section/div[1]/div")
    WebElement feaBackImg;
    @FindBy(xpath = "//div[@id=\"top\"]/div[2]/div/div/div/section[2]/div[2]/div/div/div/div/div/div/div/header/h2/span/span")
    WebElement providerh1;
    @FindBy(xpath = "//div[@id=\"top\"]/div[2]/div/div/div/section[2]/div[2]/div/div/div/div/div/div/div/header[2]/h2/span/span")
    WebElement providersub;
    @FindBy(xpath = "//div[@id=\"top\"]/div[2]/div/div/div/section[2]/div[2]/div/div/div/div/div/div/div/header[2]/div")
    WebElement providerdesc;
    @FindBy(xpath = "//div[@id=\"top\"]/div[2]/div/div/div/section[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div/header/h4")
    WebElement providersec1h4;
    @FindBy(xpath = "//div[@id=\"top\"]/div[2]/div/div/div/section[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/p")
    WebElement providersec1desc;
    @FindBy(xpath = "//div[@id=\"top\"]/div[2]/div/div/div/section[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/span/img")
    WebElement providersec1img;
    @FindBy(xpath = "//div[@id=\"top\"]/div[2]/div/div/div/section[2]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/span/img")
    WebElement Providersec2img;
    @FindBy(xpath = "//div[@id=\"top\"]/div[2]/div/div/div/section[2]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/header/h4/span/span")
    WebElement providersec2h4;
    @FindBy(xpath = "//div[@id=\"top\"]/div[2]/div/div/div/section[2]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/p")
    WebElement providersec2desc;
    @FindBy(xpath = "//div[@id=\"top\"]/div[2]/div/div/div/section[2]/div[2]/div/div/div[2]/div/div[3]/div/div/div/div/div/span/img")
    WebElement Providersec3img;
    @FindBy(xpath = "//h4/span/span[text()=\"Improve Both Patient Care Quality and Patient Experience\"]")
    WebElement providersec3h4;
    @FindBy(xpath = "//h4/span/span[text()=\"Improve Both Patient Care Quality and Patient Experience\"]/following::div[1]/p")
    WebElement providersec3desc;
    @FindBy(xpath = "//span[text()=\"Request a Free Demo\"]/parent::a")
    WebElement requestFreeDemobtn;
    @FindBy(xpath = "//span[text()=\"Why You Need To Automate Patient Processes\"]")
    WebElement patinetTitle;
    @FindBy(xpath = "//span[text()=\"Why You Need To Automate Patient Processes\"]/parent::span/parent::h2/parent::header/div[1]")
    WebElement patientSubTtle;
    @FindBy(xpath = "//span[text()=\"Why You Need To Automate Patient Processes\"]/parent::span/parent::h2/parent::header/following-sibling::div[2]/p[1]")
    WebElement patientSubTitleSecond;
    @FindBy(xpath = "//span[text()=\"Why You Need To Automate Patient Processes\"]/parent::span/parent::h2/parent::header/following-sibling::div[2]/p[2]")
    WebElement patientDesc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[3]/div/div/div/div/div/div[1]/div/div/div[2]/span/img")
    WebElement patientImg;
    @FindBy(xpath = "//span[text()=\"Ways We Communicate With Your Patients\"]")
    WebElement communicateTitle;
    @FindBy(xpath = "//span[text()=\"Ways We Communicate With Your Patients\"]/parent::span/parent::h1/following-sibling::div")
    WebElement communicateSubTitle;
    @FindBy(xpath = "//span[text()=\"Supporting Patient Journey\"]")
    WebElement supportTitle;
    @FindBy(xpath = "//span[contains(text(), \"Patient Engagement Platform effectively\")]")
    WebElement engagementTxt;
    @FindBy(xpath = "//span[contains(text(), \"Patient Engagement Platform effectively\")]/parent::span/parent::h2/following-sibling::div")
    WebElement engagementWriterName;
    @FindBy(xpath = "//span[contains(text(), \"Wondering if Creda\")]")
    WebElement wonderingTxt;
    @FindBy(xpath = "//span[contains(text(), \"Wondering if Creda\")]/parent::span/parent::h4/following-sibling::div")
    WebElement wonderingSubTxt;
    @FindBy(xpath = "//span[text()=\"See Who We Help\"]/parent::a")
    WebElement seeWhoWeHelpBtn;
    @FindBy(xpath = "//span[contains(text(), \"The Creda App\")]")
    WebElement forPatientSecTitle;
    @FindBy(xpath = "//span[contains(text(), \"The Creda App\")]/parent::span/parent::h3/following-sibling::div[1]")
    WebElement forPatientDesc;
    @FindBy(xpath = "//b[text()=\"IBS\"]")
    WebElement ibsLabel;
    @FindBy(xpath = "//b[text()=\"Lupus\"]")
    WebElement lapusLabel;
    @FindBy(xpath = "//b[text()=\"High Cholesterol\"]")
    WebElement highchoLabel;
    @FindBy(xpath = "//b[text()=\"Diabetes\"]")
    WebElement diabetesLabel;
    @FindBy(xpath = "//b[text()=\"Hypothyroidism\"]")
    WebElement hypothyroidismLabel;
    @FindBy(xpath = "//b[text()=\"Prediabetes\"]")
    WebElement prediabetesLabel;
    @FindBy(xpath = "//b[text()=\"PCOS\"]")
    WebElement pcosLabel;
    @FindBy(xpath = "//b[text()=\"Obesity\"]")
    WebElement obesityLabel;
    @FindBy(xpath = "//b[text()=\"IBD\"]")
    WebElement ibdLabel;
    @FindBy(xpath = "//span[text()=\"Enroll Today\"]/parent::a")
    WebElement enrollTodayBtn;
    public String getHomePageTitle(WebDriver driver){
            return driver.getTitle();
    }
    public boolean verifyWebSiteLogo() {
            return isLocatorPresent(pageLogo);
    }
    public List<WebElement> getheaderMenu(WebDriver driver) {
            List<WebElement> getAllheaderLinks= driver.findElements(By.xpath("//ul[@id='menu-primary-menu']/li"));
            return getAllheaderLinks;
    }
    public String getDownloadBtnTxt(){
           return downloadBtn.getText();
    }
    public String validateFeatureSecHeader() {
        return feaHeadertxt.getText();
    }
    public String validateFeatureSecTxt() {
        return feaDescription.getText();
    }
    public String validateFeatureBackImage() {
        return feaBackImg.getAttribute("data-background_image_src");
    }
    public String validateproviderSec() {
        return providerh1.getText();
    }
    public String validateproviderSubSec() {
        return providersub.getText();
    }
    public String validateproviderdesc() {
        return providerdesc.getText().trim().replaceAll("\\s+", " ");
    }
    public String validateprovidersecemailTitle() {
        return providersec1h4.getText();
    }
    public String validateprovidersec1desc() {
        return providersec1desc.getText();
    }
    public String validateprovidersec1img() {
        return providersec1img.getAttribute("src");
    }
    public String validateprovidersec1imgTitle() {
        return providersec1img.getAttribute("title");
    }
    public void moveToProviderSecemailTitle() throws InterruptedException {
        Actions actionObj = new Actions(driver);
        actionObj.moveToElement(providersec1h4).build().perform();
        Thread.sleep(500);
    }
    public String validateSecReduceTitle(String getTitle){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions. textToBePresentInElement(providersec2h4, getTitle));
        return providersec2h4.getText();
    }
    public String validateSecReduceDesc() {
        return providersec2desc.getText();
    }
    public String validatesecReduceImg() {
        return Providersec2img.getAttribute("src");
    }
    public String validateSecQualiyTitle(String getsecqualityTitle) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait. until(ExpectedConditions. textToBePresentInElement(providersec3h4, getsecqualityTitle));
        return providersec3h4.getText();
    }

    public String validateSecQualityDesc() {
        return providersec3desc.getText();
    }

    public String validatesecQualityImg() {
        return Providersec3img.getAttribute("src");
    }

    public void clickOnRequestaFreeDemoBtn() {
        requestFreeDemobtn.click();
    }

    public String validateRequestTitle() {
        return requestFreeDemobtn.getAttribute("title");
    }

    public String validateContactUsPage() {
        return driver.getTitle();
    }

    public void OpenHomePage() throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(5000);
    }

    public String validatePatientSubtitle() {
        return patientSubTtle.getText();
    }

    public String validatePatientSubtitleSecond() {
        return patientSubTitleSecond.getText();
    }

    public String validatePatientDesc() {
        return patientDesc.getText();
    }

    public String validatePatientImg() {
        return patientImg.getAttribute("src");
    }
    public String validatePatientTitle(String patientTitle) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait. until(ExpectedConditions. textToBePresentInElement(patinetTitle, patientTitle));
        return patinetTitle.getText();
    }
    public void scrollToPatientSec() throws InterruptedException {
        Actions actionObj = new Actions(driver);
        actionObj.moveToElement(patinetTitle).build().perform();
        Thread.sleep(500);
    }

    public String validateCommunicatextx(String communicateTxt) throws InterruptedException {
        moveToElement(driver, communicateTitle);
        WaitActions objWaitActions = new WaitActions();
        objWaitActions.textToBePresentInElement(driver, communicateTitle, communicateTxt, 10);
        return communicateTitle.getText();
    }

    public String validateCommunicateSubTxt() {
        return communicateSubTitle.getText().trim();
    }

    public String validateSupportTxt(String supportTxt) throws InterruptedException {
        moveToElement(driver, supportTitle);
        WaitActions objWaitActions = new WaitActions();
        objWaitActions.textToBePresentInElement(driver, supportTitle, supportTxt, 10);
        return supportTitle.getText();
    }
    public String validateEngagementTitle(String engTitle) throws InterruptedException {
        moveToElement(driver, engagementTxt);
        WaitActions objWaitActions = new WaitActions();
        objWaitActions.textToBePresentInElement(driver, engagementTxt, engTitle, 10);
        return engagementTxt.getText().replaceAll("\"", "");
    }

    public String validateWriterName() {
        return engagementWriterName.getText();
    }

    public String validateWonderingTitle(String wonderinTitle) throws InterruptedException {
        moveToElement(driver, wonderingTxt);
        WaitActions objWaitActions = new WaitActions();
        objWaitActions.textToBePresentInElement(driver, wonderingTxt, wonderinTitle, 10);
        return wonderingTxt.getText();
    }

    public String validateWonderingSubtxt() {
        return wonderingSubTxt.getText();
    }

    public String validateSeeWhoWeHelpBtn() throws InterruptedException {
        moveToElement(driver, seeWhoWeHelpBtn);
        return seeWhoWeHelpBtn.getText();
    }

    public String validateSeeWhoWeHelpBtnTitle() {
        return seeWhoWeHelpBtn.getAttribute("title");
    }

    public void seeWhoWeHelpBtnClick() {
        seeWhoWeHelpBtn.click();

    }
    public String getClinicsPageTitle() {
        return driver.getTitle();
    }

    public String getPatientTitle(String patientTitle) throws InterruptedException {
        moveToElement(driver, forPatientSecTitle);
        //WaitActions objWaitActions = new WaitActions();
        //objWaitActions.textToBePresentInElement(driver, forPatientSecTitle, patientTitle, 10);
        return forPatientSecTitle.getText().replaceAll("\\s+", " ");
    }

    public String getPatientDesc() {
        return forPatientDesc.getText();
    }
    public String getIBs() {
        return ibsLabel.getText();
    }

    public String getlupus() {
        return lapusLabel.getText();
    }

    public String getHighCholesterol() {
        return highchoLabel.getText();
    }

    public String getDiabets() {
        return diabetesLabel.getText();
    }

    public String getHypothyrodism() {
        return hypothyroidismLabel.getText();
    }

    public String getPrediabetis() {
        return prediabetesLabel.getText();
    }

    public String getPcos() {
        return pcosLabel.getText();
    }

    public String getObesity() {
        return obesityLabel.getText();
    }

    public String getIbd() {
        return ibdLabel.getText();
    }

    public String getEnrollTodaytxt(String enrollTodaytxt) throws InterruptedException {
        moveToElement(driver, enrollTodayBtn);
        WaitActions objWaitActions = new WaitActions();
        objWaitActions.textToBePresentInElement(driver, enrollTodayBtn, enrollTodaytxt, 10);
        return enrollTodayBtn.getText();
    }

    public String getEnrollTodayTitle() {
        return enrollTodayBtn.getAttribute("title");
    }

    public void clickOnEnrollTodayBtn() {
        enrollTodayBtn.click();
    }

    public String getGetAppTitle() {
        return driver.getTitle();
    }
}
