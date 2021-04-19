package chap05;

import java.util.Scanner;

class Ex_1_factorial_without_recursive {
    
    static int factorial (int x) {
        int result = x;

        for(int i = x-1; i > 1 ; i--) {
            result *= i;  
        }

    return result;

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int n = stdIn.nextInt();
        
        System.out.println("결과 값은 : " + factorial(n));
    }
}
