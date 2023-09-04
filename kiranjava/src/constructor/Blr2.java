package constructor;

public class Blr2 {
	Blr2(){
		System.out.println("hello");
	}
	Blr2(int a )  // we can create no constructors with same name but different formal arguments
	{
		System.out.println("bye");
	}
	public static void main(String[] args) {
		
		System.out.println("hi");
		Blr2 obj = new Blr2();
		Blr2 obj1 = new Blr2(10);
		

	}

}
