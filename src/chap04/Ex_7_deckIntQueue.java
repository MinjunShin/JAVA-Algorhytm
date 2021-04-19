package chap04;

public class Ex_7_deckIntQueue {
	private int max; // ��(deck)�� �뷮
	private int num; // ������ ������ ��
	private int front; // �� �� Ŀ��
	private int rear; // �� �� Ŀ��
	private int[] que; // ��(deck)�� ��ü

	// ������ �� ���ܣ�ť�� ��� ����
	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}
	}

	// ������ �� ���ܣ�ť�� ���� ��
	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() { }
	}

	// ������
	public Ex_7_deckIntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max]; // ��(deck)��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // ������ �� �����ϴ�
			max = 0;
		}
	}

	// ��(deck)�� �����͸� �Ӹ��ʺ��� ��ť
	public int enqueFront(int x) throws OverflowIntDequeException {
		if (num >= max)
			throw new OverflowIntDequeException(); // ��(deck)�� ���� ��
		num++;
		if (--front < 0)
			front = max - 1;
		que[front] = x;
		return x;
	}

	// ��(deck)�� �����͸� �����ʺ��� ��ť
	public int enqueRear(int x) throws OverflowIntDequeException {
		if (num >= max)
			throw new OverflowIntDequeException(); // ��(deck)�� ���� ��
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	// ��(deck)�� �Ӹ����� �����͸� ��ť
	public int dequeFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ��(deck)�� ��� ����
		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	// ��(deck)�� �������� �����͸� ��ť
	public int dequeRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ��(deck)�� ��� ����
		num--;
		if (--rear < 0)
			rear = max - 1;
		return que[rear];
		
	}
	
	// ��(deck)�� �������� �����͸� ��ũ(���������͸� ���캽)
	public int peekRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ��(deck)�� ��� ����
		return que[rear == 0 ? max - 1 : rear - 1];
		
	}

}
