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
    @FindBy(xpath = "//span[text()=\"Dr. Venkat Srinivasan\"]")
    WebElement venkatTitle;
    public String getOurTeamTitle() throws InterruptedException {
        moveToElement(driver, ourTeamTitle);
        moveToElement(driver, venkatTitle);
        System.out.println(ourTeamTitle.getText());
        return ourTeamTitle.getText();
    }

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
    public String getsanjivName() throws InterruptedException {
        moveToElement(driver, sanjivLuthraTitle);
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
    public String getmedicalAdvisoryTitle() throws InterruptedException {
        moveToElement(driver, mediacalAdversoryTitle);
        return mediacalAdversoryTitle.getText();
    }
    @FindBy(xpath = "//span[text()=\"Dr. Sanjiv Chopra\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement sanjivChopraImg;
    @FindBy(xpath = "//span[text()=\"Dr. Sanjiv Chopra\"]")
    WebElement sanjivChopraTitle;
    public String  getsanjivChopraName() throws InterruptedException {
        moveToElement(driver, sanjivChopraTitle);
        return sanjivChopraTitle.getText();
    }

    public String getsanjivChopraProfPicURL() {
        return sanjivChopraImg.getAttribute("src");
    }

    @FindBy(xpath = "//span[text()=\"Dr. Joseph Mikhael\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement joephImg;
    @FindBy(xpath = "//span[text()=\"Dr. Joseph Mikhael\"]")
    WebElement josephTitle;

    public String getjosephName() {
        return josephTitle.getText();
    }

    public String getjosephProfPicURL() {
        return joephImg.getAttribute("src");
    }
    @FindBy(xpath = "//span[text()=\"Dr. Duane S. Pinto\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement duaneImg;
    @FindBy(xpath = "//span[text()=\"Dr. Duane S. Pinto\"]")
    WebElement duaneTitle;
    public String getDuaneName() {
        return duaneTitle.getText();
    }

    public String getDuanePrfilePicURL() {
        return duaneImg.getAttribute("src");
    }
    @FindBy(xpath = "//span[text()=\"Dr. Frank J. Domino\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement frankImg;
    @FindBy(xpath = "//span[text()=\"Dr. Frank J. Domino\"]")
    WebElement frankTitle;
    public String getfrankName() throws InterruptedException {
        moveToElement(driver, frankTitle);
        return frankTitle.getText();
    }

    public String getFrankPrfilePicURL() {
        return frankImg.getAttribute("src");
    }
    @FindBy(xpath = "//span[text()=\"Jay Gupta\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement jayImg;
    @FindBy(xpath = "//span[text()=\"Jay Gupta\"]")
    WebElement jayTitle;
    public String getJayGuptaName() {
        return jayTitle.getText();
    }

    public String  getJayGuptaPrfilePicURL() {
        return jayImg.getAttribute("src");
    }
    @FindBy(xpath = "//span[text()=\"Dr. Martin J. Abrahamson\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement martinImg;
    @FindBy(xpath = "//span[text()=\"Dr. Martin J. Abrahamson\"]")
    WebElement martinTitle;
    public String getMartinName() {
        return martinTitle.getText();
    }

    public String getMartinPrfilePicURL() {
        return martinImg.getAttribute("src");
    }
    @FindBy(xpath = "//span[text()=\"Dr. Robert H. Shmerling\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement robertImg;
    @FindBy(xpath = "//span[text()=\"Dr. Robert H. Shmerling\"]")
    WebElement robertTitle;
    public String getRobertName() throws InterruptedException {
        moveToElement(driver, robertTitle);
        return robertTitle.getText();
    }

    public String getRobertPrfilePicURL() throws InterruptedException {
        moveToElement(driver, robertImg);
        return robertImg.getAttribute("src");
    }
    @FindBy(xpath = "//span[text()=\"Dr. Jill Grimes\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement jillImg;
    @FindBy(xpath = "//span[text()=\"Dr. Jill Grimes\"]")
    WebElement jillTitle;
    public String getJillName() {
        return jillTitle.getText();
    }

    public String  getJillPrfilePicURL() {
        return jillImg.getAttribute("src");
    }
    @FindBy(xpath = "//span[text()=\"Dr. John Sharp\"]/parent::span/parent::h4/parent::header/parent::div/div/span/img")
    WebElement johnImg;
    @FindBy(xpath = "//span[text()=\"Dr. John Sharp\"]")
    WebElement johnTitle;
    public String getJohnName() {
        return johnTitle.getText();
    }

    public String getJohnPrfilePicURL() {
        return johnImg.getAttribute("src");
    }
}
