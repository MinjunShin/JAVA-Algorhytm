package chap06;

import java.util.Scanner;

public class Ex_6_Detail_SelectionSort {

    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void detail_SelecSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            // 아직 정렬되지 않은 부분의 가장 작은 요소의 인덱스를 기록한다.
            int min = i;

            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min])
                    min = j;

            for (int m = 0; m < n; m++)
                System.out.printf("%3s", (m == i) ? '*' : (m == min) ? '+' : ' ');
            System.out.println();

            for (int k = 0; k < n; k++)
                System.out.printf("%3d", a[k]);
            System.out.println();
            // 아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환한다.
            swap(a, i, min);
        }

        System.out.println();
        for (int k = 0; k < n; k++)
            System.out.printf("%3d", a[k]);
        System.out.println();
    }

    static void showResult(int[] x, int n) {
        System.out.println("선택 정렬 결과 출력 : ");
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요소 값을 입력하세요.");
        int n = stdIn.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("선택 정렬 과정 출력 : ");
        detail_SelecSort(x, n);
        showResult(x, n);
    }
}
