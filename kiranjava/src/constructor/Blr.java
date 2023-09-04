package constructor;

public class Blr {
	Blr(){
		System.out.println("hello good morning");  // we can also create more no of constructors like this with different formal arguments
		
	}

	public static void main(String[] args) {
		System.out.println("hello good evening");  // first execute this block
		Blr a = new Blr();

	}      // even we cannot create constructor if we create object in main method it will create one default constructor
	

}
