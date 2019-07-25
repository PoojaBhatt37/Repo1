package JunitDemo25;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import JUnit.Test1;
import JUnit.Test2;

@RunWith(Suite.class)
@SuiteClasses({A.class, B.class})
public class TestSuite {

	
}
