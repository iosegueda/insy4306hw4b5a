public class MyMessage 
{
	private String message; 
	
	public MyMessage(String message) 
	{
		this.message = message; 
	}
	public String printMessage()
	{
		System.out.println(message);
		return message; 
	}
}
	//have to write the test its self in a seperate file and a runner so that we 
	//can test all of this 