// Numberic Series 15

// Triangular Numbers Series
// 1 3 6 10 15 21 28 36 45 55

import java.util.Scanner;

public class TriangularNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        //logic
        int sum =0;
        for(int i=1; i<=n; i++){
            sum +=i;
            System.out.print(sum+ " ");
        }
        sc.close();
    }
}
