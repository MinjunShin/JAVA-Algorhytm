package chap05;

import java.util.Scanner;

public class Ex_3_gcdArray {

    static int gcdArray (int[] x) throws ArrayIndexOutOfBoundsException{


            int a1 = x[0];
            int a2;

            for(int i = 0 ; i < x.length-1 ; i++) {
                int comp = a1;                
                
                a2 = x[i+1];

                while(a2 != 0) {
                    int t = a2;
                    a2 = comp % a2;
                    comp = t;            
                } 
                a1 = comp;
            }

        return a1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("배열의 최대 공약수를 구한다."); 
        System.out.print("배열의 크기 : "); int cap = stdIn.nextInt();
        int[] arr = new int[cap];

        for(int i = 0 ; i < cap ; i++) {
            System.out.print("요소 입력 : "); int x = stdIn.nextInt();
            arr[i] = x;
        }    
        
        gcdArray(arr);

        System.out.println("배열의 최대 공약수는 : " + gcdArray(arr));
    }
}