package Testutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public  WebDriver driver;
	
	public WebDriver webDriverInitilize() throws IOException 
	{
		
		 Properties prop = new Properties();
			
		 FileInputStream fis = new FileInputStream("C:\\Users\\madhu\\Desktop\\Edvora\\EdvoraTest\\src\\test\\java\\test.properties");
		 prop.load(fis);
		 
		   ChromeOptions options =new ChromeOptions();
			options.addArguments("--disable-notifications");
			WebDriver driver =new ChromeDriver(options);
		String url= prop.getProperty("url");
		
		String browser= prop.getProperty("browser");
		
	
		if(browser.equals("chrome"))
		{
			
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		}
		
		return driver;

	
	
	
	}}
