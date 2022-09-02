package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiUserProfilePage extends BaseTest {

    public HaloOglasiUserProfilePage () {
        PageFactory.initElements(driver,this);
    }
    @FindBy (className = "header-label")
    WebElement mojProfilDropDown;

    @FindBy (xpath = "(//p[@class=\"user-display-name\")][1]")
    WebElement korisnickoIme;

    @FindBy (xpath = "(//p[@class = \"user-email\")][1]")
    WebElement korisnickiEmail;

    public void mojProfilDopDownHover() {
        wdWait.until(ExpectedConditions.elementToBeClickable(mojProfilDropDown));
        actions.moveToElement(mojProfilDropDown).perform();

    }
    public boolean korisnickoImeIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(korisnickoIme));
        return korisnickoIme.isDisplayed();
    }
    public String korisnickoImegetText() {
        wdWait.until(ExpectedConditions.visibilityOf(korisnickoIme));
        return korisnickoIme.getText();
    }
    public boolean korisnickiEmailIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(korisnickiEmail));
        return korisnickiEmail.isDisplayed();
    }
    public String korisnickiEmailGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(korisnickiEmail));
        return korisnickiEmail.getText();
    }


}
