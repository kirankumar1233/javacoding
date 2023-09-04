package nonstatic_variable;

public class One {
	int a;
	int b;
	One(){
		int c =30;   // only global variables have default value i.e zero
		int d =40;
		
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		One obj =new One();
		System.out.println(" hello");
		System.out.println(obj.a);
		System.out.println(obj.b);
		//System.out.println(obj1.c);
		//System.out.println(obj1.d);
		

	}

}
