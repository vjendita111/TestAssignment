package test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.Broker;
import pages.BrowserUtilities;
import pages.DriverSetup;

public class BrokersTest {
 
	   private WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        driver = DriverSetup.getDriver();
	    }

	    @Test
	    public void testingBrokers() {
	        driver.get("https://www.yavlena.com/en/broker?city=Sofia");

	        Broker broker = new Broker();

	        List<String> brokersNames = BrowserUtilities.getElementsText(broker.getBrokersNames());

	        SoftAssert softAssert = new SoftAssert();

	        for (String name : brokersNames) {
	        	broker.getSearchBox().sendKeys(name);

	            softAssert.assertTrue(broker.getBrokersCards().size() == 1, "Only one broker is displayed");
	            softAssert.assertTrue(name.equals(broker.getBrokerName().getText()), "Name is correct!");


	        }

	        softAssert.assertAll();
	    }
}