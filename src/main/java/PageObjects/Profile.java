package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Profile 
{
  
	
	public WebDriver driver;
	
	
	By Fullname = By.xpath("//input[@name='fullname']");
	
	By moblienumber =By.xpath("//input[@name='mobileNumber']");
	
	By changepassword =By.xpath("//input[@name='Password']");
	
	By logout =By.xpath("//button[text()='Logout']");
	
	
	
	public Profile(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement Fullname() 
	{
		return driver.findElement(Fullname);
	}
	
	public WebElement moblienumber() 
	{
		return driver.findElement(moblienumber);
	}
	
     public WebElement changepassword() 
{
	return driver.findElement(changepassword);
	
}


     public WebElement logout() 
     {
     	return driver.findElement(logout);
     	
     }


}