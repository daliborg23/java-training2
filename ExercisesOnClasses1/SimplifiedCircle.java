package ExercisesOnClasses1;

public class SimplifiedCircle {
	private double radius;
	
	public SimplifiedCircle() {
		this.radius = 1;
	}
	public SimplifiedCircle(double r) {
		this.radius = r;
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double r) {
		this.radius = r;
	}
	public double getArea() {
		return Math.round((Math.PI * radius * radius * 100.00))/100.00;
	}
	public double getCircumference() {
		return Math.round((2 * Math.PI * radius * 100.00))/100.00;
	}
	public String toString() {
		return "Circle[radius=" + radius + "]";
	}
	
}
