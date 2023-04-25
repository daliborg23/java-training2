package account11;

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
		if (amount == 0) {
		    throw new IllegalArgumentException("Nelze poslat 0,-");
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
			    throw new IllegalArgumentException("Nelze zadat 0. Zadany kurz: " + kurz);
			}
			if (kurz < 0) {
				throw new ArithmeticException("Nelze zadat zaporne cislo. Zadany kurz: " + kurz);
			}
			if (kurz > 30) {
				throw new ArithmeticException("Jedna se o podvod. Zadany kurz: " + kurz);
			}
			return balance / kurz;
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
			return 0;
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
			return 0;
		}
	}
	public final double writeBalanceInDolarsDouble(double kurz)
	{ // vypise otaznik
		try
		{
			if (kurz == 0)
			{
				throw new IllegalArgumentException("Nelze zadat 0. Zadany kurz: " + kurz);
			}
			if (kurz < 0) {
				throw new ArithmeticException("Nelze zadat zaporne cislo. Zadany kurz: " + kurz);
			}
			if (kurz > 30) {
				throw new ArithmeticException("Jedna se o podvod. Zadany kurz: " + kurz);
			}
			return balance / kurz;
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage() + "\n" + e.getStackTrace());
			return 0;
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage() + "\n" + e.getStackTrace());
			return 0;
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
