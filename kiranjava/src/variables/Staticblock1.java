package variables;

public class Staticblock1 {
	static int a;
	static int b;
	static
	{
		System.out.println("hello");
		
	}
	static {
		int a =10;
		int b =20;
		
	}

	public static void main(String[] args) {
		
		int d =200;
		int e =600;
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
		System.out.println(Staticblock1.a);
		System.out.println(Staticblock1.b);
		

	}

}
