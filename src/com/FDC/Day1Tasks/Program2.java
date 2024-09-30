package com.FDC.Day1Tasks;
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        int N = scanner.nextInt();
        scanner.close();

        int Program2 = 0;
        for (int i = 1; i <= N; i++) {
        	Program2 += Integer.toString(i).length();
        }

        System.out.println("Output: " + N + " is: " + Program2);
    }

    }

	


