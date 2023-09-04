package array;

public class ArrayOvel {

	public static void main(String[] args) {
		char [] a= {'a','b','c','d','e','f','g','h','i'};
		int count =0;
		for(int i =0; i<a.length;i++)
		{
			if(a[i]=='a'||a[i]=='e' || a[i]=='i'||a[i]=='o'||a[i]=='u')
			{
				System.out.println(a[i] + " is ovel");
				count++;
			}
			
			
		}
		System.out.println(count +  "  is the no of ovels in the array");
		

	}

}
