package rozhrani7;

public class Dog extends Animal implements ISoundable
{
	//private boolean isPedigree;
	public Dog()
	{
		super();
	}
	public Dog(String name)
	{
		super(name);

	}
	public final String getJmeno()
	{
		return (name);
	}
	public final void setJmeno(String value)
	{
		name = value;
	}
	public final String sound()
	{
		return "haf";
	}
	public final String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		return String.format("%1$s %2$s vydava zvuk %3$s", this.getClass().getSimpleName(), name, sound());
	}
}
