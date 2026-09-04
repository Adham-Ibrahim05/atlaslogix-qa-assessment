package Test_Scripts;

import Listeners.IInvokedMethodListenerClass;
import Listeners.ITestResultMethodListenerClass;
import LoginPage.LoginPage;
import Utilities.LogsUtility;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static DriverFactory.Driver_Factory.*;
import static Utilities.DataUtility.GetJsonData;
import static Utilities.DataUtility.GetPropertiesDataFromFile;

@Listeners({IInvokedMethodListenerClass.class, ITestResultMethodListenerClass.class})
public class BaseTest {

    protected String Email = GetJsonData("Dataset","Admin Username");
    protected String Password = GetJsonData("Dataset","Admin Password");
    protected String Role = GetJsonData("Dataset","Role Assertion");

    @Parameters({"browser"})
    @BeforeClass
    public void Setup(@Optional String browser)
    {

        // If browser is not provided in XML, fallback to environment.properties
        if(browser == null || browser.isEmpty()){
            browser = GetPropertiesDataFromFile("environment","Browser");
        }

        // Initialize the browser
        SetupDriver(browser);
        LogsUtility.LoggerInfo("Browser is Opened");

        //Start use the driver
        GetDriver().get(GetPropertiesDataFromFile("environment","Login_URL"));
        LogsUtility.LoggerInfo("Page is redirecting to the URL");

        LoginPage loginpage = new LoginPage(GetDriver());
        loginpage.EnterEmail(Email)
                .EnterPassword(Password)
                .ClickOnSignInButton();
        Assert.assertTrue(loginpage.isRoleDisplayed(Role));

    }

    @AfterClass
    public void Quit()
    {
        QuitDriver();
    }
}
