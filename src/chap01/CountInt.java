package chap01;

import java.util.Scanner;

public class CountInt {
		public static void main(String [] args) {
			Scanner stdIn = new Scanner(System.in);
			
			int a = stdIn.nextInt();
			int count = 0;
			
			while(a != 0 ) {
				a = a/10;
				count++;
			}

			System.out.println(count);
				
			}
	}
