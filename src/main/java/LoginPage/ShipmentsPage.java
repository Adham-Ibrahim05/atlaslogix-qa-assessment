package LoginPage;


import Utilities.GeneralUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShipmentsPage {
    private final WebDriver driver;
    private final By ShipmentsPage = By.xpath("//button[contains(., 'Shipments')]");
    private final By SearchShipment = By.cssSelector("input[placeholder='Search shipments']");
    private final By ActionButton = By.cssSelector(".row-action");
    private final By SensorTab = By.xpath("//button[@role='tab' and text()='Sensors']");
    private final By ComplianceTab = By.xpath("//button[@role='tab' and text()='Compliance']");
    private final By ApproveButton = By.xpath("//button[normalize-space()='Approve compliance']");
    private final By SensorAssertion = By.cssSelector("div[role='alert']");
    private final By PermissionAssertion = By.cssSelector("div[role='status']");

    public ShipmentsPage(WebDriver driver) {
        this.driver = driver;
    }

    public ShipmentsPage NavigateToShipmentsPage(){
        GeneralUtility.Click_OnElement(driver,ShipmentsPage);
        return this;
    }

    public ShipmentsPage ShipmentDetails(String shipment){
        GeneralUtility.SendData(driver,SearchShipment,shipment);
        GeneralUtility.Click_OnElement(driver,ActionButton);
        GeneralUtility.Click_OnElement(driver,SensorTab);
        return this;
    }

    public ShipmentsPage ApproveCompliance(String shipment){
        GeneralUtility.SendData(driver,SearchShipment,shipment);
        GeneralUtility.Click_OnElement(driver,ActionButton);
        GeneralUtility.Click_OnElement(driver,ComplianceTab);
        GeneralUtility.Click_OnElement(driver,ApproveButton);
        GeneralUtility.AcceptAlert(driver);
        return this;
    }

    public boolean isSensorDataErrorDisplayed(String expected)
    {
        return GeneralUtility.GetText(driver, SensorAssertion).equals(expected);
    }

    public boolean isApprovalErrorDisplayed(String expected)
    {
        return GeneralUtility.GetText(driver, PermissionAssertion).equals(expected);
    }
}