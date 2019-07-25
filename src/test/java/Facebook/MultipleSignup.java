package Facebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleSignup extends DriverInfo{

	String firstname,lastname,d, email,pass, gender;
	String DOB[];

	@Test(priority=0)
	public void multiple() throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\games\\login.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheet("sheet6");
		int r = sheet.getLastRowNum();
		int rowcount= r+1;
		for(int i=1; i<rowcount; i++)
		{
			firstname= sheet.getRow(i).getCell(0).getStringCellValue();
			lastname= sheet.getRow(i).getCell(1).getStringCellValue();
			email= sheet.getRow(i).getCell(2).getStringCellValue();
			pass = sheet.getRow(i).getCell(4).getStringCellValue();
			d = sheet.getRow(i).getCell(5).toString();
			DOB = d.split("-");
			gender= sheet.getRow(i).getCell(6).getStringCellValue();
			data();
		}
	}

	@Test(priority=1)
	public void data()
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(pass);

		List<WebElement> ls = driver.findElements(By.xpath("//*[@class='_5dba']"));
		int m=0;
		for(int k=0; k<ls.size(); k++)
		{

			ls.get(k).sendKeys(DOB[m]);
			m++;
		}
		
		

		List<WebElement> li = driver.findElements(By.xpath("//*[@class='_58mt']"));

		for(int j=0; j<=li.size();j++)
		{
			WebElement s=li.get(j);
			String ji=s.getText();
			if(ji.equals(gender))
			{
				li.get(j).click();
				break;
			}

		}

		driver.findElement(By.name("websubmit")).click();
	}
}

