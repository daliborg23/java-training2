package rozhrani7;

import java.util.*;

public class Rozhrani
{
	public static void main(String[] args)
	{
		ArrayList<ISoundable> animals = new ArrayList<ISoundable>(Arrays.asList(new Dog("Alik"), new Dog("Azor"), new Cat("Fous"), new Cat("Tlapka"), new Car("Mercedes")));

		for (var item : animals)
		{
			System.out.printf("%1$s %2$s vydava zvuk %3$s%n", item.getClass().getSimpleName(), item.getJmeno(), item.sound());
		}
		System.out.println("===============================");
		for (var item : animals)
		{
			System.out.println(item.toString());
		}
		System.out.println("Pocet zvirat: " + Animal.countOfAnimals);
		//Console.ReadKey();
	}
}
