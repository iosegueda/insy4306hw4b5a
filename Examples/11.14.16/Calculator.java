public class Calculator 
{
	public int add(int number1, int number2)
	{
		return number1 + number2;
	}
	public int subtract(int number1, int number2)
	{
		return number1 - number2;
	}
	public int multiply(int number1, int number2)
	{
		return number1 * number2;
	}
	public double divide(double number1, double number2)
	{
		/*if (number2==0)
		{
			number2 = 3;
		}*/ //this is not good code it was just to test if we werent expecting an exception
		
		if (number2==0)
			throw new ArithmeticException();
		
		//if you change int to double you'll need to create your own exception 
		//otherwise it'll work bc no exception will be raised
		
		return number1/number2;
	}
}
//what kinds of numbers or values would significantly test this? 
//what scenarios would test this? 
//2 positives
//2 negatives
//1 positive 1 negative 
//0 in front 
//0 in the back 
