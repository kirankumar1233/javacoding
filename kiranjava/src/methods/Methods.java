package methods;

public class Methods {

	public static void main(String[] args) {
		kiran();  // reverse i.e what ever we call first it will execute first
		System.out.println("Hello");
		//kiran();    // here we are calling method
		//kumar();  // without calling methods in main method they won't execute because jvm execute main method
		          // we can call the methods in before printing statements also at that time it execute first called method

	}
	public static void kiran() {
		//kumar();  // reverse
		System.out.println("Good evening");
		kumar();  // we can call like this also
		
	}
	public static void kumar() {
		System.out.println("How are you");
	}

}
