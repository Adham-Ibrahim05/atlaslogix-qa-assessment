package Test_Scripts;


import Listeners.IInvokedMethodListenerClass;
import Listeners.ITestResultMethodListenerClass;
import LoginPage.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DriverFactory.Driver_Factory.GetDriver;
import static Utilities.DataUtility.GetJsonData;

@Listeners({IInvokedMethodListenerClass.class, ITestResultMethodListenerClass.class})
public class TC01_Login_Tenant_Switching extends BaseTest{

    protected String Region = GetJsonData("Dataset","Region Assertion");

    @Test
    public void Login_TenantSwitching(){
        DashboardPage dashboardPage = new DashboardPage(GetDriver());
        dashboardPage.TenantSwitch();
        Assert.assertTrue(dashboardPage. isTenantSelected(Region));
    }
}