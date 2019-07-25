package Facebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Calender {
	//find the calendar
	

 WebDriver driver;


	@Test(priority=0)
	public void test() throws IOException
	{
		
		FileInputStream fi= new FileInputStream("D:\\games\\Login.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fi);
		HSSFSheet sheet = wb.getSheetAt(1);// index of sheet 1
		String s= sheet.getRow(3).getCell(3).toString();
		System.out.println(s);
		String SD[]= s.split("/");
		//System.out.println(SD[0]); // 24
		//System.out.println(SD[1]); // JUNE
		//System.out.println(SD[2]); // 2019 
	}

 
	@Test(priority=1)
	public void initilize() throws InterruptedException, ParseException
	{

		String path= System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.out.println(path);
		
		System.setProperty("webdriver.chrome.driver",path); 
		driver= new ChromeDriver(); 
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(5000);
		
		String set= "24/07/2019"; // dd/MM/yyy		
		String current = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText(); //MMM yyyy		
		
		Date setdate = new SimpleDateFormat("dd/MM/yyyy").parse(set);
		Date currentdate = new SimpleDateFormat("MMM yyyy").parse(current);
		
		int difference = Months.monthsBetween(new DateTime (currentdate).withDayOfMonth(1), new DateTime(setdate).withDayOfMonth(1)).getMonths();
		
		boolean isfuture= true;
		if(difference<0)
		{
			isfuture= false;
			difference= -1*difference;
		}
		
		for(int i=0; i<difference; i++)
		{
			if(isfuture)
			{
				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			else
			{
				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
		}
		
		String day;
		day= new SimpleDateFormat("dd").format(setdate);// convert setdate to dd format
		driver.findElement(By.xpath("//a[text()='"+Integer.parseInt(day)+"']")).click();
		
	
	
	}
    
}
