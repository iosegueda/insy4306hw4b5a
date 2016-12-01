public class Account 
{
	private String owner;
	private int accountNumber;
	private double balance;
	
	public Account()
	{
		owner = "";
		accountNumber = 0;
		balance = 0.0;
	}
	public Account(String o, int n, double b)
	{
		setOwner(o);
		setAccountNumber(n);
		if(b >= 50)
		{
			setBalance(b);
		}
		else 
		{
			setBalance(0);
		}
	}
	
	public String getOwner()
	{
		return owner;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setOwner(String o)
	{
		owner = o;
	}
	public void setAccountNumber(int n)
	{
		accountNumber = n;
	}
	public void setBalance(double b)
	{
		balance = b;
	}
	public void withDraw(double amt)
	{
		if((getBalance() - amt) > 50)
		{
			setBalance = getBalance() - amt;
		}
		else
		{
			System.out.println("Insufficient funds, withdrawal cancelled.")
		}
	}
	public void deposit(double amt)
	{
		double amt = getBalance();
		
		amt += balance;
		
		setBalance(balance);
	}
	public String toString()
	{
		System.out.println("Owner: " + owner + "\n" +
							"Account Number: " + accountNumber + "\n" +
								"Account Balance: " + balance);
	}
	
}