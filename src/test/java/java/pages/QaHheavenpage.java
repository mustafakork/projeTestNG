package java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.utilities.Driver;

public class QaHheavenpage {

    public QaHheavenpage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signİnButonu;

    @FindBy(xpath = "//button[@class='js-cookie-consent-agree cookie-consent__agree']    ")
    public WebElement cookiesElementi;

    @FindBy(xpath = " //*[@id=\"navigation\"]/div[2]/ul[1]/li[7]/a")
    public WebElement signUpbutonu;

    @FindBy(xpath = "//h2[text()='Login']")
    public WebElement signUploginElementi;

    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[1]/a")
    public WebElement headerBarHomeElementi;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailUsername;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordelmenti;

    @FindBy(xpath = "//input[@name='remember']")
    public WebElement rememberMeElementi;

    @FindBy(xpath = "//button[@type='submit'][1]")
    public WebElement submitloginkutusu;

}
