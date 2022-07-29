import java.util.Scanner;
public class Prog1 
{
    public static void main(String[] args) 
    {
        Scanner Address = new Scanner(System.in);
        System.out.println("Principle amount = "); 
        int principle = Address.nextInt();
        System.out.println("Rate of Intrest (in percentage) = ");
        float rateofintrest = Address.nextFloat();
        System.out.println("Time Period (in years) = "); 
        int time = Address.nextInt();
        float simint;
        simint = (principle * rateofintrest * time)/100;
        System.out.println("Simple Intrest = "+simint);
        Address.close();
    }
}