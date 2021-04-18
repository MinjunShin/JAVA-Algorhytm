package chap04;

public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyQueueException extends RuntimeException {
	public EmptyQueueException () {};
	}
	
	public class OverflowQueueException extends RuntimeException {
	public OverflowQueueException () {};
	}
	
	public IntQueue(int capacity) {
	num = front = rear = 0;
	max = capacity;
	try {
	que = new int[max]; 
	} catch (OutOfMemoryError e) {
		max = 0;
	}
	}
	
	public int enque (int x) throws OverflowQueueException {
	if(num >= max)
		throw new OverflowQueueException();
	que[rear++] = x;
	num++;
	if(rear == max)
		rear = 0;
	return x;
	
	}
	
	public int deque() throws EmptyQueueException {
	if(num == 0)
		throw new EmptyQueueException ();

	int x = que[front];
	que[front] = 0;
	front++;
	num--;
	
	if(front == max)
		front = 0;
		
	return x;
	
	}
		
	public int peek() throws EmptyQueueException {
	if (num <= 0)
		throw new EmptyQueueException();
	return que[front];  
	}
		
	public int indexOf (int x) {
	for(int i = 0; i < num ; i++){
		int idx = (i + front) % max;
		if (que[idx] == x)
		return idx;
	}
	
	return -1;
	}
	
	public void clear() {
	num = front = rear = 0;
	}
	
	public int capa() {
	return max;
	}
	
	public int size() {
	return num;
	}
	
	public boolean isEmpty() {
	return num <= 0;
	}
	
	public boolean isFull() {
	return num >= max;
	}
	
	public void dump() {
	if(num <= 0)
		System.out.println("Queue is Empty");
	else {
		for (int i = 0 ; i < num ; i++)
		System.out.println(que[(i+front) % max] + " ");
		System.out.println();
	}
	}

	public int search(int x) {
		int index = 0;
		for(int i = 0 ; i < num ; i++) {
			index = i + front;
			if(index > max)
				index -= max;
			if(que[index] == x)
				return i+1;
		}
		return -1;
	}


	public void print() {
		System.out.println("\n--------------------------------------------------------");
		for(int i = 0; i < max; ++i) {
			System.out.printf("%2d", i);
		}
		System.out.println("\n--------------------------------------------------------");
		for(int i = 0; i < max; ++i) {
			System.out.printf("%2d", que[i]);
		}
		System.out.println("\n--------------------------------------------------------");
	}
}