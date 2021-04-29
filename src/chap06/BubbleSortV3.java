package chap06;

import java.util.Scanner;

public class BubbleSortV3 {

    static void swap(int[]a , int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    
    static void BubbleSort3(int[]a, int n) {
        int k = 0;          // a[k]보다 앞쪽은 정렬을 마친 상태
        while(k < n-1) {
            int last = n-1; // 마지막으로 요소를 교환한 위치
            for(int j = n-1; j > k ; j--)
                if(a[j-1] > a[j]) {
                    swap(a, j-1, j);
                    last = j;
                }
            k = last;                
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

        BubbleSort3(x, nx);

        System.out.println("버블 정렬 결과 : ");

        for(int i = 0 ; i < nx ; i++)
            System.out.println("x["+ i +"] : " + x[i]); 
    }
}

