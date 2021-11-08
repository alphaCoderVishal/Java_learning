package Pkg_Self_Learning;
class newThread2 implements Runnable{
	Thread t;
	newThread2()
	{
		//create a new second thread
		t= new Thread(this,"Demo_Thread");
		System.out.println("Child Thread"+t);
		t.start();//start the thread
	}
	@Override
	public void run()
	{
		try 
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Child Thread :"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
		     System.out.println("Child thread is interrupted");	
		}
		System.out.println("Exiting thread");
	}
}
public class ThreadDemo {
	public static void main(String args[]) {
		new newThread2();//creating instance of the class;
		try {
			for(int i = 5; i > 0; i--) {
			System.out.println("Main Thread: " + i);
			Thread.sleep(1000);
			}
			} catch (InterruptedException e) {
			
			System.out.println("Main thread interrupted.");
			}
			System.out.println("Main thread exiting.");
			}
			
	}


