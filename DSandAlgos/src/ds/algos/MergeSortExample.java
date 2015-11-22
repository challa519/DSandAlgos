package ds.algos;

import java.util.Random;

public class MergeSortExample {

	public static void main(String[] args) {
		int[]	numbers = new int[8];
	    generateArray(numbers);
	    printArray(numbers);;
	    MergeSortExample m=new MergeSortExample();
	    m.mergeSort(numbers, 0, numbers.length-1);
	    System.out.println();
	    System.out.println("after sort");
	    printArray(numbers);;
	}
	
	public void mergeSort(int[] numbers, int low, int high){
		if(low<high){
			int mid=(low+high)/2;
			mergeSort(numbers,low,mid);
			mergeSort(numbers,mid+1,high);
			merge(numbers,low,mid,high);
			System.out.println(" ");
			printArray(numbers);
		}
		
	}
	public void merge(int[] a, int low, int mid,int high){
          int[] temp=new int[high-low+1];
          int left=low;
          int right=mid+1;
          int k=0;
          while(left<=mid && right<=high){
        	  if(a[left]<=a[right]){
        		  temp[k]=a[left];
        		  left++;
        	  }else{
        		  temp[k]=a[right];
        		  right++;
        	  }
        	  k++;
          }
          
          while(left<=mid){
    		  temp[k]=a[left];
    		  left++;
    		  k++;
          }
          while(right<=high){
    		  temp[k]=a[right];
    		  right++;
    		  k++;
          }
        System.out.println("temp");  
        printArray(temp);
          
      	for (int i = 0; i < temp.length; i++) {
      		a[low+i]=temp[i];
	    }
	}
	
	private static void generateArray(int[] numbers) {
		Random generator = new Random();
	    for (int i = 0; i < numbers.length; i++) {
	      numbers[i] = generator.nextInt(20);
	    }
	}
	
	
	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
	    	System.out.print(numbers[i]+" ");
	    }
	}

}


