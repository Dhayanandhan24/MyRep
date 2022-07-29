import java.util.Scanner;

public class Prog16 
{
public static void main(String[] args)
{
	System.out.println("Enter the decimal number: ");
	Scanner addr = new Scanner(System.in);
	int decinum = addr.nextInt();
	addr.close();
	String bina = Integer.toBinaryString(decinum);
	System.out.println("Binary number: "+bina);
}
}
