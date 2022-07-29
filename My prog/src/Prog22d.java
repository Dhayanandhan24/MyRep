import java.util.Scanner;
public class Prog22d
{
public static void main(String[] args)
   {
	System.out.println("Enter the limit: ");
	Scanner addr = new Scanner(System.in);
	int limit = addr.nextInt();
	addr.close();
	int i,number1=1,number2=5,number3=8,value=0;
	System.out.print(number1+",");
	System.out.print(number2+",");
	System.out.print(number3+",");
   	for (i=1;i<=limit;i++)
   	{
   		value=number1+number2+number3;
   		System.out.print(value+",");
   		number1=number2;
   		number2=number3;
   		number3=value;
   	}
   }
}