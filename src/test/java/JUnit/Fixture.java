package JUnit;


	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	
	public class Fixture {
		@Before
		public void setup() {
			System.out.println("@Before");
		}

		@BeforeClass
		public static void setupclass(){	
			System.out.println("@BeforeClass");
		}

		@org.junit.Test
		public void test() {
			System.out.println("@Test");
		}
		
		@After
		public  void tearDown() {
			System.out.println("@After");
		}

		@AfterClass
		public static  void teardownclass(){	
			System.out.println("@AfterClass");
		}
	}
