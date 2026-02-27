package stepDefinitions;
import browsers.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class MyStepdefs {
    LoginPage loginPage;
    WebDriver driver;
    @Before
    public void setup() {
        driver = BrowserFactory.getDriver();
        loginPage = new LoginPage(driver);
    }
    @After
    public void tearDown() {
        BrowserFactory.quitDriver();
    }

    @Given("I am on OrangeHRM login page")
    public void i_am_on_login_page() {
        loginPage.openLoginPage();
    }

    @When("user enter valid username")
    public void userEnterValidUsername() {
        loginPage.enterUsername("Admin");
    }

    @When("user enter valid password")
    public void userEnterValidPassword() {
        loginPage.enterPassword("admin123");
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        loginPage.clickOnLoginBtn();
    }
}
