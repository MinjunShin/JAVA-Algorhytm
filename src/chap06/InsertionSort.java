package chap06;

import java.util.Scanner;

public class InsertionSort {

    static void insertSort(int[]a, int n) {

        for(int i = 0 ; i < n ; i ++) {
            int j;
            int tmp = a[i];
            for(j = i ; j > 0 && a[j-1] > tmp ; j--)
                a[j] = a[j-1];
            a[j] = tmp;
        }
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

        insertSort(x, nx);

        System.out.println("단순 삽입 정렬 결과 : ");

        for(int i = 0 ; i < nx ; i++)
            System.out.println("x["+ i +"] : " + x[i]); 
    }
    
}
