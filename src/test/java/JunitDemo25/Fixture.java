package JunitDemo25;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Fixture {

	@Before
	public void setup()
	{
		System.out.println("Setup Method Executed");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test1 is Executed");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("tEarDown Mehod is executed");
	}
}


