import java.util.Arrays;
import java.util.Scanner;

public class SortingAndInsertionIntoAnArray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		
		int size = scan.nextInt();
		int arr[] = new int[size];
		int array[] = new int[size+1];
		
		//initialising an array
		
		System.out.println("Enter all the elements into an array: ");
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scan.nextInt();
		}
		
		System.arraycopy(arr, 0, array, 0, arr.length);
		
		Arrays.sort(arr);
		System.arraycopy(arr, 0, array, 0, arr.length);
		printArray("Sorted array", arr);
		
		System.out.println("Enter the position where you want to insert an element: ");
		int pos = scan.nextInt();
		
		System.out.println("Enter an element to insert into an array: ");
		int element = scan.nextInt();
		
		insertElement(pos, element,array);
		
	}
	
	public static void printArray(String message, int array[]){
		System.out.println();
		System.out.println(message+" [Length: "+array.length+" ]");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("***********************************");
		System.out.println();
	}
	
	public static void insertElement(int pos, int element, int []array){
		
		
		int size = array.length;
		for (int i = size-2; i>= pos-1 ; i--) {
			
			array[i+1] =  array[i];
			
		}
		
		array[pos -1] = element;
		
		printArray("Array after inserting an element",array);
	}
}
