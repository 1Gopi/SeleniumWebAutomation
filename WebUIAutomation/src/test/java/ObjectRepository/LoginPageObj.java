package ObjectRepository;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPageObj {
	
	WebDriver driver;
	/*@FindBy(xpath="//form[@class='oxd-form']/div/div/div[2]/input")
	public WebElement Username; */
	
 /*	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	public WebElement Password; */
	
	/*@FindBy(xpath="//form[@class='oxd-form']/div[3]/button")
	public By Submit;
	
	*/
	
	//public LoginPageObj(WebDriver driver) {
	//	this.driver = driver;
		
		//PageFactory.initElements(this, driver);
	//}
	
	
	public By UserName = By.xpath("//form[@class='oxd-form']/div/div/div[2]/input");
	
	public By Password = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");

	public By Submit = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
/*	public WebElement EmailId() {
		return driver.findElement(UserName);
	}
	public WebElement Password() {
		return driver.findElement(Password);
	}
	
	public WebElement Submit() {
		return driver.findElement(Submit);
	}
*/
	
	
}
