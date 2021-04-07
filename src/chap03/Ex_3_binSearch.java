package chap03;

import java.util.Scanner;

class Ex_3_binSearch {

	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0; // key와 같은 요솟수
		for (int i = 0; i < n; i++)
			if (a[i] == key)
				idx[count++] = i;
		return count;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요솟수 num인 배열
		int[] y = new int[num]; // 요솟수 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}
		System.out.print("찾는 값："); // 키 값을 입력 받음
		int ky = stdIn.nextInt();

		int count = searchIdx(x, num, ky, y);

		if (count == 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			for (int i = 0; i < count; i++)
				System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");
		
		for(int i = 0; i < y.length ; i++) 
			System.out.print(y[i] + " , ");
	}
}
	