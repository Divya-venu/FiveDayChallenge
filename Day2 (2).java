package com.FDC;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		int length=scan.nextInt();
		System.out.println("Enter the breadth: ");
		
		int  breadth=scan.nextInt();
		scan.close();
		if (length == breadth)
            System.out.println("Square");
        else
            System.out.println("Rectangle");
	}

}
