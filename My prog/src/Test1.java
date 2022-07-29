class Test1 {
	
		public  static int a = 7;
	    public static int b = 9;
	    public static int c = 0;
	    
 public static void main (String args[]) {
	  
	 Runnable one = new Test2();
	
	 Runnable two = new Test3();
	 
	 Thread first = new Thread(one);
	 Thread second = new Thread(two);
	 
	 first.start();
//	 second.setPriority(10);
//	 try {
//		 
//		first.join();
//	} catch (InterruptedException e) {e.printStackTrace();
//	} 
	 
	 second.start();
	 
 }
}
