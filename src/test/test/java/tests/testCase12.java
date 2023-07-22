package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.QaHheavenpage;
import utilities.utilities.ConfigReader;
import utilities.utilities.Driver;

public class testCase12 {
    QaHheavenpage qaHheavenpage =new QaHheavenpage();
    Actions actions =new Actions(Driver.getDriver());

    @Test(groups = "mini regression1")
    public void qaHHeavenTesti() {

        //qahasueheaven anasayfaya gidin

        Driver.getDriver().get(ConfigReader.getProperty("qaheavenUrl"));

        //3. sayfa başlığının  url'nin https://qa.hauseheaven.com/ olduğu  doğrulanır
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "qa.hauseheaven.com";
        Assert.assertTrue(actualURL.contains(expectedUrl));

        //4.kullanıcının ana sayfada olduğu doğrulanır
        Assert.assertTrue(qaHheavenpage.signİnButonu.isDisplayed());

        //5.kullanıcı cookiesi  kabul eder
        qaHheavenpage.cookiesElementi.click();

        //6.kullanıcı sign up butonunun görünür olduğunu doğrular
        qaHheavenpage.signUpbutonu.isDisplayed();

        //7.kullanıcı olarak siteye sign  up  yapar
        qaHheavenpage.signUpbutonu.click();

        //8.sign up sayfasına giriş yapabildiğini test eder
        qaHheavenpage.signUploginElementi.isDisplayed();

        //9.header barında home butonunu görünür olduğunu test eder
        qaHheavenpage.headerBarHomeElementi.isDisplayed();
        //10.email/username yazar
        qaHheavenpage.emailUsername.sendKeys(ConfigReader.getProperty("emailUsername"));
        /*actions.click(qaHheavenpage.emailUsername).sendKeys(ConfigReader.getProperty("emailUsername"))
                        .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).perform();

         */
        //11.password yazar
        qaHheavenpage.passwordelmenti.sendKeys(ConfigReader.getProperty("password"));

        //12.remember me butonuna click yapar
        qaHheavenpage.rememberMeElementi.click();

        //13. login butonuna tıklar
        qaHheavenpage.submitloginkutusu.click();

        //14.kullanıcı üyeolduğunu test eder anasayfaya tekrar gelir sign in butonuna tıklar
        qaHheavenpage.headerBarHomeElementi.click();
        qaHheavenpage.signİnButonu.click();
        //kullancı username ve paswordunu girerek giriş yapar
        qaHheavenpage.emailUsername.sendKeys(ConfigReader.getProperty("emailUsername"));
        qaHheavenpage.passwordelmenti.sendKeys(ConfigReader.getProperty("password"));
        //remember me botonuna click yapar
        qaHheavenpage.rememberMeElementi.click();
        //login butonuna giriş yapar
        qaHheavenpage.submitloginkutusu.click();









    }
}
