import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ListAndSet {
	public static void main(String args[]) {
		LinkedList<String> classes = new LinkedList<String>();
		
		classes.add("Math 101");
		classes.add("Math 102");
		classes.add("Math 103");
		
		System.out.println(classes);
		
		classes.addFirst("Math 100");
		classes.remove(2);
		
		System.out.println(classes);
		
		Set<String> classesSet = new HashSet<String>();
		
		classesSet.add("ENGL 101");
		classesSet.add("ENGL 102");
		classesSet.add("ENGL 103");
		classesSet.add("ENGL 104");
		classesSet.add("ENGL 103");
		
		System.out.println(classesSet);
		
	}
}


