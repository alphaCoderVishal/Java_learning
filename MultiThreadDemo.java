package Pkg_Self_Learning;
//create multiple thread
class newThread1 implements Runnable{
	String name;//thread name
	Thread t;
	newThread1(String threadname){
		name=threadname;
		t=new Thread(this,name);
		System.out.println("New thread"+t);
		t.start();
	}
	public void run() {
		try {
		for(int i = 5; i > 0; i--) {
		System.out.println(name + ": " + i);
		Thread.sleep(1000);
		}
		} catch (InterruptedException e) {
		System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
		}
		
}
public class MultiThreadDemo {
	public static void main(String args[]) {
		new newThread1("One"); // start threads
		new newThread1("Two");
		new newThread1("Three");
		try {
		// wait for other threads to end
		Thread.sleep(10000);
		} catch (InterruptedException e) {
		System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
		}
		}

