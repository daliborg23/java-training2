package rozhrani7;

public abstract class Animal
{
	public String name;
	public static int countOfAnimals;
	public Animal() {
		countOfAnimals++;
	}
	public Animal(String name)
	{
		this.name = name;
		countOfAnimals++;
	}
}
