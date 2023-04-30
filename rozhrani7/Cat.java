package rozhrani7;

public class Cat extends Animal implements ISoundable
{
	//private boolean isPedigree;
	public Cat()
	{
		super();
	}
	public Cat(String name)
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
		return "mnau";
	}
	@Override
	public String toString()
	{
		return String.format("%1$s %2$s vydava zvuk %3$s", this.getClass().getSimpleName(), name, sound());
	}
}
