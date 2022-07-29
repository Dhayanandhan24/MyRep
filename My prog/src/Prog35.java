import java.util.Scanner;

public class Prog35 
{
   public static void main(String args[]) 
   {
	   System.out.println("Enter the number of values: ");
	   Scanner addr = new Scanner(System.in);
	   int totVal = addr.nextInt();
	   int array[] = new int[totVal];
	   int min=0, max=0, min1=0, max1=0;
	   int dumm=0,lcm=0,dumm1=0;
	   System.out.println("Enter the numbers: ");
	   {
      for(int i = 0; i<array.length; i++) 
      		{
    		  int numbers = addr.nextInt();
    		  array[i] = numbers;
            }
	   }
	   { int i=1;
	       if (array[i]<=array[i-1])
	       {
	    	   min = array[i] ;
	    	   max = array[i-1];
	       }
	       else
	       {
	    	   max = array[i] ;
	    	   min = array[i-1];
	       }
	   }
	     bb: for (int i = 1; i<10; i++) {
	    	   dumm = max*i; 
	    	   if (dumm%min==0)
	    	   {
	    		   lcm=dumm;
	    		   break bb;
	    	   }
	       }
	       for(int i=2;i<array.length;i++) 
	       {   
	    	   if (lcm>array[i]) 
			      {
			 	    min1 = array[i] ;
			 	    max1 = lcm;
			 	  }
	    	   else
			 	  {
	    		   max1 = array[i] ;
	    		   min1 = lcm;
			      }
			       
		aa: for (int j = 1; j<100; j++) {
				    dumm1 = max1*j; 
				   if (dumm1%min1==0)
				       {
				   	   lcm=dumm1;
				   	   break aa;
				       } 
  		}
	}
	       System.out.println("LCM of entered numbers: "+lcm);
}
}








