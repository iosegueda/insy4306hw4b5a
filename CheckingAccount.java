//Iris Osegueda
public class CheckingAccount extends Account
{
	private double ATMFees;
	private int numberChecksWritten;
	
	public CheckingAccount()
	{
		ATMFees = 2.50;
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
	public String toString()
	{
		String string = ("ATM Fees: " + ATMFees + "\n" +
							"Number of Checks Written: " + numberChecksWritten);
		return string;
	}
	
	public void checkWrittingFee()
	{
		if (getNumberChecksWritten() > 10)
		{
			super.setBalance(super.getBalance() - ((getNumberChecksWritten() - 10) * .05));
		}
		
	}
}