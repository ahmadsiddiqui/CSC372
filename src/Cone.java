
public class Cone extends Shape {
	private double radius, height;
	@Override
	public double surface_area() {
		return (Math.PI * radius * 
				(radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))));
	}

	@Override
	public double volume() {
		return ((1.0/3.0) * Math.PI * Math.pow(radius, 2) * height);
	}
	
	Cone(double radius, double height){
		this.height = height;
		this.radius = radius;
		
	}

}
