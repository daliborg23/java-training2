package ExercisesOnClasses2b;

public class Cylinder extends Circle {
    private double height;
    // Constructor with default color, radius and height
    public Cylinder(){// call superclass no-arg constructor Circle()
        super();
        height = 1.0;
    }
    // Constructor with default radius, color but given height
    public Cylinder(double height) {// call superclass no-arg constructor Circle()
        super();
        this.height = height;
    }
    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }
    // A public method for computing the volume of cylinder
    //  use superclass method getArea() to get the base area
    public double getVolume() {
        return (super.getArea() * height * 100) / 100; // lepe zaokrouhlit
    }
    @Override
    public double getArea() {
        return ((2*Math.PI*super.getRadius()*height)+(2*super.getArea()) * 100) / 100; // lepe zaokrouhlit
    }
    @Override
    public String toString() {
        return String.format("Cylinder: subclass of %s, height = %2.2f]",super.toString().trim().replace(']',Character.MIN_VALUE),height); // aby se base.tostring predelal a dosadil do zavorky vysku '\0' null char
    }
}
