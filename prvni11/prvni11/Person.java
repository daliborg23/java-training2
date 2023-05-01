package prvni11;

public abstract class Person
{
	public int age;
	private static int count;
	public Person()
	{
		count++;
	}
	public Person(int age)
	{
		this.age = age;
		count++;
	}
	public static int getCount()
	{
		return count;
	}
	public abstract void writeInfo();
	@Override
	public String toString()
	{
		return "ToString: pocet osob: " + Person.getCount() + ", vek: " + age;
	}
	//    {
	//      base.writeInfo();
	//    Console.WriteLine("Vek: " + age + "     Pocet instanci: " + getCount() + "      Vek getterem: " + getAge());
	//}
}
