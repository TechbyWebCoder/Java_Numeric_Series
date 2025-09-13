// Numberic Series 9

// Lucas Numbers Series
// 2 1 3 4 7 11 18 29 47 76

import java.util.Scanner;

public class LucasNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        //logic
        int a=2, b=1;
        System.out.print(a+ " "+b+ " ");
        for(int i=2; i<n;i++){
            int c =a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
        sc.close();
    }
}
