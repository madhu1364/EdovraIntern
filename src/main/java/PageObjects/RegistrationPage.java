package PageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegistrationPage {
	
	
	
	
	public WebDriver driver;
	By Username=By.xpath("//input[@autocomplete='username']");
	By Passwaord=By.xpath("//input[@autocomplete='current-password']");
	By Accountbutton=By.xpath("//button[text()='Create Account']");
	
	
	public RegistrationPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	public WebElement username()
	{
		return driver.findElement(Username);
	}
		
	public WebElement passwaord()
	{
		return driver.findElement(Passwaord);
	}
	
	public WebElement accountbutton()
	{
		return driver.findElement(Accountbutton);
	}
	
	
	
	
	
	
}
