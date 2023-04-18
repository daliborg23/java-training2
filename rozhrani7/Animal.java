package rozhrani7;

public abstract class Animal
{
	public String name;
	public static int countOfAnimals;
	public Animal()
	{
	}
	public Animal(String name)
	{
		this.name = name;
		countOfAnimals++;
	}
}
