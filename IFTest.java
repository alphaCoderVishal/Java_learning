package Pkg_Self_Learning;
interface IntStack{
	public void push(int item);
	public int pop();
}
class FixedStack implements IntStack{
	int stck[];
	int tos;
	FixedStack(int size)
	{
		stck=new int[size];
		tos=-1;
	}
	public void push(int item) {
		if (tos==stck.length-1)
		{
			System.out.println("The stack is full. Can't add more items");
		}
		else
		stck[++tos]=item;
	}
	public int pop() {
		if(tos<0)
		{
			System.out.println("stack is empty so can't pop");
			return 0;
		}
		else
			return stck[tos--];
	}
}
public class IFTest {
	public static void main(String args[]) {
		FixedStack mystack1=new FixedStack(5);
		FixedStack mystack2=new FixedStack(8);
		int i;
		for( i=0;i<5;i++)
		mystack1.push(i);	
		for( i=0;i<8;i++)
			mystack2.push(i);
		System.out.println("stack in mystack1:");
		for( i=0;i<5;i++)
         System.out.println(mystack1.pop());
		System.out.println("stack in mystack2:");
		for( i=0;i<8;i++)
	        System.out.println(mystack2.pop());
	}

}
