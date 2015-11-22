package ds.algos;

import java.util.Random;

public class QuickSortExample1 {

	public static void main(String[] args) {
		
		
		int[]	numbers = new int[10];
	    Random generator = new Random();
	    for (int i = 0; i < numbers.length; i++) {
	      numbers[i] = generator.nextInt(20);
	    }
	   qSort(numbers,0,numbers.length-1);
	    printArray(numbers);
	}
	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
	    	System.out.println(numbers[i]);
	    }
	}
	public static void qSort(int a[], int low, int high){
		if(low<=high){//condition
			int index=partition(a,low,high);//partition
			if(low<index-1) qSort(a,low,index-1);//first half
			if(high>index) qSort(a,index,high);// second half
			
		}
	}
	
	public static int partition(int a[], int low, int high){
		int pivot=a[(low+high)/2];
		while(low<=high){
			while(a[low]<pivot) low++;
			while(a[high]>pivot)high--;
			if(low<=high){
				exchange(a,low,high);
				low++;
				high--;
			}
			
		}
		
		return low;
	}

	  private static void exchange(int a[],int i, int j) {
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	  }
}
