package chap04;

public class Ex_3_BothSideStack {
	private int max;
	private int min;
	private int ptrMax;
	private int ptrMin;
	private int[] x;

	public Ex_3_BothSideStack(int capacity) {
		ptrMin = 0;
		max = capacity;
		ptrMax = max;
		try {
			x = new int [max]; // 스택 본체용 배열 생성			
		} catch(OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}
	}

	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
			System.out.println("EmptyIntStackException 에러 발생");
		}
	}

	// 실행 시 예외 : 스택이 가득 찬 경우
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}


	public void push(int comp) throws OverflowIntStackException{
		if(ptrMax == ptrMin)
			throw new OverflowIntStackException();
		else
			x[ptrMin++] = comp;	
			x[ptrMax--] = comp;

	}
	
	public void pop throws EmptyIntStackException {
		if(ptrMax <= 0)
			throw new EmptyIntStackException();
		else
			x[ptrMin--];	
			x[ptrMax++];
	}	
	
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return ptrMin;		
	}
	

}
