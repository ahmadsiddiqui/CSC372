import java.util.ArrayList;

public class StudentArray {

	public static void main(String args[]) {
		ArrayList<Student> array = new ArrayList<Student>();
		
		//adding elements to the array		
		array.add(new Student(101,"Emily","Sacramento"));
		array.add(new Student(701,"Fiona","Fresno"));
		array.add(new Student(801,"Daniel","Denver"));
		array.add(new Student(301,"Gabriel","El Paso"));
		array.add(new Student(401,"Charlotte","Indianapolis"));
		array.add(new Student(501,"Hannah","Jacksonville"));
		array.add(new Student(901,"Ben","Chicago"));
		array.add(new Student(201,"Isaac","Kansas City"));
		array.add(new Student(601,"Alice","Honolulu"));
		array.add(new Student(703,"Jasmine","Atlanta"));
		
		
		//printing the unsorted list
		System.out.println("Unsorted list: ");
		printArray(array);
		
		//sort by roll no and print 
		SelectionSort.sort(array, new SortStudentsByRollno());
		
		System.out.println("Sorted by Rollno: ");
		printArray(array);
		
		//sort by name and print
		SelectionSort.sort(array, new SortStudentsByName());
		
		System.out.println("Sorted by Name: ");
		printArray(array);
	}
	
	//helper function to print array
	public static void printArray(ArrayList<Student> array) {
		for(Student s : array) {
			System.out.println(s.toString());
		}
	}
	
}
