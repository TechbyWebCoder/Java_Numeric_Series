// Numberic Series 7

// Fibonacci Series
// 0 1 1 2 3 5 8 13 21 34

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        //logic
        int a = 0, b=1;
        System.out.print(a+" "+b+" ");
        for(int i =2; i<n;i++){
            int c = a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }
        sc.close();
    }
}
