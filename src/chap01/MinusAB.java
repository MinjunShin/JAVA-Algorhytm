package chap01;

import java.util.Scanner;

public class MinusAB {
		public static void main(String [] args) {
			Scanner stdIn = new Scanner(System.in);

			int a;
			int b;
			
			do {
				System.out.println("���� a,b�� �Է��ϼ���.");				a = stdIn.nextInt();
				b = stdIn.nextInt();

			} while (a > b);
			
			int result = b-a;

			System.out.println(result);

			}
		
	}