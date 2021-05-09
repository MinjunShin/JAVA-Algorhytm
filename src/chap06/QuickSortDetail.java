package chap06;

import java.util.Scanner;

public class QuickSortDetail {

    static int count = 0;

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
        count++;
    }

    static void quickSort(int[] a, int left, int right) {
        int pl = left;
        int pr = right;
        int x = a[(pl + pr) / 2];

        System.out.printf("a[%d] ~ a[%d] : {", left, right);
        for (int i = left; i < right; i++)
            System.out.printf("%d, " , a[i]);
        System.out.printf("%d}\n" , a[right]);

            do {
                while (a[pl] < x)
                    pl++;
                while (a[pr] > x)
                    pr--;
                if (pl <= pr)
                    swap(a, pl++, pr--);
            } while (pl <= pr);

        if (left < pr)
            quickSort(a, left, pr);
        if (pl < right)
            quickSort(a, pl, right);
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

        quickSort(x, 0, nx - 1);

        System.out.println("퀵 정렬한 결과 : ");

        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "] : " + x[i]);

        System.out.println(count + "번 실행하였다.");
    }
}
