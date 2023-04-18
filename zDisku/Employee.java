package zDisku;

  public class Employee extends Person
  {
	public int salary;
	public Employee()
	{
	}
	public Employee(int vek, int plat)
	{
		super(vek);
	  salary = plat;
	}
	@Override
	public void writeInfo()
	{
	  System.out.print(String.format("počet osob: %1$s, věk:  %2$s", Person.getCount(), age));
	  System.out.print(String.format(", salary: %1$s", salary));
	}
  }
