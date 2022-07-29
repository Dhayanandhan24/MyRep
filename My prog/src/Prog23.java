import java.util.Scanner;
public class Prog23
{
public static void main(String[] args)
   {
	System.out.println("Enter the value: ");
	Scanner addr = new Scanner(System.in);
	int val = addr.nextInt();
	System.out.println("Enter the power: ");
	int powerval = addr.nextInt();
	addr.close();
	long i,j=1;
	
	for (i=1;i<=powerval;i++)
	    {
		j *=val;
	    }
	System.out.println("Final value: "+j);
  }
}
