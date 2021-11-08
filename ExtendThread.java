package Pkg_Self_Learning;
//package Pkg_Self_Learning;
class newThread extends Thread{
	Thread t;
	newThread()
	{
	//create a new second demo thread
		super("DemoThread");
		System.out.println("Child thread"+ this);
		start();//start the thread	
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
public class ExtendThread {
	public static void main(String args[]) {
		new newThread();//creating instance of the class;
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

