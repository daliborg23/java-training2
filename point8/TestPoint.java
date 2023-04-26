package point8;

public class TestPoint
{
	public static void main(String[] args)
	{
		//double sumaObvodu = 0.0;
		//List<IPocitani> ListTvaru = new List<IPocitani>() {
		//    new Circle(new Point(4.23, -6.66), 7),
		//    new Circle(4.2),
		//    new Circle(5.01, 3.88, 4.44),

		//    new Rectangle(new Point(-3.22, 3.98), 5.76, 4.09),
		//    new Rectangle(7.55, 6.49),
		//    new Rectangle(new Point(4.77, -5.29), 4.2),
		//    new Rectangle(7.77),

		//    new Person(15,0),
		//    new Person(0, 30)
		//};
		//for (int i = 0; i < ListTvaru.Count; i++) {
		//    sumaObvodu += ListTvaru[i].perimeter();
		//}
		//sumaObvodu = Math.Round(sumaObvodu, 2);
		//Console.WriteLine($"Soucet obvodu vsech vytvorenych kruhu je: {sumaObvodu}cm"); // 402.43
		
		// zaokrouhlovani v jave double roundOff = Math.round(a * 100.0) / 100.0; hh

		Cylinder cyl1 = new Cylinder(new Circle(new Point(2.34,3.45),3.6), 4.2);
		System.out.println(cyl1);
		
//		Point p1 = new Point(1.23,3.21);
//		System.out.println(p1);
	}
}
