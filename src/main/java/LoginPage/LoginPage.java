package LoginPage;


import Utilities.GeneralUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final By Email = By.cssSelector("input[type='email']");
    private final By Password = By.cssSelector("input[type='password']");
    private final By SignInButton = By.cssSelector("button.button--primary.button--wide");
    private final By RoleAssertion = By.cssSelector("span > small");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage EnterEmail(String email)
    {
        GeneralUtility.SendData(driver,Email,email);
        return this;
    }

    public LoginPage EnterPassword(String password)
    {
        GeneralUtility.SendData(driver,Password,password);
        return this;
    }

    public void ClickOnSignInButton()
    {
        GeneralUtility.Click_OnElement(driver,SignInButton);
    }

    public boolean isRoleDisplayed(String expectedRole)
    {
        return GeneralUtility.GetText(driver, RoleAssertion).equals(expectedRole);
    }
}
