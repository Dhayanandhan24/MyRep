import java.util.Scanner;
public class Prog33d
{
public static void main(String[] args)
   {
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int limit = addr.nextInt();
	addr.close();
	int i,j,k;
	for (i=limit;i>=1;i--)
		{
		for (k=1;k<i;k++)
			{
			  System.out.print(" ");
			}
		for (j=limit;j>i;j--)
			{
			  System.out.print("*");
			}
		for (j=limit;j>=i;j--)
		    {
		  System.out.print("*");
		    }
		System.out.println("");
	    }
  }
}
