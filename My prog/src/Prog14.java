import java.util.Scanner;
public class Prog14
{
public static void main(String[] args)
	{
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int number = addr.nextInt();
	addr.close();
	int y,factorial=1;
	if(number<0)
	{
		System.out.print("Factorial is not possible");
	}
	else if (number>=0)
	{
	for (y=1;y<=number;y++)
		{	
		factorial = factorial*y;
		}
		System.out.print("Factorial of entered number: "+factorial);
	}
	}
}
