package WebDriverlistener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EventHandlerBase {
	
	final Logger logger = LogManager.getLogger(EventHandlerBase.class.getName());
	
	//This function scrolls towards a WebElement using By
	//This function is for browsers other than Firefox
/*	default boolean jsScrollToAWebElement(By by, WebDriver driver) {
		boolean aReturnValue = false;
		JavascriptExecutor js = null;
		try {
			logger.debug("jsScrollToAWebElement() : Going to perform scroll");
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",driver.findElement(by));
			logger.debug("jsScrollToAWebElement(): Scroll action performed successfully");
			aReturnValue = true;
		}
	}
*/
}
