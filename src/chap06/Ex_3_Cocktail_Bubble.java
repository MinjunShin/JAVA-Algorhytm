package chap06;

import java.util.Scanner;

public class Ex_3_Cocktail_Bubble {

        static void swap(int[]a , int idx1, int idx2) {
            int t = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = t;
        }
        
        static void Cocktail_BubbleSort(int[]a, int n) {
            int left = 0;
            int right = n - 1;
            int last = right;
    
            while (left < right) {
                for (int j = right; j > left; j--) {
                    if (a[j - 1] > a[j]) {
                        swap(a, j - 1, j);
                        last = j;
                    }
                }
                left = last;
    
                for (int j = left; j < right; j++) {
                    if (a[j] > a[j + 1]) {
                        swap(a, j, j + 1);
                        last = j;
                    }
                }
                right = last;
            }
        }
    
        public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in);
            System.out.print("배열 요소 갯수를 입력하세요. :");
            int nx = stdIn.nextInt();
            int[] x = new int [nx];
    
            System.out.println("배열 요소를 입력하세요.");
            for(int i = 0; i < nx ; i++) {
                System.out.print("a[" + i + "] : ");
                x[i] = stdIn.nextInt();
            }
    
            Cocktail_BubbleSort(x, nx);
    
            System.out.println("버블 정렬 결과 : ");
    
            for(int i = 0 ; i < nx ; i++)
                System.out.println("x["+ i +"] : " + x[i]); 
        }
    }
    
