package Pkg_Self_Learning;
//Q that we are trying to synchronize
class Q{
	int n=;
	synchronized int get() {
		System.out.println("GOT:"+n);
		return n;
		
	}
	synchronized void put(int n){
		this.n=n;
		System.out.println("Put:"+n);
	}
}
class producer implements Runnable{
	Q q;
	producer(Q q){
		this.q=q;
		new Thread(this,"producer").start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
			q.put(i++);
		}
	}
}
class consumer implements Runnable{
     Q q;
     consumer(Q q){
    	 this.q=q;
    	 new Thread(this,"consumer").start();
    	 
    	 
     }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			q.get();
		}
	}
	
}
public class PC {
	public static void main(String args[]) {
		Q q =new Q();
		new producer(q);
		new consumer(q);
		System.out.println("Press Control-C to stop.");
	}

}
