package chap01;

import java.util.Scanner;


class SumWhile {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ �������� ���մϴ�.");
		System.out.println("������ n �Է� : ");
		int a = stdIn.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= a; i++) {
			if (i < a) {
				System.out.print(i + " + ");
				sum += i;			
			}
			else {
				System.out.print(i);
				sum += i;
			}

		}		
		
		System.out.println(" = " + sum);
	}
	
}
			