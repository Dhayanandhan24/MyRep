import java.util.Scanner;
public class Prog3
{
    public static void main(String[] args) 
    {
        System.out.println("Please provide a number: "); 
        Scanner addr = new Scanner(System.in);
        int number = addr.nextInt();
        addr.close();
        if (number%2==0)
        {
        	System.out.println(number+" is an even number");
        }
        else
        {
        	System.out.println(number+" is an odd number");
        }
        
    }
}
