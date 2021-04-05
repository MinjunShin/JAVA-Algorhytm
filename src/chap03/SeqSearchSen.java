package chap03;

import java.util.Scanner;

public class SeqSearchSen {

	static int seqSearchSen(int[] a, int n, int key) {
	// ��ڼ��� n�� �迭���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻��Ѵ�.
		
		int i = 0;
		a[n] = key; // ���ʸ� �߰�
		
		
		while(true) {
			
			if(a[i] == key)
				break;
			i++;
			
		}
		
		return i == n ? -1 : i;
				
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);		
		System.out.print("��� �� : ");
		
		int num = stdIn.nextInt();
		int[] x = new int [num + 1];
		
		for (int i = 0 ; i < num ; i++) {
			System.out.print("x[" + i + "] : " );
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int key = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num ,key);
		
		if( idx == -1)
			System.out.println("�ش� ��Ұ� �����ϴ�.");
		else
			System.out.println(key + "�� x[" + idx + "] �� �ֽ��ϴ�.");	

	}

}
