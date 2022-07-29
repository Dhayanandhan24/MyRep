import java.util.Scanner;
public class Prog31c
{
public static void main(String[] args)
   {
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int limit = addr.nextInt();
	addr.close();
	int i,j;
	for (i=1;i<=limit;i++)
	{
		for (j=1;j<=5;j++)
		{
			System.out.print(j);
		}
		System.out.println("");
	}
	
   }
}
