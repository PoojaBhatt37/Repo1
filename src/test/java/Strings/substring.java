package Strings;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class substring {


	String s = "Pooja Bhatt";

	String v = "&250,6000";
	@Test
	public void test1()
	{
		String[] str =s.split(" ");
		for(int i=0; i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
	
	@Test
	public void test2()
	{
		String re= v.replace(",", "");
		System.out.println(re);
		
		String a = re.substring(1); // start the series by 1st index not by 0
				System.out.println(a);
			
	}
	
	@Test
	public void test3()
	{
	System.out.println(s.substring(1)); // output:ooja Bhatt
	}
}


