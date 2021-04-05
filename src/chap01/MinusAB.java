package chap01;

import java.util.Scanner;

public class MinusAB {
		public static void main(String [] args) {
			Scanner stdIn = new Scanner(System.in);

			int a;
			int b;
			
			do {
				System.out.println("정수 a,b를 입력하세요.");				a = stdIn.nextInt();
				b = stdIn.nextInt();

			} while (a > b);
			
			int result = b-a;

			System.out.println(result);

			}
		
	}