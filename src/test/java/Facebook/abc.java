/*package Facebook;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import org.joda.time.chrono.GregorianChronology;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class abc {

	@Test
	public void test()
	 {
	     
		int numberOnly= Integer.parseInt(month.replaceAll("[^0-9]", ""));
		int a=0;
			
			while(true)
			{
				String text = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
				int numbey=Integer.parseInt(text.replaceAll("[^0-9]", ""));		
				if(text.equals(month))
				{
					break;
				}
				else
				{
					if(numberOnly>numbey)
					{
						a=1;
						driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
					}
					else if(numberOnly<numbey)
					{a=2;
						driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
					}
					else if(numberOnly==numbey)
					{
						if(a==2) // for back
						{
							driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
							
						}
						else if(a==1) // for forward
						{
							driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();

						}
						
						String str=month;
						    if (str != null && str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
						        str = str.substring(0, str.length() - 4);
						    }
					
						
						    System.out.println(str);
						
						Date date = null;
						try {
							date = new SimpleDateFormat("MMMM").parse("March");
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Calendar cal = Calendar.getInstance();
						cal.setTime(date);
						System.out.println(cal.get(Calendar.MONTH));
						
						
						
						
	 
		
		@Test(priority=3)
		public void readExcel() throws IOException
		{
			FileInputStream fi= new FileInputStream("D:\\games\\Login.xls");
			HSSFWorkbook wb = new HSSFWorkbook(fi);
			HSSFSheet sheet = wb.getSheetAt(1);// index of sheet 1
			trainer= sheet.getRow(4).getCell(3).getStringCellValue();
			System.out.println(trainer);
			String s= sheet.getRow(3).getCell(3).toString();
			//SD= s.split("/");
			//System.out.println(SD[0]); // 24
			//System.out.println(SD[1]); // JUNE
			//System.out.println(SD[2]); // 2019  
			
			String e= sheet.getRow(3).getCell(5).toString();
			//ED= e.split("/");
			//String BR[]= ED[0].split(" ");
			//System.out.println(BR[0]);	// 24
			//System.out.println(BR[1]);  // Dec
			//System.out.println(ED[1]);  // 2019
			
			String t= sheet.getRow(4).getCell(5).getStringCellValue();
			time= t.split("-");
			//System.out.println(time[0]);  // 9:30am
			//System.out.println(time[1]);  // 11:30am
			
			lab= sheet.getRow(5).getCell(3).getStringCellValue();
			//System.out.println(lab);     //Gyan
			
			batchType= sheet.getRow(5).getCell(5).getStringCellValue();
			//System.out.println(batchType);  // Regular/ IT-6 M
			
			String bc= sheet.getRow(2).getCell(3).getStringCellValue();
			bb= bc.split("/");
			batchCode= bb[2].split("-");
			//System.out.println(batchCode[0]);  // 06
			//System.out.println(batchCode[1]);  // 02
			fi.close();
		}
			
		@Test(priority=4)
		public void addTobatch()
		{
			Select obj1 = new Select(driver.findElement(By.name("trainer")));
			obj1.selectByValue("Admin");
			driver.findElement(By.id("start_date")).sendKeys(s);
			driver.findElement(By.xpath("")).click();
			driver.findElement(By.xpath("")).click();
			driver.findElement(By.xpath("")).click();
			Select obj2 = new Select(driver.findElement(By.xpath("")));
			obj1.selectByValue("");
			Select obj3 = new Select(driver.findElement(By.xpath("")));
			obj1.selectByValue("");
			Select obj4 = new Select(driver.findElement(By.xpath("")));
			obj1.selectByValue("");
			Select obj5 = new Select(driver.findElement(By.xpath("")));
			obj1.selectByValue("");
			Select obj6 = new Select(driver.findElement(By.xpath("")));
			obj1.selectByValue("");
			driver.findElement(By.xpath("")).click();
		}
		
	 }
}
*/