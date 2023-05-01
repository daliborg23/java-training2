package ExercisesOnClasses1;

public class Rectangle {
	private float length;
	private float width;
	
	public Rectangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public double getArea() {
		return Math.round(length * width * 100.00) / 100.00;
	}
	public double getPerimeter() {
		return Math.round(2 * (length + width) * 100.00) / 100.00;
	}
	public String toString() {
		return "Rectangle[length=" + length + ",width=" + width + "]";
	}
}
