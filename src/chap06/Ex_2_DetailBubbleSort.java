package chap06;

import java.util.Scanner;

public class Ex_2_DetailBubbleSort {
	    static void swap(int[]a , int idx1, int idx2) {
	        int t = a[idx1];
	        a[idx1] = a[idx2];
	        a[idx2] = t;
	    }

	    static void bubbleSort(int[]a, int n) {
	        // 패스를 구현
	        for(int i = n ; i > 0 ; i--)
	            for(int j = 0 ; j < i-1 ; j++)
	                if(a[j] > a[j+1])
	                    swap(a, j+1, j);
	    }


	    public static void main(String[] args) {
	        Scanner stdIn = new Scanner(System.in);
	        System.out.print("배열 요소 갯수를 입력하세요. :");
	        int nx = stdIn.nextInt();
	        int[] x = new int [nx];

	        System.out.println("배열 요소를 입력하세요.");
	        for(int i = 0; i < nx ; i++) {
	            System.out.print("a[" + i + "] : ");
	            x[i] = stdIn.nextInt();
	        }

	        bubbleSort(x, nx);

	        System.out.println("버블 정렬 결과 : ");

	        for(int i = 0 ; i < nx ; i++)
	            System.out.println("x["+ i +"] : " + x[i]); 
	    }
	}
