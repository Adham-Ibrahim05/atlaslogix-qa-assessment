package Test_Scripts;


import Listeners.IInvokedMethodListenerClass;
import Listeners.ITestResultMethodListenerClass;
import LoginPage.ShipmentsPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DriverFactory.Driver_Factory.GetDriver;
import static Utilities.DataUtility.GetJsonData;

@Listeners({IInvokedMethodListenerClass.class, ITestResultMethodListenerClass.class})
public class TC03_Permission_Locked_Record_Path extends BaseTest{

    protected String PermissionMessage = GetJsonData("Dataset","Permission Assertion");
    protected String Pending_Shipment = GetJsonData("Dataset","Pending Shipment");

    @Test
    public void Unauthorized_Approval_Permission_Path(){
        ShipmentsPage shipmentsPage = new ShipmentsPage(GetDriver());
        shipmentsPage
                .NavigateToShipmentsPage()
                .ApproveCompliance(Pending_Shipment);
        Assert.assertTrue(shipmentsPage. isApprovalErrorDisplayed(PermissionMessage));
    }
}