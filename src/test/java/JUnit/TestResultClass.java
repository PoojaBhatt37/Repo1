package JUnit;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestResult;

public class TestResultClass extends TestResult {

	@Test
	public void addtest()
	{
		Assert.assertEquals(5, 6);
		
	}
}
