import java.util.Scanner;
public class Prog15
{
public static void main(String[] args)
   {
	System.out.println("Enter the number to find fibonacci: ");
	Scanner addr = new Scanner(System.in);
	int limit = addr.nextInt();
	addr.close();
	double number1=0, number2=1, finalnum;
	for (int i=0;i<=limit;++i)
	{
		finalnum = number1+number2;
		if (limit==finalnum)
		{
		System.out.println("Entered number is fibonacci");
		System.exit(0);
		}
		number1=number2;
		number2=finalnum;
			
	}
	System.out.println("Entered number is not fibonacci");
   }
}
