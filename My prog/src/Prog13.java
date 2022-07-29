import java.util.Scanner;
public class Prog13
{
public static void main(String[] args)
	{
	System.out.println("Enter the start limit: ");
	Scanner addr = new Scanner(System.in);
	int startnum = addr.nextInt();
	System.out.println("Enter the end limit: ");
	int endnum = addr.nextInt();
	addr.close();
	System.out.println();
    int i,j,sum=0;
	for(i=startnum; i<=endnum; i++)
    {
        for(j=2; j<=i;j++)
     	{   	
    	 	{
            if(i%j==0)
                break ;
        	}
     	}
            if (i==j)
            {
            	System.out.println(i);
            	sum += i;
            } 	
        
    }
        System.out.println("\nSum of all prime numbers between the range: "+sum);
    
    }
}

