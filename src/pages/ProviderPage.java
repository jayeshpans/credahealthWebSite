package pages;

import lib.PageAction;
import lib.WaitActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProviderPage extends PageAction {
    private final WebDriver driver;

    public ProviderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(linkText="Providers")
    WebElement providerbtn;
    @FindBy(xpath = "//span[text()=\"Powerful Patient\"]")
    WebElement powerfulPatientSec;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[1]/div[1]/div")
    WebElement powerfulPatientimg;
    @FindBy(xpath = "//span[contains(text(), \"Automate patient engagement so you\")]")
    WebElement patientEngTle;
    @FindBy(xpath = "//span[text()=\"Colonoscopy\"]")
    WebElement colonoscopyTxt;
    @FindBy(xpath = "//span[text()=\"Sigmoidoscopy\"]")
    WebElement sigmoidoscopyTxt;
    @FindBy(xpath = "//span[text()=\"Upper Endoscopy\"]")
    WebElement upperEndoscopyTxt;
    @FindBy(xpath = "//span[text()=\"Hemorrhoid\"]")
    WebElement hemorrhoidTxt;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[2]/div/div/div/div[2]")
    WebElement patientEngSubSec;
    @FindBy(xpath = "//span[text()=\"Lack of Awareness Impact on Delays and Cancellation\"]")
    WebElement awarenessTitle;
    @FindBy(xpath = "//span[text()=\"Lack of Awareness Impact on Delays and Cancellation\"]/parent::span/parent::h1/parent::header/following-sibling::div[2]/div/div[2]/div/div/p[1]")
    WebElement awarenessOneSec;
    @FindBy(xpath = "//span[text()=\"Lack of Awareness Impact on Delays and Cancellation\"]/parent::span/parent::h1/parent::header/following-sibling::div[2]/div/div[2]/div/div/p[2]")
    WebElement awarenessSecondSec;
    @FindBy(xpath = "//span[text()=\"Lack of Awareness Impact on Delays and Cancellation\"]/parent::span/parent::h1/parent::header/following-sibling::div[2]/div/div[2]/div/div/p[3]")
    WebElement awarenessThirdSec;
    @FindBy(xpath = "//span[text()=\"Lack of Awareness Impact on Delays and Cancellation\"]/parent::span/parent::h1/parent::header/parent::div/parent::div/parent::div/preceding::div[2]/span/img")
    WebElement awarenessImg;
    @FindBy(xpath = "//span[text()=\"Studies show the impact of reinforced education by telephone or short message service (SMS) leads to:\"]")
    WebElement reinforcededucationTitle;
    @FindBy(xpath = "//span[text()=\"Studies show the impact of reinforced education by telephone or short message service (SMS) leads to:\"]/parent::span/parent::h1/parent::header/parent::div/parent::div/parent::div/parent::div/parent::div/following-sibling::div/div/div/div/div/div/p")
    WebElement reinforcededucationOneSec;
    @FindBy(xpath = "//span[text()=\"Studies show the impact of reinforced education by telephone or short message service (SMS) leads to:\"]/parent::span/parent::h1/parent::header/parent::div/parent::div/parent::div/parent::div/parent::div/following-sibling::div/div/div[2]/div/div/div/p")
    WebElement reinforcededucationSecondSec;
    @FindBy(xpath = "//span[text()=\"End-to-end patient engagement platform\"]")
    WebElement endtoendPatientTitle;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[5]/div[1]/div")
    WebElement endtoendPatientImg;
    @FindBy(xpath = "//span[text()=\"More Details\"]/parent::a")
    WebElement moreDetailsBtn;
    @FindBy(xpath = "//span[text()=\"Let us transform the way you interact with and\"]")
    WebElement interactTxt;
    @FindBy(xpath = "//span[text()=\"Comprehensive platform of solutions\"]")
    WebElement Comprehensivetxt;
    @FindBy(xpath = "//span[text()=\"Comprehensive platform of solutions\"]/parent::span/parent::h4/parent::header/following-sibling::div[2]/p")
    WebElement Comprehensivesubtxt;
    @FindBy(xpath = "//span[text()=\"Customizable content \"]")
    WebElement CustomizableTitle;
    @FindBy(xpath = "//span[text()=\"Customizable content \"]/parent::span/parent::h4/parent::header/following-sibling::div[6]/p")
    WebElement CustomizableTxt;
    @FindBy(xpath = "//span[text()=\"Scalable platform\"]")
    WebElement ScalableTitle;
    @FindBy(xpath = "//span[text()=\"Scalable platform\"]/parent::span/parent::h4/parent::header/following-sibling::div[4]")
    WebElement ScalableDesc;
    @FindBy(xpath = "//span[text()=\"Actionable reporting\"]/parent::span/parent::h4/parent::header/following-sibling::div[3]")
    WebElement Actionabletxt;
    @FindBy(xpath = "//span[text()=\"Actionable reporting\"]")
    WebElement ActionableTitle;
    @FindBy(xpath = "//span[text()=\"Wondering if Creda is Fit for you\"]")
    WebElement wonderingcredsTitle;
    @FindBy(xpath = "//span[text()=\"Wondering if Creda is Fit for you\"]/parent::span/parent::h4/following-sibling::div")
    WebElement wonderingcredsDesc;
    @FindBy(xpath = "//span[text()=\"See Who We Help\"]/parent::a")
    WebElement SeeWhoWeHelpBtn;
    @FindBy(xpath = "//span[text()=\"Do your patients have questions about their procedures?\"]")
    WebElement questionsTitle;
    @FindBy(xpath = "//span[text()=\"Do your patients have questions about their procedures?\"]/parent::span/parent::h3/parent::header/following::div[2]/div/div[1]/div/div[4]/p")
    WebElement questiondescOne;
    @FindBy(xpath = "//span[text()=\"Do your patients have questions about their procedures?\"]/parent::span/parent::h3/parent::header/following::div[2]/div/div[2]/div/div[4]/p")
    WebElement questiondescsecond;
    @FindBy(xpath = "//span[text()=\"Do your patients have questions about their procedures?\"]/parent::span/parent::h3/parent::header/following::div[2]/div/div[3]/div/div[4]/p")
    WebElement questiondescThrid;
    @FindBy(xpath = "//span[text()=\"Case Study\"]")
    WebElement caseStudyTitle;
    @FindBy(xpath = "//span[text()=\"Case Study\"]/parent::span/parent::h4/parent::header/following-sibling::div[1]/p")
    WebElement caseStudyDesc;
    @FindBy(xpath = "//span[text()=\"Our Ready to Implement\"]")
    WebElement implemenetEngagementTitle;
    @FindBy(xpath = "//span[text()=\"Our Ready to Implement\"]/parent::span/parent::h4/following-sibling::div[1]")
    WebElement implemenetEngagementDesc;
    @FindBy(xpath = "//span[text()=\"PRE- PROCEDURE PREP\"]")
    WebElement preprocedureTitle;
    @FindBy(xpath = "//span[text()=\"PRE- PROCEDURE PREP\"]/parent::span/parent::h4/following-sibling::div[1]")
    WebElement preprocedureDesc;
    @FindBy(xpath = "//span[text()=\"Enquire For Demo\"]/parent::a")
    WebElement enquireDemoBtn;
    @FindBy(xpath = "//span[text()=\"POST- PROCEDURE CARE\"]")
    WebElement postprocedureTitle;
    @FindBy(xpath = "//span[text()=\"POST- PROCEDURE CARE\"]/parent::span/parent::h4/following-sibling::div")
    WebElement postprocedureDec;
    @FindBy(xpath = "//span[text()=\"We work hard to fill the gaps in your\"]")
    WebElement healthcarelandscapeTitle;
    @FindBy(xpath = "//span[text()=\"We work hard to fill the gaps in your\"]/parent::span/parent::h4/parent::header/following-sibling::div[1]")
    WebElement healthcarelandscapeSubTitle;
    @FindBy(xpath = "//strong[text()=\"90% of patients surveyed said they\"]/parent::p")
    WebElement healthcarelandscapeSecOne;
    @FindBy(xpath = "//strong[text()=\"90% of clinic staff surveyed said they\"]/parent::p")
    WebElement healthcarelandscapeSecSecond;
    @FindBy(xpath = "//span[text()=\"See How We Work With your Systems\"]")
    WebElement workSystemTitle;
    @FindBy(xpath = "//span[text()=\"See How We Work With your Systems\"]/parent::span/parent::h2/following-sibling::div")
    WebElement workSystemSubTitle;
    @FindBy(xpath = "//span[text()=\"Talk To Experts\"]/parent::a")
    WebElement talkToExpertsbtn;
    @FindBy(xpath = "//span[text()=\"Become a Partner\"]/parent::a")
    WebElement partnerBtn;
    @FindBy(xpath = "//span[text()=\"Creda for Clinics\"]")
    WebElement credaclinicsBtn;
    @FindBy(xpath = "//span[text()=\"Creda for Clinics\"]/parent::span/parent::h3/parent::header/div")
    WebElement credaclinicsSubBtn;
    @FindBy(xpath = "//span[text()=\"Creda for Clinics\"]/parent::span/parent::h3/parent::header/following-sibling::div[2]/div/div/div/div/p")
    WebElement credaclinicDesc;
    @FindBy(xpath = "//span[text()=\"Contact Us\"]/parent::a")
    WebElement contactUsBtn;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[12]")
    WebElement superheadline;
    public void clickProviderPage() {
        providerbtn.click();
    }
    public String validatePowerfulPatientSec() {
        return powerfulPatientSec.getText().replaceAll("\\s+", " ");
    }
    public String validatePatientCommImg() {
        return powerfulPatientimg.getAttribute("data-background_image_src");
    }
    public String validatePatientEngagementTitle(String patientEngTitle) throws InterruptedException {
        moveToElement(driver, patientEngTle);
        return patientEngTle.getText().replaceAll("\\s+", " ");
    }
    public String Colonoscopy() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView(true);", patientEngTle);
        Thread.sleep(1000);
        return colonoscopyTxt.getText();
    }
    public String Sigmoidoscopy() {
        return sigmoidoscopyTxt.getText();
    }
    public String UpperEndoscopy() {
        return upperEndoscopyTxt.getText();
    }
    public String Hemorrhoid() {
        return hemorrhoidTxt.getText();
    }
    public String awarenessTxt() throws InterruptedException {
        moveToElement(driver, awarenessTitle);
        return awarenessTitle.getText();
    }
    public String awarenessDesc() {
        return awarenessOneSec.getText();
    }
    public String awarenessDescSecond() {
        return awarenessSecondSec.getText();
    }
    public String awarenessDescThrid() {
        return awarenessThirdSec.getText();
    }
    public String awarenessimg() {
        return awarenessImg.getAttribute("src");
    }
    public String validatereinforceTitle() throws InterruptedException {
        moveToElement(driver, reinforcededucationTitle);
        return reinforcededucationTitle.getText();
    }
    public String validatereinforceOneSection() throws InterruptedException {
        moveToElement(driver, reinforcededucationOneSec);
        return reinforcededucationOneSec.getText();
    }
    public String validatereinforceSecondSection() {
        return reinforcededucationSecondSec.getText();
    }
    public String endtoendPatientTitle() throws InterruptedException {
        moveToElement(driver, endtoendPatientTitle);
        return endtoendPatientTitle.getText().replaceAll("\\s+", " ");
    }
    public String endtoendPatientImg() {
        return endtoendPatientImg.getAttribute("data-background_image_src");
    }
    public void clickOnMoreDetailsBtn() throws InterruptedException {
        moveToElement(driver, moreDetailsBtn);
        moreDetailsBtn.click();
    }
    public String getMoreDetailsTitle() {
        return moreDetailsBtn.getAttribute("title");
    }
    public String validateInteractSection(String arg1) throws InterruptedException {
        moveToElement(driver, interactTxt);
       // WaitActions objWaitActions = new WaitActions();
        //objWaitActions.textToBePresentInElement(driver, interactTxt, arg1, 10);
        return interactTxt.getText().replaceAll("\\s+", " ");
    }
    public String validatecomprehensiveTitle(String arg1) throws InterruptedException {
        moveToElement(driver, Comprehensivetxt);
        WaitActions objWaitActions = new WaitActions();
        objWaitActions.textToBePresentInElement(driver, Comprehensivetxt, arg1, 10);
        return Comprehensivetxt.getText();
    }
    public String validatecomprehensiveTxt() {
        return Comprehensivesubtxt.getText();
    }
    public String validateCustomizableTitle() {
        return CustomizableTitle.getText();
    }
    public String validateCustomizabletxt() {
        return CustomizableTxt.getText();
    }
    public String ScalableTitle() {
        return ScalableTitle.getText();
    }
    public String Scalabledesc() {
        return ScalableDesc.getText();
    }
    public String validateActionableTitle() {
        return ActionableTitle.getText();
    }
    public String validateActionableDesc() {
        return Actionabletxt.getText();
    }
    public String validateWonderingTitle(String arg1) throws InterruptedException {
        moveToElement(driver, wonderingcredsTitle);
        return wonderingcredsTitle.getText();
    }
    public String validateWonderingDesc() {
        return wonderingcredsDesc.getText();
    }
    public void clickonSeeWhoWeHelpBtn() {
        SeeWhoWeHelpBtn.click();
    }
    public String validateSeeWhoWeHelpTitle() {
        return SeeWhoWeHelpBtn.getAttribute("title");
    }
    public String validatequestionTitle() throws InterruptedException {
        moveToElement(driver, questionsTitle);
        return questionsTitle.getText();
    }
    public String validatequestiondescOne() {
        return questiondescOne.getText();
    }
    public String validatequestiondescTwo() {
        return questiondescsecond.getText();
    }
    public String validatequestiondescThree() {
        return questiondescThrid.getText();
    }
    public String getcaseStudyTitle() throws InterruptedException {
        moveToElement(driver, caseStudyTitle);
        return caseStudyTitle.getText();
    }
    public String getcaseStudyDesc() {
        return caseStudyDesc.getText();
    }
    public String getEnagementTitle() throws InterruptedException {
        moveToElement(driver, implemenetEngagementTitle);
        return implemenetEngagementTitle.getText().replaceAll("\\s+", " ");
    }
    public String getEnagementDesc() {
        return implemenetEngagementDesc.getText().replaceAll("\\s+", " ");
    }
    public String getpreprocedureTitle() throws InterruptedException {
        moveToElement(driver, preprocedureTitle);
        return preprocedureTitle.getText();
    }
    public String getpreprocedureDesc() {
        return preprocedureDesc.getText();
    }
    public String getenquireBtnTitle() throws InterruptedException {
        moveToElement(driver, enquireDemoBtn);
        return  enquireDemoBtn.getAttribute("title");
    }
    public void clickonEnquireBtnTitle() {
        enquireDemoBtn.click();
    }
    public String getpostprocedureTitle() {
        return postprocedureTitle.getText().replaceAll("\\s+", " ");
    }
    public String getpostprocedureDesc() {
        return postprocedureDec.getText().replaceAll("\\s+", " ");
    }
    public String getHealthcarelandscapeTitle() throws InterruptedException {
        moveToElement(driver, healthcarelandscapeTitle);
        return healthcarelandscapeTitle.getText().replaceAll("\\s+", " ");
    }
    public String getHealthcarelandscapeSubTitle() {
        return healthcarelandscapeSubTitle.getText().replaceAll("\\s+", " ");
    }
    public String getHealthcarelandscapeSectionOne() throws InterruptedException {
        moveToElement(driver, healthcarelandscapeSecOne);
        return healthcarelandscapeSecOne.getText().replaceAll("\\s+", " ");
    }
    public String getHealthcarelandscapeSectionSecond() {
        return healthcarelandscapeSecSecond.getText().replaceAll("\\s+", " ");
    }
    public String getWorkSystemsTitle() throws InterruptedException {
        moveToElement(driver, superheadline);
        return workSystemTitle.getText();
    }
    public String getWorkSystemDesc() {
        return workSystemSubTitle.getText().replaceAll("\\s+", " ");
    }
    public String getTalkToExportTitle() {
        return talkToExpertsbtn.getText();
    }
    public void clickonTalkToExportBtn() {
        talkToExpertsbtn.click();
    }
    public String getTalkToPartnerTitle() {
        return partnerBtn.getText();
    }
    public void clickonPartnerBtn() {
        partnerBtn.click();
    }
    public String getCredaClinicsTitle() throws InterruptedException {
        moveToElement(driver, credaclinicsBtn);
        return credaclinicsBtn.getText();
    }
    public String getCredaClinicsSubTitle() {
        return credaclinicsSubBtn.getText();
    }
    public String getCredaClinicsDescOne() {
        return credaclinicDesc.getText();
    }
    public String getCredaClinicsDesctwo() {
        return credaclinicDesc.getText();
    }
    public String getContactUsTitle() {
        return contactUsBtn.getAttribute("title");
    }
    public void clickOnContactUsBtn() {
        contactUsBtn.click();
    }
}
