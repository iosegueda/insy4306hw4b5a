import org.junit.Test;
import static org.junit.Assert.*;
//you need this static one bc when you call a class method's 
//we want to use the assert's methods we don't want to have to do assert.Assert
//if we call it then we can just call them 

//for this class we're always going to call it TestWhateverweretesting
public class TestCalculator
{	
	//Calculator c1 = new Calculator();
	//how come you can call it if we didnt make a constructor?
	//cause theres a default constructor 
	
	//anytime you run a test case it'll call set up first and then call testAdd
	//you always get a baseline of the initial thing 
	//you want to make sure all your test cases are running on the same initial level 
	
	Calculator c1;
	
	@Before
	public void setUp()
	{
		c1 = new Calculator();
	}
	//so now everytime it'll set you up a new calculator before every test 
	//setup, run, teardown
	//most times there isn't anything in the teardown but sometimes you do need it 
	
	@Test //we let junit know that its a test by doing this <----
	public void testAdd()
	{
		//we give it the answer we're expecting and the values its working with 
		assertEquals(7, c1.add(4,3));
		assertEquals(-7, c1.add(-4,-3));
		assertEquals(7, c1.add(9,-2));//this is a [9 + (-2)] 9 plus a negative 2 not 9 minus 2(9-2)
		assertEquals(7, c1.add(0,7));
		assertEquals(7, c1.add(7,0));
	}
	
	@Test 
	public void testSubtract()
	{
		assertEquals(1, c1.subtract(4,3));
		assertEquals(-1, c1.subtract(-4,-3));
		assertEquals(11, c1.subtract(9,-2));
		assertEquals(-7, c1.subtract(0,7));
		assertEquals(7, c1.subtract(7,0));
	}
	
	@Test //numbers aren't right on this one i just copied and pasted the last one, need to 
	//do the math for each line so that its right
	public void testMultiply()
	{
		/*assertEquals(1, c1.multiply(4,3));
		assertEquals(-1, c1.multiply(-4,-3));
		assertEquals(11, c1.multiply(9,-2));
		assertEquals(-7, c1.multiply(0,7));
		assertEquals(7, c1.multiply(7,0));*/
	}
	
	@Test (expected=ArithmeticExeception.class)//we need this bc were going to divide by 0
	public void testDivide()
	{
		/*assertEquals(1, c1.divide(4,3));
		assertEquals(-1, c1.divide(-4,-3));
		assertEquals(11, c1.divide(9,-2));
		assertEquals(-7, c1.divide(0,7));
		assertEquals(7, c1.divide(7,0)); */
		c1.divide(2,0);
		//you can look for exceptions that you expect 
	}
	
	@After 
	public void tearDown()
	{
		//sometimes when you're running multiple instances of a lot of thigns you can 
		//run out of memory 
		//most people dont do anything for tear down but if you have resources... 
	}
}
//the importance of setup and teardown is that we dont know in what order the things will 
//be tested so we want to make sure we always start out with the same thing and set on how to 
//finish so it's good for the next time? 

//the hard part is figuiring out the parts to test 
//on the test we have to list all the things that could wrong
