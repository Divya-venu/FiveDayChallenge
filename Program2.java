package com.FDC;
import java.util.Scanner;
public class Program2 {
			
	
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	       
	        System.out.print(" first integer: ");
	        int firstInt = scan.nextInt();
	        System.out.print(" second integer: ");
	        
	        int secondInt = scan.nextInt();
	        scan.close();
	       
	        char firstChar = getUnicodeCharacter(firstInt);
	        char secondChar = getUnicodeCharacter(secondInt);

	        
	        System.out.println("The corresponding characters are: " + firstChar + " " + secondChar);
	    }

	   
	    public static char getUnicodeCharacter(int codePoint) {
	        return (char) codePoint;
	    }
	


			}

		
	


