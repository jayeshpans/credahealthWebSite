package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ChronicCarePage {
    private final WebDriver driver;
    public ChronicCarePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public String getobjChronicCarePageTitle() {
        return "Chronic Care - CredaHealth";
    }
}
