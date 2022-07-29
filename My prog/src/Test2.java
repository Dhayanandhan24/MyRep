
public class Test2 implements Runnable{
		int a=4;
		int b=5;
		int c;

	public synchronized void run() {
		
		for(int i=1;i<=15;i++) {
			c = a+b;
			System.out.println(c);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
