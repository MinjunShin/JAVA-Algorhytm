package chap02;

import java.util.Scanner;

public class ArrayEqual {

	static boolean equals(int[]a , int[]b) {
		
		if(a.length != b.length)
			return false;
		
		for(int i = 0; i < a.length ; i++)
			if(a[i] != b[i])
				return false;
		
		return true;
		
	}
	
	static void copy(int[]a, int[]b) {
		
		b = a.clone();
		
	}
	
	static void swap(int[]a, int idx1, int idx2) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}
	
	static void reverse(int[]a) {
		
		for(int i = 0; i<a.length/2 ; i++)
			swap(a, i, a.length-i-1);
		
	}
	
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);

		
		System.out.print("배열 A의 요소 갯수 입력 : ");
		int nA = stdIn.nextInt();
		int[] a = new int[nA];
		
		for(int i = 0; i < a.length ; i++) {
			System.out.print("a[" + i + "] :");
			a[i] = stdIn.nextInt();
		}
		
		/*
		System.out.print("배열 B의 요소 갯수 입력 : " );
		int nB = stdIn.nextInt();
		int[] b = new int[nB];
		
		for(int i = 0; i < b.length ; i++) {
			System.out.print("b[" + i + "] :");
			b[i] = stdIn.nextInt();
		}
		*/
		
		int[]b = new int[nA];
		
		b=a.clone();
		
		reverse(b);
			
		
		for(int i = 0; i < b.length ; i++) {
			System.out.print(b[i] + " ");
		}
		
		
		
		System.out.println("배열 A와 B는" + (equals(a,b) ? "같습니다." : "같지 않습니다."));
		

	}

}
