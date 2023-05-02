package files;

import java.util.*;
import java.io.*;

//Zadejte počet dnů a hodin. Program vypočte, kolik je to hodin (výsledek může být reálné číslo)
public class A1
{
	public static void Mainx()
	{
		int dny;
		int hodiny;

		System.out.print("Zadejte pocet dnu: ");
		dny = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Zadejte pocet hodin: ");
		hodiny = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.printf("\n%1$s dnu a %2$s hodiny je %3$s hodin\n" + "\r\n", dny, hodiny, (dny * 24) + hodiny);
		System.out.println("\n" + dny + " dnu a " + hodiny + "hodiny je " + (dny * 24) + hodiny + " hodin\n"); //druhá možnost
	}
}
