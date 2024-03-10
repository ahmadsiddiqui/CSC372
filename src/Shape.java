
public abstract class Shape {
	public abstract double surface_area();
	public abstract double volume();
	
	public String toString() {
		
		return String.format("Surface Area: %f Volume: %f",this.surface_area(),this.volume());
	
	}
}
