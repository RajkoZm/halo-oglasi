package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiRegistrationPage extends BaseTest {

    public HaloOglasiRegistrationPage () {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@value=\"person\"]")
    WebElement fizickoLiceCheckBox;

    @FindBy (id ="UserName")
    WebElement korisnickoImeInputField;

    @FindBy (id = "Email")
    WebElement emailInputField;

    @FindBy (id = "Password")
    WebElement passwordInputField;

    @FindBy (id = "ConfirmPassword")
    WebElement confirmPasswordInputField;

    @FindBy (id = "HasAgreedToGetFiscalReceiptByEmail")
    WebElement agreedTermsCheckBox;

    @FindBy (xpath = "(//button[text() ='Registruj me'])[1]")
    WebElement registrujMeButton;





    public void fizickoLiceCheckBoxClick() {
        wdWait.until(ExpectedConditions.visibilityOf(fizickoLiceCheckBox));
        if (!fizickoLiceCheckBox.isSelected()) {
            fizickoLiceCheckBox.click();
        }
    }

    public void korisnickoImeSendKeys( String ime) {
        wdWait.until(ExpectedConditions.visibilityOf(korisnickoImeInputField)).clear();
        korisnickoImeInputField.sendKeys(ime);
    }
    public void emailSendKeys( String email) {
        wdWait.until(ExpectedConditions.visibilityOf(emailInputField)).clear();
        emailInputField.sendKeys(email);
    }
    public void passwordSendKeys( String password) {
        wdWait.until(ExpectedConditions.visibilityOf(passwordInputField)).clear();
        passwordInputField.sendKeys(password);
    }
    public void confirmPasswordSendKeys( String confirmPassword) {
        wdWait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField)).clear();
        confirmPasswordInputField.sendKeys(confirmPassword);
    }

    public  void agreedTermsCheckBoxClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(agreedTermsCheckBox)).click();
    }

    public void registrujMeButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujMeButton)).click();
    }




}
