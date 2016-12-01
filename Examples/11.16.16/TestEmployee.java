import org.junit.Test;
import static org.junit.Assert.*;
//this will be something we have to do on the test
//set up test cases with setups and teardowns 
//prob wont have to write employee like we did here but we do have to set up everything
//like we did here 

public class TestEmployee()
{
	EmployeeBusinessLogic ebl; 
	Employee e;
	
	@Before
	public void setUp()
	{
		ebl = new EmployeeBusinessLogic();
		e = new Employee("Jones", 8000, 20);
	}
	
	//test cases 
	//sample statement
	assertEquals(96000.0, ebl.calculateYearlySalary(e), 0.0);
	//this should give you a problem bc we've never done float numbers before 
	//saying 2 floats are equal is going to be difficult so we have to give it delta? 
	//aka how much error we're willing to take, you do this by adding a comma at the end 
	//and stating how much 
	
	@After 
	public void tearDown()
	{
		ebl = null;
		e = null; 
		//once java sees that its been set to null it'll go and take the memory back 
		//essentaially deleting it?
	}
	
	
}