package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import page.*;

public class HaloOglasiSuccessfulRegistrationTest extends BaseTest {

    HaloOglasiHomePage haloOglasiHomePage;
    HaloOglasiLoginPage haloOglasiLoginPage;
    HaloOglasiRegistrationPage haloOglasiRegistrationPage;
    HaloOglasiSuccessfulRegistrationPage haloOglasiSuccessfulRegistrationPage;
    MailinatorHomePage mailinatorHomePage;
    MailinatorInboxPage mailinatorInboxPage;
    MailinatorHaloOglasiEmailPage mailinatorHaloOglasiEmailPage;
    HaloOglasiUserProfilePage haloOglasiUserProfilePage;


    @Before
    public void setUpTest() {
        haloOglasiHomePage = new HaloOglasiHomePage();
        haloOglasiLoginPage = new HaloOglasiLoginPage();
        haloOglasiRegistrationPage = new HaloOglasiRegistrationPage();
        haloOglasiSuccessfulRegistrationPage = new HaloOglasiSuccessfulRegistrationPage();
        mailinatorHomePage = new MailinatorHomePage();
        mailinatorInboxPage = new MailinatorInboxPage();
        mailinatorHaloOglasiEmailPage = new MailinatorHaloOglasiEmailPage();
        haloOglasiUserProfilePage = new HaloOglasiUserProfilePage();



    }


    @Test
    public void successfulRegistrationTest() {
        haloOglasiHomePage.ulogujSeClick();
        haloOglasiLoginPage.registrujteSeClick();
        haloOglasiRegistrationPage.fizickoLiceCheckBoxClick();
        haloOglasiRegistrationPage.korisnickoImeSendKeys("mikizm3211");
        haloOglasiRegistrationPage.emailSendKeys("mikizm3211@mailinator.com");
        haloOglasiRegistrationPage.passwordSendKeys("22334455");
        haloOglasiRegistrationPage.confirmPasswordSendKeys("22334455");
        haloOglasiRegistrationPage.agreedTermsCheckBoxClick();
        haloOglasiRegistrationPage.registrujMeButtonClick();
        Assert.assertTrue(haloOglasiSuccessfulRegistrationPage.registrationSuccessMessageIsDisplayed());
        Assert.assertEquals("Registracija je uspela!\n"+
                "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji Vam je poslat na : mikizm321@mailinator.com !",haloOglasiSuccessfulRegistrationPage.registrationSuccessMessageGetText());
        driver.get("https://www.mailinator.com/");
        mailinatorHomePage.mailinatorEmailSendKeys("mikizm3211@mailinator.com");
        mailinatorHomePage.mailinatorInputFieldSendKeyboardKeys(Keys.ENTER);
        mailinatorInboxPage.haloOglasiAktivacioniMailClick();
        mailinatorHaloOglasiEmailPage.switchFocusToIframeBody();
        mailinatorHaloOglasiEmailPage.aktivirajNalogButtonClick();
        haloOglasiSuccessfulRegistrationPage.switchToNewTab(1);
        Assert.assertTrue(haloOglasiSuccessfulRegistrationPage.registrationSuccessMessageIsDisplayed());
        Assert.assertEquals("Vaš nalog je uspešno aktiviran!\n" +
                "Produžite na stranicu za logovanje kako biste pristupili našem portalu. Prijava",
                haloOglasiSuccessfulRegistrationPage.registrationSuccessMessageGetText());
        haloOglasiSuccessfulRegistrationPage.prijavaLinkClick();
        haloOglasiLoginPage.emailIliKorisnickoImeInputFieldSendKeys("email");
        haloOglasiRegistrationPage.passwordSendKeys("password");
        haloOglasiLoginPage.ulogujMeButtonClick();
        haloOglasiUserProfilePage.mojProfilDopDownHover();





        }

    }

