package chap01;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		int a;
		
		do {
			System.out.println("2�ڸ��� ���� ������ �Է��ϼ���.");
			a = stdIn.nextInt();
		} while (a < 10 || a > 99);
		
		System.out.println(a);
		
		
	}

}
