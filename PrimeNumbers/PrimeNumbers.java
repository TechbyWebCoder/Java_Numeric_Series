// Numberic Series 12

// Prime Numbers Series
// 2 3 5 7 11 13 17 19 23 29

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 
        int count =0 , num= 2;
        while(count<n){
            boolean prime = true;
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    prime = false;
                    break;
                }
            }
                if(prime){
                    System.out.print(num + " ");
                    count++;
                }
                
            num++;
        }
        sc.close();
    }
}
