package Btes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginBtes extends Driver  {
	
	String time[], bb[], batchCode[],b[];
	String lab, batchType, trainer, s,e, l;
	
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		Thread.sleep(5000);
		Select obj1 = new Select(driver.findElement(By.xpath("//select[@name='shop']")));
		obj1.selectByValue("SDET");
		Thread.sleep(5000);
		Select obj2 = new Select(driver.findElement(By.xpath("//select[@name='trainer']")));
		obj2.selectByValue("trainer");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("trainer");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='submit']")).click();
	}
	
	@Test(priority=2)
	public void links() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='sidebar-menu']/div/ul/li[1]/a[contains(text(), ' Manage Batches')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='sidebar-menu']/div/ul/li/ul/li/a/span[contains(text(), 'Add Batch')]")).click();
		
	}
	
	@Test(priority=3)
	public void readExcel() throws IOException
	{
		FileInputStream fi= new FileInputStream("D:\\games\\Login.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fi);
		HSSFSheet sheet = wb.getSheetAt(1);// index of sheet 1
		trainer= sheet.getRow(4).getCell(3).getStringCellValue();
		s= sheet.getRow(3).getCell(3).toString(); // returns start date
				
		e= sheet.getRow(3).getCell(5).toString(); // returns end date
				
		String t= sheet.getRow(4).getCell(5).getStringCellValue();
		time= t.split("-");
		//System.out.println(time[0]);  // 9:30am
		//System.out.println(time[1]);  // 11:30am
		
		lab= sheet.getRow(5).getCell(3).getStringCellValue();//Gyan
		l = lab.toUpperCase();
		System.out.println(l);
	
		batchType= sheet.getRow(5).getCell(5).getStringCellValue();// Regular/ IT-6 M
		b = batchType.split("/");
		System.out.println(b[1]);
		String bc= sheet.getRow(2).getCell(3).getStringCellValue();
		bb= bc.split("/");
		batchCode= bb[2].split("-");
		//System.out.println(batchCode[0]);  // 06
		//System.out.println(batchCode[1]);  // 02
		fi.close();
	}
		
	@Test(priority=4)
	public void addTobatch() throws InterruptedException
	{
		Select obj1 = new Select(driver.findElement(By.name("trainer")));
		obj1.selectByValue("Admin");	
		driver.findElement(By.id("start_date")).sendKeys(s);
		driver.findElement(By.id("end_date")).sendKeys(e);
		
		driver.findElement(By.name("timefrom")).sendKeys(time[0]);
		Thread.sleep(5000);
		driver.findElement(By.name("timeto")).sendKeys(time[1]);
		Thread.sleep(5000);
		System.out.println();
		Select obj2 = new Select(driver.findElement(By.name("labname")));
		obj2.selectByVisibleText(l);
		Thread.sleep(5000);
		Select obj3 = new Select(driver.findElement(By.name("session")));
		obj3.selectByValue("dec/jan-may/june");	
		Select obj4 = new Select(driver.findElement(By.name("batch_type")));
		obj4.selectByValue(b[1]);	
		Select obj5 = new Select(driver.findElement(By.name("batch_status")));
		obj5.selectByValue("process");
		Select obj6 = new Select(driver.findElement(By.name("batch_month")));
		obj6.selectByValue(batchCode[0]);
		driver.findElement(By.name("batch_code")).sendKeys(batchCode[1]);
		
		
		
		
		
		driver.findElement(By.name("submit")).click();
		
		

		
		
		
	}
	
}




