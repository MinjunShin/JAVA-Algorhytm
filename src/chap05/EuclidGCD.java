package chap05;

import java.util.Scanner;

public class EuclidGCD {
 
    static int gcd(int x, int y){
        
        if(y == 0)
            return x;

        else
            return gcd(y, x % y);
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("두 수의 최대 공약수를 구한다.");

        System.out.print("첫번째 정수 입력 : "); int x = stdIn.nextInt();
        System.out.print("두번째 정수 입력 : "); int y = stdIn.nextInt();

        System.out.println("두 수의 최대 공약수는 : " + gcd(x,y));
    }
}
