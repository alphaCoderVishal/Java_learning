package Pkg_Self_Learning;
class Callme {
	void call(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("interrupted");
			
		}
		System.out.println("]");
	}
}
class caller implements Runnable{
	String msg;
	Callme target;
	Thread t;
	public caller(Callme targ,String s) {
		target=targ;
		msg=s;
		t=new Thread(this);
		t.start();
		}
	public void run()
	{
		target.call(msg);//object of class callme
	}
	
}
public class Synch {
	public static void main(String args[]) {
		Callme target=new Callme();
		caller ob1=new caller(target,"Hello");
		caller ob2=new caller(target,"Synchronized");
		caller ob3=new caller(target,"world");
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
			} catch(InterruptedException e) {
			System.out.println("Interrupted");
			}
	}

}
