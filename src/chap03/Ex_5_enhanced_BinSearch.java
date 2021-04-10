package chap03;

import java.util.Scanner;

class Ex_5_enhanced_BinSearch {

	static int binSearch(int[] a, int n, int key) {
		
		int idxL = 0;
		int idxR = n-1;
		
		do {
			int idxC = (idxL + idxR)/2;
			
			if(a[idxC] == key) {
				for ( ; idxC > idxL; idxC--) // key�� ���� �� ���� ��Ҹ� ã���ϴ�
					if (a[idxC - 1] < key)
						break;
				return idxC; // �˻�����
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
		
		System.out.print("��ڼ� : ");
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

		System.out.print("�˻��� �� : ");
		int key = stdIn.nextInt();
		
		int idx = binSearch(x, num, key);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� ����.");
		else
			System.out.println(idx + " ��ҿ� ���� �ִ�.");
		
	}

}
