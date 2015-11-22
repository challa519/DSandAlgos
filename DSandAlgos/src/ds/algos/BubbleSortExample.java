package ds.algos;

import java.util.Random;

public class BubbleSortExample {

	public static void main(String[] args) {
		int[]	numbers = new int[10];
	    Random generator = new Random();
	    for (int i = 0; i < numbers.length; i++) {
	      numbers[i] = generator.nextInt(20);
	    }
	    
	    BubbleSortExample bsort=new BubbleSortExample();
	    bsort.bubbleSort(numbers);
	    for (int i = 0; i < numbers.length; i++) {
	    	System.out.println(numbers[i]);
	    }
	    
	    
	}
	public void bubbleSort(int[] arr) {
	      boolean swapped = true;
	      int j = 0;
	      int tmp;
	      while (swapped) {
	            swapped = false;
	            j++;
	            for (int i = 0; i < arr.length - j; i++) {                                       
	                  if (arr[i] > arr[i + 1]) {                          
	                        tmp = arr[i];
	                        arr[i] = arr[i + 1];
	                        arr[i + 1] = tmp;
	                        swapped = true;
	                  }
	            }                
	      
	      }
	}
	
}
