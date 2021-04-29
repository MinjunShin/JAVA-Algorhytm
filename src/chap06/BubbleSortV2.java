package chap06;

public class BubbleSortV2 {

    static void swap(int[]a , int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    
    static void BubbleSort2(int[]a, int n) {        
        for(int i = 0; i < n ; i++)  { 
            int exchange = 0;         
            for(int j = n-1; j > 0 ; j--){
                if(a[j] < a[j-1]) {
                    swap(a, j-1, j);
                    exchange++;                    
                }
                if(exchange == 0) break;
            }
        }
    }
}
