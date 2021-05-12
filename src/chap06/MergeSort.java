package chap06;

import java.util.Scanner;

public class MergeSort {

    static int[] buff;

    static void __mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;
            
            __mergeSort(a, left, center); // 배열의 앞부분을 병합정렬
            __mergeSort(a, center + 1, right); // 배열의 뒷부분을 병합정렬

            for (i = left; i <= center; i++)
                buff[p++] = a[i];

            while (i <= right && j < p)
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];

            while (j < p)
                a[k++] = buff[j++];
        }
    }

    static void mergeSort(int[]a, int n) {
        buff = new int[n]; // 작업용 배열 생성

        __mergeSort(a, 0, n-1); // 배열 전체를 병합정렬

        buff = null; // 작업용 배열 해제
    }
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("배열 요소 갯수를 입력하세요. :");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        System.out.println("배열 요소를 입력하세요.");
        for (int i = 0; i < nx; i++) {
            System.out.print("a[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        mergeSort(x, nx);

        System.out.println("병합 정렬한 결과 : ");

        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "] : " + x[i]);
    }
    
}
