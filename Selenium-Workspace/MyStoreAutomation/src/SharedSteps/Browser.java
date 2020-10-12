package SharedSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Browser {

	// Declare WebDriver driver as a static so it can be used throughout test suite 
	public static WebDriver driver;
	// Declare Actions builder as a static so it can be used throughout test suite 
	static Actions builder;
	
	public static void getBrowserChrome()
	{
	// Configure Browser to be Chrome
	System.setProperty("webdriver.chrome.driver", "C:\\Python27\\Scripts\\chromedriver.exe");
	driver = new ChromeDriver();
	//Configure builder variable for any Actions that need to interact with driver
	builder = new Actions(driver);
	}

	
	public static void getBrowserFirefox()
	{
	// Configure Browser to be Firefox
	System.setProperty("webdriver.gecko.driver", "C:\\Python27\\Scripts\\geckodriver.exe");
	driver = new FirefoxDriver();
	//Configure builder variable for any Actions that need to interact with driver
	builder = new Actions(driver);
	}	

	
	public static void openUrl()
	{
	// Open Browser and navigate to BaseUrl
	String baseUrl = "http://automationpractice.com/";
//	String baseUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	driver.get(baseUrl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
	}
}