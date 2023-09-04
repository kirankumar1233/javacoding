package even;

public class SumEven {

	public static void main(String[] args) {
		int sum = 0;
		for(int a=1; a<=100;a++)
		{
			if (a%2==0)
			{
				sum = sum+a;
				//System.out.println(sum); it prints the even values with increasing sum
				
			}
			
		}
		System.out.println(sum+" thi is the sum of first 50 even numbers");
}
}
