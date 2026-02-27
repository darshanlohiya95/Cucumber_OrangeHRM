package pages;

import browsers.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    // Locator
    @FindBy(name = "username")
    WebElement username_Loc;
    @FindBy(name = "password")
    WebElement password_Loc;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton_Loc;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // Actions
    public void openLoginPage(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    public void enterUsername(String username){
        username_Loc.sendKeys(username);
    }
    public void enterPassword(String password){
        password_Loc.sendKeys(password);
    }
    public void clickOnLoginBtn(){
        loginButton_Loc.click();
    }
    // Business Logic
    public void login(String user, String pass){
        enterUsername(user);
        enterPassword(pass);
        clickOnLoginBtn();
    }
}