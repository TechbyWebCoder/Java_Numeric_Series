// Numberic Series 5

// Even Numbers Series
// 2 4 6 8 10 12 14 16 18 20

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        //logic
        for(int i=2; i<=n; i+=2){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
