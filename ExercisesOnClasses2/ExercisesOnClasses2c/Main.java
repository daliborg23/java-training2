package ExercisesOnClasses2c;

public class Main {
    public static void main(String[] args) {
        // Declare and allocate a new instance of cylinder
        //   with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println(String.format("Cylinder: radius=%2.2f height=%2.2f surface area=%2.2f volume=%2.2f",c1.getRadius(),c1.getHeight(),c1.getArea(),c1.getVolume()));

        // Declare and allocate a new instance of cylinder
        //   specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println(String.format("Cylinder: radius=%2.2f height=%2.2f surface area=%2.2f volume=%2.2f",c2.getRadius(),c2.getHeight(),c2.getArea(),c2.getVolume()));

        // Declare and allocate a new instance of cylinder
        //   specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(String.format("Cylinder: radius=%2.2f height=%2.2f surface area=%2.2f volume=%2.2f",c3.getRadius(),c3.getHeight(),c3.getArea(),c3.getVolume()));

        Cylinder c4 = new Cylinder(5.0, 8.0); // TSA = 2πr(r + h) = 2πr(r + h) = 2 × 3.14 × 5(5 + 8) = 408.41 cm2 --- Total Surface Area of Cylinder(TSA)
        System.out.println(String.format("Cylinder: radius=%2.2f height=%2.2f surface area=%2.2f volume=%2.2f",c4.getRadius(),c4.getHeight(),c4.getArea(),c4.getVolume()));
        System.out.println();
        System.out.println(c4.toString());
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
    }
}
