package JUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AssertClass {
	int num;
	String temp, str;

	@Before
	public void setup()
	{
		num=5;
		temp=null;
		str= "Junit is working fine";
	}

	@Test
	public void test()
	{
		//check for false condition
		assertEquals("Junit is working fine", str);	

		//check for false condition
		assertFalse(num>6);

		//check for not null value
		assertNotNull(str);

		//check for null value
		assertNull(temp);

		//check for true condition
		assertTrue(num==5);

	}


}
