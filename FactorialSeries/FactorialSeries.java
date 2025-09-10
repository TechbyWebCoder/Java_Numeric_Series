// Numberic Series 6

// Factorial Series
// 1 2 6 24 120 720 5040 40320 362880 3628800

import java.util.Scanner;

public class FactorialSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        //logic
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
            System.out.print(fact + " ");
        }
        sc.close();
    }
}
