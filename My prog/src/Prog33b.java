import java.util.Scanner;
public class Prog33b
{
public static void main(String[] args){
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int limit = addr.nextInt();
	addr.close();
	double value=1;
	int m=0;
	int a[]= new int[limit];
	for (int i=1;i<=limit;i++)
	{
		a[i-1]=(int)value;
		value *= i;
	}
	for (int i=1;i<=limit;i++)
	{
		for (int j=1;j<=i;j++) 
		{
			System.out.print(a[m]+" ");
			m++;
		}
		System.out.println("");
	}
  }
}

