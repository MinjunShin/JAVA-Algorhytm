package chap01;

import java.util.Scanner;


class SumWhile {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 정수합을 구합니다.");
		System.out.println("정수값 n 입력 : ");
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
			