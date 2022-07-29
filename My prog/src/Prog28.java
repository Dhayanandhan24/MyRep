import java.util.Scanner;
public class Prog28
{
public static void main(String[] args)
	{
	Scanner addr  = new Scanner(System.in);
	System.out.println("Enter the number of rows: ");
	int rowsno = addr.nextInt();
	System.out.println("Enter the number of columns: ");
	int columnno = addr.nextInt();
	int a[][] = new int[rowsno][columnno];
	int b[][] = new int[rowsno][columnno];
//	---------------------------------------
	for (int i=0;i<rowsno;i++)
	{
		for (int j=0;j<columnno;j++)
		{
			if (i==j)
			{
				a[i][j]=1;
			}
			else
			{
				a[i][j]=0;
			}
		}
	}
	System.out.println("\nMatrix A: ");
		for(int i=0;i<rowsno;i++)
		{
			for(int j=0;j<columnno;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i=0;i<rowsno;i++)
		{
			for (int j=0;j<columnno;j++)
				{
				System.out.print("Enter the value for a[i][j]: ");
				int value = addr.nextInt();
				b[i][j]=value;
				}
		}
		System.out.println("\nMatrix B: ");
				for (int i=0;i<rowsno;i++)
		{
			for (int j=0;j<columnno;j++)
				{
				System.out.print(b[i][j]+" ");
				}
			System.out.println();
		}			
		for (int i=0;i<rowsno;i++)
		{
			for (int j=0;j<columnno;j++)
				{
				if (b[i][j]!=a[i][j])
				{
					System.out.println("\nEntered matrix is not an identity matrix");
					System.exit(0);
				}
				}
		}
		System.out.println("\nEntered matrix is an identity matrix");
	}
}