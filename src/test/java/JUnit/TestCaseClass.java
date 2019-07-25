package JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestCaseClass extends TestCase {

	@Before
	public void setup()
	{
		
	}
	
	@Test
	public void test1()
	{
		System.out.println("Number of current test case:"+this.countTestCases());
		String name= this.getName();
		System.out.println("The Test case Name is:" +this.getName());
		
		this.setName("Test2");
		String newname = this.getName();
		System.out.println("Update name of testcase is:" +newname);
	}
	
	@After
	public void tearDown()
	{
		
	}
}
