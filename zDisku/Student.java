package zDisku;

  public class Student extends Person
  {
	public int scholarship;
	//public Student() { }
	public Student(int vek, int stipendium)
	{
		super(vek);
	  scholarship = stipendium;
	}
	@Override
	public void writeInfo()
	{
	  System.out.print(String.format("počet osob: %1$s, věk:  %2$s", Person.getCount(), age));
	  System.out.println(String.format(", scholarship: %1$s", scholarship));
	}
	public final String toString()
	{
	  //return base.ToString() + ", scholarship: " + scholarship; //
	  return super.toString() + String.format(" scholarship: %1$s", scholarship); //2
	}
  }
