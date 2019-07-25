package Facebook;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class datefromexcel {


	WebDriver driver;
	
	@BeforeSuite
	public void initilize()
	{

		String path= System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path); 
		driver= new ChromeDriver(); 
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	}
	@Test
	public void readExcel() throws IOException
	{
		FileInputStream fi= new FileInputStream("D:\\games\\Login.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fi);
		HSSFSheet sheet = wb.getSheetAt(1);// index of sheet 1
		String s= sheet.getRow(3).getCell(3).toString(); // returns start date
		System.out.println(s);
		/*WebElement d= driver.findElement(By.id(er"datepicker"));
		d.click();
		d.sendKeys(s);
		*/
		/*String e= sheet.getRow(3).getCell(5).toString(); // returns end date
		System.out.println(e);
		driver.findElement(By.id("start_date")).sendKeys(e);*/
	}
	
}