package zDisku;

  public class Teacher extends Employee
  {
	public int teachingTime;
	public Teacher(int vek, int plat, int uvazek)
	{
		super(vek, plat);
	  teachingTime = uvazek;
	}
	@Override
	public void writeInfo()
	{
	  super.writeInfo();
	  System.out.println(String.format(", počet úvazkových hodin: %1$s", teachingTime));
	}
  }
