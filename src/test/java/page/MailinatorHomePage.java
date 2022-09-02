package page;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorHomePage extends BaseTest {

    public MailinatorHomePage () {
        PageFactory.initElements(driver,this);

    }
    @FindBy (id = "search")
    WebElement mailinatorEmailInputField;

    public void mailinatorEmailSendKeys (String emailMailinator){
        wdWait.until(ExpectedConditions.visibilityOf(mailinatorEmailInputField)).clear();
        mailinatorEmailInputField.sendKeys(emailMailinator);
    }

    public void mailinatorInputFieldSendKeyboardKeys(Keys keyboardButton) {
        wdWait.until(ExpectedConditions.visibilityOf(mailinatorEmailInputField)).sendKeys(keyboardButton);
    }

}

