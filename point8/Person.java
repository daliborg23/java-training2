package point8;

public class Person implements IPocitani
{
	public double pocetPiv;
	public double pocetSeduLehu;
	public static double BMI = 22.0; // ???
	public Person(double pocetPiv, double pocetSeduLehu)
	{
		this.pocetPiv = pocetPiv * 0.08;
		this.pocetSeduLehu = pocetSeduLehu * (0.17);
	}
	public final double perimeter()
	{
		if (pocetPiv > pocetSeduLehu)
		{
			return (this.pocetPiv * 5 - this.pocetSeduLehu) * BMI;
		}
		else
		{
			return (this.pocetSeduLehu * 15) - this.pocetPiv * BMI;
		}
	}
}
