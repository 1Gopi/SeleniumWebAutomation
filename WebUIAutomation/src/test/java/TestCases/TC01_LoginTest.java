package TestCases;

import ObjectRepository.HomePageObj;
import org.testng.annotations.Test;
import ObjectRepository.LoginPageObj;
import java.io.*;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//@Listeners(WebDriverlistener.Listners.class)

public class TC01_LoginTest extends BaseClass {
	///log = new Logger(TC01_LoginTest.java);
	
	LoginPageObj login = new LoginPageObj();
	
	
  @Test(description="Valid Login Test case",priority=1)
  public void validLogin() throws Exception{
	 /* WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.elementToBeClickable(login.UserName)); */
	  log.info("waiting for username field visibility");
	  WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(20));
	  wait4.until(ExpectedConditions.visibilityOfElementLocated(login.UserName));
	  driver.findElement(login.UserName).sendKeys("Admin");
	  WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(20));
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(login.Password));
	  log.info("waiting for pass field visibility");
	  driver.findElement(login.Password).sendKeys("admin123");
	  WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(20));
	  wait3.until(ExpectedConditions.elementToBeClickable(login.Submit));
	  log.info("clicking on submit button");
	  driver.findElement(login.Submit).click();
	  File srcFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  try {
		  log.info("Taking screenshot in TC01");
		FileUtils.copyFile(srcFile2,new File("../src/test/java/TestReports/Screenshots/scrt2.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		log.error("Exception on taking screenshot");
		System.out.println("File location not found : " +e.getMessage());
		//e.printStackTrace();
	}
	  //TC02_HomePage HomeObj = new TC02_HomePage(driver);
  }
  
  
/*  @Test(dependsOnMethods="validLogin")
 	public void Homepage() {

 		boolean cond = true;
 		String homeurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
 		while (cond) {
 			if (driver.getCurrentUrl().toString().equalsIgnoreCase(homeurl)) {
 				cond = false;

 				WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
 				wait5.until(ExpectedConditions.elementToBeClickable(HomeObj.UsernameDropdown));
 				WebElement dropDown = driver.findElement(HomePageObj.UsernameDropdown);
 				dropDown.click();
 				Actions ac = new Actions(driver);
 				ac.moveToElement(HomeObj.DropdownBox).build().perform();
 				ac.moveToElement(HomeObj.About).click().build().perform();

 				File scrFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 				try {
 					FileUtils.copyFile(scrFile3, new File("../src/test/java/TestReports/Screenshots/scrt4.png"));
 				} catch (IOException e) {
 					// TODO Auto-generated catch block
 					System.out.println("The error is " + e.getMessage());
 				}
 			} else {
 				try {
 					Thread.sleep(5000);
 				} catch (InterruptedException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 				}
 				cond = true;
 			}
 		}
 	}
   
  
 */
  

}
