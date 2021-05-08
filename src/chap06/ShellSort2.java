package chap06;

import java.util.Scanner;

public class ShellSort2 {

    static void shellSort2(int[]a, int n) {
        int h;
        for ( h = 1; h < n / 9; h = h * 3 + 1);

        for ( ; h > 0; h /= 3)
            for (int i =h; i< n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
                    a[j + h] = a[j];
                a[j + h] = tmp;
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

        shellSort2(x, nx);

        System.out.println("오름차 순으로 정렬한 결과 : ");

        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "] : " + x[i]);
    }

}
