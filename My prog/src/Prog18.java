public class Prog18 
{
public static void main(String[] args){
	int k = 1;
	int i = 7;
	int count = 0;
	
		for (k=1;k<1000;k++) 
		{
			while (count<3) 
			{
				if ((i % 2 == 1) && (i % 3 == 1) && (i % 4 == 1) && (i % 5 == 1) && (i % 6 == 1)) 
				{
					System.out.println("Number: "+i);
					count ++; 
				}
				i+=7;
			}
		}
	}
	
}
