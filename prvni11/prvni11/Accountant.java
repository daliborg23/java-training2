package prvni11;

public class Accountant extends Employee
{
	public Accountant(int age, int salary)
	{
		super(age, salary);
	}
	@Override
	public void writeInfo()
	{
		super.writeInfo();
		System.out.println();
	}
}
