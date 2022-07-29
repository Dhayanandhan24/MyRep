import java.util.Scanner;

public class Myfirstprog
{
	public static void main(String[] args) {
		Scanner Address = new Scanner(System.in);
		System.out.println("Enter the number ");
		int i = Address.nextInt();
		System.out.println("Entered number is " + i);
		Address.close();
	}
}