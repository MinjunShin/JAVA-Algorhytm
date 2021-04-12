package chap04;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ex_2_Gstack <E> {

	private int max;
	private int ptr;
	private E[] stk;
	
	
	public Ex_2_Gstack(int capacity) {
		
		this.max = max;
		this.ptr = ptr;
		try{
			this.stk = (E[]) stk[capacity];
		} catch(OutOfMemoryError e) {
			max = 0;
		}		

	}
	
	// ������ �� ���ܣ������� ��� ����
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {
		}
	}

	// ������ �� ���ܣ������� ���� ��
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {
		}
	}
	
	public E push(E comp) throws OverflowGstackException{		
		if(ptr >= max)
			throw new OverflowGstackException();					
		return stk[ptr++] = comp;		
	}
	 
	public E pop(E comp) throws EmptyGstackException {
		if(ptr <= 0)
			throw new EmptyGstackException();
		return stk[--ptr] = comp;
	}
	
	// ���ÿ��� �����͸� ��ũ(������� �����͸� ���� ��)
	public E peek() throws EmptyGstackException {
		if (ptr <= 0) // ������ ��� ����
			throw new EmptyGstackException();
		return stk[ptr - 1];
	}

	// ���ÿ��� x�� �˻��Ͽ� index(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(E x) {
		for (int i = ptr - 1; i >= 0; i--) // ������ʺ��� ���� �˻�
			if (stk[i].equals(x))
				return i; // �˻�����
		return -1; // �˻�����
	}
		
	
}
