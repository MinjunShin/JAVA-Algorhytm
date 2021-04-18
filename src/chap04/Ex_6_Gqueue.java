package chap04;

public class Ex_6_Gqueue <E> {
    private int max;
	private int num;
	private int front;
	private int rear;
	private E [] que;


	
    public static class EmptyQueueException extends RuntimeException {
        public EmptyQueueException() { };
    }

	public static class OverflowQueueException extends RuntimeException {
        public OverflowQueueException () {};
    }  

    public Ex_6_Gqueue (int capacity) {
        front = rear = num = 0;
        max = capacity;
        try {
            this.que = (E[]) que[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public E enque(E x) throws OverflowQueueException {
        if(num >= max)
		    throw new OverflowQueueException();
        que[rear++] = x;
        num++;
        if(rear == max)
            rear = 0;
        return x;
    }

    public E deque() throws EmptyQueueException {
        if(num == 0)
            throw new EmptyQueueException();
        E x = que[front++];        
        num--;

        if(front == max)
            front = 0;
        return x;
    }

    public E peek() throws EmptyQueueException {
        if(num <= 0)
            throw new EmptyQueueException();
        return que[front];
    }

    public int indexOf(E x) {
        for(int i = 0; i < num ; i++) {
            if(que[(i + front) % max] == x)
                return i + front;
        }
        return -1;
    }

    public int search(E x) {
        for (int i = 0; i < num; i++)
            if (que[(i + front) % max].equals(x))   // 검색 성공
                return i + 1;
        return -1;                            	 // 검색 실패
    }

}
