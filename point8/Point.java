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
		return String.format("[%1$0.2f; %2$0.2f]", Double.isNaN(x) ? Double.NaN : Math.round(x * Math.pow(10, 2)) / Math.pow(10, 2), Double.isNaN(y) ? Double.NaN : Math.round(y * Math.pow(10, 2)) / Math.pow(10, 2));
		//return $"[{Math.Round(x, 2),5:F2}; {Math.Round(y,2),5:F2}]";
		//return $"[{String.Format("{0:0.00}", x)}; {String.Format("{0:0.00}", y)}]";
		//return "[" + Math.Round(x, 2).ToString("0.00") + "; " + Math.Round(y,2).ToString("0.00") + "]";
		//return "["+Math.Round(x, 2)+ "; "+ Math.Round(y, 2) + "]";
	}
}
