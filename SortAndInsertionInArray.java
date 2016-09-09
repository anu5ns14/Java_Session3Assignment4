import java.util.Arrays;
import java.util.Scanner;

public class SortAndInsertionInArray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size = scan.nextInt();
		
		int arr[] = new int[size + 1];
		
		//Initialising an array
		
		System.out.println("Enter all the elements into an array:  ");
		for (int i = 0; i < size; i++) {
			
			arr[i]= scan.nextInt();
		}
		
		Arrays.sort(arr); // Sorting an array
		
		printArray("Sorted Array",arr); // printing a sorted array
		
		System.out.println("Enter the location where you want to enter new element: ");
		int pos = scan.nextInt();
		
		System.out.println("Enter the new element to be enterred :");
		int element = scan.nextInt();
		
		insertElement(pos, element, arr); // inserting new element at specified location in an array
		
	}
	
	public static void printArray(String message, int array[]){
		
		System.out.println("***********************************");
		System.out.println(message+" [Length: "+array.length+" ]");
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
		
			if (array[i] == 0){
				continue;
			}
			System.out.print(array[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		System.out.println("***********************************");
	}
	
	public static void insertElement(int pos, int element, int array[]){
		
	
		
		int size = array.length -1;

		for (int i = 0; i < pos ; i++) {
			array[i] = array[i+1];
		}
		
		array[pos -1] = element;
		
		printArray("Array after inserting an element",array);
	}
	
}