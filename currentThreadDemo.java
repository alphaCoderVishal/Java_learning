package Pkg_Self_Learning;


public class currentThreadDemo {
	public static void main(String args[]) {
		Thread t= Thread.currentThread();//t is assigned a reference to main thread
		System.out.println("Current Thread:"+t);
		System.out.print(t.isAlive());
		//change the name of the thread
		t.setName("My Thread");
		System.out.println(t.getName());
		try {
			for(int n = 5; n > 0; n--) {
			System.out.println(n);
			Thread.sleep(5000);
			}
			} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
			}
			}
		
	}


