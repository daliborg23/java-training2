package rozhrani7;

public class Car implements ISoundable
{
	public String name;
	public int speed;
	public Car()
	{
	}
	public Car(String name)
	{
		this.name = name;
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
		return "brrr";
	}
	@Override
	public String toString()
	{
		return String.format("%1$s %2$s vydava zvuk %3$s", this.getClass().getSimpleName(), name, sound());
	}
}
