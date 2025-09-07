// Numberic Series 3

// Catalan Numbers Series
// 1 1 2 5 14 42 132 429 1430 4862

import java.util.Scanner;

public class CatalanNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        //logic
        long[]cat = new long[n+1];
        cat[0] = 1;
        for(int i=1; i<=n;i++){
            cat[i] = 0;
            for(int j=0; j<i; j++)
            cat[i] += cat[j]*cat[i-1-j];
        }
        for(int i=0; i<n;i++)
        System.out.print(cat[i]+" ");
        sc.close();
    }
}
