//bubble sort algorithm

import java.util.Random;

public class BubSortEx1 {
	public static void main(String [] args){
	
		Random rando = new Random();
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++){
			numbers[i] = rando.nextInt(20);
		}//end for loop
		
		System.out.println("Before: ");
		printArray(numbers);
		
		//Sorting algorithm here
		boolean swappedSomething = true;
		
		while (swappedSomething){
			
		swappedSomething = false; 
		for (int i = 0; i < numbers.length - 1; i++){
			if (numbers[i] > numbers[i + 1]){
				swappedSomething = true; 
				int temp = numbers[i];
				numbers[i] = numbers[i + 1];
				numbers[i + 1] = temp; 
			}//end if loop
		
		}//end for loop
		
		}//end swappedSomething
		
		System.out.println("\nAfter: ");
		printArray(numbers);
		
	} // close bracket for main 

		//call function, separate from main class
		private static void printArray(int [] numbers){
			for (int i = 0; i < numbers.length; i++){
				System.out.println(numbers[i]);
			}
		}
		
}//end class