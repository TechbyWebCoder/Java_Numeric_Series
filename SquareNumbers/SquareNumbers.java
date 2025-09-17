// Numberic Series 13

// Square Numbers Series
// 1 4 9 16 25 36 49 64 81 100

import java.util.Scanner;

public class SquareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        //logic
        for(int i=1; i<=n; i++){
            System.out.print(i*i+" ");
        }
        sc.close();
    }
}
