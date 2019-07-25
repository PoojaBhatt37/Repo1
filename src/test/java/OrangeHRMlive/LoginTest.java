package OrangeHRMlive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginTest extends Driver {
	String loginid, password;

	@Test
	public void login() throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\games\\login.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet= wb.getSheet("sheet4");
		int rowcount = sheet.getLastRowNum();
		int row= rowcount+1;

		for (int i=0; i<row; i++)
		{ 
			loginid = sheet.getRow(i).getCell(0).getStringCellValue();
			password = sheet.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(loginid);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		}
	}


	/*@Test
	public void links() throws InterruptedException 
	{	
		Thread.sleep(5000);	
		WebElement menu =  driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b"));
		WebElement sub_menu1 =  driver.findElement(By.xpath("//a[text()='User Management']"));
		WebElement sub_menu2 =  driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		Actions ac1 = new Actions(driver);
		ac1.moveToElement(menu).moveToElement(sub_menu1).moveToElement(sub_menu2).click().build().perform();
	}

	@Test
	public void add_userDetails()
	{
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();

		Select obj1 = new Select(driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
		obj1.selectByValue("1");

		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Linda Anderson");
		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("Pooja Bhatt");

		Select obj2 = new Select(driver.findElement(By.xpath("//select[@id='systemUser_status']")));
		obj2.selectByValue("1");

		driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("Admin@12");
		driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("Admin@12");

		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}

	@Test
	public void insertdata_fetch() throws InterruptedException
	{
		Thread.sleep(5000);
		int rowcount= driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println("The no of rows are:" +rowcount);

		Thread.sleep(5000);
		int columncount= driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/*")).size();
		System.out.println("The no of columns are:" +columncount);
		System.out.println("After Add Data");
		Thread.sleep(5000);
		for(int i=1; i<=1; i++)
		{
			for(int j=1; j<=5;j++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr/th["+j+"]")).getText() + "      ");
			}
		}
		System.out.println(" ");

		Thread.sleep(5000);
		for(int i=1; i<=rowcount;i++)
		{
			for(int j=1; j<=columncount;j++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td["+j+"]")).getText()+ "       ");

			}
			System.out.println(" ");
		}

	}

	@Test
	public void delete() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_2']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id= 'btnDelete']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
		driver.navigate().back();
	}


	@Test
	public void deletedata_fetch() throws InterruptedException
	{
		Thread.sleep(5000);
		int rowcount= driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println("The no of rows are:" +rowcount);

		Thread.sleep(5000);
		int columncount= driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/*")).size();
		System.out.println("The no of columns are:" +columncount);
		System.out.println("After Delete Data");
		Thread.sleep(5000);
		for(int i=1; i<=1; i++)
		{
			for(int j=1; j<=5;j++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr/th["+j+"]")).getText() + "      ");
			}
		}
		System.out.println(" ");

		Thread.sleep(5000);
		for(int i=1; i<=rowcount;i++)
		{
			for(int j=1; j<=columncount;j++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td["+j+"]")).getText()+ "       ");

			}
			System.out.println(" ");
		}

	}
	@Test
	public void search() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("Pooja Bhatt");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		driver.findElement(By.xpath("//input[@id='resetBtn']")).click();
	}

	 */


}

