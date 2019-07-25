package JunitDemo25;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

import JUnit.Test1;
import JUnit.Test2;
import JUnit.Test_Suite;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result res = JUnitCore.runClasses(TestSuite.class);
				
				for(Failure f: res.getFailures())
				{
					System.out.println(f);
				}
System.out.println(res.wasSuccessful());		
		
	}

}
