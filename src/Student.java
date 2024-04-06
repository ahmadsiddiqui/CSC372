import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private String address;
	private double GPA;
	
	public Student(String name, String address, double GPA){
		this.name = name;
		this.address = address;
		this.GPA = GPA;
	}
	
	
	public Student() {
		this.GPA = -1;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return(this.name + " " + this.address + " " + this.GPA);
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	
}
