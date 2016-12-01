public class SavingsAccount
{
	private double interestRate;
	private int numberWithdrawals;
	
	public SavingsAccount()
	{
		interestRate = 0.02;
		numberWithdrawals = 0;
	}
	public SavingsAccount(String o, int n, double b, double i, int w)
	{
		super.setOwner(o);
		super.setAccountNumber(n);
		super.setBalance(b);
		this.setInterestRate(i);
		this.setNumberWithdrawals(w);
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
		double interest; 
		double principleAmount;
		double ratePerYear;
		double time;
		int months;
		int monthsPerYear;
		
		principleAmount = getBalance();
		ratePerYear = interestRate;
		monthsPerYear = 12;
		months = 1;
		time = months/monthsPerYear;
		
		interest = principleAmount*ratePerYear*time;
		setBalance(getBalance() + interest);
	}
	@Override
	public void withDraw(double amt)
	{
		if(getNumberWithdrawals() < 3) 
		{
			if((getBalance() - amt) > 50)
			{
				setBalance = getBalance() - amt;
			}
			else
			{
				System.out.println("Insufficient funds, withdrawal cancelled.")
			}
			setNumberWithdrawals(getNumberWithdrawals() + 1);
		}
		else 
			System.out.println("You have reached the maximum amount of withdrawals from your savings account for this month");
		
	}
}