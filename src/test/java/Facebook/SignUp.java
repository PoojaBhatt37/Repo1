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

public class SignUp extends DriverInfo {

	String lastname;
	String name[], DOB[];
	String email, pass;

	@Test(priority=1)
	public void readExcel() throws IOException
	{
		FileInputStream fi= new FileInputStream("D:\\games\\Login.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fi);
		HSSFSheet sheet = wb.getSheetAt(0);// index of sheet 0
		String n= sheet.getRow(0).getCell(0).getStringCellValue();
		name= n.split(" ");
		email= sheet.getRow(2).getCell(0).getStringCellValue();
		pass= sheet.getRow(3).getCell(1).getStringCellValue();
		String d= sheet.getRow(4).getCell(0).toString();
		DOB= d.split("-");
		String S = sheet.getRow(5).getCell(0).getStringCellValue();
		System.out.println(S);
		fi.close();
	}

	@Test(priority=2)
	public void signupfb()
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name[0]);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(name[1]);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(pass);
		Select obj1 = new Select(driver.findElement(By.name("birthday_day")));
		obj1.selectByValue(DOB[0]);
		Select obj2= new Select(driver.findElement(By.name("birthday_month")));
		obj2.selectByVisibleText(DOB[1]);
		Select obj3= new Select(driver.findElement(By.name("birthday_year")));
		obj3.selectByValue(DOB[2]);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
	}
}








