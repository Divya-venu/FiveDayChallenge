package com.FDC;
import java.util.Scanner;
public class Program1
{
	
	public static void main(String[] args)
	{
		
			Scanner scan =new Scanner(System.in);
			System.out.println("First number: ");
			int num1=scan.nextInt();
			System.out.println("Second number: ");
			int num2=scan.nextInt();
			System.out.println("Third number: ");
			scan.close();
			int num3=scan.nextInt();
			
			int greater;
			if(num1>=num2 && num1>=num3)
			{
				greater=num1;
			}
			else if(num2>=num1 && num2>=num3)
			{
				greater=num2;
			}
			else
			{
				greater=num3;
			}
			System.out.println("The Greater number is: "+greater);
	}
}
			
		

	


	

	
