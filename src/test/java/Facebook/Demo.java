package Facebook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
int a=100, b=29;

@Test
public void add()
{
	System.out.println("Add");
	Assert.assertEquals(129, a+b);
}
@Test
public void sub()
{
	System.out.println("Subtract");
	Assert.assertEquals(71, a-b);
}

}
