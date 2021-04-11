package chap03;
import java.util.Scanner;
import java.util.Arrays;


class BinarySearchTester {
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 요소를 입력");
		
		System.out.print("x[0] :");
		x[0] = stdIn.nextInt();
		
		for(int i = 1; i < num ; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = stdIn.nextInt();
			} while(x[i] < x[i-1]);
		}
		
		System.out.println("검색할 값 : ");
		int ky = stdIn.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0)
			System.out.println("그 값으 요소가 없습니다.");
		else
			System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
				
	}

}
