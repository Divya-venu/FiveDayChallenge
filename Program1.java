package com.FDC;
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++) {
          
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
           
            for (int k = 1; k <= i; k++) {
                if (k == 1 || k == i || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


				
		
		

	

	

