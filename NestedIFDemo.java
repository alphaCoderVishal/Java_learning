package Pkg_Self_Learning;
class A{
	public interface NestedIF{
	public boolean isNotNegative(int x); //interface method must be public
	}
}
class B implements A.NestedIF{
	public boolean isNotNegative(int x) {
		return x<0?false:true;
	}
	
	
}
public class NestedIFDemo {
	public static void main(String args[]) {
		//making reference variable of nested interface
		A.NestedIF nif=new B();
		if (nif.isNotNegative(42))
			System.out.println("The numberis not negative");
		if (nif.isNotNegative(-42))
			System.out.println("This wont be printed due to logical comdition");
	}

}
