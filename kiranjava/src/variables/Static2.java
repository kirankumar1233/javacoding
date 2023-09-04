package variables;

public class Static2 {
	static int a= 20;
	static int b=40;
	static int c =50;
	

	public static void main(String[] args) {
		
		int a = 300;
		int b = 400;
		int d = 500;
		System.out.println(a);
		System.out.println(Static2.a);
		System.out.println(b);
		System.out.println(Static2.b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(Static2.c);
		System.out.println(Static1.a);  // we created class for this  
		System.out.println(Static1.b);
		

	}

}
