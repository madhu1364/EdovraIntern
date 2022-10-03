package EdvoraIntern;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.Profile;

import PageObjects.RegistrationPage;
import Testutils.TestBase;



public class EdvoraHome {
	public WebDriver driver;

	
	@Test(priority=1)
	public void enterUserDetails() throws IOException, InterruptedException
	{
	
        Properties prop = new Properties();
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\madhu\\Desktop\\Edvora\\EdvoraTest\\src\\test\\java\\test.properties");
		
		prop.load(fis);
		
		TestBase tb = new TestBase();
		driver = tb.webDriverInitilize();
	    LoginPage lp=new LoginPage(driver);
	    lp.loginButton().click();
		
		
	}
	

	@Test(priority=2)
	public void Pageaccount() throws InterruptedException 
	{
		
		RegistrationPage Rp=new RegistrationPage(driver); 
		Rp.username().sendKeys("madhu");
		Rp.passwaord().sendKeys("Ram");
		Rp.accountbutton().click();
		
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		
	}
	
	
	@Test(priority=3)
	
	public void Profilepage() throws InterruptedException  
	{
		
		
		Profile Pp=new Profile (driver);
		Pp.Fullname().sendKeys("abhiram");
		Pp.moblienumber().sendKeys("9160468914");
		Pp.changepassword().sendKeys("abhiram");
		Pp.logout().click();
		
	}
		
		
		
		

		
	



























}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

