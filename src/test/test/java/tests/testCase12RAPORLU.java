package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.QaHheavenpage;
import utilities.utilities.ConfigReader;
import utilities.utilities.Driver;
import utilities.utilities.ReusableMethods;
import utilities.utilities.TestBaseRapor;

public class testCase12RAPORLU extends TestBaseRapor {
    QaHheavenpage qaHheavenpage =new QaHheavenpage();
    Actions actions =new Actions(Driver.getDriver());

    @Test(groups = "mini regression1")
    public void qaHHeavenTesti() {
        extentTest =extentReports.createTest("qahauseheaven sayfasına üye girişi","kullanıcı qaHH sayfasına girebilmeli");

        //qahasueheaven anasayfaya gider

        Driver.getDriver().get(ConfigReader.getProperty("qaheavenUrl"));
        extentTest.info("kullanıcı qahasueheaven anasayfaya gider");

        //3. sayfa başlığının  url'nin https://qa.hauseheaven.com/ olduğu  doğrulanır
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "qa.hauseheaven.com";
        Assert.assertTrue(actualURL.contains(expectedUrl));
        extentTest.pass("ana sayfa URl'nin qa.hauseheaven.com olduğunu test eder");

        //4.kullanıcının ana sayfada olduğu doğrulanır
        Assert.assertTrue(qaHheavenpage.signİnButonu.isDisplayed());
        extentTest.pass("Kullanıcı ana sayfada olduğunu doğrular");

        //5.kullanıcı cookiesi  kabul eder
        qaHheavenpage.cookiesElementi.click();
        extentTest.info("kullanıcı cookiesi kabul eder");

        //6.kullanıcı sign up butonunun görünür olduğunu doğrular
        qaHheavenpage.signUpbutonu.isDisplayed();
        extentTest.info("kullanıcı sign up butonunun görünür olduğunu doğrular");

        //7.kullanıcı olarak siteye sign  up  yapar
        qaHheavenpage.signUpbutonu.click();
        extentTest.info("kullanıcı olarak siteye sign  up  yapar");

        //8.sign up sayfasına giriş yapabildiğini test eder
        qaHheavenpage.signUploginElementi.isDisplayed();
        extentTest.pass("sign up sayfasına giriş yapabildiğini test eder");

        //9.header barında home butonunu görünür olduğunu test eder
        qaHheavenpage.headerBarHomeElementi.isDisplayed();
        extentTest.pass("header barında home butonunu görünür olduğunu test eder");
        //10.email/username yazar
        qaHheavenpage.emailUsername.sendKeys(ConfigReader.getProperty("emailUsername"));
        extentTest.info("kullanıcı email/username yazar");
        /*actions.click(qaHheavenpage.emailUsername).sendKeys(ConfigReader.getProperty("emailUsername"))
                        .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).perform();

         */
        //11.password yazar
        qaHheavenpage.passwordelmenti.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("kullanıcı password yazar");

        //12.Remember botonuna click yapar
        qaHheavenpage.rememberMeElementi.click();
        extentTest.info("Kullanıcı Remember botonuna click yapar");

        //13. login butonuna tıklar
        qaHheavenpage.submitloginkutusu.click();
        extentTest.info("Kullanıcı login butonuna tıklar");

        //14.kullanıcı üyeolduğunu test eder anasayfaya tekrar gelir sign in butonuna tıklar
        qaHheavenpage.headerBarHomeElementi.click();
        qaHheavenpage.signİnButonu.click();
        extentTest.info("kullanıcı üyeolduğunu test eder anasayfaya tekrar gelir sign in butonuna tıklar");
        //kullancı username ve paswordunu girerek giriş yapar
        qaHheavenpage.emailUsername.sendKeys(ConfigReader.getProperty("emailUsername"));
        qaHheavenpage.passwordelmenti.sendKeys(ConfigReader.getProperty("password"));
        //remember me botonuna click yapar
        qaHheavenpage.rememberMeElementi.click();
        //login butonuna giriş yapar
        qaHheavenpage.submitloginkutusu.click();
        extentTest.info("kullancı username ve paswordunu girerek giriş yapar");

        ReusableMethods.bekle(2);

        tearDownTest();









    }
}
