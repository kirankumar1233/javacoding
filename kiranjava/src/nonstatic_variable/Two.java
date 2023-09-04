package nonstatic_variable;

public class Two {
	static int a;
	int b;

	public static void main(String[] args) {
		a=10;
		//Two obj = new Two(obj.b);
		System.out.println(a);
		System.out.println(a);
		

	}

}
