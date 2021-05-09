package chap06;

import java.util.Scanner;

import chap04.IntStack;

public class QuickSort_withoutRecur {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void quickSort2(int[] a, int left, int right) {
        IntStack lstack = new IntStack(a.length);
        IntStack rstack = new IntStack(a.length);

        lstack.push(left);
        rstack.push(right);

        while (lstack.IsEmpty() != true) {
            System.out.println();
            lstack.dump();
            rstack.dump();
            int pl = left = lstack.pop(); // 왼쪽 커서
            int pr = right = rstack.pop(); // 오른쪽 커서
            int x = a[(left + right) / 2]; // 피벗
            lstack.dump();
            rstack.dump();
            do {
                while (a[pl] < x)
                    pl++;
                while (a[pr] > x)
                    pr--;
                if (pl <= pr)
                    swap(a, pl++, pr--);
            } while (pl <= pr);

            if (left < pr) {
                lstack.push(left); //왼쪽 그룹 범위의
                rstack.push(pr); //인덱스를 푸시한다.
            }
            if (pl < right) {
                lstack.push(pl); //오른쪽 그룹 범위의
                rstack.push(right); //인덱스를 푸시한다.
            }
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

        quickSort2(x, 0, nx - 1);

        System.out.println("비재귀 퀵 정렬한 결과 : ");

        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "] : " + x[i]);
    }

}
