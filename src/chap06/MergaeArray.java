package chap06;

import java.util.Scanner;

public class MergaeArray {
    
    static void merge (int[]a, int na, int[]b, int nb, int[] c) {
        //정렬을 마친 배열 a, b를 병합하여 배열 c에 저장한다.
        int pa = 0; 
        int pb = 0;
        int pc = 0;

        while (pa < na && pb < nb) // 작은 값을 저장한다.
            c[pc++] = (a[pa]<=b[pb])?a[pa++]:b [pb++];

        while (pa< na)
            c[pc++] =a[pa++];
        
            while (pb < nb)
                c[pc++]= b [pb++];
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] a = {2,4,6,8,11,13};
        int[] b = {1,2,3,4,9,16,21};
        int[] c = new int[13];

        System.out.print("두 배열의 병합 진행");
        merge(a, a.length, b, b.length, c);

        System.out.println("두 배열을 병합하여 c에 저장하였다.");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] : " + a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] : " + b[i]);
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] : " + c[i]);
        }
    }
}
