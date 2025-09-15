// Numberic Series 11

// Pell Numbers Series
// 0 1 2 5 12 29 70 169 408 985

import java.util.Scanner;

public class PellNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        //logic
        int a=0, b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2; i<n; i++){
            int c = 2*b+a;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }
        sc.close();
    }
}
