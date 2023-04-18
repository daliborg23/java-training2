package zDisku;

  public class Prvni
  {
	public static void Main(String[] args)
	{
	  Student s1 = new Student(20, 1000);
	  s1.writeInfo();
	  System.out.println(s1);
	  Accountant e1 = new Accountant(30, 12000);
	  e1.writeInfo();
	  Teacher u1 = new Teacher(40, 20000, 22);
	  u1.writeInfo();
	  System.out.println(String.format("počet osob: %1$s, věk:  %2$s", Person.getCount(), u1.age));
	}
  }
