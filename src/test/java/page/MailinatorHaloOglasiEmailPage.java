package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorHaloOglasiEmailPage extends BaseTest {

    public MailinatorHaloOglasiEmailPage () {
        PageFactory.initElements(driver,this);

    }
    @FindBy (linkText = "Aktiviraj nalog")
    WebElement aktivirajNalogButton;

    @FindBy (id = "html_msg_body")
    WebElement iframeBody;


    public void aktivirajNalogButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(aktivirajNalogButton)).click();
    }

    public void switchFocusToIframeBody() {
        wdWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeBody));
    }

    public void switchFocusToIframeBody1() {
        wdWait.until(ExpectedConditions.visibilityOf(iframeBody));
        driver.switchTo().frame(iframeBody);

    }
     public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
     }

}
