package ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jdk.internal.org.jline.utils.Log;

public class HomePageObj {
	
	WebDriver driver = null;
	
	public HomePageObj(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver,this);
	} 
	
	//@FindBy(how = How.XPATH, using="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")
	//public WebElement UsernameDropdown;
	
	//public static By UsernameDropdown = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	
/*	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement UsernameDropdown;
	
	@FindBy(xpath="///ul[@role='menu']")
	private WebElement DropdownBox;
	
	@FindBy(xpath="//a[normalize-space()='About']")
	private WebElement About;
	
	*/

	
	private By UsernameDropdown = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	
	private By DropdownBox = By.xpath("///ul[@role='menu']");
	
	private By About = By.xpath("//a[normalize-space()='About']");
	
	/* 
	public void clickUsername() {
		UsernameDropdown.click();
	}
	*/
	/*public void userNameClick() {
		System.out.println("In Username click method");
		WebDriverWait wt1 = new WebDriverWait(driver, Duration.ofMillis(20));
		wt1.until(ExpectedConditions.elementToBeClickable(UsernameDropdown));
		System.out.println("After wait in username click method");
		UsernameDropdown.click();
		System.out.println("After click on username");
	}
	*/
	public By getUsernameDropdown() {
		
		return UsernameDropdown;
	}

	public void setUsernameDropdown(By usernameDropdown) {
		
		UsernameDropdown = usernameDropdown;
	}

	public By getDropdownBox() {
		
		return DropdownBox;
	}

	public void setDropdownBox(By dropdownBox) {
		DropdownBox = dropdownBox;
	}

	public By getAbout() {

		return About;
	}

	public void setAbout(By about) {
		About = about;
	}

	/*public WebElement getUserNameAbout() {
		return UserNameAbout;
	}

	public void setUserNameAbout(WebElement userNameAbout) {
		UserNameAbout = userNameAbout;
	}
*/
/*	public void userNameDropdown() {
		
		  WebDriverWait wt2 = new WebDriverWait(driver, Duration.ofMillis(20));
		  wt2.until(ExpectedConditions.elementToBeClickable(DropdownBox));
		 
		DropdownBox.click();
	}
	
	public void userNameAbout() {
		WebDriverWait wt3 = new WebDriverWait(driver, Duration.ofMillis(20));
		wt3.until(ExpectedConditions.elementToBeClickable(UserNameAbout));
		UserNameAbout.click();
	}
	*/
}
