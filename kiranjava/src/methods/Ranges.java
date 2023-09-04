package methods;

public class Ranges {

	public static void main(String[] args) {
		even(1, 30);
		

	}
	public static void even(int a , int b) {
		for(int i=a; i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i + "  is even number");
			}
		}
	}

}
