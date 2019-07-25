package Facebook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class test extends DriverInfo {

	boolean bValue = false;
	HSSFSheet sheet;
	String DOB[];
	@Test
	public void multiple() throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\games\\login.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheet("sheet6");
		int r = sheet.getLastRowNum();
		int rowcount= r+1;
		for(int i=1; i<rowcount; i++)
		{

			String d = sheet.getRow(i).getCell(5).toString();
			System.out.println(d);
			DOB = d.split("-");
			List<WebElement> ls = driver.findElements(By.xpath("//*[@class='_5dba']"));
			int m=0;
			for(int k=0; k<ls.size(); k++)
			{

				ls.get(k).sendKeys(DOB[m]);
				m++;
			}
			

		}
	}
}




