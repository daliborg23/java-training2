package account11;

import java.util.*;

public class Account
{
	public int balance;
	//public Account() { }
	public final void insertInto(int amount)
	{
		if (balance + amount < 0)
		{
			throw new IndexOutOfBoundsException("Nedostatek penez pro vyber... Na ucte je: " + balance);
		}
		balance += amount;
	}
	public final int writeBalance()
	{ //spis string
		//Console.WriteLine($" je {balance},-"); // tady chci dostat nazev promenne ale asi jen pomoci property?
		return balance;
	}
	//public void writeBalance() {
	//    Console.WriteLine($"Na uctu je: {balance}");
	//}
	public final int writeBalanceInDolars(int kurz)
	{
		try
		{
			if (kurz == 0) {
			    throw new IllegalArgumentException("Argument 'divisor' is 0");
			}
			return balance / kurz;
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Deleni nulou!" + e.getMessage());
			return balance;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Nejaka dalsi vyjimka co se pocitani tyce." + e.getMessage());
			return balance;
		}
		catch (RuntimeException e)
		{
			System.out.println("Nejaka dalsi vyjimka co se pocitani tyce. Exception" + e.getMessage());
			return balance;
		}
	}
	public final double writeBalanceInDolarsDouble(double kurz)
	{ // vypise otaznik
		try
		{
			if (kurz == 0)
			{
				throw new IllegalArgumentException();
			}
			return balance / kurz;
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Deleni nulou!");
			return balance;
		}
	}
	public final void transferTo(Account account, int amount)
	{
		if (amount < 0)
		{
			throw new IndexOutOfBoundsException("Zadana zaporna castka...");
		}
		if (amount > this.balance)
		{
			throw new IndexOutOfBoundsException("Nedostatek penez pro prevod... Na ucte je: " + balance + " ");
		}
		if (amount == 0)
		{
			throw new IndexOutOfBoundsException("Nelze prevest 0,-");
		}
		if (account == this)
		{
			throw new IndexOutOfBoundsException("Nemuzes poslat penize sam sobe...");
		}
		this.balance -= amount;
		account.balance += amount;
	}
}
