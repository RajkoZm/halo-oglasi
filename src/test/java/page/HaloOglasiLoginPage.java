package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiLoginPage extends BaseTest {

    public HaloOglasiLoginPage () {
        PageFactory.initElements(driver,this);

    }
    @FindBy (linkText = "Registrujte se →")
    WebElement registrujteSeLink;

    @FindBy (id = "EMailOrUsername")
    WebElement emailIliKorisnickoImeInputField;

    @FindBy (css = ".login-button")
    WebElement ulogujMeButton;

    public void registrujteSeClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujteSeLink)).click();
    }
    public void emailIliKorisnickoImeInputFieldSendKeys(String emailIliKorisnickoIme) {
        wdWait.until(ExpectedConditions.visibilityOf(emailIliKorisnickoImeInputField)).clear();
        emailIliKorisnickoImeInputField.sendKeys(emailIliKorisnickoIme);
    }
    public void ulogujMeButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(ulogujMeButton)).click();
    }

}
