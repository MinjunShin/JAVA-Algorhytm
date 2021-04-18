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
            this.que = (E[]) que[capacity];
        } catch (OutOfMemoryError e) {
        	max = 0;
        }

    }




}
