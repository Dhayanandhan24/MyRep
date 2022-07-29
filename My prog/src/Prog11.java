import java.util.Scanner;
public class Prog11 
{

	public static void main(String args[])
	{
	System.out.println("Please provide a number to convert to word: ");	
	Scanner add = new Scanner(System.in);
	int number = add.nextInt();
	add.close();
	int value=0, dummynum=1;
	String addr[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	while (number !=0)
		{
		    dummynum = number%10;
			value = value*10+dummynum;
			number/=10;
		}
	int	dumm=0;
	while (value !=0) 
		{
		dumm = value%10;	
				System.out.print(addr[dumm]+" ");
		value /= 10;
		}
	}
}
