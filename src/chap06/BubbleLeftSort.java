package chap06;

import java.util.Scanner;

public class BubbleLeftSort {
	
	static int countComp = 0;
	static int countChange = 0;
    static void swap(int[]a , int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
        countChange++;
    }

    static void bubbleSort(int[]a, int n) {
        // �н��� ����  	
        for(int i = 0 ; i < n-1 ; i++) {
        	System.out.println("�н�" + (i+1) + " : ");
        	
            for(int j = n-1 ; j > i ; j--) {
            	
                if(a[j] < a[j-1]) {
	            	for(int k = 0 ; k < j ; k++)
	            		System.out.printf("%2d", a[k]);
	            	System.out.print("+");
	            	for(int k = j; k <n ; k++)
	            		System.out.printf("%2d", a[k]);	            	
	            	System.out.println();	            		
	            	countChange++;
                    swap(a, j-1, j);
                    continue;
                }
                
                else
	            	for(int k = 0 ; k < j ; k++)
	            		System.out.printf("%2d", a[k]);
	            	System.out.print("-");	            	
	            	for(int k = j; k <n ; k++)
	            		System.out.printf("%2d", a[k]);
	            	System.out.println();
            }
        }
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
            System.out.print(x[i] + " "); 
    }
}