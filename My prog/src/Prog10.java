
import java.util.Scanner;
public class Prog10 
{

	public static void main(String args[])
	{
	System.out.println("Please provide a number to reverse: ");	
	Scanner add = new Scanner(System.in);
	int number = add.nextInt();
	add.close();
	int value=0, dummynum=1;
	while (number !=0)
		{
		    dummynum = number%10;
			value = value*10+dummynum;
			number/=10;
		}
		System.out.println("Reversed number is: "+value);
	}
}
