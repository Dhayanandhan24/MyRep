import java.util.Scanner;
public class Prog9 {

	public static void main(String args[])
	{
		System.out.println("Please provide maximum value: ");
		Scanner ad = new Scanner(System.in);
		int number = ad.nextInt();
		ad.close();
		int sum=0;
		int i;
		for(i=1;i<=number;i+=2)
			{
			sum = sum + i;
			}		
		
		System.out.println("Sum: "+sum);
//		int sum=0;
//		int n=5;
//		for(int i=1;i<=n;i+=2)
//		{
//			sum= sum+i;
//		}
//		System.out.println(sum);
	}
}
