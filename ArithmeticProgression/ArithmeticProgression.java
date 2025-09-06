// Numberic Series 2

// Arithmetic Progression Series
// 2 4 6 8 10 12 14 16 18 20

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        //logic
        int a=2, d=2;
        for(int i=0; i<n; i++){
            System.out.print(a + " ");
            a +=d;
        }
        sc.close();
    }
}
