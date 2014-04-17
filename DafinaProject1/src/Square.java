
public class Square implements Shape {
	private double a;
	
	public Square(double a) {
		this.a = a;
	}

	public double size() {
		return 4*a;
	}

	public double area() {
		return a*a;
	}
}