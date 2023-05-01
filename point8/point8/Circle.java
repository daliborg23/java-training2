package point8;

public class Circle extends Shape implements IPocitani
{
	public double r;
	//public Circle(){}
	public Circle(Point center, double r)
	{
		super(center);
		if (r <= 0)
		{
			throw new ZapornaHodnotaException("Polomer musi byt kladne cislo vetsi nez 0cm.");
		}
		else
		{
			this.r = r;
		}
	}
	public Circle(double r)
	{
		this(new Point(0, 0), r);
		//this.r = r;
	}
	public Circle(double x, double y, double r)
	{
		this(new Point(x, y), r);
		//this.r = r;
	}
	public final double perimeter()
	{
		return Math.round((2 * Math.PI * r) * Math.pow(10, 2)) / Math.pow(10, 2);
	}
	@Override
	public double area()
	{
		return Math.round((Math.PI * Math.pow(r, 2)) * Math.pow(10, 2)) / Math.pow(10, 2);
	}
	@Override
	public String toString()
	{
		return String.format("Kruh s polomerem: %1$5scm", Math.round(r * Math.pow(10, 2)) / Math.pow(10, 2));
	}
	@Override
	public void writeInfo()
	{
		System.out.print(String.format("Kruh s polomerem: %1$5scm, Obvodem: %2$scm, Obsahem: %3$scm2 ", Math.round(r * Math.pow(10, 2)) / Math.pow(10, 2), perimeter(), area()));
		super.writeInfo();
	}
}
