package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Broker {
	public Broker(){
			   PageFactory.initElements(DriverSetup.getDriver(), this);	    }


		    @FindBy(css = ".brokers-loading")
		    private WebElement loader;

		    
		    public WebElement getLoader() {
		        return loader;
		    }

		    @FindBy(css = "input.input-search")
		    private WebElement searchBox;

		    public WebElement getSearchBox() {
		        return searchBox;
		    }

		    @FindBy(css = "div.load-more-brokers > a")
		    private WebElement loadMoreBrokersBtn;

		    public WebElement getLoadMoreBrokersBtn() {
		        return loadMoreBrokersBtn;
		    }

		    @FindBy(css = "div.header-group > h3 > a")
		    private List<WebElement> brokersNames;

		    public List<WebElement> getBrokersNames() {
		        return brokersNames;
		    }

		    @FindBy(css = "article.broker-card")
		    private List<WebElement> brokersCards;

		    public List<WebElement> getBrokersCards() {
		        return brokersCards;
		    }

		    @FindBy(css = "article.broker-card .name")
		    private WebElement brokerName;

		    public WebElement getBrokerName() {
		        return brokerName;
		    }
		
	}


