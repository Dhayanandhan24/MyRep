
public class Test3 implements Runnable {
		int a=6;
		int b=8;
		int c;

	public synchronized void run() {
		
		for(int i=1;i<=15;i++) {
			c = a+b;
			System.out.println(c);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
