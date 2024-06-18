package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class BrowserUtilities {
	 public static List<String> getElementsText(List<WebElement> list) {
	        List<String> elemTexts = new ArrayList<>();
	        for (WebElement el : list) {
	            elemTexts.add(el.getText());
	        }
	        return elemTexts;
	    }

}
