package ExercisesOnClasses1;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	public Circle(double r) {
		this.radius = r;
		this.color = "red";
	}
	public Circle(double r, String color) {
		this.radius = r;
		this.color = color;
	}
	public double getRadius() {
		return this.radius;
	}
	public String getColor() {
		return this.color;
	}
	public void setRadius(double r) {
		this.radius = r;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return "Circle[radius=" + radius + ", color=" + color + "]";
	}
	public double getArea() {
		return Math.round((Math.PI * radius * radius * 100.00))/100.00;
		//return Math.round(Math.PI * radius * radius);
	}
}
