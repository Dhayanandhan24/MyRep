import java.util.Scanner;
public class Prog32c
{
public static void main(String[] args)
   {
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int limit = addr.nextInt();
	addr.close();
	int i,j,k=0;
	for (i=1;i<=limit;i++)
	{
		for (j=1;j<=i;j++)
		{
			k++;
			System.out.print(k);
		}
		System.out.println("");
	}
	
   }
}
