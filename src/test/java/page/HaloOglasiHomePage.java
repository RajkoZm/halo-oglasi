package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiHomePage extends BaseTest {

    public HaloOglasiHomePage () {

        PageFactory.initElements(driver,this);
    }
    @FindBy (linkText = "Uloguj se")
    WebElement ulogujSeButton;

    public void ulogujSeClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(ulogujSeButton)).click();
    }

}
