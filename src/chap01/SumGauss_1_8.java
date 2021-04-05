package chap01;

import java.util.Scanner;


public class SumGauss_1_8 {

	static int Gauss (int n) {
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); 
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 정수합을 구합니다.");
		System.out.println("정수값 n 입력 : ");
		int a = stdIn.nextInt();
	
		System.out.print(Gauss(a));
		
	}

}
