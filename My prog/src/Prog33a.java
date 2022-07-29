import java.util.Scanner;
public class Prog33a
{
public static void main(String[] args){
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int limit = addr.nextInt();
	addr.close();
	double value;
	int m=0;
	int a[]= new int[limit];
	for (int i=1;i<=limit;i++)
	{
		value = Math.pow(i, 2);
		if((value%2==0))
		{
			value-=(2*value);
		}
		a[i-1]=(int)value;

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

