package OrangeHRMlive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver {
public static WebDriver driver;
	
	@BeforeSuite
	public void initilize()
	{

		String path= System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.out.println(path);
		
		System.setProperty("webdriver.chrome.driver",path); 
		driver= new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
	}
	
	@AfterSuite
	public void close()
	{
		//driver.quit();
	}
}
