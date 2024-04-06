
import java.util.Comparator;
import java.util.LinkedList;

//A sort-in-place method using selection sort to 
//sort a linked list of students by any comparator
public class SelectionSort  {
	public static  void sort(LinkedList<Student> ll , Comparator<Student> c) {
		
		for(int i = 0; i<(ll.size()-1); i++) {
			int lowest = i;
			for (int j = i + 1; j< ll.size(); j++){
				if (c.compare(ll.get(j), ll.get(lowest))< 0) {
					lowest = j;
				}
			}
			Student temp = ll.get(lowest); 
			ll.set(lowest, ll.get(i));
			ll.set(i, temp);
		}
	}
}