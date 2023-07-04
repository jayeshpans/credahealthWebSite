package pages;

import lib.PageAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AboutUsPage extends PageAction {
    private final WebDriver driver;

    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(linkText = "About Us")
    WebElement aboutUsMenu;
    @FindBy(xpath = "//span[text()=\"About Us\"]")
    WebElement aboutUsTitle;
    @FindBy(xpath = "//span[text()=\"About Creda Health\"]")
    WebElement credaHealthTitle;
    @FindBy(xpath = "//span[text()=\"About Creda Health\"]/parent::span/parent::h5/following-sibling::div")
    WebElement credaHealthDesc;
    @FindBy(xpath = "//span[text()=\"Start Today!\"]/parent::a")
    WebElement startTodayBtn;
    public void clickOnAboutUsMenu() {
        aboutUsMenu.click();
    }

    public void getAboutUsPageTitle() {
        driver.getTitle();
    }

    public String getAboutUsTitle() {
        return aboutUsTitle.getText();
    }

    public String getCredaHealthTitle() throws InterruptedException {
        moveToElement(driver, credaHealthTitle);
        return credaHealthTitle.getText();
    }

    public String getcredaHealthDesc() {
        return credaHealthDesc.getText();
    }

    public String getStartTodayBtnTitle() {
        return startTodayBtn.getAttribute("Title");
    }

    public void clickOnStartTodaybtn() {
        startTodayBtn.click();
    }
    @FindBy(xpath = "//span[text()=\"Our team\"]")
    WebElement ourTeamTitle;
    public String getOurTeamTitle() {
        return ourTeamTitle.getText();
    }
    @FindBy(xpath = "//span[text()=\"Dr. Venkat Srinivasan\"]")
    WebElement venkatTitle;
    @FindBy(xpath = "//span[text()=\"Dr. Venkat Srinivasan\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement venkatImg;
    public String  getvenkatName() {
        return venkatTitle.getText();
    }

    public String getvenkatProfilePicURL() {
        return venkatImg.getAttribute("src");
    }
    @FindBy(xpath = "//span[text()=\"Kim Shah\"]")
    WebElement kimTitle;
    @FindBy(xpath = "//span[text()=\"Kim Shah\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement kimImg;
    public String getkimshaName() {
        return kimTitle.getText();
    }
    @FindBy(xpath = "//span[text()=\"Monty Kothiwale\"]")
    WebElement montyTitle;
    @FindBy(xpath = "//span[text()=\"Monty Kothiwale\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement montyImg;
    public String getmontyName() {
        return montyTitle.getText();
    }

    public String getkimProfilePicURL() {
        return kimImg.getAttribute("src");
    }
    @FindBy(xpath = "//span[text()=\"Sanjiv Luthra\"]")
    WebElement sanjivLuthraTitle;
    @FindBy(xpath = "//span[text()=\"Sanjiv Luthra\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement sanjivLuthraImg;
    public String getsanjivName() {
        return sanjivLuthraTitle.getText();
    }

    public String getmontyProfPicURL() {
        return montyImg.getAttribute("src");
    }

    public String getsanjivProfPicURL() {
        return sanjivLuthraImg.getAttribute("src");
    }
    @FindBy(xpath = "//span[text()=\"Dr. Mamta Kothiwale\"]")
    WebElement mamtaTitle;
    @FindBy(xpath = "//span[text()=\"Dr. Mamta Kothiwale\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement mamtaImg;
    public String getmantaName() {
        return mamtaTitle.getText();
    }

    public String getmamtaProfPicURL() {
        return mamtaImg.getAttribute("src");
    }
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[4]/div/div/div/div[1]/div/div/div/div/header/h3/span/span")
    WebElement mediacalAdversoryTitle;
    public String getmedicalAdvisoryTitle() {
        return mediacalAdversoryTitle.getText();
    }
    @FindBy(xpath = "//span[text()=\"Dr. Sanjiv Chopra\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement sanjivChopraImg;
    @FindBy(xpath = "//span[text()=\"Dr. Sanjiv Chopra\"]")
    WebElement sanjivChopraTitle;
    public String  getsanjivChopraName() {
        return sanjivChopraTitle.getText();
    }

    public String getsanjivChopraProfPicURL() {
        return sanjivChopraImg.getAttribute("src");
    }

    public void getjosephName() {
    }

    public void getjosephProfPicURL() {
    }

    public void getDuaneName() {
    }

    public void getDuanePrfilePicURL() {
    }

    public void getfrankName() {
    }

    public void getFrankPrfilePicURL() {
    }

    public void getJayGuptaName() {
    }

    public void getJayGuptaPrfilePicURL() {
    }

    public void getMartinName() {
    }

    public void getMartinPrfilePicURL() {
    }

    public void getRobertName() {
    }

    public void getRobertPrfilePicURL() {
    }

    public void getJillName() {
    }

    public void getJillPrfilePicURL() {
    }

    public void getJohnName() {
    }

    public void getJohnPrfilePicURL() {
    }
}
