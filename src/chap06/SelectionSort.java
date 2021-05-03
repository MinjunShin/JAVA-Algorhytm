package chap06;

import java.util.Scanner;

public class SelectionSort {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int k = 0; k < n; k++)
                System.out.printf("%3d", a[k]);
            System.out.println();

            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min])
                    min = j;
            swap(a, i, min);
        }
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

        selectionSort(x, nx);

        System.out.println("선택 정렬 결과 : ");

        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "] : " + x[i]);
    }
}
