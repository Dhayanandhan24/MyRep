import java.util.Scanner;
public class Prog25
{
public static void main(String[] args)
   {
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int limit = addr.nextInt();
	int a[]= new int[limit+1];
	int i;
	for (i=1;i<=limit;i++)
		{
			System.out.print("Enter the value: ");
			int value = addr.nextInt();
			{
				a[i]=value;
			}
		}
	System.out.print("Entered numbers are: ");
	System.out.print("");
	for (i=1;i<=limit;i++)
	{
	System.out.print(a[i]+",");
	}
	System.out.print("\nEnter the value to find in array: \n");
	int findval = addr.nextInt();
	for (int j=0;j<=limit;j++)
	{
		if (findval==a[j])
		{
			System.out.println("Number is found");
			System.exit(0);
		}
	}
	System.out.println("Number is not found");
   }
}