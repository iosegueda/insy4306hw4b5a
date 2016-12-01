public class Employee 
{
	private String name;
	private double monthlySalary;
	private int age; 
	
	public Employee()
	{
		name = "";
		monthlySalary = 0.0;
		age = 0;
	}
	public Employee(String n, double s, int a)
	{
		setName(n);
		setMonthlySalary(s);
		setAge(a);
	}
	public String getName()
	{
		return name;
	}
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setMonthlySalary(double s)
	{
		monthlySalary = s;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public String toString()
	{
		System.print.ln("Name: " + name + "\n" +
						"Monthly Salary: " + monthlySalary + "\n" +
						"Age: " + age);
	}
	
}