import java.util.Scanner;
public class Prog22b
{
public static void main(String[] args)
   {
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int limit = addr.nextInt();
	addr.close();
	double number1=0, number2=1, finalnum;
	System.out.print("1,");
	for (int i=0;i<=limit;++i)
		{
		finalnum = number1+number2;
		System.out.print(((int)finalnum)+",");
		number1=number2;
		number2=finalnum;
	    }
    }
}

