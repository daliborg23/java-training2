package point8;

public class Cylinder
{
	public Circle bottom;
	public double height;
	public Cylinder()
	{
	}
	public Cylinder(Circle bottom, double height)
	{
		this.bottom = bottom;
		this.height = height;
	}
	public final double surface()
	{
		return Math.round((2 * bottom.area() + bottom.perimeter() * height) * Math.pow(10, 2)) / Math.pow(10, 2);
	}
	public final double volume()
	{
		return Math.round((bottom.area() * height) * Math.pow(10, 2)) / Math.pow(10, 2);
	}
	@Override
	public String toString()
	{
		return String.format("Valec s objemem: %1$scm3, Povrchem: %2$scm2, Vyskou: %3$scm, Podstavou: %4$s stred je v bode: %5$s", volume(), surface(), height, bottom.toString(), bottom.center.toString());
	}
}
