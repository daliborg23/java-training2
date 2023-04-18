package prvni11;

public class Student extends Person
{
	public int scholarship;
	public Student()
	{
	}
	public Student(int age, int scholarship)
	{
		super(age);
		this.scholarship = scholarship;
	}
	@Override
	public void writeInfo()
	{
		//base.writeInfo();
		System.out.print("Pocet osob: " + Person.getCount() + ", vek: " + age);
		System.out.println(", Stipendium: " + scholarship);
	}
	public final String toString()
	{
		return super.toString() + String.format(" Stipendium: " + scholarship);
	}
}
