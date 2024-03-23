import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort  {
	public static  void sort(ArrayList<Student> array, Comparator<Student> c) {
		
		for(int i = 0; i<(array.size()-1); i++) {
			int lowest = i;
			for (int j = i + 1; j< array.size(); j++){
				if (c.compare(array.get(j), array.get(lowest))< 0) {
					lowest = j;
				}
			}
			Student temp = array.get(lowest); 
			array.set(lowest, array.get(i));
			array.set(i, temp);
		}
	}
}