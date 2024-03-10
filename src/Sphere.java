
public class Sphere extends Shape {
	private double radius;

	@Override
	public double surface_area() { //area of sphere = 4 * pi * r^2
		return (4 * Math.PI * radius * radius);
	}

	@Override
	public double volume() { // 4/3 * pi * r^3
		
		
		return ((4.0 / 3.0) * (Math.PI) * (Math.pow(radius, 3)));
	}
	Sphere(double radius){
		this.radius = radius;
	}
}
