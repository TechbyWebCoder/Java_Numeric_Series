// Numberic Series 14

// Sum Of Digits Series
// 1 2 3 4 5 6 7 8 9 1

import java.util.Scanner;

public class SumOfDigitsSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        //logic
        for(int i=1; i<=n; i++){
            System.out.print((i%9==0?9:i%9)+ " ");
        }
        sc.close();
    }
}
