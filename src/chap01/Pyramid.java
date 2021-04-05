package chap01;

import java.util.Scanner;

public class Pyramid {
	
	
	static void PrintPyr(int a) {
		
		for(int i=1; i<= a; i++) {
			for(int j = a; j >i ; j--)
				System.out.print(" ");
			for(int k = 1; k <= 2*i-1 ; k++)
				System.out.print(i);		
			System.out.println();
		}	
	}

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
	
	
		PrintPyr(a);
		
	}

}
