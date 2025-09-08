// Numberic Series 4

// Cube Numbers Series
// 1 8 27 64 125 216 343 512 729 1000

import java.util.Scanner;

public class CubeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        //logic
        for (int i=1;i<=n; i++){
            System.out.print(i*i*i + " ");
        }
        sc.close();
    }
}
