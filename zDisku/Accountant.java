package zDisku;

  public class Accountant extends Employee
  {
	public Accountant(int vek, int plat)
	{
		super(vek, plat);
	}
	@Override
	public void writeInfo()
	{
	  super.writeInfo();
	  System.out.println();
	}
  }
