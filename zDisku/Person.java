package zDisku;

  public abstract class Person
  {
	public int age;
	private static int count = 0;
	public Person()
	{
		count++;
	}
	public Person(int vek)
	{
	  age = vek;
	  count++;
	}
	public abstract void writeInfo();
		@Override
		public String toString()
		{
			return String.format("ToString: počet osob: %1$s, věk:  %2$s", Person.getCount(), age);
		}
		public static int getCount()
		{
	  return count;
		}
  }
