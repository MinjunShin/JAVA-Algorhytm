package chap03;

import java.util.Scanner;

public class Ex_4_ShowBinaryDetail {

	static int binSearch_and_ShowDetail (int[] a, int n, int key) {
		
		int idxL = 0;
		int idxR = n-1;
		
		System.out.printf("%4s", "|");
		for(int i = 0; i < n ; i++)
			System.out.printf("%4d", i);
		System.out.println();
		for(int i = 0; i < n+1 ; i++)
			System.out.print("----");
		System.out.println();
				
		
		do {
			int idxC = (idxL + idxR) / 2;
			System.out.print("   |");
			if (idxL != idxC)
				System.out.printf(String.format("%%%ds<-%%%ds+", (idxL * 4) + 1, (idxC - idxL) * 4), "", "");
			else
				System.out.printf(String.format("%%%ds<-+", idxC * 4 + 1), "");
			if (idxC != idxR)
				System.out.printf(String.format("%%%ds->\n", (idxR - idxC) * 4 - 2), "");
			else
				System.out.println("->");
				
			System.out.printf("%3d%s", idxC, "|");
			for(int i = 0; i < n ; i++)
				System.out.printf("%4d", a[i]);
			System.out.println();
				
			if(a[idxC] == key)
				return idxC;
			else if(a[idxC] > key)
				idxR = idxC;
			else
				idxL = idxC;			
						
		} while(idxL <= idxR);
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int [] x = new int[num];
		
		System.out.print("x[0] : ");
		x[0] = stdIn.nextInt();
		
		
		for(int i = 1; i < num ; i++) {
			
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = stdIn.nextInt();
			} while( x[i] < x[i-1]);
		}

		System.out.print("검색할 값 : ");
		int key = stdIn.nextInt();
		
		int idx = binSearch_and_ShowDetail(x, num, key);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없다.");
		else
			System.out.println(idx + " 요소에 값이 있다.");


	}

}
