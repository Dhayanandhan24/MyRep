import java.util.Scanner;
public class Prog22c
{
public static void main(String[] args)
   {
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int limit = addr.nextInt();
	addr.close();
	int m=1,n=2;
	for (int i=0;i<(limit/2);i++)
	{
	{
		System.out.print(m+",");
		m=m+3;
    }
	{
		System.out.print(n+",");
		n=n+4;
    }
	}
   }
}

