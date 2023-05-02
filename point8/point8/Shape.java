package point8;

public abstract class Shape
{ // : IPocitani
	public Point center;
	//public Shape(){}
	public Shape(Point center)
	{
		this.center = center;
	}
	public Shape(double x, double y)
	{
		this(new Point(x, y));
		//this.center = new Point(x, y);
	}
	// public abstract double perimeter();
	public abstract double area();
	@Override
	public String toString()
	{
		return String.format("%1$s", center.toString());
	}
	public void writeInfo()
	{
		System.out.printf("a Stred tvaru je v bode %1$s.%n", center);
	}
}
