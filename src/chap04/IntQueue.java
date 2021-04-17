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
	    que = new int[max]; // ť ��ü�� �迭�� ����
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
	    int x = que[front++];
	    num--;
	    
	    if(front == max)
	      front = 0;
	      
	    return x;
	    
	  }
	  
	  //ť���� ������ ��ũ���� ��ȯ
	  public int peek() throws EmptyQueueException {
	    if (num <= 0)
	      throw new EmptyQueueException();
	    return que[front];  
	  }
	  
	  //ť���� x�� �˻��Ͽ� �ε���(ã�� ���ϸ� -1)�� ��ȯ.
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
	}
