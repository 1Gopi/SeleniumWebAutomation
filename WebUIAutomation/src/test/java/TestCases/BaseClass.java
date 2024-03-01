package TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.apache.logging.log4j.Logger;

public class  BaseClass {
	
	public static WebDriver driver;
	String Url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
	
	public WebDriver getDriver(WebDriver driver) {
		driver = this.driver;
		return driver;
	}
	
	public void getScreenShotPath(String testCaseName,WebDriver driver) throws IOException {
		try {
			log.info("Taking screenshot in");
		File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//TakesScreenshot ts = (TakesScreenshot)driver;
		//File src = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"\\src\\test\\java\\TestReports\\"+testCaseName+".png";
		FileUtils.copyFile(ts, new File(dest));
		}
		catch(IOException e) {
			log.error("Causing exception in taking screenshot");
			System.out.println(e.getMessage());
		}
	}
	
	 @BeforeSuite(description="calling url")
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "../WebUIAutomation/src/test/java/Resources/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  log.info("Navigating to App url");
		  driver.get(Url);
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		  
	  }

	  @AfterSuite(description="quiting browser")
	  public void tearDown() throws Exception {
		  Thread.sleep(5000);
		  log.info("In tearDown");
		  driver.quit();
	  }
	  
	  
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
	}

}
