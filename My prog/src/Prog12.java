import java.util.Scanner;
public class Prog12 
{
public static void main(String[] args)
	{
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int number = addr.nextInt();
	addr.close();
	for (int i=2;i<=number;i+=2)
		System.out.print(i*i+" ");
	}
}
