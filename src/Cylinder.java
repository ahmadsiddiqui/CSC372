
public class Cylinder extends Shape {
	
	private double radius,height;

	@Override
	public double surface_area() { //A=2πrh+2πr^2
		return ((2 * Math.PI * radius * height) 
				+ (2 * Math.PI * radius *radius));
	}

	@Override
	public double volume() {//V=πr^2h
		
		return (Math.PI * radius * radius * height);
	}
	
	Cylinder(double radius, double height){
		this.height = height;
		this.radius = radius;
	}
}
