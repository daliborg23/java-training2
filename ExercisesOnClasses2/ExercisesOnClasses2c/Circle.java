package ExercisesOnClasses2c;

public class Circle {
    private double radius;
    private String color;
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() { return color; }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() { return (Math.PI * radius * radius * 100) / 100; } // mathround ee
    @Override
    public String toString() { // Circle[radius=r,color=c]
        //return ("Original: " + base.ToString());
        return String.format("Circle[radius = %2.2f, color = %s]",getRadius(),getColor());
    }
}
