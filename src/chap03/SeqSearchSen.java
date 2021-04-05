package chap03;

import java.util.Scanner;

public class SeqSearchSen {

	static int seqSearchSen(int[] a, int n, int key) {
	// 요솟수가 n인 배열에서 key와 같은 요소를 보초법으로 선형 검색한다.
		
		int i = 0;
		a[n] = key; // 보초를 추가
		
		
		while(true) {
			
			if(a[i] == key)
				break;
			i++;
			
		}
		
		return i == n ? -1 : i;
				
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);		
		System.out.print("요솟 수 : ");
		
		int num = stdIn.nextInt();
		int[] x = new int [num + 1];
		
		for (int i = 0 ; i < num ; i++) {
			System.out.print("x[" + i + "] : " );
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num ,key);
		
		if( idx == -1)
			System.out.println("해당 요소가 없습니다.");
		else
			System.out.println(key + "는 x[" + idx + "] 에 있습니다.");	

	}

}
