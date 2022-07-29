import java.util.Scanner;

public class Prog26 {
 public static void main(String[] args)
 {
	 System.out.println("Enter the limit: ");
		Scanner addr = new Scanner(System.in);
		int limit = addr.nextInt();
		int a[]= new int[limit+1];
		for (int i=1;i<=limit;i++)
			{
				System.out.print("Enter the value: ");
				int value = addr.nextInt();
				{
					a[i]=value;
				}
			}
		System.out.print("\nEntered numbers are: \n");
		System.out.print("");
		for (int i=1;i<=limit;i++)
		{
		System.out.print(a[i]+",");
		}
		System.out.print("\nEnter the value to find in array: \n");
		int num = addr.nextInt();
		
		for(int i=0;i<=limit;i++)
		{
			if(a[i]==num)
			{
				System.out.println(i);
				System.out.println("Number is found.");
				System.exit(0);
			}		
		}
		System.out.println("Number is not found.");	
 }
}
