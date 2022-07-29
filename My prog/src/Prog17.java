import java.util.Scanner;

public class Prog17 
{
public static void main(String[] args)
{
	System.out.println("Enter the decimal number: ");
	Scanner addr = new Scanner(System.in);
	int decinum = addr.nextInt();
	addr.close();
	int deci=0, i=0, dumm;
	while(decinum>0)
	{
		dumm=decinum%10;
		decinum=decinum/10;
		deci=deci+dumm*(int)Math.pow(2, i);
		++i;
	}
	System.out.println(deci);
}
}

