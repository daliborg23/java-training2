package prvni11;

public class Main
{
	public static void main(String[] args)
	{
		Student s1 = new Student(18, 10000);
		Accountant a1 = new Accountant(22, 25000);
		Teacher t1 = new Teacher(33, 35000, 33);
		s1.writeInfo();
		a1.writeInfo();
		t1.writeInfo();
		System.out.println("Pocet osob: " + Person.getCount() + ", vek: " + t1.age);
		System.out.println(s1);
		System.out.println(s1);
		System.out.println(s1);
	}
}
