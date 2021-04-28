package chap06;

import java.util.Scanner;

public class Ex_2_DetailBubbleSort {
	    static void swap(int[]a , int idx1, int idx2) {
	        int t = a[idx1];
	        a[idx1] = a[idx2];
	        a[idx2] = t;
	    }

	    static void bubbleSort(int[]a, int n) {
	        // �н��� ����
	        for(int i = n ; i > 0 ; i--)
	            for(int j = 0 ; j < i-1 ; j++)
	                if(a[j] > a[j+1])
	                    swap(a, j+1, j);
	    }


	    public static void main(String[] args) {
	        Scanner stdIn = new Scanner(System.in);
	        System.out.print("�迭 ��� ������ �Է��ϼ���. :");
	        int nx = stdIn.nextInt();
	        int[] x = new int [nx];

	        System.out.println("�迭 ��Ҹ� �Է��ϼ���.");
	        for(int i = 0; i < nx ; i++) {
	            System.out.print("a[" + i + "] : ");
	            x[i] = stdIn.nextInt();
	        }

	        bubbleSort(x, nx);

	        System.out.println("���� ���� ��� : ");

	        for(int i = 0 ; i < nx ; i++)
	            System.out.println("x["+ i +"] : " + x[i]); 
	    }
	}
