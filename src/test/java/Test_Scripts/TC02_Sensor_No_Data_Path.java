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
public class TC02_Sensor_No_Data_Path extends BaseTest{

    protected String SensorNoDataMessage = GetJsonData("Dataset","Sensor Assertion");
    protected String Shipment = GetJsonData("Dataset","Shipment Name");

    @Test
    public void Sensor_NoData(){
        ShipmentsPage shipmentsPage = new ShipmentsPage(GetDriver());
        shipmentsPage
                .NavigateToShipmentsPage()
                .ShipmentDetails(Shipment);
        Assert.assertTrue(shipmentsPage. isSensorDataErrorDisplayed(SensorNoDataMessage));
    }
}