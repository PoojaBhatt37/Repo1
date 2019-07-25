package JUnit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

	@RunWith(Suite.class) //this annotation requires 1 test suite to be executed so we r providing a parameter suite.class
	@SuiteClasses({Test1.class, Test2.class}) // here you combine your different files
	
	public class Test_Suite {
	
	}

