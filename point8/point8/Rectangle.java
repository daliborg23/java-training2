package point8;

public class Rectangle extends Shape implements IPocitani
{
	public double a;
	public double b;
	//public Rectangle(){}
	public Rectangle(Point center, double a, double b)
	{
		super(center);
		this.a = a;
		this.b = b;
	}
	public Rectangle(double a, double b)
	{
		this(new Point(0, 0), a, b);
		//this.a = a; this.b = b;
	}
	public Rectangle(Point center, double a)
	{ // ctverec
		this(center, a, a);
		//this.a = a; this.b = a;
	}
	public Rectangle(double a)
	{
		this(new Point(0, 0), a);
		//this.a = a; this.b = a;
	}
	public final double perimeter()
	{
		return Math.round((2 * (a + b)) * Math.pow(10, 2)) / Math.pow(10, 2);
	}
	@Override
	public double area()
	{
		return Math.round((a * b) * Math.pow(10, 2)) / Math.pow(10, 2);
	}
	@Override
	public String toString()
	{
		if (a == b)
		{
			return String.format("Ctverec s delkou strany: a = %1$5scm, Obvodem: %2$scm, Obsahem: %3$scm2 ", Math.round(a * Math.pow(10, 2)) / Math.pow(10, 2), perimeter(), area());
		}
		else
		{
			return String.format("Obdelnik s delkou stran: a = %1$5scm, b = %2$5scm, Obvodem: %3$scm, Obsahem: %4$scm2 ", Math.round(a * Math.pow(10, 2)) / Math.pow(10, 2), Math.round(b * Math.pow(10, 2)) / Math.pow(10, 2), perimeter(), area());
		}
	}
	@Override
	public void writeInfo()
	{
		if (a == b)
		{
			System.out.printf("Ctverec s delkou strany: a = %1$5scm ", Math.round(a * Math.pow(10, 2)) / Math.pow(10, 2));
		}
		else
		{
			System.out.printf("Obdelnik s delkou stran: a = %1$5scm, b = %2$5scm, Obvodem: %3$scm, Obsahem: %4$scm2 ", Math.round(a * Math.pow(10, 2)) / Math.pow(10, 2), Math.round(b * Math.pow(10, 2)) / Math.pow(10, 2), perimeter(), area());
		}
		super.writeInfo();
	}
}
