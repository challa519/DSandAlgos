package ds.sql;

public class Queue {
	
	int capacity=10;
	int top, bottom=0;
	private int a[]=new int[capacity];
	
	/*FIFO - First In First Out*/
	public void push(int val){
		if(top==capacity && bottom==0) return;
		//if(top==capacity && bottom!=0) top
		a[top]=val;
		top=top+1;

	}
	
	public int pop(){
		int temp=a[bottom];
		a[bottom]=0;
		bottom=bottom+1;
		return temp;
	}
	
	public boolean isEmpty(){
		return (top==bottom);
	}

	public static void main(String[] args) {
       System.out.println(2%12);
	}

}
