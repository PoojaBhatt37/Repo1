package ReportGeneration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ReportDemo {

	WebDriver driver;
	
	@Test
	public void initilize()
	{
		String path= System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path); 
		driver= new ChromeDriver(); 
		Reporter.log("The Browser is open now");
		driver.manage().window().maximize();
		Reporter.log("The Browser is Maximized");
		driver.get("https://www.google.com/");
		Reporter.log("The Google Website is opened");
		driver.findElement(By.name("q")).sendKeys("Hi");
		Reporter.log("The Data/Hi/ is entered");
	}
	
}
