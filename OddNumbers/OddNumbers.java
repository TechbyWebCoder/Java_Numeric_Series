// Numberic Series 10

// Odd Numbers Series
// 1 3 5 7 9 11 13 15 17 19

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        //logic
        for(int i=1; i<=n*2; i+=2){
            System.out.print(i+ " ");
        }
        sc.close();
    }
}
