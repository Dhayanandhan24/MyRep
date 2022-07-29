import java.util.Scanner;
	public class Prog30
	{
	public static void main(String[] args)
		{
		Scanner addr  = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rowsno = addr.nextInt();
		System.out.print("Enter the number of columns: ");
		int columnno = addr.nextInt();
		System.out.print("\n");
		int a[][] = new int[rowsno][columnno];
		int b[][] = new int[rowsno][columnno];
		int c[][] = new int[rowsno][columnno];
		if (rowsno==columnno)
		{
		for (int i=0;i<rowsno;i++)
		{
			for (int j=0;j<columnno;j++)
				{
				System.out.print("Enter the value for a[i][j]: ");
				int value = addr.nextInt();
				a[i][j]=value;
				}
		}
		for (int l=0;l<rowsno;l++)
		{
			for (int k=0;k<columnno;k++)
				{
				System.out.print("Enter the value for b[i][j]: ");
				int value = addr.nextInt();
				b[l][k]=value;
				}
		}
		System.out.println("\nMatrix A: ");
		for (int g=0;g<rowsno;g++)
		{
			for (int h=0;h<columnno;h++)
				{
				System.out.print(a[g][h]+" ");
				}
			System.out.println();
		}
		System.out.println("\nMatrix B: ");
		for (int m=0;m<rowsno;m++)
		{
			for (int n=0;n<columnno;n++)
				{
				System.out.print(b[m][n]+" ");
				}
			System.out.println();
		}
		System.out.println("\nMatrix Addition: ");
		for (int i=0;i<rowsno;i++)
		{
			for (int j=0;j<=(columnno-1);j++)
				{
				c[i][j]=a[i][j]+b[i][j];
				}
		}
		for (int i=0;i<rowsno;i++)
		{
			for (int j=0;j<columnno;j++)
				{
				System.out.print(c[i][j]+" ");
				}
			System.out.println();
		}
		System.out.println("\nMatrix Substraction: ");
		for (int i=0;i<=(rowsno-1);i++)
		{
			for (int j=0;j<=(columnno-1);j++)
				{
				c[i][j]=a[i][j]-b[i][j];
				}
		}
		for (int i=0;i<rowsno;i++)
		{
			for (int j=0;j<columnno;j++)
				{
				System.out.print(c[i][j]+" ");
				}
			System.out.println();
		}
		System.out.println("\nMatrix Multiplication: ");
		for (int i=0;i<=(rowsno-1);i++)
		{
			for (int j=0;j<columnno;j++)
			{
				c[i][j]=0;
				for (int k=0;k<columnno;k++)
				{
				c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for (int i=0;i<=(rowsno-1);i++)
		{
			for (int j=0;j<=(columnno-1);j++)
				{
				System.out.print(c[i][j]+" ");
				}
			System.out.println();
		}
		}
		else
		{
			System.out.println("Matrix operations are not possible");
		}
	}
	}