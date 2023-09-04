package methods;

public class ClassRecduce {

	public static void main(String[] args) {
		add(10,20);
		add(30,40);
		add(80, 20);
		sub(100,50);
		

	}
	public static void add(int a , int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	public static void sub(int c , int d) {
		int sub = c-d;
		System.out.println(sub);
	}

}
