public class CheckingAccount
{
	private double ATMFees;
	private int numberChecksWritten;
	
	public CheckingAccount()
	{
		ATMFees = 0.0;
		numberChecksWritten = 0;
	}
	public CheckingAccount(double f, int c)
	{
		setATMFees(f);
		setNumberChecksWritten(c);
	}
	
	public double getATMFees()
	{
		return ATMFees;
	}
	public int getNumberChecksWritten()
	{
		return numberChecksWritten;
	}
	public void setATMFees(double f)
	{
		ATMFees = f;
	}
	public void setNumberChecksWritten(int c)
	{
		numberChecksWritten = c;
	}
	public String toString
	{
		System.out.println("ATM Fees: " + ATMFees + "\n" +
							"Number of Checks Written: " + numberChecksWritten);
	}
	
	public void checkWrittingFee()
	{
		
	}
}