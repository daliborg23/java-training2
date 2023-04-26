package point8;

public class Point
{
	public double x;
	public double y;
	//public Point() {}
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString()
	{
		//return String.format("[%0.1f",x) + "," + String.format("%0.1f]",y);
		return "[" + x + "," + y + "]";
	}
}
