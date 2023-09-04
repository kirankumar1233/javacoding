package variables;

public class StaticBlock {
	static int a;
	static int b;
	static
	{
		System.out.println("hello");
	}
	static {
		System.out.println("Good morning");
	}
	static {
		System.out.println("How are you");
	} // before main method is there any block first that block will execute but main method should be present after the block
	public static void main(String[] args) {
		int a =20;
		int b= 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(StaticBlock.a);
		

	}

}
