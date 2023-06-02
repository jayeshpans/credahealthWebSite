package pages;

import lib.PageAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//div[@id=\"top\"]/div[2]/div/div/div/section[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div/header/h4/span/span")
    WebElement providersec1h4;

    @FindBy(xpath = "//div[@id=\"top\"]/div[2]/div/div/div/section[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/p")
    WebElement providersec1desc;

    @FindBy(xpath = "//div[@id=\"top\"]/div[2]/div/div/div/section[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/span/img")
    WebElement providersec1img;

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
        return providerdesc.getText();
    }

    public String validateprovidersec1Title() {
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
}
