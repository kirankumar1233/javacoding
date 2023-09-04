package nonstatic_variable;

public class Stat {
	static int b;
	Stat(){
		System.out.println("hello");
	}

	public static void main(String[] args) {
		System.out.println(b);
		Stat obj = new Stat();
		

	}

}
