import java.util.Scanner;
public class Prog5
{
    public static void main(String[] args) 
    {
        System.out.println("Please enter your name: "); 
        Scanner addr = new Scanner(System.in);
        String name = addr.next();
        System.out.println("Please enter CS mark: "); 
        float CS = addr.nextFloat();
        System.out.println("Please enter Science mark: "); 
        float Science = addr.nextFloat();
        System.out.println("Please enter Maths mark: "); 
        float Maths = addr.nextFloat();
        addr.close();        
        	{
        	System.out.println("\nName of the student: "+name);
        	}
        float total,average;
        total = CS+Science+Maths;
        average = total/3;
            {
        	System.out.println("Total marks obtained: "+total);
            System.out.println("Average mark: "+average);	
            }
        if (average>=60&&average<=100)
        	{
        	System.out.println("\nResult: You secured 1st class");
        	}
        else if (average>=50&&average<=59)
    		{
        	System.out.println("\nResult: You secured 2nd class");
    		}
        else if (average>=35&&average<=49)
    		{
        	System.out.println("\nResult: Pass");
    		}
        else
        	{
        	System.out.println("\nResult: Fail");
    		}
    }
}
