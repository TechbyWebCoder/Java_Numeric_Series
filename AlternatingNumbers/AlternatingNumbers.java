// Numberic Series 1

// Alternating Numbers Series
// 1 -2 3 -4 5 -6 7 -8 9 -10

import java.util.Scanner;

public class AlternatingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        //logic 
        for (int i =1; i<=n; i++)
        System.out.print((i%2==0?-i:i)+ " ");
        
        sc.close();
    }
}
