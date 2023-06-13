package pages;

import gherkin.lexer.Th;
import lib.PageAction;
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
}
