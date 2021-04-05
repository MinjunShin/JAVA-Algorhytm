package chap01;

import java.util.Scanner;

class Median {

	static int med3(int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b; //a-b-c
			else if( c>= a)
				return a; // c-a-b
			else 
				return c; // a-c-b
		else if(a > c)
			return a; // b-a-c
		else if(b > c)
			return c; // b-c-a
		else
			return b; // c-b-a
	}
		
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a를 입력 : ");
		int a = stdIn.nextInt();
		System.out.println("b를 입력 : ");
		int b = stdIn.nextInt();
		System.out.println("c를 입력 : ");
		int c = stdIn.nextInt();
		
		System.out.println(med3(a,b,c));
	}

}
