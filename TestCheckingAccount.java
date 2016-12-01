import org.junit.Test;
import static org.junit.Assert.*;

public class TestCheckingAccount()
{
	Account acc1;
	
	@Before
	public void setUp()
	{
		acc1 = new Account("John Doe", 1, 50.0);
		acc2 = new Account("Jane Doe", 1, 45.0);
	}
	
	@Test 
	public void testAccount
	{
		assertEquals(50, c1.getBalance());
		assertEquals(0, c2.getBalance());
	}
	
	@After 
	public void tearDown()
	{
		
	}
}