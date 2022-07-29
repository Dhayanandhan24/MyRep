import java.util.Scanner;
public class Prog4
{
    public static void main(String[] args) 
    {
        System.out.println("Please provide a number: "); 
        Scanner addr = new Scanner(System.in);
        double number1 = addr.nextDouble();
        addr.close();        
        	{
        	 System.out.println("Whole number is: "+(int)number1);
        	}
        double numberdummy, number2;
        numberdummy = (int)number1;
        number2 = (double)number1 - numberdummy; 
            {
        	 System.out.println("Decimal value is: "+number2);
            }
    }
}
