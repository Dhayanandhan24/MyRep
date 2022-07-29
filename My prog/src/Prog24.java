import java.util.Scanner;
public class Prog24
{
public static void main(String[] args)
   {
	System.out.println("Enter the string: ");
	Scanner addr = new Scanner(System.in);
	String strione = addr.next();
	addr.close();
	
	String temp=strione,stritwo="";
	char dummy;
	for (int i=0;i<=(strione.length()-1);i++)
	    {
		dummy=temp.charAt(i);
		stritwo=dummy+stritwo;
	    }
	System.out.println("Reverse of string: "+stritwo);
	for(int j=0;j<=(strione.length()-1);j++)
		if(strione.charAt(j)==stritwo.charAt(j))
		{
			System.out.println("It is palindrome");
			System.exit(0);
		}
	System.out.println("It is not palindrome");
	
  }
}
