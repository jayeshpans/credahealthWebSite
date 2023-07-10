package pages;

import lib.PageAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetTheAppPage extends PageAction {
    private final WebDriver driver;

    public GetTheAppPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(linkText = "Download App")
    WebElement downloadAppmenu;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/div/div/div/div/div[1]/div/div/header/h2/span/span")
    WebElement getTheAppTitle;
    @FindBy(xpath = "//div[text()=\"A chronic condition management app that solves all your healthcare challenges.\"]")
    WebElement getTheAppDesc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[3]/div[1]/div/div/div/div/div[1]/div/div/header/h2/span/span")
    WebElement tryItFree;
    @FindBy(xpath = "//div[text()=\"Creda will help you stay on top of your game. You'll get 24/7 support from our digital health assistant and guidance.\"]")
    WebElement tryItFreeDesc;
    @FindBy(xpath = "//strong[text()=\"Get the App\"]")
    WebElement getTheApp;
    @FindBy(xpath = "//span[text()=\"App Store\"]/parent::a[@class=\"bt_bb_link\"]")
    WebElement appStoreBtn;
    @FindBy(xpath = "//span[text()=\"Play Store\"]/parent::a[@class=\"bt_bb_link\"]")
    WebElement playStoreBtn;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section[3]/div[1]/div/div/div/div/div[1]/div/div/div[5]/div[1]/div/span/img")
    WebElement appImg;
    public void clickOngetTheApp() {
        downloadAppmenu.click();
    }

    public String  getTheAppTitle() {
        return driver.getTitle();
    }

    public String getpageTitle() {
        return getTheAppTitle.getText();
    }

    public String  getpageDesc() {
        return getTheAppDesc.getText();
    }

    public String getTryItFreeTitle() {
        return tryItFree.getText();
    }

    public String getTryItFreeDesc() {
        return tryItFreeDesc.getText();
    }

    public String getAppLinkTitle() {
        return getTheApp.getText();
    }

    public String  getAppStoreLink() {
        return appStoreBtn.getAttribute("href");
    }

    public String  getPlayStoreLink() {
        return playStoreBtn.getAttribute("href");
    }

    public String getPlayStoreLogoLink() {
        return appImg.getAttribute("src");
    }
}
