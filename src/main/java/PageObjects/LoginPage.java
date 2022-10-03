package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {
	
	 public WebDriver driver;
	 
		
	 
	 By loginbutton=By.xpath("//button[text()='SignIn']");

	 public LoginPage(WebDriver driver) 
		{
			    this.driver =driver;
		}

    public WebElement loginButton()
	  {
		 return driver.findElement(loginbutton);
	  }
	 
}
