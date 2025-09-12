// Numberic Series 8

// Geometric Progression Series
// 2 4 8 16 32 64 128 256 512 1024

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        //logic
        int a =2, r= 2;
        for(int i=0; i<n;i++){
            System.out.print(a + " ");
            a *=r;
        }
        sc.close();
    }
}
