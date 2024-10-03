package TwoDimentionArray;
import java.util.Scanner;
public class question1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("rows (m): ");
	        int m = scanner.nextInt();
	        System.out.print("columns (n): ");
	        int n = scanner.nextInt();
	        System.out.print("+");
	        for (int i = 0; i < n; i++) {
	            System.out.print("-");
	        }
	        System.out.println("+");
	        
	        
	        for (int i = 0; i < m; i++) {
	            System.out.print("|");
	            for (int j = 0; j < n; j++) {
	                System.out.print(" ");
	            }
	            System.out.println("|");
	        }
	        
	        
	        System.out.print("+");
	        for (int i = 0; i < n; i++) {
	            System.out.print("-");
	        }
	        System.out.println("+");
	        
	        scanner.close();
	    }
	}
