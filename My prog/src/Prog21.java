import java.util.Scanner;
public class Prog21
{
public static void main(String[] args)
   {
	System.out.println("Enter the number of items: ");
	Scanner addr = new Scanner(System.in);
	int totalitems = addr.nextInt();
	double sum=0, value=0,actual, newactual=0;
	for (int i=1;i<=totalitems;i++)
	{
		System.out.print("\nEnter item code: ");
		int itemcode = addr.nextInt();
		System.out.print("Enter Description: ");
		String desc = addr.next();
		System.out.print("Enter quantity: ");
		int quantity = addr.nextInt();
		System.out.print("Enter price: ");
		int price = addr.nextInt();
		sum = quantity*price;
		value+=sum;
	}
	System.out.println("\nTotal: "+(int)value);
	if (value>=10000)
		actual = value-(value*.1);
	else
		actual = value;
	System.out.print("\nDo you pay through card (True/False): ");
	boolean getit = addr.nextBoolean();
	{
		if (getit==true)
		{
			if (actual<=1000)
			    {
				newactual=actual-(actual*0.025);
					System.out.println("\nGrand total: "+newactual);
				}
			else
				{
				    System.out.println("\nAfter Discounting 10%");
					System.out.println("\nGrand total: "+actual);
				}
		}
			else
				{
				    System.out.println("\nAfter Discounting 10%");
					System.out.println("\nGrand total: "+actual);	
				}	
	    }
    }
}

