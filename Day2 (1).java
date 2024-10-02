package com.FDC;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		        System.out.println("Enter the year:");
		        
		        int year = scan.nextInt();
		        scan.close();
		        boolean LeapYear = false;
		        if (year % 4 == 0) 
		        {
		            if (year % 100 == 0) 
		            {
		                if (year % 400 == 0) 
		                {
		                    LeapYear = true;
		                } 
		                else 
		                {
		                    LeapYear = false;
		                }
		            }
		            else 
		            {
		                LeapYear = true;
		            }
		        } 
		        else 
		        {
		            LeapYear = false;
		        }		        
		        if (LeapYear)
		        {
		            System.out.println("True");
		        } else 
		        {
		            System.out.println("False");
		        }		 
		        
		}

	}


