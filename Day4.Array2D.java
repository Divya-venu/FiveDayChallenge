package TwoDimentionArray;
import java.util.Scanner;
public class Array2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]a=new int[3][5];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("enter age "+i+" student "+j);
				a[i][j]=sc.nextInt();
			}
		}
				
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<5;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
		sc.close();
}
	}
}
	
