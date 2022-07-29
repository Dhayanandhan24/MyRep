import java.util.Scanner;
public class Prog12b 
{
public static void main(String[] args)
	{
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int number = addr.nextInt();
	addr.close();
	for (int i=1;i<=number;i++)
		System.out.print(i+" ");
	}
}
