import org.junit.Test;
import static org.junit.Assert.*;
//you need this static one bc when you call a class method's 
//we want to use the assert's methods we don't want to have to do assert.Assert
//if we call it then we can just call them 

//for this class we're always going to call it TestWhateverweretesting
public class TestMyMessage
{
	String message = "Hello World";
	
	MyMessage ml = new MyMessage(message);
	
	@Test //we let junit know that its a test by doing this <----
	public void testPrintMessage()
	{
		assertEquals(message, m1.printMessage());
	}
}
