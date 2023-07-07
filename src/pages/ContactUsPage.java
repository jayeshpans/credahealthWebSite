package pages;

import lib.PageAction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends PageAction {
    private final WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(linkText= "Contact Us")
    WebElement contactUsMenu;
    @FindBy(xpath = "//span[text()=\"Contact \"]")
    WebElement contactUsTitle;
    @FindBy(xpath = "//span[text()=\"Contact \"]/parent::span/parent::h2/following-sibling::div")
    WebElement contactUsDesc;
    @FindBy(xpath = "//span[text()=\"Get In Touch\"]/parent::span/parent::h2/following-sibling::div")
    WebElement getTouchDesc;
    @FindBy(xpath = "//span[text()=\"Get In Touch\"]")
    WebElement getTouchTitle;
    @FindBy(xpath = "//p[text()=\"1 Central Street, #884 Norwood,\"]")
    WebElement USAAddress;
    @FindBy(xpath = "//span[text()=\"info@credahealth.com\"]")
    WebElement USAEmail;
    @FindBy(xpath = "//span[text()=\"info@credahealth.com\"]/parent::a")
    WebElement USAEmailLink;
    @FindBy(xpath = "//span[text()=\"Survey #1156, Shukrawar Peth, Pune, 411002\"]")
    WebElement INDAddress;
//    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[2]")
//    WebElement addressSection;
    public void clickOnContactUsMenu() {
        contactUsMenu.click();
    }

    public String  getContactUsPageTitle() {
        return contactUsTitle.getText();
    }

    public String getContactUsDesc() {
        return contactUsDesc.getText();
    }

    public String getTouchTitle() throws InterruptedException {
        Thread.sleep(200);
        moveToElement(driver, contactUsDesc);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        return getTouchTitle.getText();
    }

    public String  getTouchDesc() {
        return getTouchDesc.getText();
    }

    public String  getUSAAdress() {
        return USAAddress.getText().replaceAll("\\s+",  " ");
    }

    public String getUSAEmailTitle() throws InterruptedException {
        moveToElement(driver, USAEmail);
        return USAEmailLink.getAttribute("title");
    }

    public String getUSAEmailAddrsss() throws InterruptedException {
        moveToElement(driver, USAEmail);
        return USAEmail.getText();
    }

    public String  getIndEmailAddrsss() {
        return INDAddress.getText();
    }
    @FindBy(xpath = "//label[text()=\" Your name\"]")
    WebElement yournameLabel;
    @FindBy(xpath = "//label[text()=\" Your email\"]")
    WebElement emailLabel;
    @FindBy(xpath = "//label[text()=\" Subject\"]")
    WebElement subjectLabel;
    @FindBy(xpath = "//label[text()=\" Your message (optional)\"]")
    WebElement messageLabel;
    public String getYourname() {
        return yournameLabel.getText();
    }

    public String  getYourEmail() {
        return emailLabel.getText();
    }

    public String  getSubject() {
        return subjectLabel.getText();
    }

    public String  getYourMessage() {
        return messageLabel.getText();
    }
    @FindBy(xpath = "//input[@name=\"your-name\"]")
    WebElement nameInpt;
    @FindBy(xpath = "//input[@name=\"your-email\"]")
    WebElement emailInpt;
    @FindBy(xpath = "//input[@name=\"your-subject\"]")
    WebElement subjectInpt;
    @FindBy(xpath = "//textarea[@name=\"your-message\"]")
    WebElement messageInpt;
    @FindBy(xpath = "//input[@value=\"Submit\"]")
    WebElement submitBtn;
    @FindBy(className = "wpcf7-response-output")
    WebElement errorMeg;
    public void sendInputToName(String arg1) {
        nameInpt.sendKeys(arg1);
    }

    public void sendInputToEmail(String arg1) {
        emailInpt.sendKeys(arg1);
    }

    public void sendInputToSubject(String arg1) {
        subjectInpt.sendKeys(arg1);
    }

    public void sendInputToMessage(String arg1) {
        messageInpt.sendKeys(arg1);
    }

    public void clickOnSubmitBtn() {
        submitBtn.click();
    }

    public String  getContactUsErrorMessage() throws InterruptedException {
        Thread.sleep(350);
        return errorMeg.getText();
    }

}
