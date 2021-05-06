package chap06;

import java.util.Scanner;

public class Ex_8_BinSearch_InsertionSort {
    static void binInsertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int pl = 0; // 검색범위 맨 앞의 인덱스
            int pr = i - 1; // 검색범위 맨 뒤의 인덱스
            int pc; // 〃 중앙의 인덱스
            int pd; // 삽입하는 위치의 인덱스

            do {
                pc = (pl + pr) / 2;
                if (a[pc] == key) // 검색성공
                    break;
                else if (a[pc] < key)
                    pl = pc + 1;
                else
                    pr = pc - 1;
            } while (pl <= pr);
            pd = (pl <= pr) ? pc + 1 : pr + 1;

            for (int j = i; j > pd; j--)
                a[j] = a[j - 1];
            a[pd] = key;
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

        binInsertionSort(x, nx);

        System.out.println("단순 삽입 정렬 결과 : ");

        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "] : " + x[i]);
    }
}
