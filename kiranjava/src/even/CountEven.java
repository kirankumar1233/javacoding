package even;

public class CountEven {

	public static void main(String[] args) {
		int count =0;
		int j =0;
		int a = 12244;
		while(a>0)
		{
			a = a/10;
			count++;			
		}
		if(a%2==0)
			j++;
		System.out.println(count);
		System.out.println(j);
		

	}

}
