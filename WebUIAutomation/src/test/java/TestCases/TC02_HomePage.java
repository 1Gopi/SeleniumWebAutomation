package TestCases;

import ObjectRepository.HomePageObj;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//@Listeners(WebDriverlistener.Listners.class)
public class TC02_HomePage extends BaseClass {
	// WebDriver driver = null;
	  HomePageObj HomeObj = new HomePageObj(driver);

		/*
		 * public TC02_HomePage(WebDriver driver) { this.driver = driver; }
		 */
	   @Test(dependsOnMethods="TestCases.TC01_LoginTest.validLogin")
		public void Homepage() throws Exception {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			boolean cond = true;
			String homeurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			log.info("Making while conditions for wait until Homepage navigation");
			while (cond) {
				if (driver.getCurrentUrl().toString().equalsIgnoreCase(homeurl)) {
					cond = false;
					log.info("wait for username clickability");
					WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait5.until(ExpectedConditions.elementToBeClickable(HomeObj.getUsernameDropdown()));				
					WebElement userclick = driver.findElement(HomeObj.getUsernameDropdown());
					log.info("clicking on username");
					js.executeScript("arguments[0].click();",userclick);
					driver.switchTo().activeElement();
					WebElement ab = driver.findElement(HomeObj.getAbout());
					log.info("clicking on About");
					ab.click();
					
					File scrFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					try {
						log.info("Taking screenshot");
						FileUtils.copyFile(scrFile3, new File(System.getProperty("user.dir")
								+ "\\src\\test\\java\\TestReports\\Screenshots\\scrt4.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						log.info("Exception of screenshot taking");
						System.out.println("The error is " + e.getMessage());
					}
				}
				else {
					
					Thread.sleep(5000);
					log.info("Make cond true for next iteration of check for homapage");
					cond = true;
				}
			}
		}
	   
	  
}
