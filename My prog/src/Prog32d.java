import java.util.Scanner;
public class Prog32d
{
public static void main(String[] args)
   {
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int limit = addr.nextInt();
	addr.close();
	int number1=0, number2=1, finalnum;	
	int a[] = new int [limit+1];
	a[0]=1;
	for (int i=1;i<=limit;i++)
		{
		      finalnum = number1+number2;
		      a[i]=finalnum;
		      number1=number2;
		      number2=finalnum;		
	    }
	int l=0;
	for (int j=0;j<=limit;j++)
	{
		for (int k=0;k<=j;k++)
			{
			
				System.out.print(a[l]+" ");
				l++;
			}
		System.out.println("");
	}
	   }
   }	


