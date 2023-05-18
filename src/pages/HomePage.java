package pages;

import lib.PageAction;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
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
}
