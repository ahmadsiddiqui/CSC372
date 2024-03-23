import java.util.Arrays;

public class SearchSortExample {
	
	public static void main(String args[]) {
		int[] arr = {3,1,4,2};
		
		System.out.println(Arrays.toString(arr));
		
		//sort algorithm
		
		for(int i = 0; i<arr.length-1; i++) {
			int lowest = i;
			for (int j = i + 1; j< arr.length; j++){
				if (arr[j]< arr[lowest]) {
					lowest = j;
				}
			}
			int temp = arr[lowest]; arr[lowest] = arr[i]; arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	
		
		//search algorithm
		int target = 3;
		for ( int i= 0; i< (arr.length-1); i++) {
			if(arr[i] == target){
				System .out.println("Target found at index: " + i);
			}
			
		}
		
	}
	
	

}


