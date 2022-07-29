import java.util.Scanner;
public class Prog2M2
{
    public static void main(String[] args) 
    {
        System.out.println("Please provide first numbers: "); 
        Scanner addr = new Scanner(System.in);
        int firstnumber = addr.nextInt();
        System.out.println("Please provide second numbers: "); 
        int secondnumber = addr.nextInt();
        int dummyvariable;
        dummyvariable = firstnumber; 
        firstnumber = secondnumber;
        secondnumber = dummyvariable;
        System.out.println("After exchanging...");
        System.out.println("First number is "+firstnumber);
        System.out.println("Second number is "+secondnumber);
        addr.close();
    }
}