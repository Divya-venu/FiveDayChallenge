package TwoDimentionArray;
import java.util.Scanner;
public class question2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of rows (m): ");
		int m=scanner.nextInt();
		System.out.print("Enter the number of rows (n): ");
		int n=scanner.nextInt();
		int [][]p=new int[m][n];
		System.out.print("Enter elements of matrix : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				p[i][j]=scanner.nextInt();
			}
		}
		System.out.print("[");
		for(int i=0; i<Math.min(m, n);i++)
		{
			System.out.print(p[i][i]);
			if(i<Math.min(m, n)-1)
			{
				System.out.print(",");
			}
		}
		System.out.println("]");
		scanner.close();
	}

}
