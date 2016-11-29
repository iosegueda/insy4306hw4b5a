public class SavingsAccount
{
	private double interestRate;
	private int numberWithdrawals;
	
	public SavingsAccount()
	{
		interestRate = 0.0;
		numberWithdrawals = 0;
	}
	public SavingsAccount(String o, int n, double b, double l, int w)
	{
		
	}
	
	public double getInterestRate()
	{
		return interestRate;
	}
	public getNumberWithdrawals;
	{
		return numberWithdrawals;
	}
	public void setInterestRate(double i)
	{
		interestRate = i;
	}
	public void setNumberWithdrawals(int w)
	{
		numberWithdrawals = w;
	}
	public String toString()
	{
		System.out.println("Interest Rate: " + interestRate + "\n" +
							"Number of Withdrawals: " + numberWithdrawals);
	}
	
	public void calculateInterest()
	{
		
	}
}