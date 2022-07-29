import java.util.Scanner;
public class Prog7
{
    public static void main(String[] args) 
    {
        System.out.println("Please provide employee name: "); 
        Scanner addr = new Scanner(System.in);
        String empname = addr.next();
        System.out.println("Please provide employee id: "); 
        int empid = addr.nextInt();
        System.out.println("Please provide basic pay: "); 
        float basic = addr.nextFloat();
        System.out.println("Please provide Special allowance: "); 
        float sa = addr.nextFloat();
        System.out.println("Please provide bonus (in percentage): "); 
        float bonus = addr.nextFloat();
        System.out.println("Please provide monthly tax savings investment amount: "); 
        float mtsi = addr.nextFloat();        
        addr.close();
        double grossmon,annsal,grossann,slab1,slab2,slab3,inv, finalgross;
        grossmon = basic+sa;
        annsal = grossmon*12;
        grossann = annsal+(annsal*(bonus/100));
        
        inv = mtsi*12;
        	{
	        if (inv<=150000)
	        	finalgross = grossann-inv;
	        else
	        	finalgross = grossann-150000;
        	}
        slab1 = finalgross-(finalgross*0.05);
        slab2 = finalgross-(finalgross*0.2);
        slab3 = finalgross-(finalgross*0.3);
        
        	System.out.println("\nEmployee name: "+empname); 
        	System.out.println("Employee Id: "+empid); 
	        if (grossann>=250000&&grossann<=500000)
	        	{
	        		System.out.println("Annual Gross pay: "+finalgross); 
	        		System.out.println("Annual Net pay: "+slab1);
	        		System.out.println("Tax amount: "+(finalgross-slab1));
	        	}
	        else if (grossann>500000&&grossann<=1000000)
	        	{
	        		System.out.println("Annual Gross pay: "+finalgross); 
	        		System.out.println("Annual Net pay: "+slab2);
	        		System.out.println("Tax amount: "+(finalgross-slab2));
	        	}
	        else if (grossann>1000000)
	        	{
	        		System.out.println("Annual Gross pay: "+finalgross); 
	        		System.out.println("Annual Net pay: "+slab3);
	        		System.out.println("Tax amount: "+(finalgross-slab3));
	        	}
	        else
	        	{
	        	System.out.println("Annual Gross pay: "+finalgross); 
	        	System.out.println("Annual Net pay: "+finalgross);
        		System.out.println("Tax amount: Nil");
	        	}
    }
}