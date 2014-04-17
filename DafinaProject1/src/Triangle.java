
public class Triangle implements Shape {
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double size() {
		return a+b+c;
	}

	public double area() {
		double halfSize = size()/2;
		return Math.sqrt(halfSize * (halfSize - a) * (halfSize - b) * (halfSize - c));
	}

}
