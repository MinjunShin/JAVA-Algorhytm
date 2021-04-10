package chap03;

import java.util.Scanner;

class Ex_5_enhanced_BinSearch {

	static int binSearch(int[] a, int n, int key) {
		
		int idxL = 0;
		int idxR = n-1;
		
		do {
			int idxC = (idxL + idxR)/2;
			
			if(a[idxC] == key) {
				for ( ; idxC > idxL; idxC--) // key와 같은 맨 앞의 요소를 찾습니다
					if (a[idxC - 1] < key)
						break;
				return idxC; // 검색성공
			}
			
			else if(key < a[idxC])
				idxR = idxC-1;
			else
				idxL = idxC+1;
					
			
		} while (idxL <= idxR);
		
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
		
		int idx = binSearch(x, num, key);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없다.");
		else
			System.out.println(idx + " 요소에 값이 있다.");
		
	}

}
