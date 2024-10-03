package TwoDimentionArray;
import java.util.Scanner;
public class Question3 {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);	        	      
	        System.out.print("Enter an integer n: ");
	        int n = scanner.nextInt();	        	       
	        long factorial = calculateFactorial(n);
	        System.out.println("Factorial of " + n + " is " + factorial);	        	       
	        if (isPrime(factorial)) {
	            System.out.println(factorial + " is a prime number");
	        } else {
	            System.out.println(factorial + " is not a prime number");
	        }
	        
	        scanner.close();
	    }	    	    
	    public static long calculateFactorial(int n) {
	        long result = 1;
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }	    
	    public static boolean isPrime(long number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (long i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}



