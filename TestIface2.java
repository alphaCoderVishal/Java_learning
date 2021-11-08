package Pkg_Self_Learning;
 interface callback{
	public void callback(int param);
}
 class client implements callback{
	 public void callback(int p)//interface function must be public
	 {
		 System.out.println("callback is called with:"+p);
	 }
 }
class AnotherClass implements callback{
	public void callback(int n) 
	{
		System.out.println("Another version of callback");
		System.out.println("n squared is: "+n*n);
	}
}
public class TestIface2 {
	public static void main(String args[]) {
		callback c=new AnotherClass();
		AnotherClass a=new AnotherClass();
		callback cl=new client();
		cl.callback(44);
		c.callback(42);
		a.callback(43);
	}

}
