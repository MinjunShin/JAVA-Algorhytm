package chap01;

import java.util.Scanner;

public class SquarePrint_1_14 {	

	static void triangleLB(int a) {

		for(int i = 1; i<= a ; i++) {
			for(int j = 1; j <=i ; j++) 
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void triangleRB(int a) {
		
		for(int i = 1; i<= a ; i++) {
			for(int j = a ; j > i ; j--) 
				System.out.print(" ");
			for(int k = 1; k <= i ; k++)
				System.out.print("*");
			System.out.println();
		}				
		
	}
	
	static void triangleLT(int a) {
		
		for(int i = a; i >= 1 ; i--) {
			for(int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		
	}

	
	static void triangleRT(int a) {
		
		for(int i = 1; i <= a ; i++) {
			for(int j = 1 ; j < i ; j++) 
				System.out.print(" ");
			
			for(int k = 1; k <= a - i + 1 ; k++)
				System.out.print("*");
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		System.out.println("����� �Է��Ͽ� �̵�ﰢ���� ����Ѵ�.");
		int a;
		
		do {
			System.out.print("�ܼ� : ");
			Scanner stdIn = new Scanner(System.in);
			a = stdIn.nextInt();
		} while(a <= 0);
		
		triangleLB(a);
		System.out.println();
		triangleRB(a);
		System.out.println();
		triangleLT(a);
		System.out.println();
		
		triangleRT(a);
		
	}
	

}
