package LoginPage;


import Utilities.GeneralUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private final WebDriver driver;
    private final By TenantSwitcher = By.cssSelector("label.tenant-switcher select");
    private final By SecondaryTenant = By.cssSelector("option[value='TENANT-ADHAM-IBRAHIM-QA29-MENA']");;
    private final By RegionAssertion = By.cssSelector("span.region");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public DashboardPage TenantSwitch(){
        GeneralUtility.Click_OnElement(driver,TenantSwitcher);
        GeneralUtility.Click_OnElement(driver,SecondaryTenant);
        return this;
    }

    public boolean isTenantSelected(String expectedTenant)
    {
        return GeneralUtility.GetText(driver, RegionAssertion).equals(expectedTenant);
    }


}