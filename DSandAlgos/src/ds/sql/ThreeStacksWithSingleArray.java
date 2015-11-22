package ds.sql;

public class ThreeStacksWithSingleArray {
	
	static int stackSize = 10;
	static int [] buffer = new int [stackSize * 3];
	
	// 3 stack pointers to keep track of the index of the top element
	static int [] stackPointer = {-1, -1, -1};

	public static void main(String[] args) throws Exception  {
		push(2, 4);
		System.out.println("Peek 2: " + peek(2));
		push(0, 3);
		push(0, 7);
		push(0, 5);
		System.out.println("Peek 0: " + peek(0));
		pop(0);
		System.out.println("Peek 0: " + peek(0));
		pop(0);
		System.out.println("Peek 0: " + peek(0));	}
	
	static void push(int stackNum, int value) throws Exception {
		/* Check that we have space for the next element */
		if (stackPointer[stackNum] + 1 >= stackSize) { 
			throw new Exception("Stack is full");
		}
		/* Increment stack pointer and then update top value*/		
		stackPointer[stackNum]++;
		buffer[absTopOfStack(stackNum)] = value;	
	}


	/* returns index of the top of the stack "stackNum", in absolute terms */
	static int absTopOfStack(int stackNum) {
		return stackNum * stackSize + stackPointer[stackNum];
	}	
	
	static boolean isEmpty(int stackNum){
		return stackPointer[stackNum]==-1;
	}
	
	static int peek(int stackNum)  throws Exception{
		if (isEmpty(stackNum)) {
			throw new Exception();
		}		
		return buffer[absTopOfStack(stackNum)];
	}
	
	static int pop(int stackNum){
		int temp=0;
		if (isEmpty(stackNum)) { 
			
		}else{
			temp=buffer[absTopOfStack(stackNum)];
			buffer[absTopOfStack(stackNum)]=0;
			stackPointer[stackNum]--;
			
		}
		return temp;
	}
}
