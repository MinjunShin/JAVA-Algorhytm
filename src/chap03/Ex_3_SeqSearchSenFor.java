package chap03;

import java.util.Scanner;

public class Ex_3_SeqSearchSenFor {
	
	static int seqSearchSen(int[] a, int n, int key) {
	// 요솟수가 n인 배열에서 key와 같은 요소를 보초법으로 선형 검색한다.

		int i = 0;
		
		a[n] = key; // 보초를 추가
				
		for(int j = 1; j<=n ; j++) {
			i++;
			
			if(a[i] == key)
				break;
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
	
		System.out.printf("%4s", "|");
		for(int j = 0; j<num ; j++) {
			System.out.printf("%3d", j);			
		}
		System.out.println();
		for(int j = 0; j<num+1 ; j++) {
			System.out.print("---");
		}
		System.out.println();
		
		
		for(int l = 0; l <num ; l++) {
			
			if(x[idx] == l)
				break;

			System.out.printf("%4s", "|");
			
			for(int h = 0; h<= l ; h++) {
				System.out.printf("%2s", " ");
				if(h == l)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
			System.out.printf("%2d", l);
			System.out.printf("%2s", "|");
						
			for(int k = 0; k<num ; k++) {
				System.out.printf("%3d", x[k]);

			}
			System.out.println();

		}		
		
		
		if(idx == -1)
			System.out.println("해당 요소가 없습니다.");
		else
			System.out.println(key + "는 x[" + idx + "] 에 있습니다.");	

	}

}
