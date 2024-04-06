
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentArray {

	public static void main(String args[]) {
		LinkedList<Student> array = new LinkedList<Student>();
		
		
		Scanner s = new Scanner(System.in);
		
		
		
		while(true)
		{
			Student st = new Student();
			System.out.println("Enter the student description or type \"done\" "
					+ "if there are no more entries: \n");
			
			System.out.println("Name: ");
			
			st.setName(s.nextLine());
			
			
			if (st.getName().equalsIgnoreCase("done")) {
				SelectionSort.sort(array, new SortStudentsByName());
				try {
					printLinkedListToFile(array);
					
				} catch (IOException e) {
					System.out.println("File not made");
					e.printStackTrace();
				}
				s.close();
				break;
			}
			System.out.println("Address: ");
			st.setAddress(s.nextLine());
			
			System.out.println("GPA: ");
			
			
			//java.util.NoSuchElementException
			boolean success = false;
			while(!success)
				try {
					st.setGPA(s.nextDouble());
					s.nextLine();
					success = true;
				}
				catch(NoSuchElementException e) {
					System.out.println("Please enter a decimal value: ");
					s.nextLine();
				}
			
			array.add(st);
		}
		
		
		
		
		
		//sort by name and print
		
	}
	private static void printLinkedListToFile(LinkedList<Student> array) throws IOException{
		try (FileWriter writer = (new FileWriter("output.txt"))){
            for (Student s : array) {
                writer.write(s.getName());
                writer.write(" : ");
                writer.write(s.getAddress());
                writer.write(" : ");
                writer.write(Double.toString(s.getGPA()));
                writer.write("\n");
            }
            System.out.println("ArrayList contents have been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
			
		
		
	}
	//helper function to print array
	public static void printLinkedList(LinkedList<Student> array) {
		for(Student s : array) {
			System.out.println(s.toString());
		}
	}
	
}
