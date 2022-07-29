import java.util.Scanner;
public class Prog22a
{
public static void main(String[] args)
   {
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int limit = addr.nextInt();
	addr.close();
	double value=1,m,n,finval=1,a;
	for (int i=0;i<=limit;i++)
	{
		m=i;
		n=2;
		a = Math.pow(m,n);
		value=finval+a;
		System.out.print(((int)value)+",");
		finval = value;
	    }
    }
}

