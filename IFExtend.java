package Pkg_Self_Learning;
interface A1{
	void meth1();
	void meth2();
}
interface B1 extends  A1{
	//extension of interface
	void method3();
	
}
class Myclass implements B1{
	public void meth1() {
		System.out.println("implement method 1");
	}
	public void meth2() {
		System.out.println("implement method 2");
	}
	public void method3() {
		System.out.println("implement method 3");
	}
}
public class IFExtend {
	public static void main(String args[]) {
		Myclass ob=new Myclass();
		ob.meth1();
		ob.meth2();
		ob.method3();
	}
	

}
