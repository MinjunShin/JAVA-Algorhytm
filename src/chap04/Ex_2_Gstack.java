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
	
	// 실행할 때 예외：스택이 비어 있음
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {
		}
	}

	// 실행할 때 예외：스택이 가득 참
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
	
	// 스택에서 데이터를 피크(꼭대기의 데이터를 살펴 봄)
	public E peek() throws EmptyGstackException {
		if (ptr <= 0) // 스택이 비어 있음
			throw new EmptyGstackException();
		return stk[ptr - 1];
	}

	// 스택에서 x를 검색하여 index(찾지 못하면 -1)를 반환
	public int indexOf(E x) {
		for (int i = ptr - 1; i >= 0; i--) // 꼭대기쪽부터 선형 검색
			if (stk[i].equals(x))
				return i; // 검색성공
		return -1; // 검색실패
	}
		
	
}
