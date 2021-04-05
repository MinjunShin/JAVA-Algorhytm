package chap01;

import java.util.Scanner;

public class sumOfex_1_9 {
	
	static int sumof(int a, int b) {
		int sum = 0;
		int max;
		int min;
		
		if(a < b) {
			max = b;
			min = a;
		}
			
		else {
			max = a;
			min = b;			
		}
		
		for(int i = min; i <= max; i++) {
			sum += min;
			min++;
		}
		
		return sum;

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 정수합을 구합니다.");
		System.out.println("정수값 n 입력 : ");
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
			
		System.out.println(sumof(a,b));
	}

}
