package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverInfo {


	public static WebDriver driver;
	
	@BeforeSuite
	public void initilize()
	{

		String path= System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.out.println(path);
		
		System.setProperty("webdriver.chrome.driver",path); 
		driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
	}
	
	@AfterSuite
	public void close()
	{
		//driver.quit();
	}
}


