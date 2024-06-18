package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Broker {
	public Broker(){
			PageFactory.initElements(DriverSetup.getDriver(), this);	    }


		    @FindBy(xpath = "//*[@id=\"broker-keyword\"]")
		    private WebElement searchBox;

		    public WebElement getSearchBox() {
		        return searchBox;
		    }


		    @FindBy(xpath = "/html/body/div[3]/div[1]")
		    private List<WebElement> brokersNames;

		    public List<WebElement> getBrokersNames() {
		        return brokersNames;
		    }

		    @FindBy(xpath = "/html/body/div[3]/div[1]/div[1]/div")
		    private List<WebElement> brokersCards;

		    public List<WebElement> getBrokersCards() {
		        return brokersCards;
		    }

		    @FindBy(xpath = "/html/body/div[3]/div[1]/div[1]/div/div[2]/a[1]")
		    private WebElement brokerName;

		    public WebElement getBrokerName() {
		        return brokerName;
		    }
		
	}


