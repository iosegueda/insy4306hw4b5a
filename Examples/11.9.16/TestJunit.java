import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit 
{
	@Test
	public void testAdd()//you always want the word test in it TestCount or TestWhatever 
	{
		//int num = 5;
		String str = "Junit is working ";
		assertEquals("Junit is workign fine", str);
		//tehres more asserts you could do 
		//assertFalse(num>6);
		//assertNotNull(str);
	}
}
