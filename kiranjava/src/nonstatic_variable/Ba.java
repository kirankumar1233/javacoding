package nonstatic_variable;

public class Ba {
	int b;

	public static void main(String[] args) {
		Ba obj = new Ba();
		Ba obj1 = new Ba();
		System.out.println(obj.b);

	}

}
