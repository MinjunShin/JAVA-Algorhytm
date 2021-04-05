package chap02;

import java.util.Scanner;

public class MaxofArray {

	static int MaxValue(int[] a) {
		
		int max = a[0];
		
		for(int i=1 ; i<a.length ; i++)
			if(a[i] > max) max = a[i];

		return max;
		}
	
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int n = stdIn.nextInt();
		
		int[] heightArray = new int[n];		
				
		for(int i = 0; i < n ; i++) {
			System.out.print("heightArray[" + i + "] : ");
			heightArray[i] = stdIn.nextInt();
		}
	
		System.out.println("배열 최대값은 : " + MaxValue(heightArray));	
		
	}

}
