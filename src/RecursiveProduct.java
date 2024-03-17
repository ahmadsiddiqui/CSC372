import java.util.Scanner;

public class RecursiveProduct {
	
	
	public static int productOfArray(int input[]) {
			return productOfArray(input,0);
	}
	
	private static int productOfArray(int numbers[], int index) {
	
		if(index == numbers.length -1) {
			return numbers[index];
		}
		else {
			return numbers[index] * productOfArray(numbers, index+1);
			
		}
	}
	
	public static void main(String args[]) {
		
		System.out.println("enter five numbers: ");
		
		int numbers[] = new int[5];
		
		Scanner s = new Scanner(System.in);
		int i = 0;
		while(i<5) {
			numbers[i]= s.nextInt();
			i++;
		}
		s.close();
		
		
		System.out.println("product of numbers: " + productOfArray(numbers));
	}

}
