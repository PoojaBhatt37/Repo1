package JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerDemo {

	public static void main(String[] args)
	{
		Result res = JUnitCore.runClasses(Test1.class, Test2.class);
		for(Failure fail : res.getFailures())
		{
			System.out.println(fail.toString());
		}
		
		System.out.println(res.wasSuccessful());
	}
}
