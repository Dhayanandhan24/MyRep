import java.util.Scanner;
public class Prog6
{
    public static void main(String[] args) 
    {
        System.out.println("Please provide three numbers: "); 
        Scanner Addr = new Scanner(System.in);
        double number1 = Addr.nextDouble();
        double number2 = Addr.nextDouble();
        double number3 = Addr.nextDouble();
        Addr.close();
        
        if (number1>number2&&number1>number3)
          {	
        	System.out.println(number1+" is the largest number");
        	{
        	if (number2>number3)
        		System.out.println(number2+" is the second largest number");
        	else 
        		System.out.println(number3+" is the second largest number");
         	}
          }
        else if (number2>number1&&number2>number3)
	      {
	    	System.out.println(number2+" is the largest number");
	    	{
	        	if (number1>number3)
	        		System.out.println(number1+" is the second largest number");
	        	else
	        		System.out.println(number3+" is the second largest number");
	    	}
	      }
        else if (number3>number1&&number3>number2)
	      {
	    	System.out.println(number3+" is the largest number");
	    	{
	        	if (number1>number2)
	        		System.out.println(number1+" is the second largest number");
	        	else 
	        		System.out.println(number2+" is the second largest number");
	    	}
	      }
    }    
}