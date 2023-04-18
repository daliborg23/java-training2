package prvni11;

public abstract class Employee extends Person
{
	private int salary;
	public Employee()
	{
	}
	public Employee(int age, int salary)
	{
		super(age);
		this.salary = salary;
	}
	@Override
	public void writeInfo()
	{
		//base.writeInfo();
		System.out.print("Pocet osob: " + Person.getCount() + ", vek: " + age);
		System.out.print(", Plat: " + salary);
	}
}
