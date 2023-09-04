package constructor;

public class Blr1 {
	Blr1(int a , int b)  // constructor with formal arguments
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);
		
	}

	public static void main(String[] args) {
		System.out.println("hi");
		Blr1 obj = new Blr1(10, 20);
		System.out.println(obj);
		

	}

}
